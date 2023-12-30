import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel{
    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.GREEN);
//        g2d.fillRect(10,60,200,50);
//        g2d.drawLine(0,0,500,500);
//        g2d.drawRect(10,10,200,100);
//        g2d.drawOval(10,10,100,200);
//        g2d.fillOval(120,10,100,200);
//        g2d.drawArc(10,10,100,100,180,180);
//        g2d.setPaint(Color.red);
//        g2d.fillArc(10,10,100,100,180,180);
//        g2d.setPaint(Color.black);
//        g2d.fillArc(10,10,100,10,0,180);
//        int[] xP = {150,250,350};
//        int[] yP = {250,150,250};
//        g2d.drawPolygon(xP,yP,3);
//        g2d.setPaint(Color.red);
//        g2d.fillPolygon(xP,yP,3);
        g2d.drawString("You are a good man",50,50);
    }
}
public class TwoDGraphics {

    MyPanel panel = new MyPanel();
    TwoDGraphics(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(560,560);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
