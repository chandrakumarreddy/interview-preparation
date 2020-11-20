// Remove even elements from an array

class Main {
  static int[] removeEvens(int[] arr) {
    int oddCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        ++oddCount;
      }
    }
    int result_index = 0;
    int[] tempArr = new int[oddCount];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        tempArr[result_index++] = arr[i];
      }
    }
    return tempArr;
  }

  public static void main(String[] args) {
    int size = 10;
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    System.out.println("Array before");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    int[] newArr = removeEvens(arr);
    System.out.println("Array after");
    for (int i = 0; i < newArr.length; i++) {
      System.out.print(newArr[i] + " ");
    }
  }
}