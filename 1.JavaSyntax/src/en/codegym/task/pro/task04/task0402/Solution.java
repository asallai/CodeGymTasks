package en.codegym.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Everyone wants to be loved
*/

public class Solution {
    public static void main(String[] args) {
        String text = " loves me.";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i = 1;
        while(i <= 10) {
            System.out.println(name + text);
            i++;
        }
    }
}
