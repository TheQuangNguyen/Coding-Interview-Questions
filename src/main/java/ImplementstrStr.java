public class ImplementstrStr {

    // Implement strStr()
    // Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack

    // Input: haystack = "hello", needle = "ll"
    // Output: 2

    // Input: haystack = "aaaaa", needle = "bba"
    // Output: -1

    public int strStr(String haystack, String needle) {
        int needleIndex = 0;
        int haystackIndex = 0;

        for (int i = 0; i < haystack.length(); i++) {
            char haystackLetter = haystack.charAt(haystackIndex);
            char needleLetter = needle.charAt(needleIndex);
            if (haystackLetter == needleLetter) {
//                int tempHaystackIndex = haystackIndex
            }
        }

        return 1;
    }
}
