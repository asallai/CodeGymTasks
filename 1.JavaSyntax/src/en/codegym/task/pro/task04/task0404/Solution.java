package en.codegym.task.pro.task04.task0404;

/* 
Filled rectangle
*/

public class Solution {
    public static void main(String[] args) {
        int height = 1;
        int width;
        while(height <= 5) {
            width = 1;
             while(width <= 10) {
                System.out.print('Q');
                width++;
             }
             System.out.println();
             height++;
        }
    }
}