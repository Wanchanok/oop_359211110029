package ooplab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalGrade {
//    score 0-49 grad F
//    score 50-59 grad D
//    score 60-69 grad C
//    score 70-79 grad B
//    score 80-100 grad A
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int count =0;
    int score = 0;
    for (int i=1;i<=3;i++) {
        System.out.print("Enter you Score (1-100): ");
        score = Integer.parseInt(reader.readLine());
        if (score < 0 || score > 100) {
            count++;
            if (count == 3) {
                System.out.println("System Error.");
                break;
            }

    }else{
        if (score <=49) {
            System.out.println("Your grad  : F");
        } else if (score <= 59) {
            System.out.println("Your grad  : D");
        } else if (score <= 69) {
            System.out.println("Your grad : C");
        } else if (score <= 79) {
            System.out.println("Your grad : B");
        } else {
            System.out.println("Your grad A");

        }
            break;

    }
    }
}// main
}//class

