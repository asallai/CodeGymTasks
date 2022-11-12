package en.codegym.task.pro.task04.task0407;

/* 
Sum of numbers not divisible by 3
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0, num = 1;
        while(num <= 100) {
            if(num % 3 == 0) {
                num++;
                continue;
            }
            sum = sum + num;
            num++;
        }
        System.out.println(sum);
    }
}