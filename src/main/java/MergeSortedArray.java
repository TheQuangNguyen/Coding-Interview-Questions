import java.util.ArrayList;

public class MergeSortedArray {

    // Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
    // Note:
    // The number of elements initialized in nums1 and nums2 are m and n respectively.
    // You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

    // Input:
    // nums1 = [1,2,3,0,0,0], m = 3
    // nums2 = [2,5,6],       n = 3
    //
    // Output: [1,2,2,3,5,6]

    // nums1 = [1,2,2,4,0,0]
    // nums2 = [3,5,6]


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
//        int currentTempIndex = 0;
        int currentIndex1 = 0;
        int currentIndex2 = 0;

        while (currentIndex1 < m) {
            if (temp.isEmpty()) {
                if (nums1[currentIndex1] > nums2[currentIndex2]) {
                    temp.add(nums1[currentIndex1]);
                    nums1[currentIndex1] = nums2[currentIndex2];
                    currentIndex1++;
                    currentIndex2++;
                } else {
                    currentIndex1++;
                }
            } else {
                if (temp.get(0) > nums2[currentIndex2]) {
                    temp.add(nums1[currentIndex1]);
                    nums1[currentIndex1] = nums2[currentIndex2];
                    currentIndex1++;
                    currentIndex2++;
                } else {
                    temp.add(nums1[currentIndex1]);
                    nums1[currentIndex1] = temp.remove(0);
                    currentIndex1++;
                }
            }
        }

        while (currentIndex1 < nums1.length) {
            if (!temp.isEmpty()) {
                if (temp.get(0) > nums2[currentIndex2]) {
                    nums1[currentIndex1] = nums2[currentIndex2];
                    currentIndex1++;
                    currentIndex2++;
                } else {
                    nums1[currentIndex1] = temp.remove(0);
                    currentIndex1++;
                }
            } else {
                nums1[currentIndex1] = nums2[currentIndex2];
                currentIndex1++;
                currentIndex2++;
            }
        }
    }
}
