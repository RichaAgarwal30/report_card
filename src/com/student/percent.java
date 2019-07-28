package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percent {
    public static void main(String[] args) throws IOException {

        int percent = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int total = 0;


        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        System.out.println("Enter x:");
        x = Integer.parseInt(br.readLine());
        System.out.println("Enter y:");
        y = Integer.parseInt(br.readLine());
        System.out.println("Enter z:");
        z = Integer.parseInt(br.readLine());

        total = x + y + z;

        percent = (total / 300) * 100;

        System.out.println("Percentage :" + percent);
    }

}
