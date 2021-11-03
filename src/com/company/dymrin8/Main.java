package com.company.dymrin8;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        findSymbolOccurance();
        findWordPosition();
        stringReverse();
        isPalindrome();
    }

    /*Создать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ.
     Необходимо вычислить, сколько раз символ встречается в переданной строке и вернуть это числовое значение.*/

    public static int findSymbolOccurance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку ");
        String phrase1 = scanner.nextLine();
        System.out.println("Введите вторую строку ");
        String phrase2 = scanner.nextLine();
        int number = 0;
        Pattern p = Pattern.compile(phrase2);
        Matcher m = p.matcher(phrase1);
        while (m.find()) {
            number++;
        }
        System.out.println(number);
        return number;
    }

    /*
    Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target).
    Необходимо выяснить, является ли target (подстрока) частью строки source.
    Если да, тогда вернуть номер позиции (индекс) первого элемента подстроки в строке, иначе вернуть -1.
    */
    public static int findWordPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести строку для проверки ");
        String sourse = scanner.nextLine();
        System.out.println("Ввести искомое ");
        String target = scanner.nextLine();
        int index = sourse.indexOf(target);
        System.out.println(index);
        return index;
    }

    /*
    Создать метод stringReverse. Метод принимает в качестве параметра строку.
    Необходимо ее развернуть и вернуть измененный вариант.
    */
    public static String stringReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для разворота ");
        String string = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            result.insert(0, string.charAt(i));

        }
        System.out.println(string + " -> " + result);
        return result.toString();
    }

    /*
    Создать метод isPalindrome. Метод принимает в качестве параметра строку.
    Необходимо Проверить является ли переданная строка палиндромом.
    Если да, тогда вернут true, иначе false.
    */
    public static boolean isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите палиндром ");
        String object = scanner.nextLine();
        int j = object.length();
        for (int i = 0; i < (j / 2); i++) {
            if (object.charAt(i) != object.charAt(j - i - 1)) {
                System.out.println(object + "-> false");
                return false;
            }
        }
        System.out.println(object + "-> true");
        return true;
    }

}
