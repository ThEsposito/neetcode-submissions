class Solution {
    public static boolean isValid(String s) {
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')','(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        Stack<Character> lastOpened = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(closeToOpen.containsKey(c)) {
                if(lastOpened.isEmpty() || lastOpened.pop() != closeToOpen.get(c)) return false;
            } else {
                lastOpened.push(c);
            }
        }
        return lastOpened.isEmpty();
    }
}
