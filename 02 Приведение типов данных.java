// Приведение типов данных

/* "byte" хранит целое число от -128 до 127 и занимает 1 байт
   "short" хранит целое число от -32 768 до 32 767 и занимает 2 байта
   "int" хранит целое число от -2 147 483 648 до 2 147 483 647 и занимает 4 байта
   "long" хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
   "double" хранит число с плавающей точкой от ±4.9*10^-324 до ±1.7976931348623157*10^308 и занимает 8 байт
   float: хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта (после числа всеглда ставится "F" без пробела)
   char: хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, диапазон хранимых значений - от 0 до 65535
   String: строковый параметр
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(50/20);        // вывод числа без остатка
        System.out.println(50.0/20);      // вывод числа с остатком


        int a = 20;

        System.out.println(a);            // вывод числа без остатка
        System.out.println((double)a);    // вывод числа без остатка


        // преобразование типов: от типа byte к типу int

        byte b1 = 120;
        System.out.println(b1);

        int i1 = (int)b1;
        System.out.println(i1);

        // преобразование типов: от типа int к типу byte

        int i2 = 150;
        System.out.println(i2);

        byte b2 = (byte)i2;
        System.out.println(b2);

    }
}