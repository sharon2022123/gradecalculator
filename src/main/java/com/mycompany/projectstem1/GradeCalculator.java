/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.projectstem1;
import java.util.Scanner;

/**
 *
 * @author shhe4315
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asks user for course code input
        System.out.println("Please enter the course name.");
        String name = input.nextLine();

        //asks user for average time in minutes
        System.out.println("Please enter the average time spent in a week for this course in minutes.");
        int time = input.nextInt();

        //asks user for homeowrk grades as ints
        System.out.println("Please enter the homework grades for this course.");
        int homework1 = input.nextInt();
        int homework2 = input.nextInt();
        int homework3 = input.nextInt();
        int homework4 = input.nextInt();

        //calculates average hw grade as double
        double averagehw = (double) (homework1+homework2+homework3+ homework4)/4;

        //asks user for quiz grade as doubles
        System.out.println("Please enter the quiz grades for this course.");
        double quiz1 = input.nextDouble();
        double quiz2 = input.nextDouble();

        //calculate average quiz grades
        double averagequiz = (quiz1+quiz2)/2;

        //asks user for final exam grade
        System.out.println("Please enter the final exam grade for this course.");
        double exam = input.nextDouble();
        //prints the inputs of user
        System.out.println("Course name: " + name);

        //converts minutes to hours and minutes
        System.out.println("Weekly time spent: " + time/60+"h"+time%60);

        //prints averages
        System.out.println("Average homework grade: " + averagehw);
        System.out.println("Average quiz grade: " + averagequiz);
        System.out.println("Final exam grade: " + exam);

        //uses weights to calculate overall grade
        double average = (averagehw*0.35 + averagequiz*.15 + exam*.5)+0.5;

        //prints final overall grade
        System.out.println("Overall grade: " + (int)(average));
    }
}
