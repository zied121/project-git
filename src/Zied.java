public class Zied {
    public static int calculateArraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = calculateArraySum(arr);
        System.out.println("Sum of the array elements: " + sum);
    }
}