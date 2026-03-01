import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    
    int birdX = 100;
    int birdY = 300;
    int birdWidth = 40;
    int birdHeight = 40;

    int velocityY = 0;
    int gravity = 1;

    Timer timer;
    ArrayList<Rectangle> pipes;
    Random rand = new Random();

    int pipeWidth = 80;
    int pipeGap = 200;

    boolean gameOver = false;
    int score = 0;

    public GamePanel() {
        pipes = new ArrayList<>();
        addPipe();
        addPipe();

        timer = new Timer(20, this);
        timer.start();

        setFocusable(true);
        addKeyListener(this);
    }

    public void addPipe() {
        int topHeight = rand.nextInt(400) + 50;
        int bottomY = topHeight + pipeGap;

        pipes.add(new Rectangle(500, 0, pipeWidth, topHeight));
        pipes.add(new Rectangle(500, bottomY, pipeWidth, 700 - bottomY));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 500, 700);

        // Bird
        g.setColor(Color.yellow);
        g.fillRect(birdX, birdY, birdWidth, birdHeight);

        // Pipes
        g.setColor(Color.green);
        for (Rectangle pipe : pipes) {
            g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
        }

        // Score
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 32));
        g.drawString("Score: " + score, 20, 50);

        if (gameOver) {
            g.setColor(Color.red);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("GAME OVER", 70, 350);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) return;

        velocityY += gravity;
        birdY += velocityY;

        // Move pipes
        for (int i = 0; i < pipes.size(); i++) {
            Rectangle pipe = pipes.get(i);
            pipe.x -= 5;

            // Remove old pipes
            if (pipe.x + pipe.width < 0) {
                pipes.remove(pipe);
                i--;
                if (pipe.y == 0) {  // counted for only top pipe
                    score++;
                    addPipe();
                }
            }
        }

        // Collision detection
        for (Rectangle pipe : pipes) {
            if (pipe.intersects(new Rectangle(birdX, birdY, birdWidth, birdHeight))) {
                gameOver = true;
            }
        }

        // Ground or sky hit
        if (birdY > 700 || birdY < 0) {
            gameOver = true;
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!gameOver) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                velocityY = -12; // jump
            }
        } else {
            // Reset game
            birdY = 300;
            velocityY = 0;
            pipes.clear();
            addPipe();
            addPipe();
            score = 0;
            gameOver = false;
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
