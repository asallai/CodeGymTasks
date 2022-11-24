package en.codegym.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Area of a circle
*/

public class Solution {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        if(radius >= 0) {
            int area = (int)(pi * radius * radius);
            System.out.println(area);
        }
    }
}