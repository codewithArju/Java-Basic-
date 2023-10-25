public class Leftshiftarray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,};
        int shiftAmount = 1;

        System.out.println("Before left shift:");
        printArray(array);

        leftShiftArray(array, shiftAmount);

        System.out.println("After left shift:");
        printArray(array);
    }

    public static void leftShiftArray(int[] array, int shiftAmount) {
        int length = array.length;

        // Adjust shiftAmount to avoid unnecessary shifts
        shiftAmount = shiftAmount % length;

        // Perform left shift
        for (int i = 0; i < shiftAmount; i++) {
            int temp = array[0];

            for (int j = 0; j < length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[length - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
}
