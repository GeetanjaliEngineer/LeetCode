public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1,  right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid; // mid could be the first bad version
            } else {
                left = mid + 1; // search in the right half
            }
        }

        return left; // left == right, first bad version
    }
}
