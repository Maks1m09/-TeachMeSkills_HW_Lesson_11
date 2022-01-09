package com.teachmeskills.homework_11;

import java.io.*;
import java.util.Scanner;

public class Task11 {
    public void Task() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path for reading");
        String fileForRead = scanner.nextLine();
        System.out.println("Enter the path for recording");
        String fileForWriter = scanner.nextLine();
        System.out.println("Enter the path for Errors");
        String fileToRecordErrors = scanner.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileForRead));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileForWriter));
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileToRecordErrors));
        scanner.close();
        String s;
        StringBuilder stringBuilder = new StringBuilder();
        while ((s = bufferedReader.readLine()) != null) {
            stringBuilder.append(s).append("\n");
        }
        bufferedReader.close();
        String[] stringArray = stringBuilder.toString().split("\n");
        for (String value : stringArray) {
            if (value.length() >= 15 && (value.startsWith("docnum") || value.startsWith("сontract"))) {
                bufferedWriter.write(value + "\n");
            } else if (value.length() < 15) {
                bufferedWriter2.write(value + " The length is small" + "\n");
            } else if (value.length() > 15 && !(value.startsWith("docnum") || value.startsWith("сontract"))) {
                bufferedWriter2.write(value + " Word does not start with docnum or сontract" + "\n");
            }
        }
        bufferedWriter.close();
        bufferedWriter2.close();
    }
}
