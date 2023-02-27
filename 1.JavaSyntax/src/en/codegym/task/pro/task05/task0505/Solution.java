package en.codegym.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the next number: ");
            array[i] = scanner.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
