class Main {
  static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
    int s1 = arr1.length;
    int s2 = arr2.length;
    int[] resultArr = new int[s1 + s2];
    int i = 0, j = 0, k = 0;
    while (i < s1 && j < s2) {
      if (arr1[i] < arr2[j]) {
        resultArr[k++] = arr1[i++];
      }
      else {
        resultArr[k++] = arr2[j++];
      }
    }
    while (i < s1) {
      resultArr[k++] = arr1[i++];
    }
    while (j < s2) {
      resultArr[k++] = arr2[j++];
    }
    return resultArr;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 12, 14, 17, 23 };
    int[] arr2 = { 11, 19, 27 };
    int[] mergedArr = mergeTwoArrays(arr1, arr2);
    for (int i = 0; i < mergedArr.length; i++) {
      System.out.println(mergedArr[i]);
    }
  }
}