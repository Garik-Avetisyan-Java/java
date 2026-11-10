package homeworks.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        BraceChecker bc = new BraceChecker("((())]");
        bc.check();
        char c = ')';
    }
}
