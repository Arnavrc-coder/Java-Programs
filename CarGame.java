import javax.swing.*;

public class CarGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Racing Game");
        Game panel = new Game();

        frame.add(panel);
        frame.setSize(400, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
