import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Game extends JPanel implements ActionListener, KeyListener {

    int carX = 180;
    int carY = 550;
    int carWidth = 50;
    int carHeight = 80;

    int enemyX;
    int enemyY = -200;
    int enemyWidth = 50;
    int enemyHeight = 80;

    int speed = 5;
    int score = 0;

    boolean gameOver = false;

    Timer timer;
    Random rand = new Random();

    public Game() {
        setFocusable(true);
        addKeyListener(this);

        enemyX = rand.nextInt(300);
        timer = new Timer(20, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background (road)
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 400, 700);

        // Road lines
        g.setColor(Color.WHITE);
        for (int i = 0; i < 700; i += 80) {
            g.fillRect(195, i, 10, 50);
        }

        // Player car
        g.setColor(Color.BLUE);
        g.fillRect(carX, carY, carWidth, carHeight);

        // Enemy car
        g.setColor(Color.RED);
        g.fillRect(enemyX, enemyY, enemyWidth, enemyHeight);

        // Score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Score: " + score, 20, 40);

        // Game Over Text
        if (gameOver) {
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("GAME OVER", 60, 350);
            g.setFont(new Font("Arial", Font.PLAIN, 25));
            g.drawString("Press SPACE to restart", 60, 400);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) return;

        enemyY += speed;

        // Respawn enemy
        if (enemyY > 700) {
            enemyY = -200;
            enemyX = rand.nextInt(300);
            score++;
            speed++;  // increase difficulty
        }

        // Collision detection
        Rectangle player = new Rectangle(carX, carY, carWidth, carHeight);
        Rectangle enemy = new Rectangle(enemyX, enemyY, enemyWidth, enemyHeight);

        if (player.intersects(enemy)) {
            gameOver = true;
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (gameOver) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                // Reset game
                gameOver = false;
                score = 0;
                speed = 5;
                enemyY = -200;
                enemyX = rand.nextInt(300);
            }
        } else {
            if (e.getKeyCode() == KeyEvent.VK_LEFT && carX > 30) {
                carX -= 15;
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT && carX < 320) {
                carX += 15;
            }
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
