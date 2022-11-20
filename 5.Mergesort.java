public class MyClass {
  public static void main(String args[]) {
    int[] arr = {
      3,
      5,
      8,
      4,
      1,
      9,
      -2
    };

    int[] ans = merge(arr, 0, arr.length - 1);

    for (int i = 0; i < ans.length; i++) {
      System.out.println(ans[i]);
    }

  }

  private static int[] merge(int[] arr, int lo, int hi) {
    if (lo == hi) {
      int[] ba = new int[1];
      ba[0] = arr[lo];
      return ba;
    }
    int mid = lo + (hi - lo) / 2;
    int[] lh = merge(arr, lo, mid);
    int[] rh = merge(arr, mid + 1, hi);
    int[] sh = sortarr(lh, rh);
    return sh;

  }

  private static int[] sortarr(int[] a, int[] b) {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] ans = new int[a.length + b.length];
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        ans[k] = a[i];
        i++;
      } else {
        ans[k] = b[j];
        j++;
      }
      k++;
    }

    while (i < a.length) {
      ans[k] = a[i];
      k++;
      i++;
    }

    while (j < b.length) {
      ans[k] = b[j];
      k++;
      j++;
    }

    return ans;
  }
}
