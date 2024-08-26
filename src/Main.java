import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int canvasWidth = 600;
        int canvasHeight = canvasWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(canvasWidth, canvasHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Snake snake = new Snake(canvasWidth, canvasHeight);
        frame.add(snake);
        frame.pack();
        snake.requestFocus();
    }
}