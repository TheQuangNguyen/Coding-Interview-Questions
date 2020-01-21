package CrackingTheCodingInterview.ArraysAndStrings;

public class URLify {

    // Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the true length of the string. Note: if implementing in Java, please use a character array so that you can perform this operation in place

    // Input: 'Mr John Smith    ", 13
    // Output: 'Mr%20John%20Smith"

    public static char[] urlify(char[] inputString, int length) {
        if (inputString.length < 3) {
            return inputString;
        }

        int endSpaces = inputString.length - length;
        int numberOfSpaces = endSpaces / 2;
        int endIndex = inputString.length - 1;
        int traverseIndex = inputString.length - endSpaces - 1;

        while (traverseIndex > 0 && numberOfSpaces > 0) {
            if (inputString[traverseIndex] == ' ') {
                inputString[endIndex--] = '0';
                inputString[endIndex--] = '2';
                inputString[endIndex--] = '%';
                numberOfSpaces--;
            } else {
                inputString[endIndex--] = inputString[traverseIndex];
            }
            traverseIndex--;
        }

        return inputString;
    }
}
