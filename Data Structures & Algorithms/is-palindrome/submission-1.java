class Solution {
    private boolean isAlphanumeric(char c) {
        return Character.isLetterOrDigit(c);
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(!isAlphanumeric(s.charAt(i))) {
                i++;
                continue;
            }
            if(!isAlphanumeric(s.charAt(j))) {
                j--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }

        return true;
    }
}
