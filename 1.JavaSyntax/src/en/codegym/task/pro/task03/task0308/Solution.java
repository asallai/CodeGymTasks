package en.codegym.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Quadrants
*/

public class Solution {
    public static void main(String[] args) {
        int quadrant;

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0)
            quadrant = 1;
        else if (x < 0 && y > 0)
            quadrant = 2;
        else if (x < 0 && y < 0)
            quadrant = 3;
        else if (x > 0 && y < 0)
            quadrant = 4;
        else quadrant = 0;

        System.out.println(quadrant);
    }
}
