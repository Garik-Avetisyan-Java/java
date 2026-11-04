package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da  = new DynamicArray();
        System.out.println("----------Խնդիր 1 & Խնդիր 2----------");
        for (int i = 1; i < 21; i++) {
            da.add(i);
        }
        System.out.println();
        System.out.println("----------Խնդիր 3----------");
        System.out.println(da.getByIndex(0));
        System.out.println(da.getByIndex(1));
        System.out.println(da.getByIndex(20));
        System.out.println(da.getByIndex(15));
        System.out.println(da.getByIndex(-1));
        System.out.println(da.getByIndex(40));
        System.out.println("----------Խնդիր 4----------");
        da.print();
    }
}
