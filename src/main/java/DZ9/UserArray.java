package DZ;

public class UserArray {
    public static void main(String[] args) {
        int[] array = newArr(new int[]{1,8,5,2,62},78);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+ " ");
        }
    }
    public static int[] newArr(int[] array, int value ){
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i == 0) {
                temp[i] = value;
                continue;
            }
            temp[i] = array[i - 1];
        }
    return temp;
    }
}
