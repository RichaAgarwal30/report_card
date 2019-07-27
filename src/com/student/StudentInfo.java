/*There are 2 students having 3 subjects each: English, Hindi, Maths
        Write a program to give user input for their marks in each subject. The report card for each student needs to be printed on console like below:
        Student 1:
        Subject Marks Grade
        English 40 C
        Hindi 92 A+
        Maths 61 B
        Total 193 B
        Pass

        Student 2:
        Subject Marks Grade
        English 30 F
        Hindi 80 A
        Maths 52 B+
        Total 162 F
        Fail

        Grading should be as follows in one subject or on total
        Marks/Percent Grade
        90-100 A+
        80-89 A
        70-79 B+
        60-69 B
        50-59 C+
        40-49 C
        0-40 F

        If student gets F in any subject.he should be failed
        */

package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentInfo {
    public static void main(String[] args) throws IOException {

        String Subject1 = "English", Subject2 = "Hindi", Subject3 = "Maths";

        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        System.out.print("Enter Student1 Name :");
        String Student1 = br.readLine();

        System.out.print("Enter Marks in " + Subject1 + ":");
        float E1 = Float.parseFloat(br.readLine());
        System.out.print("Enter Marks in " + Subject2 + ":");
        float H1 = Float.parseFloat(br.readLine());
        System.out.print("Enter Marks in " + Subject3 + ":");
        float M1 = Float.parseFloat(br.readLine());


        System.out.print("Enter Student2 Name :");
        String Student2 = br.readLine();

        System.out.print("Enter Marks in " + Subject1 + ":");
        float E2 = Float.parseFloat(br.readLine());
        System.out.print("Enter Marks in " + Subject2 + ":");
        float H2 = Float.parseFloat(br.readLine());
        System.out.print("Enter Marks in " + Subject3 + ":");
        float M2 = Float.parseFloat(br.readLine());

        System.out.println("----------------------");
        System.out.println("Student1 :" + Student1);
        System.out.println("----------------------");
        System.out.println("Subjects" + "  " + "Marks");

        System.out.println(Subject1 + "   " + E1);
        System.out.println(Subject2 + "     " + H1);
        System.out.println(Subject3 + "     " + M1);

        System.out.println("----------------------");
        System.out.println("Student2 :" + Student2);
        System.out.println("----------------------");

        System.out.println("Subjects" + "  " + "Marks");

        System.out.println(Subject1 + "   " + E2);
        System.out.println(Subject2 + "     " + H2);
        System.out.println(Subject3 + "     " + M2);

    }

}
