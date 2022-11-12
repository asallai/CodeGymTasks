package en.codegym.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Second smallest number entered
*/

// CODEGYM SOLUTION
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = console.nextInt();
        int secondMin = console.nextInt();
        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if(min == secondMin) {
                if(x < min) {
                    min = x;
                } else {
                    secondMin = x;
                }
            } else if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}


// MY SOLUTION - NOT CORRECT
/*
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int number;

        while(scanner.hasNextInt()) {
            i++;
            number = scanner.nextInt();
            if(number < min2 ) {
                if(number < min1)
                    min1 = number;
                else min2 = number;
            }
            System.out.println(number + " " + min1 + " " + min2);
        }

        if(i < 2)
            System.err.println("ERROR");
        else
            System.out.println(min2);
    }
}
*/
