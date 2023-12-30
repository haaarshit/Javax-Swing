import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomPanel extends JPanel implements ActionListener {
    final int width = 500;
    final int height = 500;
    Image img;
    Timer timer;
    int xVeclocity = 1;
    int yVeclocity = 1;
    int x = 0;
    int y = 0;
    CustomPanel(){
        this.setPreferredSize(new Dimension(width,height));
        this.setBackground(Color.BLACK);
        img = new ImageIcon("img.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(img,x,y,null);
    }

    public void actionPerformed(ActionEvent e){
        if(x >= width || x<0){
          xVeclocity *=-1;
        }
        if(y >= height || y<0){
            yVeclocity *=-1;
        }

        x += xVeclocity;
        y += yVeclocity;
        repaint();
    }
}
public class TwoDAnimations extends JFrame {
    CustomPanel panel;
    TwoDAnimations(){
        panel = new CustomPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
