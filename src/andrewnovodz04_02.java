package src;

public class andrewnovodz04_02 {
    public static void main(String[] args){

        /*Задача 1. Переменные и арифметика

        Создай переменные a и b типа int.
                Выведи в консоль:
        1. их сумму
        2. разность
        3. произведение
        4. результат целочисленного деления
        5. остаток от деления*/

        int a = 5, b = 3;
        System.out.println("задача 1:" +
                "\n" + "1)сумма чисел: " + (a + b) +
                "\n" + "2)разность: " + (a - b) +
                "\n" + "3)произведение: " + (a * b) +
                "\n" + "4)целочисленное деление: " + (a / b) +
                "\n" + "5)остаток: " + (a % b) +
                "\n");

        /*Задача 2. Инкремент и декремент

        Есть код:
        int x = 7;
        int y = x++;
        Выведи x
        Выведи y
        Затем измени код так, чтобы y в консоли стал равен 8.*/

        int x = 7, y = x++;

        /*первый способ:
        int x =7;
        x++;
        int y = x;
        x при выводе тоже будет равен 8
        второй способ:
        int x = 7;
        int y = ++x;
        третий способ:
        int x = 7;
        int y = x+1;*/

        System.out.println("задача 2:"+
                "\n" + "x равен:" + x +
                "\n" + "y равен:" + y +
                "\n");

        /*Задача 3. Сравнение чисел

        Создай две переменные int a и int b.
        Выведи в консоль:
        true, если a больше b
        true, если a равно b
        true, если a не равно b*/

        int a1 = 3, b1 = 3;

        System.out.println("задача 3:" +
                (a1 > b1 ? "\n a больше b: true" : "") +
                (a1 == b1 ? "\n a равно b: true" : "") +
                (a1 != b1 ? "\n a не равно b: true" : ""));
        System.out.println();
        //здесь если использовать if else, то команда выполнится когда хоть одно условия будет истинно, а по условию у нас может быть 2 true

        /*Задача 4. Логические операторы

        Даны переменные:
        int age = 20;
        boolean hasTicket = true;
        Напиши условие, которое выведет "Проход разрешён", если:
        возраст 18 или больше
        и билет есть
        Во всех остальных случаях выводи "Проход запрещён".*/

        int age = 20;
        boolean hasTicket = true;
        System.out.println("Задача 4:");
        if(age > 17 && hasTicket){
            System.out.println("Проход разрешён" + "\n");
        }else {
            System.out.println("Проход запрещён" + "\n");
        }
        /*так же можно было выполнить с помощью тернарного оператора - ?:
        System.out.println("Задача 4:" + "\n" +
        (age > 17 && hasTicket ? "Проход разрешён" + "\n" : "Проход запрещён" + "\n"));*/

        /*Задача 5. Простая проверка числа

        Дано число int number.
        Если число:
        больше 0 — вывести "Положительное"
        меньше 0 — вывести "Отрицательное"
        равно 0 — вывести "Ноль"*/

        int number = -1;
        System.out.println("Задача 5:");
        if(number>0){
            System.out.println("Положительное" + "\n");
        }else if(number<0){
            System.out.println("Отрицательное" + "\n");
        }else{
            System.out.println("Ноль" + "\n");
        }

        /*Задача 6. Тернарный оператор

        Дано целое число int n.
        Используя тернарный оператор, запиши в переменную absN абсолютное значение числа n
        Выведи absN в консоль.*/

        int n = -10, absN = (n < 0) ? -n : n;
        System.out.println("задача 6: " + "\n" + absN + "\n");

        /*Задача 7. switch — календарь

        Дана переменная:
        int month = 3;
        С помощью switch выведи:

        1 → "Январь"
        2 → "Февраль"
        3 → "Март"
        4 → "Апрель"
        5 → "Май"
        6 → "Июнь"
        7 → "Июль"
        8 → "Август"
        9 → "Сентябрь"
        10 → "Октябрь"
        11 → "Ноябрь"
        12 → "Декабрь"

        любое другое значение → "Некорректный день"*/

        System.out.println("Задача 7:");
        int month = 3;
        switch(month){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Некорректный день");
        }







    }
}
