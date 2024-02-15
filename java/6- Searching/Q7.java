public class Q7 {
    static int orderAgnosticBS(MountainArray mountainArr, int target, int s, int e) {
        boolean isAsc = mountainArr.get(s) < mountainArr.get(e);

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            }
            if (isAsc) {
                if (midValue < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (midValue < target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return -1;
    }

    static int findPeak(MountainArray mountainArr) {
        int s = 0;
        int e = mountainArr.length() - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }
}
