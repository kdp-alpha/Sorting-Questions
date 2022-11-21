//https://www.techiedelight.com/smallest-window-sorting-which-make-array-sorted/

public class MyClass {
    public static void main(String args[]) {
        int[] arr = {
            1,
            2,
            3,
            7,
            5,
            6,
            4,
            8
        };
        int rightidx = -1;
        int maxsofar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxsofar < arr[i]) {
                maxsofar = arr[i];
            }

            if (arr[i] < maxsofar) {
                rightidx = i;
            }
        }
        int leftidx = -1;
        int minsofar = Integer.MAX_VALUE;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (minsofar > arr[j]) {
                minsofar = arr[j];
            }

            if (arr[j] > minsofar) {
                leftidx = j;
            }
        }

        swap(arr, rightidx, leftidx);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
