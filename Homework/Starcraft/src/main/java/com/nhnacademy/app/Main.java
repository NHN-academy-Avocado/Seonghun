package com.nhnacademy.app;

import com.nhnacademy.app.domain.User;
import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;
import com.nhnacademy.app.domain.weapon.DefaultAttack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User user = new User(selectTribe());
        User computer = new User(randomTribe());
        while (user.getCountUnit() > 0 && computer.getCountUnit() > 0) {
            printGameInfo(user, computer);
            userTurn(user, computer);
            System.out.println("========================================");
            if (computer.getCountUnit() == 0) {
                break;
            }
            printGameInfo(user, computer);
            ComputerTurn(user, computer);
            System.out.println("========================================");
        }
        if (user.getCountUnit() == 0) {
            System.out.println("패배했습니다. ㅠㅠ");
        } else {
            System.out.println("승리했습니다!!");
        }
    }

    private static void ComputerTurn(User user, User computer) {
        int index = selectRandomIndex(0, computer);
        int target = -1;
        if (computer.getUnits().get(index) instanceof AirAttack) {
            target = selectRandomIndex(0, user);
        } else {
            target = selectRandomIndex(1, user);
            if (target == -1) {
                index = selectRandomIndex(3, computer);
                target = selectRandomIndex(2, user);
                if (target == -1) {
                    System.out.println("공격할 수 있는 유닛이 없습니다.");
                    return;
                }
            }
        }

        System.out.println("적 " + index + "가 플레이어 " + target + "을 공격!!");
        computer.getUnits().get(index).attack(user.getUnits().get(target));
        if (user.getUnits().get(target).getShield() < 1) {
            user.lostUnit();
        }
    }


    private static int selectRandomIndex(int type, User user) {
        // type 0이면 살아있는 유닛 아무거나
        // type 1이면 땅에 있는 유닛만
        // type 2이면 하늘에 있는 유닛만
        // type 3이면 하늘을 때릴 수 있는 유닛만

        List<Integer> temp = new ArrayList<>();
        int len = user.getUnits().size();
        if (type == 0) {
            for (int i = 0; i < len; i++) {
                if (user.getUnits().get(i).getShield() > 0) {
                    temp.add(i);
                }
            }
        } else if (type == 1) {
            for (int i = 0; i < len; i++) {
                if (user.getUnits().get(i).getShield() > 0 && user.getUnits().get(i) instanceof GroundUnit) {
                    temp.add(i);
                }
            }
        } else if (type == 2) {
            for (int i = 0; i < len; i++) {
                if (user.getUnits().get(i).getShield() > 0 && user.getUnits().get(i) instanceof FlyUnit) {
                    temp.add(i);
                }
            }
        } else {
            for (int i = 0; i < len; i++) {
                if (user.getUnits().get(i).getShield() > 0 && user.getUnits().get(i) instanceof AirAttack) {
                    temp.add(i);
                }
            }
        }
        if (temp.size() == 0) {
            return -1;
        }
        Random rand = new Random();
        return temp.get(rand.nextInt(temp.size()));
    }

    private static void userTurn(User user, User computer) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {

            while (true) {
                // 때릴 수 있는 경우를 입력해야 다음으로 넘어감
                // 못때리는 경우 다시 입력해달라고 함
                System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요(번호로 선택): ");
                char[] targets = bf.readLine().toCharArray();
                if (Character.getNumericValue(targets[0]) >= user.getUnits().size() ||
                        Character.getNumericValue(targets[2]) >= computer.getUnits().size() ||
                        user.getUnits().get(Character.getNumericValue(targets[0])).getShield() < 1 ||
                        computer.getUnits().get(Character.getNumericValue(targets[2])).getShield() < 1) {
                    System.out.println("유효하지 않은 번호입니다.");
                } else if (user.getUnits().get(Character.getNumericValue(targets[0])) instanceof DefaultAttack &&
                        computer.getUnits().get(Character.getNumericValue(targets[2])) instanceof FlyUnit) {
                    System.out.println("해당 유닛은 공중 유닛을 공격할 수 없습니다.");
                } else {
                    user.getUnits().get(Character.getNumericValue(targets[0]))
                            .attack(computer.getUnits().get(Character.getNumericValue(targets[2])));
                    if (computer.getUnits().get(Character.getNumericValue(targets[2])).getShield() < 1) {
                        computer.lostUnit();
                    }
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printGameInfo(User user, User computer) {
        int len = computer.getUnits().size();
        System.out.println("적군: " + computer.getTribe());
        for (int i = 0; i < len; i++) {
            if (computer.getUnits().get(i).getShield() > 0) {
                System.out.print(i + ". ");
                System.out.print(computer.getUnits().get(i).getClass().getSimpleName());
                System.out.println(" (현재 방어력: " + computer.getUnits().get(i).getShield() + ")");
            }
        }
        System.out.println();

        int len2 = user.getUnits().size();
        System.out.println("아군: " + user.getTribe());
        for (int i = 0; i < len2; i++) {
            if (user.getUnits().get(i).getShield() > 0) {
                System.out.print(i + ". ");
                System.out.print(user.getUnits().get(i).getClass().getSimpleName());
                System.out.println(" (현재 방어력: " + user.getUnits().get(i).getShield() + ")");
            }
        }
    }

    private static String randomTribe() {
        Random rand = new Random();
        int result = rand.nextInt(3);
        switch (result) {
            case 0:
                return "Terran";
            case 1:
                return "Zerg";
            default:
                return "Protos";
        }
    }

    public static String selectTribe() {
        System.out.println("게임을 시작합니다.");
        System.out.print("종족을 선택해주세요(Terran, Protos, Zerg): ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String userType = "";
        try {
            userType += bf.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return userType;
    }
}
