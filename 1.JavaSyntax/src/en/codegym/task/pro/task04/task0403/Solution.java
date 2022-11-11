package en.codegym.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Summation
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int sum = 0;
        while(!exit) {
            if(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else {
                String line = scanner.nextLine();
                if(line.equals("ENTER"))
                    exit = true;
            }
        }
        System.out.println(sum);
    }
}