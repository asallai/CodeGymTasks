package en.codegym.task.pro.task03.task0313;

public class Solution {
    public static String string1 = "Amigo";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "The references to the strings are the same";
        String different = "The references to the strings are different";
        System.out.println(string1 == string2 ? same : different);
        System.out.println(string1 == string3 ? same : different);
        System.out.println(string2 == string3 ? same : different);
    }
}
