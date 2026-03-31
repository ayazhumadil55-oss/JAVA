import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task7 extends JPanel {
    char ch = ' ';

    public task7() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                ch = e.getKeyChar();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Pressed: " + ch, 50, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task7");
        task7 panel = new task7();
        f.add(panel);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

