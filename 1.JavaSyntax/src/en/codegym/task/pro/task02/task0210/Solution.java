package en.codegym.task.pro.task02.task0210;

/* 
Bigger every time
*/

public class Solution {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + 
                         Integer.parseInt(bigAmount);

        System.out.println(hugeAmount);
    }
}
