import javax.swing.*;
import java.awt.*;

public class Rita extends Canvas {
    private final int height = 600;
    private final int width = 800;
    int treeX = 200;
    int treeY = 200;
    int houseX = 425;
    int houseY = 300;

    public Rita() {
        JFrame frame = new JFrame("Generic Picture");
        this.setSize(width, height);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        drawTree(g, treeX,treeY);
        drawTree(g, treeX+30,treeY);
        drawTree(g, treeX+60,treeY);
        drawHouse(g, houseX, houseY);
        update();
    }

    private void update() {
        
    }

    private void drawHouse(Graphics g, int x, int y) {
        g.setColor(new Color(0xff0000));
        g.fillRect(x,y,100,50);
    }

    private void drawTree(Graphics g, int x, int y) {
        g.setColor(new Color(0x00DD33));
        g.fillRect(x,y,20,40);
        g.setColor(new Color(0x694b37));
        g.fillRect(x+8,y+40,4,20);
    }


    public static void main(String[] args) {
        Rita exempel = new Rita();
    }
}