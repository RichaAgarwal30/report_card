package com.student;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Student1 Name :");
        String Student1 = scn.nextLine();
        System.out.print("Enter Student2 Name :");
        String Student2 = scn.nextLine();
        System.out.println("Student1 is =" + Student1);
        System.out.println("Student2 is =" + Student2);
    }

}
