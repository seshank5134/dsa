class Solution {
   public static int characterReplacement(String s, int k) {

    int left = 0;
    int maxLen = 0;
    int maxFreq = 0;
    int[] freq = new int[26]; // here we use in[26] instead of hashmap There are only 26 uppercase English letters, so an int[26] is faster and uses less memory than a HashMap

    for (int right = 0; right < s.length(); right++) {

        //  Add current character to frequency array

        freq[s.charAt(right) - 'A']++;

        //  Update maxFreq
        // why we dont decrease becoz We never decrease maxFreq because a stale maximum is still safe and avoids rescanning the frequency array.

        maxFreq = Math.max(maxFreq,
                           freq[s.charAt(right) - 'A']);

        //  If window is invalid, shrink it

        while ((right - left + 1) - maxFreq > k) {

            freq[s.charAt(left) - 'A']--; // here we use asci calculation so that we can check frequency 
            left++;
        }

        // Update answer

        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}


}