public class Array {
static void rotateleft(int[]a){// here i am rotate an array of each element oncetime leftside.Q(.2)
    int temp =a [0];
    for (int i=a.length;i<a.length;i++){
       a[i-1] =a[i]; 
   } 
   a[a.length-1]=temp;
}
 public static void leftShiftArray(int[] array, int k) {//here i am rotate array element in leftside[Q-2]

    int length = array.length;
 //  avoid unnecessary shifts
    k = k % length;
// logic left shift
   for (int i = 0; i < k; i++)
    {
       int temp = array[0];
   for (int j = 0; j < array.length - 1; j++) 
   {
       array[j] = array[j + 1];
   }
     array[length - 1] = temp;

     }
   }     

 public static void printArray(int[] array) {
       for (int element : array)
    {
      System.out.print(element + " ");
     }
        System.out.println();
    }

 public static void rightShiftArray(int[] arr, int shift) {//1----
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
    
    public static void printArray2(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }   
 

 
 static boolean isSorted(int[] arr){// here i am shorted an array .Q(3)
   for (int i = 0; i < arr.length - 1; i++)
      {
       if (arr[i] > arr[i + 1]) 
       { 
        return false; // Found an Array element out of order
      }

    }
     return true; // All elements of an Array are in non-decreasing order
}
 public static void findMinMax(int[] arr) {// here i am found Max,Min element in array.Q(5)
  int min = arr[0];
  int max = arr[0];
        
 for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) 
     {
      min = arr[i];
     }

 if (arr[i] > max) 
   {
    max = arr[i];
   }
 }
        
System.out.println("Minimum: " + min);
System.out.println("Maximum: " + max);

}
  //public static int[] removeDuplicate (int[] array, int k){

 // }
    
public static void main(String[] args) {
    //--------------(.2)
    System.out.println("WELCOME TO MY ARRAY PROGRAM"); 
    int [] a = {1,2,3,4,5,};
    System.out.print("Before left shift:");
    for (int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+ " ");
    }
   System.out.println();
    rotateleft(a);
    for(int i=0; i<a.length;i++)
    {
      System.out.print(a[i] +" "); 
    }
    System.out.println("After Left shift:");

    //---------------[-2]

   int[] array = {1,2,3,4,5,6,7,8,9,};
   int k = 1;

    System.out.println("Before left shift:");
    printArray(array);

   leftShiftArray(array, k);

   System.out.println("After left shift:");
   printArray2(array);
   
    //---------------1
    int[] arr = {1, 2, 3, 4, 5};
        int shift = 2;
        
        System.out.println("Original Array: ");
        printArray(arr);
        
        rightShiftArray(arr, shift);
        
        System.out.println("Array after right shift: ");
        printArray(arr);
    //------------ 3
     int[] array1 = {1, 2, 3, 4, 5};
     int[] array2 = {7, 2, 6, 9, 3};    
     System.out.println("Is array1 sorted? " + isSorted(array1));
     System.out.println("Is array2 sorted? " + isSorted(array2));

    //---------- 5
    int[] nums = {5, 9, 10, 1, 7, 3};
    findMinMax(nums);

   }
} 