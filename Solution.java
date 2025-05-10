package n9t5n2025;

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        d = d % arr.length;
        if(d == 0){
            return;
        }

        rotateArr1(arr, 0, d - 1);
        rotateArr1(arr, d, arr.length - 1);
        rotateArr1(arr, 0, arr.length - 1);
    }
    public static void rotateArr1(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
