package en.codegym.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Three numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a == c)
                System.out.print(a + " " + b + " " + c);
        else if (a == b)
            System.out.print(a + " " + b);
        else if (a == c)
            System.out.print(a + " " + c);
        else if (b == c)
            System.out.print(b + " " + c);
    }
}
