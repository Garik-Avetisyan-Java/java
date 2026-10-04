package homework;
public class Homework2 {
    public static void  main(String[] args){
        //FIRST TASK
        System.out.println("4");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("--------------");
        //SECOND TASK
        System.out.println("2");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("--------------");
        //THIRD TASK
        System.out.println("3");
        int space = 10;
        for (int i = 0; i < 6; i++) {
            for (int s = 0; s <= space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            space = space - 2;
            System.out.println();
        }
        System.out.println("--------------");
        //FOURTH TASK
        System.out.println("4");
        space = 0;
        for (int i = 5; i > 0; i--) {
            for (int s = 0; s <= space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            space = space + 2;
            System.out.println();
        }
        System.out.println("--------------");
        //FIFTH TASK
        System.out.println("5");
        space = 5;
        for (int i = 0; i < 6; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            space--;
            System.out.println();
        }
        space = 0;
        for (int i = 4; i > 0 ; i--) {
            for (int s = 0; s <= space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            space++;
            System.out.println();
        }
        System.out.println("--------------");
    //5-ի երկրորդ տարբերակ;
        System.out.println("5-ի երկրորդ տարբերակ");
        int k = 4;
        space = 5;
        for (int i = 0; i < 10; i++) {
            if (i < 6){
                for (int s = 0; s < space; s++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");
                }
                space--;
                if (i == 5){
                    space = 0;
                }
                System.out.println();
            }
            if (i > 5){
                for (int s = 0; s <= space; s++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < k; j++) {
                    System.out.print(" *");
                }
                k--;
                space++;
                System.out.println();
            }
        }
    }
}
