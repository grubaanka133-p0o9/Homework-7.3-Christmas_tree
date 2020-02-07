public class Tree {
    public void ChristmasTree(int lines) {
        for (int line = 0; line < lines; line++) {
            for (int x = 0; x < lines - line; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < 1 + (line * 2); y++) {
                System.out.print("0");
            }
            System.out.println("");
        }
    }
}
