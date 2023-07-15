import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = scanner.nextInt();
        System.out.print("Enter maximum Limit ");
        int limit = scanner.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        limitSum(array,limit);

    }

    public static void limitSum(int array[], int limit) {
        int preSum = 0;
        for (int a = 0; a < array.length; a++) {
            preSum += array[a];
        }
        int i = 0;
        while (preSum > limit) {
            preSum -= array[i];
            i++;
        }
        System.out.println(preSum);
    }

}