import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double task1_1Result = HW1.Task1_1(1, 2, 3);
        System.out.println(String.format("Task 1.1 Result: %.2f", task1_1Result));
        System.out.println(new String(new char[50]).replace('\0', '='));

        String task1_2Result = HW1.Task1_2(1, 2, 3);
        System.out.println(String.format("Task 1.2 Result: %s", task1_2Result));
        System.out.println(new String(new char[50]).replace('\0', '='));

        int task2_1Result = HW1.Task2_1(3);
        System.out.println(String.format("Task 2.1 Result: %d", task2_1Result));
        System.out.println(new String(new char[50]).replace('\0', '='));

        int[] task2_2Result = HW1.Task2_2(new int[]{1,2,3});
        System.out.println(String.format("Task 2.2 Result: %s", Arrays.toString(task2_2Result)));
        System.out.println(new String(new char[50]).replace('\0', '='));

        int[] task3_1Result = HW1.Task3_1(new int[]{1,2,3,4});
        System.out.println(String.format("Task 3.1 Result: %s", Arrays.toString(task3_1Result)));
        System.out.println(new String(new char[50]).replace('\0', '='));

        int[] task3_2Result = HW1.Task3_2(new int[]{4,2,3,1});
        System.out.println(String.format("Task 3.2 Result: %s", Arrays.toString(task3_2Result)));
        System.out.println(new String(new char[50]).replace('\0', '='));

        String task4_1Result = HW1.Task4_1(1);
        System.out.print("Task 4.1 Result: ");
        System.out.println(task4_1Result);
        System.out.println(new String(new char[50]).replace('\0', '='));

        String task4_2Result = HW1.Task4_2(1.1);
        System.out.print("Task 4.2 Result: ");
        System.out.println(task4_2Result);
        System.out.println(new String(new char[50]).replace('\0', '='));

        int task4_3Result = HW1.Task4_3("1");
        System.out.print("Task 4.3 Result: ");
        System.out.println(task4_3Result);
        System.out.println(new String(new char[50]).replace('\0', '='));

        double task4_4Result = HW1.Task4_4("1.1");
        System.out.print("Task 4.4 Result: ");
        System.out.println(task4_4Result);
        System.out.println(new String(new char[50]).replace('\0', '='));

        int task4_5Result = HW1.Task4_5("test, how is this shit. works");
        System.out.println(String.format("Task 4.5 Result: %d", task4_5Result));
        System.out.println(new String(new char[50]).replace('\0', '='));

        int task4_6Result = HW1.Task4_6("test, how is this shit. works");
        System.out.println(String.format("Task 4.6 Result: %d", task4_6Result));
        System.out.println(new String(new char[50]).replace('\0', '='));

        String task4_7Result = HW1.Task4_7("test, how is this shit. works1.?");
        System.out.println(String.format("Task 4.7 Result: %s", task4_7Result));
        System.out.println(new String(new char[50]).replace('\0', '='));
    }
}
