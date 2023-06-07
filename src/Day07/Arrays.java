package Day07;

class Arrays {
    static int[] minMax(int[] arr, int n)
    {
        int min=arr[0];
        int max=arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] res = new int[2];
        res[0] = min;
        res[1] = max;
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = { 10, 60, 15, 20, 50 };
        int n = arr.length;
        int[] res = minMax(arr, n);
        System.out.println("Maximum number in array is: " + res[1]);
        System.out.println("Minimum number in array is: " + res[0]);
    }
}
