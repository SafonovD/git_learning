package DZ;

import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину масива :");
        int size = scanner.nextInt();
        process(size);

    }
        public static void process(int size){

            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextInt(30);
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
                        // сумма Элементов
            int summ = 0;

            for (int i = 0; i < arr.length; i++) {
                summ += arr[i];
            }
            System.out.println("Сумма элемантов " + summ);
                   // Максимальное и минимальное значение
            int maxNum = arr[0];
            int minNum = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > maxNum) maxNum = arr[i];
                else if(arr[i] < minNum) minNum = arr[i];
            }
            System.out.println("Максимальный элемент = " + maxNum);
            System.out.println("Минимальный элемент = " + minNum);
                      // Cреднее арифметическое
            double arg = 0;
            for (int i = 0; i < arr.length; i++) {
                arg += arr[i];
            }
            arg /= arr.length;
            System.out.println("среднее арифметическое = " + arg);
                      // Не четные числа
            for (int i = 0; i < arr.length; i++) {
                if((arr[i] % 2) != 0){
                    System.out.print(arr[i] + " ");
                }

            }
        }
    }

