public class Main {
    public static void main(String[] args) {

        int[] queue = {6, 2, 6, 8, 3, 7, 1, 4, 4};
        int intNumber = 9; // redundant, you can always get the value from size or length
        int subArraySize = 3;
        System.out.println(Collections.maxUniqueNumber(subArraySize, queue));
    }
}
