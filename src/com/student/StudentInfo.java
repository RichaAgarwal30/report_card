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

        StudentInfo studentInfo = new StudentInfo();
        String subject1 = "English";
        String gradeInEnglish = "";
        float marksInEnglish = 0;

        String subject2 = "Hindi";
        String gradesInHindi = "";
        float marksInHindi = 0;

        String subject3 = "Maths";
        String gradesInMaths = "";
        float marksInMaths = 0;

        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        System.out.print("Enter Student1 Name :");
        String Student1 = br.readLine();

        System.out.print("Enter Marks in " + subject1 + ":");
        marksInEnglish = Float.parseFloat(br.readLine());

        System.out.print("Enter Marks in " + subject2 + ":");
        marksInHindi = Float.parseFloat(br.readLine());

        System.out.print("Enter Marks in " + subject3 + ":");
        marksInMaths = Float.parseFloat(br.readLine());

        gradeInEnglish = studentInfo.calculateGrade(marksInEnglish);
        gradesInHindi = studentInfo.calculateGrade(marksInHindi);
        gradesInMaths = studentInfo.calculateGrade(marksInMaths);

        System.out.println("----------------------");
        System.out.println("Student1 :" + Student1);
        System.out.println("----------------------");
        System.out.println("Subjects" + " " + "Marks" + " " + "Grade");

        System.out.println(subject1 + " " + marksInEnglish + " " + gradeInEnglish);
        System.out.println(subject2 + " " + marksInHindi + " " + gradesInHindi);
        System.out.println(subject3 + " " + marksInMaths + " " + gradesInMaths);
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
}