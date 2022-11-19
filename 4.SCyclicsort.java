public class Main {
    public static void main(String[] args) {
        int[] arr = {
            3,
            5,
            2,
            1,
            4
        };
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = arr[i] - 1;
            if (arr[i] != arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                i++;
            }
        }


        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
