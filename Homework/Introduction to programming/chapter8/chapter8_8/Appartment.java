package chapter8_8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

public class Appartment {
    private int size;
    private String address;
    private List<String> people = new ArrayList<>();
    
    public Appartment(int size, String address) {
        this.size = size;
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public int numPeople() {
        return people.size();
    }

    public void addPerson(String name) {
        if (numPeople() < 10) {
            people.add(name);
        }
    }

    public String getPerson(int n) {
        if (n >= numPeople()) {
            return null;
        }
        return people.get(n);
    }

    public void deletePerson(int n) {
        if (n < numPeople()) {
            people.remove(n);
        }
    }

    public void saveToFile(String filename) throws FileNotFoundException {
        FileOutputStream os = new FileOutputStream(filename, false);
        PrintStream pw = new PrintStream(os);
        pw.println(toString());
    }

    public static Appartment readFromFile(BufferedReader br) throws IOException {
        String[] temp = br.readLine().split(" ");
        Appartment appartment = new Appartment(Integer.parseInt(temp[0]), temp[1]);
        String line = br.readLine();
        while (line != null) {
            appartment.addPerson(line);
            line = br.readLine();
        }
        return appartment;
    }

    public static void printAppartment(String filename) throws IOException {
        FileInputStream is = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
        }
    }

    @Override
    public String toString() {
        String result = size + " " + address + " " + "\n";
        for (int i = 0; i < numPeople(); i++) {
            result += people.get(i);
            if (i != numPeople()-1) {
                result += " ";
            }
        }
        return result;
    }

    
}
