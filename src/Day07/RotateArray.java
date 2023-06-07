package Day07;

public class RotateArray {
    static int[] rotate(int arr[],int r){
        for(int i = 0; i < r; i++){
            int j, first;
            first = arr[0];
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        return arr;
    }
    public static void main(String[] args) {


        int [] arr = new int [] {1,2,3,4,5,6,7};
        int r = 2;
        int[] res = rotate(arr, r);
        System.out.println("Array after left rotation: ");
        for(int i = 0; i< res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
