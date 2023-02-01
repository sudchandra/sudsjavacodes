class Linear {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 5, 6 };
        int ele = 9;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == ele)

            {
                System.out.println("element found at location" + i);
            } else {
                System.out.println("elee not found");
            }
        }

    }
}