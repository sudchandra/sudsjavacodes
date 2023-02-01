// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Bubblesort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 3, 40, 65, 5 };
        int i;
        int j;
        int temp;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("the elements are");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}