package en.codegym.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Minimum of N numbers
*/

public class Solution {

   public static int[] array;

    // My solution

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        array = new int[n];

        for (int i=0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i=0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Min value = " + min);
    }

    // THEIR SOLUTION
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
     */
}
