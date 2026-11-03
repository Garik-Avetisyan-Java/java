package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da  = new DynamicArray();
        System.out.println("----------Խնդիր 1 & Խնդիր 2----------");
        da.add(20);
        da.add(21);
        da.add(22);
        da.add(23);
        da.add(24);
        da.add(25);
        da.add(26);
        da.add(27);
        da.add(28);
        da.add(29);
        da.add(30);
        da.add(31);
        da.add(32);
        da.add(33);
        da.add(34);
        da.add(35);
        da.add(36);
        da.add(37);
        da.add(38);
        da.add(39);
        da.add(40);
        da.add(41);
        da.add(42);
        da.add(43);
        da.add(44);
        da.add(45);
        System.out.println();
        System.out.println("----------Խնդիր 3----------");
        System.out.println(da.getByIndex(0));
        System.out.println(da.getByIndex(1));
        System.out.println(da.getByIndex(2));
        System.out.println(da.getByIndex(15));
        System.out.println(da.getByIndex(-1));
        System.out.println(da.getByIndex(40));
        System.out.println("----------Խնդիր 4----------");
        da.print();
    }
}
