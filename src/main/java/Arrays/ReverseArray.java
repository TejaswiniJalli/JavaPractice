package Arrays;

public class ReverseArray {
    static int[] reverseArray(int[] arr,int n){
        int res[]=new int[n];
        int r=0;
        for(int i=n-1;i>=0;i--){
            res[r]=arr[i];
            r++;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int[] res = reverseArray(arr, n);
        for(int i=0;i<n;i++)
        System.out.print(res[i]+" ");

    }
}
