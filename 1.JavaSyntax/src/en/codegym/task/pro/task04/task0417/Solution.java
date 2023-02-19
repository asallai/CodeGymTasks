package en.codegym.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Wind speed
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedInMetersPerSecond = scanner.nextInt();
        int speedInKilometersPerHour = (int) Math.round(speedInMetersPerSecond * 3.6);
        System.out.println(speedInKilometersPerHour);
    }
}