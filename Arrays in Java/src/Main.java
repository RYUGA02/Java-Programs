public class Main {
    public static void main(String[] args) {

        // Array creation methods in java
//        1. Declaration and memory location
//        int [] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//
//        System.out.println(arr[1]);

////        2. Decalaration and then memory location
//        int [] arr1;
//        arr1 = new int[5];
//
//        arr1[0] = 60;
//        arr1[1] = 70;
//        arr1[2] = 80;
//        arr1[3] = 90;
//        arr1[4] = 100;
//
//        System.out.println(arr1[3]);

//        3. Declaration, memory location and then initilization

//        int [] arr2 = {100,200,300,400,500};
//        System.out.println(arr2[1]);


//        Accessing the array elements

//        1. accessing the array element using the for loop
//         for(int i =0 ; i<arr2.length; i++){
//             System.out.println(arr2[i]);
//         }

//         2. accessing the array element using the for-each loop

//        for(int element : arr){
//            System.out.println(element);
//        }


//        multidimensional array

        int[][] array = new int[2][5];
        array[0][0] = 1000;
        array[0][1] = 2000;
        array[0][2] = 3000;
        array[0][3] = 4000;
        array[0][4] = 5000;
        array[1][0] = 6000;
        array[1][1] = 7000;
        array[1][2] = 8000;
        array[1][3] = 9000;
        array[1][4] = 10000;

        System.out.println("Printing the 2-D Array :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }


//        Printing the array largest element

        int[] numbers = new int[7];
        numbers[0] = 2;
        numbers[1] = 32;
        numbers[2] = 34;
        numbers[3] = 354;
        numbers[4] = 5343;
        numbers[5] = 3232;
        numbers[6] = 22;

//        System.out.println("Displaying the array largest element");
//        int maxElement = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > maxElement) {
//                maxElement = numbers[i];
//            }
//        }
//        System.out.println("Displaying the largest array number :");
//        System.out.println(maxElement);
//
//
////        Printing the array minimum element
//
//        int minNum = Integer.MAX_VALUE;
//        for (int i =0; i <numbers.length ;i++){
//            if(minNum > numbers[i]){
//                minNum = numbers[i];
//            }
//        }
//        System.out.println("Displaying the smallest array number :");
//        System.out.println(minNum);


//        Reversing the array element

//        int temp = 0;
//        int num = Math.floorDiv(numbers.length,2);
//        for (int i=0 ; i<num ; i++){
//
//                temp = numbers[i];
//                numbers[i] = numbers[numbers.length-1-i];
//                numbers[numbers.length-1-i] = temp;
//
//        }
//       for (int element : numbers){
//           System.out.println(element);
//       }


//        Sorting the array element

        int[] sort = {1, 3, 4, 22, 54, 544, 8434};
        boolean isSorted = true;
        for (int i = 0; i < sort.length - 1; i++) {
            if (sort[i] > sort[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}

