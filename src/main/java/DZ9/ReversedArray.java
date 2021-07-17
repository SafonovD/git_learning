package DZ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ReversedArray {
    public static void main(String[] args) {
        int[] temp;
     int[] array = new int[10];
      myReverse(array);    // возвращаем инвертированный массив
       System.out.println();

        temp = subArray(array,2,15);

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }
    public static int[] myReverse(int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(30);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int temp;
        for (int i = array.length-1, j = 0; i >=array.length/2 ; i--,j++) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        for (int key : array){
            System.out.print(key + " ");
        }
        return array;
    }
   public static int [] subArray(int [] array, int index, int count){
        int[] temp = new int[count];
        boolean full = false;
       for (int i = index, j = 0; i < count ; i++, j++) {
           if(i <= ((array.length - index) + 1) && !full){
               temp[j] = array[i];
           }else {
               if (!full) {
                   full = true;
                   i -= index;
               }
               temp[j] = 1;
           }

       }
      return temp;
   }

}
