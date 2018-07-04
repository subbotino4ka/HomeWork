import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW1 {
    public static double Task1_1(double a, double b, double c) {
        if (a % 2 == 0) {
            return (a * b) / c;
        }

        if ((a + c) % 2 == 0 || (b + c) % 2 == 0) {
            return Math.pow(a, c);
        } else {
            return a + b - c;
        }
    }

    public static String Task1_2(int x, int y, int z) {
        if (x == 0 && y == 0 && z == 0)
            return "Точка Не принадлежит области";

        if (x > 0 && y > 0 && z > 0)
            return "Точка принадлежит 1 области";
        if (x < 0 && y > 0 && z > 0)
            return "Точка принадлежит 2 области";
        if (x < 0 && y > 0 && z < 0)
            return "Точка принадлежит 3 области";
        if (x > 0 && y > 0 && z < 0)
            return "Точка принадлежит 4 области";

        if (x > 0 && y < 0 && z > 0)
            return "Точка принадлежит 5 области";
        if (x < 0 && y < 0 && z > 0)
            return "Точка принадлежит 6 области";
        if (x < 0 && y < 0 && z < 0)
            return "Точка принадлежит 7 области";
        if (x > 0 && y < 0 && z < 0)
            return "Точка принадлежит 8 области";

        return "Возникла проблема :(";
    }

    public static int Task2_1(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int[] Task2_2(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return arr;
    }

    public static int[] Task3_1(int[] arr) {
        int mid = arr.length / 2;
        int midPos = mid + arr.length % 2;
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[midPos + i];
            arr[midPos + i] = temp;
        }

        return arr;
    }

    public static int[] Task3_2(int[] arr) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static String Task4_1(int n) {
        return Integer.toString(n);
    }

    public static String Task4_2(double n) {
        return Double.toString(n);
    }

    public static int Task4_3(String str) {
        return Integer.parseInt(str);
    }

    public static double Task4_4(String str) {
        return Double.parseDouble(str);
    }

    public static int Task4_5(String str) {
        List<String> words = new ArrayList<String>();
        Matcher m = Pattern.compile("\\w+").matcher(str);

        while (m.find()) {
            words.add(m.group());
        }

        if(words.size() == 0)
            return 0;

        int result = Integer.MAX_VALUE;

        for(String word : words){
            if(word.length() < result)
                result = word.length();
        }

        return result;
    }

    public static int Task4_6(String str) {
        List<String> words = new ArrayList<String>();
        Matcher m = Pattern.compile("\\w+").matcher(str);

        while (m.find()) {
            words.add(m.group());
        }

        return words.size();
    }

    public static String Task4_7(String str) {
        return str.replaceAll("\\p{L}+(?=\\P{L}*$)", "");
    }
}

// 1) Если а – четное посчитать а*б/с,
// если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
// иначе посчитать  а+б-с
// 2) Определить какой области принадлежит точка с координатами (х,у,z)
// 2.
// 1) Вычислить факториал числа n. n! = 1*2*…*n-1*n;
// 2) Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321
// 3.
// 1) Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
// 2) Отсортировать массив (пузырьком (Bubble)
//
// 4. Написать функции преобразования:
// 1)целого числа в строку
// 2)вещественного числа в строку
// 3)строки в целое число
// 4)строки в вещественное число
// 5)Дана строка, состоящая из слов, разделенных пробелами и знаками препинания. Определить длину самого короткого слова
// 6)Подсчитать количество слов во введенной пользователем строке
// 7)В заданной строке удалить последнее слово

// https://stackoverflow.com/questions/7752713/regex-for-all-alphabets
// https://www.regular-expressions.info/unicode.html#prop