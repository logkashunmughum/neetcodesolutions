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
