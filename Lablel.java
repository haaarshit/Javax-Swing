import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Lablel {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.YELLOW,2);

        // LABELS
        JLabel label = new JLabel();
        label.setText("LET'S CODE IT");
        ImageIcon img = new ImageIcon("qoute.png");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli",Font.PLAIN,24));
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // will display the background color
        label.setBorder(border);
//        label.setBounds(100,100,360,360);
        JFrame frame = new JFrame();
        frame.setSize(720,580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.setLayout(null);
//        frame.setResizable(false);
        frame.add(label);

        frame.pack(); // window adjust the size to preferred size according to it's subcomponents (add all components to frame before using pack method)

    }
}
