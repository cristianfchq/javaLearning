package swing;

import java.awt.*;
import javax.swing.JFrame;

public class MyCanvas extends Canvas {

    public void paint(Graphics g) {

        Toolkit t = Toolkit.getDefaultToolkit();
        for (int i = 50; i < 350; i = i + 50) {
            alien(g, t , i);
        }
        nave(g, t);
    }

    public void alien(Graphics g, Toolkit t, int num){
        Image i = t.getImage("/home/cristian/Desktop/java/javaLearning/swing/alien.gif");
        g.drawImage(i, num, 100, this);
        g.drawImage(i, num, 140, this);
    }

    public void nave(Graphics g, Toolkit t){
        Image i = t.getImage("/home/cristian/Desktop/java/javaLearning/swing/spaceship3030.png");
        g.drawImage(i, 180, 300, this);
    }

    public static void main(String[] args) {
        MyCanvas m = new MyCanvas();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }

}