
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1  =======================================================================
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 1: четное-нечетное число");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.");
        System.out.print("Введите целое число ");
        int a1 = scanner.nextInt();
        if ((a1%2)==0)
        {
            System.out.println("Число "+ a1+" четное");
        }
        else
        {
            System.out.println("Число "+ a1+" нечетное");
        }
        // Задача 2 =======================================================================
        System.out.println("Задача 2: Минимальное из трех чисел");
        System.out.println("Условие: Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.");
        System.out.print("Введите первое целое число ");
        int a2 = scanner.nextInt();
        System.out.print("Введите второе целое число ");
        int a3 = scanner.nextInt();
        System.out.print("Введите третье целое число ");
        int a4 = scanner.nextInt();
        if (a2<a3 && a2<a4)
        {
            System.out.println(" Самое минимальное число " + a2);
        }
        else if (a3<a2 && a3<a4)
        {
            System.out.println(" Самое минимальное число " + a3);
        }
        else
        {
            System.out.println(" Самое минимальное число " + a4);
        }
        // Задача 3 =======================================================================
        System.out.println("Задача 3: Таблица умножения");
        System.out.println("Условие: Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).");
        int a5 = 5;
        for (int i=1; i<=10; i++)
        {
            System.out.println(a5 + " * " + i + " = " + a5*i);
        }
        // Задача 4 =======================================================================
        System.out.println("Задача 4: Сумма чисел от 1 до N");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.");
        System.out.print("Введите целое число N ");
        int a6 = scanner.nextInt();
        int sum = 0;
        for (int i=1; i<=a6; i++)
        {
            sum = sum+i;
        }
        System.out.println("Сумма всех чисел от 1 до " + a6 + " = " + sum);
        // Задача 5 =======================================================================
        System.out.println("Задача 5: Число Фибоначчи");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.");
        System.out.print("Введите число N ");
        int a7 = scanner.nextInt();
        int[] a8= new int[a7];
        a8[0]=0;
        a8[1]=1;
        for (int i=2;i<a7;i++)
        {
           a8[i]=a8[i-1]+a8[i-2];
        }
        for (int i=0; i<a7; i++)
        {
            System.out.print(a8[i] + ", ");
        }
        // Задача 6 =======================================================================
        System.out.println("Задача 6: Проверка простого числа");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).");
        System.out.print("Введите простое число ");
        int a9 = scanner.nextInt();
        boolean n = true;
        if (a9<=1)
        {
            n=false;
        }
        else {
            for (int i = 2; i < a9; i++)
            {
                if (a9 % i == 0)
                {
                    n=false;
                    break;
                }
            }
        }
        if(n)
        {
            System.out.println(a9 + " число простое");
        }
        else
        {
            System.out.println(a9 + " число не простое");
        }
        // Задача 7 =======================================================================
        System.out.println("Задача 7: Обратный порядок чисел");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.");
        System.out.print("Введите число ");
        int a10 = scanner.nextInt();
        for (int i =a10; i>0; i--)
        {
            System.out.println(i+" ");
        }
        // Задача 8 =======================================================================
        System.out.println("Задача 8: Сумма четных чисел");
        System.out.println("Условие: Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).");
        System.out.print("Введите число А ");
        int a11 = scanner.nextInt();
        System.out.print("Введите число В ");
        int a12 = scanner.nextInt();
        int sum1=0;
        for(int i = a11; i<=a12; i++)
        {
        if(i%2==0) sum1=sum1+i;

        }
        System.out.println("Сумма всех четных между А и В = " + sum1);
        // Задача 9 =======================================================================
        System.out.println("Задача 9: Реверс строки");
        System.out.println("Условие: Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.");
        System.out.print("Введите строку: ");
        String str = scanner.next();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка после реверса: " + reverse);
        // Задача 10 =======================================================================
        System.out.println("Задача 10: Количество цифр в числе");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.");
        System.out.print("Введите число: ");
        int a13=scanner.nextInt();
        int a14=0;
        if(a13==0) a14=1;
        else
        {
            while(a13 !=0)
            {
                a13 /= 10;
                a14++;
            }
        }
        System.out.println("Количество цифр в числе =" + a14);
        // Задача 11 =======================================================================
        System.out.println("Задача 11: Факториал числа");
        System.out.println("Условие: Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).");
        System.out.print("Введите число N = ");
        int a15=scanner.nextInt();
        int a16=1;
        for(int i = 0; i<a15; i++)
        {
            a16+=a16*i;
        }
        System.out.println("Факториал числа " +a15+ " = " + a16);
        // Задача 12 =======================================================================
        System.out.println("Задача 12: Сумма цифр числа");
        System.out.println("Условие: Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.");
        System.out.print("Введите целое число = ");
        int b=scanner.nextInt();
        int sum2=0;
        while (b!=0)
        {
            int b1=b%10;
            sum2+=b1;
            b/=10;
        }
        System.out.println("Сумма всех цифр числа = " + sum2 );
        // Задача 13 =======================================================================
        System.out.println("Задача 13: Палиндром");
        System.out.println("Условие: Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).");
        System.out.print("Введите строку: ");
        String str1 = scanner.next();
        String reverse1 = new StringBuffer(str1).reverse().toString();
        String result = str1.equals(reverse1) ? "Эта строка является палиандромом" : "Эта строка не является палиандромом";
        System.out.println(result);
        // Задача 14 =======================================================================
        System.out.println("Задача 14: Найти максимальное число в массиве");
        System.out.println("Условие: Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.");
        System.out.print("Введите размер массива ");
        int b2=scanner.nextInt();
        int[] m= new int[b2];
        for(int i = 0;i<b2;i++)
        {
            System.out.print("Введите " + i + " элемент массива ");
            m[i]=scanner.nextInt();
        }
        System.out.print("Вы ввели массив: ");
        System.out.println(Arrays.toString(m));
        int max=m[0];
        for(int i =1; i<b2;i++)
        {
            if ( m[i] > max ) max=m[i];

        }
        System.out.print("Максимальное число в Массиве ");
        System.out.println(max);
        // Задача 15 =======================================================================
        System.out.println("Задача 15: Сумма всех элементов массива");
        System.out.println("Условие: Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.");
        System.out.print("Введите размер массива ");
        int b3=scanner.nextInt();
        int[] q= new int[b3];
        for(int i = 0;i<b3;i++)
        {
            System.out.print("Введите " + i + " элемент массива ");
            q[i]=scanner.nextInt();
        }
        System.out.print("Вы ввели массив: ");
        System.out.println(Arrays.toString(q));
        int sum3=0;
        for(int i=0; i<b3; i++)
        {
            sum3+=q[i];
        }
        System.out.println("Сумма всех элементов массива равна " + sum3);
        // Задача 16 =======================================================================
        System.out.println("Задача 16: Количество положительных и отрицательных чисел");
        System.out.println("Условие: Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.");
        System.out.print("Введите размер массива ");
        int b4=scanner.nextInt();
        int[] w= new int[b4];
        int plus=0;
        int noplus=0;
        for(int i = 0;i<b4;i++)
        {
            System.out.print("Введите " + i + " элемент массива ");
            w[i]=scanner.nextInt();
        }
        System.out.print("Вы ввели массив: ");
        System.out.println(Arrays.toString(w));
        for(int i = 0; i<b4; i++)
        {
            if(w[i]>=0) plus+=1;
                else noplus+=1;
        }
        System.out.println("Количество положительных элементов массива" + plus);
        System.out.println("Количество отрицательных элементов массива" + noplus);
        // Задача 17 =======================================================================
        System.out.println("Задача 17: Простые числа в диапазоне");
        System.out.println("Условие: Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).");
        System.out.print("Введите число А ");
        int a20 = scanner.nextInt();
        System.out.print("Введите число В ");
        int a21 = scanner.nextInt();

        for (int i =a20; i <=a21; i++)
        {
            boolean simple=true;
            for( int v = 2; v<i;v++)
            {
                if(i%v==0)
                {
                    simple = false;
                    break;
                }

            }
            if(simple) System.out.print(i+" ");

        }
        // Задача 18 =======================================================================
        System.out.println("Задача 18: Подсчет гласных и согласных в строке");
        System.out.println("Условие: Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.");
        System.out.print("Введите строку на русском языке ");
        String str2=scanner.next().toLowerCase();
        int aa=0;
        int bb=0;
        for(int i=0; i<str2.length(); i++)
        {
            char t = str2.charAt(i);
            if(t=='а'|| t=='у'|| t=='о'|| t=='э'|| t=='ы'|| t=='я'|| t=='ю'|| t=='е'|| t=='ё') aa+=1;
            else bb+=1;
        }
        System.out.println("Количество гласных" + aa);
        System.out.println("Количество согласных" + bb);
        // Задача 19 =======================================================================
        /*System.out.println("Задача 19: Перестановка слов в строке");
        System.out.println("Условие: Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.");

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();


        String[] words = inputString.split(" ");


        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }*/
        // Задача 20 =======================================================================
        System.out.println("Задача 20: Число Армстронга");
        System.out.println("Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).");
        System.out.print("Введите число: ");
        int qqq = scanner.nextInt();
        int fff = String.valueOf(qqq).length();
        int sum5 = 0;
        int kek = qqq;
        while (qqq > 0) {
            int ttt = qqq % 10;
            sum5 += Math.pow(ttt, fff);
            qqq /= 10;
        }
        if (sum5 == kek) {
            System.out.println(kek + " - является числом Армстронга");
        } else {
            System.out.println(kek + " - не является числом Армстронга");
        }
        scanner.close();
        System.out.println();
    }
}