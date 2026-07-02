class Bird{
    public static void main(String[] args) {
        String s = "AAABAB";
        int k = 1;
        int result = replacement(s,k);
        System.out.println(result);
    }
    
   public static int replacement(String s, int k) {

    int left = 0;
    int maxLen = 0;
    int maxFreq = 0;

    int[] freq = new int[26];

    for (int right = 0; right < s.length(); right++) {

        //  Add current character to frequency array

        freq[s.charAt(right) - 'A']++;

        //  Update maxFreq

        maxFreq = Math.max(maxFreq,
                           freq[s.charAt(right) - 'A']);

        //  If window is invalid, shrink it

        while ((right - left + 1) - maxFreq > k) {

            freq[s.charAt(left) - 'A']--;
            left++;
        }

        // Update answer

        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}
}