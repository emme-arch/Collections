import java.util.*;

public class Collections {
    static int maxNum = 0;
    static int UniqueNumbers = 0;

    public static int maxUniqueNum(int intNumber, int subArraySize, int... arr) {

        for (int x = 0; x < intNumber - subArraySize; x++) {
            UniqueNumbers = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < subArraySize; i++) {
                if (!map.containsKey(arr[i + x])) {
                    ++UniqueNumbers;
                    map.put(arr[i + x], 1);
                }
            }
            if (UniqueNumbers > maxNum) maxNum = UniqueNumbers;
        }
        return maxNum;
    }
}
