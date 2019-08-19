
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
using for loop
*/

package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) throws NumberFormatException, IOException {

        StudentInfo studentInfo = new StudentInfo();

        int[] studentNumber = new int[3];


        String[] studentName = new String[3];
        String[] gradeInEnglish = new String[3];
        float[] marksInEnglish = new float[3];
        String[] gradesInHindi = new String[3];
        float[] marksInHindi = new float[3];
        String[] gradesInMaths = new String[3];
        float[] marksInMaths = new float[3];
        String[] gradesInTotal = new String[3];
        float[] totalMarks = new float[3];

        String subject1 = "English";
        String subject2 = "Hindi";
        String subject3 = "Maths";

        for (int i = 0; i < studentNumber.length; i++) {

            BufferedReader br = new BufferedReader(new
                    InputStreamReader(System.in));


            System.out.print("Enter Student Name : ");

            studentName[i] = br.readLine();

            marksInEnglish[i] = studentInfo.getMarks("English");

            marksInHindi[i] = studentInfo.getMarks("Hindi");

            marksInMaths[i] = studentInfo.getMarks("Maths");

            gradeInEnglish[i] = studentInfo.calculateGrade(marksInEnglish[i]);
            gradesInHindi[i] = studentInfo.calculateGrade(marksInHindi[i]);
            gradesInMaths[i] = studentInfo.calculateGrade(marksInMaths[i]);

            totalMarks[i] = marksInEnglish[i] + marksInHindi[i] + marksInMaths[i];
            gradesInTotal[i] = studentInfo.calculateTotalGrade(gradeInEnglish[i], gradesInHindi[i], gradesInMaths[i], totalMarks[i]);
        }

        for (int j = 0; j < studentName.length; j++) {

            System.out.println("----------------------");
            System.out.println("Student:" + studentName[j]);
            System.out.println("----------------------");
            System.out.println("Subjects" + "   " + "Marks" + "   " + "Grade");

            System.out.println(subject1 + "    " + marksInEnglish[j] + "    " + gradeInEnglish[j]);
            System.out.println(subject2 + "      " + marksInHindi[j] + "    " + gradesInHindi[j]);
            System.out.println(subject3 + "      " + marksInMaths[j] + "    " + gradesInMaths[j]);

            System.out.println("Total" + "      " + totalMarks[j] + "   " + gradesInTotal[j]);

            if (gradesInTotal[j] == "F") {
                System.out.println("Status : Fail");
            } else {
                System.out.println("Status : Paas");
            }

        }
    }


    public String calculateGrade(Float marks) {
        if (marks >= 90 && marks <= 100) {
            return "A+";
        } else if (marks >= 80 && marks <= 89) {
            return String.valueOf('A');
        } else if (marks >= 70 && marks <= 79) {
            return "B+";
        } else if (marks >= 60 && marks <= 69) {
            return String.valueOf('B');
        } else if (marks >= 50 && marks <= 59) {
            return "C+";
        } else if (marks >= 40 && marks <= 49) {
            return String.valueOf('C');
        } else if (marks >= 0 && marks <= 40) {
            return String.valueOf('F');
        } else {
            return null;
        }
    }

    public String calculateTotalGrade(String gradeInEnglish, String gradesInHindi, String gradesInMaths, float totalMarks) {
        if (gradeInEnglish.equals("F")) {
            return "F";

        } else if (gradesInHindi.equals("F")) {
            return "F";

        } else if (gradesInMaths.equals("F")) {
            return "F";
        } else {
            float percentMarks = totalMarks / 300 * 100;
            return calculateGrade(percentMarks);
        }
    }

    public float getMarks(String subject) {
        float marks = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter marks in " + subject + ": ");
                marks = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: You typed the wrong marks. Marks can only be numbers. Please try again:");
            } catch (NumberFormatException e) {
                System.out.println("Number");
            }
        }
        return marks;
    }

}




