package chapter8_7;

import java.io.*;
import java.util.*;

public class HandleBAs {
    private List<BankAccount> allAccounts = new ArrayList<BankAccount>();

    public HandleBAs(String filename) throws IOException {
        FileInputStream is = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            BankAccount bankaccount = new BankAccount(line, br.readLine());
            line = br.readLine();
            bankaccount.deposit(Double.parseDouble(line));
            allAccounts.add(bankaccount);
        }
        br.close();
    }

    public void interests(double rate) {
        for (BankAccount account: allAccounts) {
            account.rateBalance(rate);
        }
    }

    public void printNegative() {
        for (BankAccount account: allAccounts) {
            if (account.getBalance() < 0) {
                System.out.println(account.toString());
            }
        }
    }
}
