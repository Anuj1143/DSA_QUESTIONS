class Solution {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        // Transform string: add # between characters
        StringBuilder t = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            t.append("#").append(c);
        }
        t.append("#$");

        int n = t.length();
        int[] P = new int[n];
        int center = 0, right = 0;

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right)
                P[i] = Math.min(right - i, P[mirror]);

            // Expand around center i
            while (t.charAt(i + P[i] + 1) == t.charAt(i - P[i] - 1)) {
                P[i]++;
            }

            // Update center and right
            if (i + P[i] > right) {
                center = i;
                right = i + P[i];
            }
        }

        // Find max length and center
        int maxLen = 0, centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}