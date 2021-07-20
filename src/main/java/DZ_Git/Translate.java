package DZ_Git;

import javax.swing.*;


public class Translate {
    public static void main(String[] args) {
        String text;
        text = JOptionPane.showInputDialog("Ведите вариант перевода:\n 1: RU -> EN \n 2: 2 - EN -> RU");


        input(text);
      
    }


public static String input(String in){
    int number = 0;

    number = Integer.parseInt(in);

    if(number == 1){
        translator(in = JOptionPane.showInputDialog("Введите слово: "));
    }else if(number == 2){
        translator(in = JOptionPane.showInputDialog("Enter a word: "));
    } else{
        System.out.println("Вы ввели несуществующее число");
    }

        return in;

}
    public static String translator(String text){

        switch (text){
            case ("Корова"):
                JOptionPane.showMessageDialog(null, "Caw" );
                break;
            case ("Лягушка"):
                JOptionPane.showMessageDialog(null, "Frog" );
                break;
            case ("Кошка"):
                JOptionPane.showMessageDialog(null, "Cat" );
                break;
            case ("Caw"):
                JOptionPane.showMessageDialog(null, "Корова" );
                break;
            case ("Frog"):
                JOptionPane.showMessageDialog(null, "Лягушка" );
                break;
            case ("Cat"):
                JOptionPane.showMessageDialog(null, "Кошка" );
                break;
            default:
                JOptionPane.showMessageDialog(null, "Нет такого слова" );
        }

        return text;
    }
}
