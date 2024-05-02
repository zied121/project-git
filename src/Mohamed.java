public class Mohamed {
    public static double calculateArrayAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double average = calculateArrayAverage(arr);
        System.out.println("Average of the array elements: " + average);
    }
}