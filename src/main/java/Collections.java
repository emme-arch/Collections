import java.util.*;

public class Collections {
    static int maxNum;

    public static int maxUniqueNumber(int subArraySize, int[] arr) {
        maxNum = 0;
        Deque<Object> queue = new ArrayDeque<>();
        for (int x = 0; x <= arr.length - 1; x++) queue.add(arr[x]);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x = 0; x < arr.length - subArraySize; x++) {
            Object[] temp = queue.toArray();
            for (int i = 0; i < subArraySize; i++) {
                hashSet.add((Integer) temp[i]);
            }
            queue.remove();
            if (hashSet.size() > maxNum) maxNum = hashSet.size();
            hashSet.clear();
        }
        return maxNum;
    }
}
