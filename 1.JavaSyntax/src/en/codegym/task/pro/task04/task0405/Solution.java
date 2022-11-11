package en.codegym.task.pro.task04.task0405;

/* 
Unfilled rectangle
*/

public class Solution {
    public static void main(String[] args) {
        int row = 1;
        int column;

        while(row <= 10) {
            column = 1;

            while(column <= 20) {
                if(row == 1 || row == 10)
                    System.out.print('B');
                else {
                    if(column == 1 || column == 20)
                      System.out.print('B');
                    else
                      System.out.print(' ');
               }
                column++;
            }
            System.out.println();
            row++;
        }
    }
}