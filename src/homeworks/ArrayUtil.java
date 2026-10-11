package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        // Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        // Խնդիր 2 — Տպել առաջին էլեմենտը
            System.out.println();
            System.out.println("The first element of the array: " + numbers[0]);
        // Խնդիր 3 — Տպել վերջին էլեմենտը
            System.out.println("The last element of the array: " + numbers[numbers.length - 1]);
        // Խնդիր 4 — Տպել զանգվածի երկարությունը
            System.out.println("The length of the array: " + numbers.length);
        // Խնդիր 5 — Գտնել ամենափոքր թիվը
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (min > numbers[i]) min = numbers[i];
            }
            System.out.println("Min: " + min);
        // Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
            if (numbers.length <= 2){
                System.out.println("Can't print middle values");
            }else {
                if (numbers.length % 2 == 0){
                    System.out.print("Middle elements: ");
                    System.out.print(numbers[numbers.length / 2 - 1] + " ");
                    System.out.println(numbers[numbers.length / 2]);
                }else {
                    System.out.println("Middle element: " + numbers[numbers.length / 2]);
                }
            }
        // Խնդիր 7 — Հաշվել զույգ թվերի քանակը
            int evenNumbers = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) evenNumbers++;
            }
            System.out.println("Even numbers count: " + evenNumbers);
        // Խնդիր 8 — Հաշվել կենտ թվերի քանակը
            int oddNumbers = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 1) oddNumbers++;
            }
            System.out.println("Odd numbers count: " + oddNumbers);
        // Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Sum: " + sum);
        // Խնդիր 10 — Հաշվել միջին թվաբանականը
            double average = (double) sum / numbers.length;
            System.out.println("Average: " + average);
        // Bonus 1 — Գտնել ամենամեծ թիվը
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (max < numbers[i]) max = numbers[i];
            }
            System.out.println("Max " + max);
        // Bonus 2 — Հաշվել դրական և բացասական թվերը
            int positive = 0;
            int negative = 0;
            for (int i = 0; i < numbers.length; i++) {
               if (numbers[i] > 0) positive++;
               if(numbers[i] < 0) negative++;
            }
            System.out.println("Positives count: " + positive);
            System.out.println("Negative count: " + negative);
        // Bonus 3 — Տպել զանգվածը հակառակ հերթականությամբ
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
    }
}
