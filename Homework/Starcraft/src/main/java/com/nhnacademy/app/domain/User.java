package com.nhnacademy.app.domain;

import com.nhnacademy.app.domain.unit.Unit;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private String tribe;
    private List<Unit> units = new ArrayList<>();
    private int countUnit;

    public User(String tribe) {
        this.tribe = tribe;
//        if (tribe.equals("Terran")) {
//            for (int i = 0; i < 5; i++) {
//                this.units.add(makeTerran());
//            }
//            this.countUnit = 5;
//        } else if (tribe.equals("Zerg")) {
//            for (int i = 0; i < 8; i++) {
//                this.units.add(makeZerg());
//            }
//            this.countUnit = 8;
//        } else {
//            for (int i = 0; i < 4; i++) {
//                this.units.add(makeProtos());
//            }
//            this.countUnit = 4;
//        }
        if (tribe.equals("Terran")) {
            this.countUnit = 5;
        } else if (tribe.equals("Zerg")) {
            this.countUnit = 8;
        } else {
            this.countUnit = 4;
        }
        String packageName = "com.nhnacademy.app.domain.unit." + tribe.toLowerCase();
        try {
            // 패키지 내의 모든 클래스를 가져옵니다.
            List<Class<?>> classes = getClasses(packageName);
            Random rand = new Random();
            int i = 0;
            // 클래스로부터 객체를 만듭니다.
            while (i < this.countUnit) {
                int target = rand.nextInt(classes.size());
                try {
                    String targetName = classes.get(target).getSimpleName();
                    if (!targetName.equals("Terran") && !targetName.equals("Zerg") && !targetName.equals("Protos")) {
                        Unit unit = (Unit) createInstance(classes.get(target));
                        units.add(unit);
                        i++;
                    }
                    // obj를 사용하거나 저장하세요.
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


//    private Unit makeProtos() {
//
//        Random rand = new Random();
//        int result = rand.nextInt(5);
//        switch (result) {
//            case 0:
//                return new Zealot();
//            case 1:
//                return new Dragoon();
//            case 2:
//                return new HighTempler();
//            case 3:
//                return new Scout();
//            default:
//                return new Corsair();
//        }
//    }

//    private Unit makeZerg() {
//        Random rand = new Random();
//        int result = rand.nextInt(5);
//        switch (result) {
//            case 0:
//                return new Zergling();
//            case 1:
//                return new Hydralisk();
//            case 2:
//                return new Ultralisk();
//            case 3:
//                return new Mutalisk();
//            default:
//                return new Guardian();
//        }
//    }

//    private Unit makeTerran() {
//        Random rand = new Random();
//        int result = rand.nextInt(5);
//        switch (result) {
//            case 0:
//                return new Goliath();
//            case 1:
//                return new Marine();
//            case 2:
//                return new Tank();
//            case 3:
//                return new Valkyrie();
//            default:
//                return new Wraith();
//        }
//    }

    public List<Class<?>> getClasses(String packageName) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        java.net.URL resource = classLoader.getResource(path);

        if (resource == null) {
            throw new ClassNotFoundException("No resource for " + path);
        }

        if (resource.getProtocol().equals("file")) {
            classes.addAll(findClasses(new java.io.File(resource.getFile()), packageName));
        }
        return classes;
    }

    public List<Class<?>> findClasses(java.io.File directory, String packageName) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }
        java.io.File[] files = directory.listFiles();
        for (java.io.File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(
                        Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }

    public Object createInstance(Class<?> clazz)
            throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<?> constructor = clazz.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        return constructor.newInstance();
    }


    public String getTribe() {
        return tribe;
    }

    public int getCountUnit() {
        return countUnit;
    }

    public List<Unit> getUnits() {
        return this.units;
    }

    public void lostUnit() {
        this.countUnit -= 1;
    }
}
