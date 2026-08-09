class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> charCounts = new HashMap<>();
        int n = s.length();

        for(int i = 0; i < n; i++) {
            Character charS = s.charAt(i);
            if(!charCounts.containsKey(charS)) {
                charCounts.put(charS, 1);
            } else {
                charCounts.put(charS, charCounts.get(charS) + 1);
            }

            Character charT = t.charAt(i);
            if(!charCounts.containsKey(charT)) {
                charCounts.put(charT, -1);
            } else {
                charCounts.put(charT, charCounts.get(charT) - 1);
            }
        }

        for (Integer count : charCounts.values()) {
            if(count != 0) return false;
        }

        return true;
    }
}
