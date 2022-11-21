public class Main {
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args) {
    int[] arr = {
      1,
      0,
      1,
      0,
      1,
      0,
      0,
      1
    };

    int pivot = 1;
    int i = 0;
    int j = 0;

    while (i < arr.length) {
      if (arr[i] >= pivot) {
        i++;
      } else {
        swap(arr, i, j);
        i++;
        j++;
      }
    }

    for (int k = 0; k < arr.length; k++) {
      System.out.println(arr[k]);
    }
  }
}
