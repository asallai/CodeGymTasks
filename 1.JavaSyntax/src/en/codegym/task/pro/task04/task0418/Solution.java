package en.codegym.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Is the glass half empty or half full?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        int result;

        Scanner scanner = new Scanner(System.in);
        boolean isOptimist = scanner.nextBoolean();
        if(isOptimist) {
            result = (int) Math.ceil(glass);
        } else {
            result = (int) Math.floor(glass);
        }
        System.out.println(result);
    }
}