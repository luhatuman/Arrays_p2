public class Main {
    public static int[] generateRandomArray() { // Из примера, дополнительно почитать
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1"); //Сумма ячеек массива
        int[] arr = generateRandomArray();
        int totalAmountForTheMonth = 0;
        for (int i : arr) {
            totalAmountForTheMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + totalAmountForTheMonth + " руб.");
        //Task 2
        System.out.println("Task 2");
        int maxAmount = 100_000;
        int minAmount = 200_000;
        for (int i : arr) {
            if (i <= minAmount) {
                minAmount = i;
            }
            if (i >= maxAmount) {
                maxAmount = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minAmount + " руб.");
        System.out.println("Максимальная сумма трат за день составила " + maxAmount + " руб.");
        //Task 3
        System.out.println("Task 3");
        float averageAmount = (float) totalAmountForTheMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " руб.");
        //Task 4
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = (reverseFullName.length - 1); i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}