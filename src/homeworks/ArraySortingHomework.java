package homeworks;

public class ArraySortingHomework {
    public static void main(String[] args) {
        //  Խնդիր 1 — Սորտավորել զանգվածը փոքրից մեծ (Ascending Order)
            int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
            int temp = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]){
                        temp = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = temp;
                    }
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        //  Խնդիր 2 — Սորտավորել զանգվածը մեծից փոքր (Descending Order)
            System.out.println();
            int[] numbersForTaskTwo = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
            int tempForTaskTwo = 0;
            for (int i = 0; i < numbersForTaskTwo.length; i++) {
                for (int j = i + 1; j < numbersForTaskTwo.length; j++) {
                    if (numbersForTaskTwo[i] < numbersForTaskTwo[j]){
                        tempForTaskTwo = numbersForTaskTwo[j];
                        numbersForTaskTwo[j] = numbersForTaskTwo[i];
                        numbersForTaskTwo[i] = tempForTaskTwo;
                    }
                }
            }
            for (int i = 0; i < numbersForTaskTwo.length; i++) {
                System.out.print(numbersForTaskTwo[i] + " ");
            }
    }
}
