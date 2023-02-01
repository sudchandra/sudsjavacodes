class Test8 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 3, 5, 6, 7 };
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}