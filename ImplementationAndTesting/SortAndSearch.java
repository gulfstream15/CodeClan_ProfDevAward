public class SortAndSearch {
 
  public static void main(String[] args) {
               
    int[] myStartArray = {1, 4, 6, 7, 9, 2, 3};
    int[] mySortedArray;

    int target = 4;
    int indexBeforeSort = 0;
    int indexAfterSort = 0;
               
    System.out.println("Array before selection sort");
    for(int i=0; i < myStartArray.length; i++){
        if (myStartArray[i] == target) {
           indexBeforeSort = i;
        }
        System.out.print(myStartArray[i] + " ");
    }

    System.out.println("");
    System.out.println("Index of integer 4 before sort is : " + indexBeforeSort);    
               
    mySortedArray = selectionSort(myStartArray);
                               
    System.out.println("");
    System.out.println("Array after selection sort");

    for(int i = 0; i < mySortedArray.length; i++){
       if (mySortedArray[i] == target) {
        indexAfterSort = i;
       }
       System.out.print(mySortedArray[i] + " ");
    }

    System.out.println("");
    System.out.println("Index of integer 4 after sort is : " + indexAfterSort);

  }
 
  private static int[] selectionSort(int[] myIntArray) {
               
    int n = myIntArray.length;
    int temp = 0;
               
    for(int i = 0; i < n; i++){
       for(int j = 1; j < (n-i); j++){                               
          if (myIntArray[j-1] > myIntArray[j]){
            temp = myIntArray[j-1];
            myIntArray[j-1] = myIntArray[j];
            myIntArray[j] = temp;
          }                               
       }
    }  
    return myIntArray;
  }
  
}