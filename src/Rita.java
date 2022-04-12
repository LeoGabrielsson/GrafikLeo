import javax.swing.*;
import java.awt.*;

public class Rita extends Canvas {
    private final int height = 600;
    private final int width = 800;
    int skyX = 0;
    int skyY = 0;
    int[] mountxPoints = {0,200,275,400,600,800};
    int[] mountyPoints = {278,100,150,25,100,278};
    int treeX = 200;
    int treeY = 300;
    int houseX = 425;
    int houseY = 300;
    int groundX = 0;
    int groundY = 0;

    public Rita() {
        JFrame frame = new JFrame("Generic Picture");
        this.setSize(width, height);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        drawGround(g, groundX, groundY);
        drawSky(g, skyX, skyY);
        drawMount(g);
        drawTree(g, treeX,treeY);
        drawTree(g, treeX+30,treeY);
        drawTree(g, treeX+60,treeY);
        drawHouse(g, houseX, houseY);
        update();
    }
    private void update() {

    }

    private void drawSky(Graphics g, int x, int y) {
        g.setColor(new Color(0x75E4F6));
        g.fillRect(x,y, 800, 278);
    }
    private void drawMount(Graphics g) {
        g.setColor(new Color(0x5D5D5D));
        g.fillPolygon(mountxPoints,mountyPoints, 6 );
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
    private void drawGround(Graphics g, int x, int y) {
        g.setColor(new Color(0x34B92B));
        g.fillRect(x,y, 800, 600);
    }


    public static void main(String[] args) {
        Rita exempel = new Rita();
    }
}