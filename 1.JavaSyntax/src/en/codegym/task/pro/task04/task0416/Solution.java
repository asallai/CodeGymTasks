package en.codegym.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cans = scanner.nextInt();
        int people = scanner.nextInt();

        double result = 1.0 * cans / people;

        System.out.println(result);
    }
}