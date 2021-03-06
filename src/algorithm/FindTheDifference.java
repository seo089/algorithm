/*Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.*/

package algorithm;

import java.util.HashMap;

public class FindTheDifference {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		
		System.out.println(findTheDifference(s,t));
	}

	public static char findTheDifference(String s, String t) {
		
		char result = ' ';
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < t.length(); i++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i),map.get(s.charAt(i))-1);
		}
		
		for(Character key : map.keySet()) {
			if(map.get(key) != 0) {
				result = key;
			}
		}
		
		return result;

	}
}
