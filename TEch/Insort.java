class Insort {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2, 1 };
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++) {
            int min = arr[0];
            for (j = i + 1; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[j];
            arr[j] = temp;
        }
        System.out.println("the eleements are");
        for (i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

    }
}
