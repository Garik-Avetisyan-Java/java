package homeworks;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        // Խնդիր 1 — Տպել բոլոր սիմվոլները
            System.out.println("---------Խնդիր 1----------");
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        // Խնդիր 2 — Հաշվել սիմվոլների քանակը
            System.out.println("---------Խնդիր 2----------");
            System.out.println("Characters count: " + chars.length);
            System.out.println("First character: " + chars[0]);
            System.out.println("Last character: " + chars[chars.length - 1]);
        // Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը
            System.out.println("---------Խնդիր 3----------");
            char item = 'a';
            int itemCount = 0;
            for (int i = 0; i < chars.length; i++) {
                if (item == chars[i]) itemCount++;
            }
            System.out.println("Character " +  item + " " +  "count: " + itemCount);
        // Խնդիր 4 — Հաշվել ձայնավորների քանակը
            System.out.println("---------Խնդիր 4----------");
            int vowelsCount = 0;
            for (int i = 0; i < chars.length; i++) {
                switch (chars[i]){
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        vowelsCount++;
                        break;
                }
            }
            System.out.println("Vowels count: " + vowelsCount);
        // Խնդիր 5 — Հաշվել բաղաձայնների քանակը
            System.out.println("---------Խնդիր 5----------");
            int consonantsCount = 0;
            for (int i = 0; i < chars.length; i++) {
                if (((chars[i] >= 'a' && chars[i] <= 'z') ||
                    (chars[i] >= 'A' && chars[i] <= 'Z')) &&
                    chars[i] != 'a' && chars[i] != 'A' &&
                    chars[i] != 'e' && chars[i] != 'E' &&
                    chars[i] != 'i' && chars[i] != 'I' &&
                    chars[i] != 'o' && chars[i] != 'O' &&
                    chars[i] != 'u' && chars[i] != 'U') {

                    consonantsCount++;
                }
            }
            System.out.println("Consonants count:  " + consonantsCount);
        // Խնդիր 6 — Հաշվել բացատների քանակը
            System.out.println("---------Խնդիր 6----------");
            int countOfSpace = 0;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == ' ') countOfSpace++;
            }
            System.out.println("Spaces count: " + countOfSpace);
        // Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)
            System.out.println("---------Խնդիր 7----------");
            char temp;
            for (int i = 0; i < chars.length / 2; i++) {
                temp = chars[i];
                chars[i] = chars[chars.length - (i + 1)];
                chars[chars.length - (i + 1)] = temp;
            }
            for (int i = 0; i < chars.length; i++){
                System.out.print(chars[i]);
            }
            System.out.println();
        // Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը
            System.out.println("---------Խնդիր 8----------");
            char[] charsTwo = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
            for (int i = 0; i < charsTwo.length; i++) {
                if(charsTwo[i] >= 'a' && charsTwo[i] <= 'z'){
                    charsTwo[i] = (char) (charsTwo[i] - 32);;
                }
            }

            System.out.print("UpperCase: ");
            for (int i = 0; i < charsTwo.length; i++) {
                System.out.print(charsTwo[i]);
            }
            for (int i = 0; i < charsTwo.length; i++) {
                if (charsTwo[i] >= 'A' && charsTwo[i] <= 'Z'){
                    charsTwo[i] = (char) (charsTwo[i] + 32);;
                }
            }
            System.out.println();
            System.out.print("LowerCase: ");
            for (int i = 0; i < chars.length; i++) {
                System.out.print(charsTwo[i]);
            }
            System.out.println();
        // Խնդիր 9 — Փոխարինել տրված սիմվոլը
            System.out.println("---------Խնդիր 9----------");
            char[] charsThree = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
            char oldChar = 'a';
            char newChar = '*';
            for (int i = 0; i < charsThree.length; i++) {
                if (charsThree[i] == oldChar){
                    charsThree[i] = newChar;
                }
            }
            for (int i = 0; i < charsThree.length; i++) {
                System.out.print(charsThree[i]);
            }
            System.out.println();
        // Խնդիր 10 — Ստուգել Palindrome-ը
            System.out.println("---------Խնդիր 10----------");
            char[] charsForPalindrome = {'l', 'e', 'v', 'e', 'l'};
            boolean isPalindrome = false;
            for (int i = 0; i < charsForPalindrome.length; i++) {
                if (charsForPalindrome[i] == charsForPalindrome[charsForPalindrome.length - (i + 1)]){
                    isPalindrome = true;
                }else {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println("is palindrome: " + isPalindrome);
        // Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը
            System.out.println("---------Bonus 1----------");
            char[] charsForBonusOne = {'a', 'b', 'c', 'a', 'd'};
            char target = 'a';
            for (int i = 0; i < charsForBonusOne.length; i++) {
                if(charsForBonusOne[i] == target){
                    System.out.println("First index: " + i);
                    break;
                }else if(charsForBonusOne[i] != target && i == charsForBonusOne.length - 1){
                    System.out.println(-1);
                }
            }
        // Bonus 2 — Համեմատել երկու char զանգված
            System.out.println("---------Bonus 2----------");
            char[] first = {'J', 'a', 'v', 'a'};
            char[] second = {'J', 'a', 'v', 'a'};
            boolean isEqual = false;
            if (first.length == second.length){
                for (int i = 0; i < first.length; i++) {
                    if (first[i] == second[i]){
                        isEqual = true;
                    }else {
                        isEqual = false;
                        break;
                    }
                }
            }
            if (first.length == 0 && second.length == 0) isEqual = true;
            System.out.println("Arrays are equal: " + isEqual);
        // Bonus 3 — Հեռացնել կրկնվող սիմվոլները
            System.out.println("---------Bonus 3----------");
            char[] charsForBonusThree = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};
            boolean isRepeated = false;
            for (int i = 0; i < charsForBonusThree.length; i++) {
                isRepeated = false;
                for (int j = 0; j < i; j++) {
                    if (charsForBonusThree[i] == charsForBonusThree[j]){
                        isRepeated = true;
                        break;
                    };
                }
                if (isRepeated){
                    continue;
                };
                System.out.print(charsForBonusThree[i]);
                System.out.print(' ');
            }
    }
}
