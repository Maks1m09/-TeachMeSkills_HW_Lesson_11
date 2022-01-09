package com.teachmeskills.homework_11;

import java.io.*;


public class Runner {
    public static void main(String[] args) {
        Task11 task11 = new Task11();
        try {
            task11.Task();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
