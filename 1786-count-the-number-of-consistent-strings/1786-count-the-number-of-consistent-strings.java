class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for (String word : words) {
            int i = 0;
            for (; i < word.length(); i++) {
                if (!set.contains(word.charAt(i))) break;
            }
            if (i == word.length()) count++;
        }
        return count;
    }
}
