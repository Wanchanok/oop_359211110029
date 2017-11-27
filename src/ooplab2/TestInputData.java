package ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestInputData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.print("What is your name : ");
        String name = reader.readLine();
        System.out.println("Your name is " +name);
        System.out.println("How old are you? : ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You are "+age+" years old. ");

        // Scanner
        Scanner Scanner = new Scanner(System.in);
        System.out.print("What are you? : ");
        String address = Scanner.nextLine();
        System.out.println("You from :"+address);
        // testing push
    }// main
}// class
