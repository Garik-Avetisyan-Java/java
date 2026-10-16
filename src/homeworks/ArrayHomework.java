package homeworks;

public class ArrayHomework {
    public static void main(String[] args) {
        // Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը
            int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
            int n = 6;
            int countOfNumber = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == n) countOfNumber++;
            }
            System.out.println("Count of " + n + ": " + countOfNumber);
        // Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
            int[] numbersForTaskTwo = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
            int y = 0;
            int LastIndex = numbersForTaskTwo.length - 1;
            for (int i = 0; i < numbersForTaskTwo.length / 2; i++) {
                y = numbersForTaskTwo[i];
                numbersForTaskTwo[i] = numbersForTaskTwo[LastIndex];
                numbersForTaskTwo[LastIndex] = y;
                LastIndex--;
            }
            for (int i = 0; i < numbersForTaskTwo.length; i++) {
                System.out.print(numbersForTaskTwo[i] + " ");
            }
        // Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
            int[] numbersForTaskThree = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
            int repeatNumber = 0;
            for (int i = 0; i < numbersForTaskThree.length; i++) {
                boolean checked = false;
                for (int j = 0; j < i; j++) {
                    if (numbersForTaskThree[i] == numbersForTaskThree[j]) {
                        checked = true;
                        break;
                    }
                }
                if (checked) {
                    continue;
                }
                for (int j = i + 1; j < numbersForTaskThree.length; j++) {
                    if (numbersForTaskThree[i] == numbersForTaskThree[j]){
                        repeatNumber++;
                        break;
                    }
                }
            }
            System.out.println();
            System.out.println("Repeated numbers count: " + repeatNumber);
        // Խնդիր 4 — Հաշվել ձայնավորների քանակը
            char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
            int countOfVowels = 0;
            for (int i = 0; i < chars.length ; i++) {
                if (chars[i] == 'ա' || chars[i] == 'ե' || chars[i] == 'է' || chars[i] == 'ը' || chars[i] == 'ի' || chars[i] == 'ո' || chars[i] == 'օ'){
                    countOfVowels++;
                }
            }
            System.out.println("Vowels count: " + countOfVowels);
        // Bonus 1 — Գտնել երկրորդ ամենամեծ թիվը
            int[] numbersForBonusOne = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
            int max = 0;
            int secondMax = 0;
            for (int i = 0; i < numbersForBonusOne.length; i++) {
                if(max < numbersForBonusOne[i]){
                    max = numbersForBonusOne[i];
                }
                if (numbersForBonusOne[i] < max && numbersForBonusOne[i] > secondMax){
                    secondMax = numbersForBonusOne[i];
                }
            }
            System.out.println("Second maximum: " + secondMax);
        // Bonus 2 — Հեռացնել կրկնվող թվերը
            int[] numbersForBonusTwo = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};
            for (int i = 0; i < numbersForBonusTwo.length; i++) {
                boolean checked = false;
                for (int j = 0; j < i; j++) {
                    if(numbersForBonusTwo[i] == numbersForBonusTwo[j]){
                        checked = true;
                    }
                }
                if (checked){
                    continue;
                }
                System.out.print(numbersForBonusTwo[i] + " ");
            }
        // Bonus 3 — Գտնել ամենաշատ կրկնվող թիվը
        int[] numbersForBonusThree = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};
        int num = 0;
        int currentCount = 0;
        int count = 0;
        for (int i = 0; i < numbersForBonusThree .length; i++) {
            currentCount = 0;
            for (int j = 0; j < numbersForBonusThree.length; j++) {
                if (numbersForBonusThree[i] == numbersForBonusThree[j]){
                    currentCount++;
                    if(currentCount > count){
                        count = currentCount;
                        num = numbersForBonusThree[i];
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Most frequent number: " + num);
        System.out.println("Count: " + count);
    }
}
