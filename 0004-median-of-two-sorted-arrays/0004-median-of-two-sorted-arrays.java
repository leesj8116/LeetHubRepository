class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
		int[] arr = new int[length];

        // 개선 1. 두 배열을 합칠 때 부터 정렬을 적용해서 개선
        int p1 = 0; int p2 = 0;
        int index = 0;
        while((p1 < nums1.length) && (p2 < nums2.length)) {
            // 비교 후 더 작은 수 부터 삽입
            arr[index++] = (nums1[p1] < nums2[p2]) ? nums1[p1++] : nums2[p2++];
        }

        // 한쪽 배열의 길이가 짧아 다 삽입하지 못한 경우, 남은 배열을 마저 삽입
        while (p1 < nums1.length) {
            arr[index++] = nums1[p1++];
        }
        while (p2 < nums2.length) {
            arr[index++] = nums2[p2++];
        }

		if (length % 2 == 0) {
			return ((arr[length / 2] + arr[(length / 2) - 1]) / 2.0f);
		} else {
			return arr[length / 2];
		}
    }
}