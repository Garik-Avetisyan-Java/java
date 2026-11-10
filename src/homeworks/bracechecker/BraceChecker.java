package homeworks.bracechecker;

public class BraceChecker {
    private Stack stack = new Stack();
    private String text;
    public BraceChecker(String text) {
        this.text = text;
    }
    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                int opened = stack.pop();
                if (opened == 0) {
                    System.out.println(
                            "Error: unexpected closing " + current + " at " + i
                    );
                    return;
                }
                if ((current == ')' && opened != '(') ||
                        (current == ']' && opened != '[') ||
                        (current == '}' && opened != '{')) {
                    System.out.println(
                            "Error: opened " + (char) opened + " but closed " + current + " at " + i
                    );
                    return;
                }
            }
        }
        int remaining = stack.pop();
        if (remaining != 0) {
            System.out.println(
                    "Error: opened " + (char) remaining + " but no closing bracket found"
            );
            return;
        }
        System.out.println("No errors");
    }
}