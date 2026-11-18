package org.example;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the math mark: ");
        int math=sc.nextInt();
        System.out.println("Enter the eng mark: ");
        int eng=sc.nextInt();
        System.out.println("Enter the tam mark: ");
        int tam=sc.nextInt();
        double avg;
        avg = (math + eng + tam) / 3.0;
        if (avg >= 90)
            System.out.println("Grade: O");
        else if (avg >= 80)
            System.out.println("Grade: A+");
        else if (avg >= 70)
            System.out.println("Grade: A");
        else if (avg >= 60)
            System.out.println("Grade: B");
        else if (avg >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");

        sc.close();

    }
}