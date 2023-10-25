public class ArrayRightShift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int shift = 2;
        
        System.out.println("Original Array: ");
        printArray(arr);
        
        rightShiftArray(arr, shift);
        
        System.out.println("Array after right shift: ");
        printArray(arr);
    }
    
    public static void rightShiftArray(int[] arr, int shift) {
        int length = arr.length;
        
        // Perform right shift 'shift' number of times
        for (int i = 0; i < shift; i++) {
            int lastElement = arr[length - 1];
            
            // Shift elements to the right
            for (int j = length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            
            // Assign the last element to the first position
            arr[0] = lastElement;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
