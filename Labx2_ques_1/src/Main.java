import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        int [] array = {2,4,5,3,6,7,9,4,5,6}; // Declaraing the original array with 10 elements

        int[] subArray = Arrays.copyOfRange(array,2,7); // using the Arrays.copyOfRange() method to get the subArray from 2 index to 7


        Integer highest = null;  // Intialising the highest variable to null
        Integer secondHighest = null; // Intializing the secondHighest variable to null


         for(int num: subArray){  // For Each Loop    // case -1                                    case-2                                            case-3
            if(highest == null || num > highest){   // highest == null or 5 > null          // highest == null or 3 > 5                           // highest == null or 6 > 5
                secondHighest = highest;            // secondHighest = null;                // goes to else-if condition                          // secondHighest = 5;
                highest = num;                      // highest = 5;                        // 3 != 5                                              // highest = 6;
            }                                                                              // secondHighest == null || 3 > null (Current Value of secondHighest Value)
            else if(num != highest){                                                       // secondHighest = 3;
                if(secondHighest == null ||  num > secondHighest){
                    secondHighest = num;
                }
            }
        }

        System.out.println("Second Highest Element is :"+secondHighest);

    }
}