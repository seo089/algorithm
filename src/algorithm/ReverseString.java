package algorithm;

/*Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.



Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/


import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {

//        Stack<Character> ch = new Stack<Character>();
//
//        for(int i = 0; i< s.length; i++){
//            ch.push(s[i]);
//        }
//
//        for (int i = 0; i < s.length; i++){
//            s[i] = ch.pop();
//        }

        char temp;

        for (int i = 0, j = s.length - 1; i < j ; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

    }
}
