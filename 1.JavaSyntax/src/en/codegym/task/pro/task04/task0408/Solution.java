package en.codegym.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Maximum of entered numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int number;
        while(scanner.hasNextInt()) {
            number = scanner.nextInt();
            if(number > max && number % 2 == 0)
                max = number;
        }
        System.out.println(max);
    }
}