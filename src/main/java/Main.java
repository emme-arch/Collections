public class Main {
    public static void main(String[] args) {
        int[] queue = {6, 2, 6, 8, 3, 7, 1, 4, 4};
        int intNumber = 9;
        int subArraySize = 3;
        System.out.println(Collections.maxUniqueNumber(intNumber, subArraySize, queue));
    }
}
