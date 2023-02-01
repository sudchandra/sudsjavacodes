class Selsort {
    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1 };
        int i, temp, j;
        for (i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (j = i + 1; j < arr.length - 1; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("the elements are");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}