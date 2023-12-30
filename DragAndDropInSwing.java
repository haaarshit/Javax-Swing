import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class  DragPanel extends JPanel{
    ImageIcon  image = new ImageIcon("img.png");
    final int width = image.getIconWidth();
    final int height = image.getIconHeight();

    Point imgCoord;
    Point prevCoord;
    DragPanel(){
        System.out.println("Image icon "+image);
        System.out.println("Image w and h "+width+" "+height);
        imgCoord = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g){
     super.paintComponent(g);
     image.paintIcon(this,g,(int)imgCoord.getX(),(int)imgCoord.getY());
    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevCoord = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            imgCoord.translate(
                    (int)currentPt.getX()-(int)prevCoord.getX(),
                    (int)currentPt.getY() -(int)prevCoord.getY()
            );
            prevCoord = currentPt;
            repaint();
        }
    }
}
class NewFrame extends JFrame{
    DragPanel dragPanel = new DragPanel();
    NewFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Drag & Drop");
        this.setSize(600,600);
        this.add(dragPanel);
        this.setVisible(true);
    }
}
public class DragAndDropInSwing {
    DragAndDropInSwing(){
        NewFrame frame = new NewFrame();
    }
}