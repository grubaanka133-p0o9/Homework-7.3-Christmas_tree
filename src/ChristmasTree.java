import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree();
        System.out.println("Enter a number from 1 to 20:");
        int lines = scanner.nextInt();

        while (lines > 20 || lines < 1) {
            System.out.println("give another value:");
            lines = scanner.nextInt();
        }
        tree.ChristmasTree(lines);
    }
}
