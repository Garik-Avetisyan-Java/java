package homeworks;
public class Homework1 {
    public static void main(String[] args) {
        // Ունեք երկու ամբողջ թիվ x և y։ Գրել ծրագիր, որը if-ով կպարզի և կտպի՝ որը մեծ է:
        int x = 10;
        int y = 7;
        if (x > y){
            System.out.println("x is more than y");
        }
        if(y > x){
            System.out.println("y is more than x");
        }
        // Օգտագործել for ցիկլ՝ տպելու համար առաջին 5 բնական թվերը
        for (int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
        //Հայտարարեք երկու ամբողջ փոփոխական (int a = 5; int b = 7;) և տպեք դրանց գումարը։
        int a = 5;
        int b = 7;
        System.out.println("");
        System.out.println(a + b);
        //Տրված է int n = 3;։ Օգտագործելով for ցիկլ, տպեք n-ի բազմապատկման աղյուսակը 1-ից մինչև 10։
        int n = 7;
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
