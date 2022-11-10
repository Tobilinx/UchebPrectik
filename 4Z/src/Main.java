import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Вводим текст
        String text = "";
        System.out.println("Введите текст");
        Scanner sc1 = new Scanner(System.in);
        text = sc1.nextLine();

        //Преобразуем текст в массив char'ов
        char[] charArray = text.toCharArray();

        //Удаляем в тексте не нужные символы и выводим в консоль с 1 пробелом
        for(char x : charArray){
            if(Character.isLetter(x)){
                System.out.print(x + " ");
            }
        }

    }

}