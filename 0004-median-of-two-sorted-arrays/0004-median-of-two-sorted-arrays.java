class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
		int[] arr = new int[length];
		for (int i = 0 ; i < nums1.length; i++) {
			arr[i] = nums1[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			arr[nums1.length + i] = nums2[i];
		}

		// sorted
		arr = Arrays.stream(arr).sorted().toArray();

		if (length % 2 == 0) {
			return ((arr[length / 2] + arr[(length / 2) - 1]) / 2.0f);
		} else {
			return arr[length / 2];
		}
    }
}