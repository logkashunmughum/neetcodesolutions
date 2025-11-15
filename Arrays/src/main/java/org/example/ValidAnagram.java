/** Given two strings s and t, return true if t is an anagram of s, and false otherwise.



        Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

        1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */

package org.example;

public class ValidAnagram {

    public static void main(String[] args) {
        if (isAnagram("anagram", "naagram")) {
            System.out.println("Anagram found");
        } else {
            System.out.println("Not anagram");
        }
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (char a : s.toCharArray()) freq[a - 'a']++;
        for (char a : t.toCharArray()) {
            if(--freq[a - 'a'] < 0) return false;
        }
        return true;
    }
}
