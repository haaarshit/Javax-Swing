import javax.swing.*;
import java.awt.*;

public class BordersLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720,580);
        frame.setLayout(new BorderLayout(10,10)); // setting border layout with 10px of margin
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.black);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.gray);
        // border layout
        panel5.setLayout(new BorderLayout());

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        // ---------------- Sub Panel'

        JPanel panelA = new JPanel();
        panelA.setPreferredSize(new Dimension(20,50));
        panelA.setBackground(Color.orange);
        panel5.add(panelA,BorderLayout.NORTH);
        panelA.setLayout(new BorderLayout());

        //----------------- Sub panel for Sub panel
        JPanel panela = new JPanel();
        panela.setPreferredSize(new Dimension(50,50));
        panela.setBackground(Color.magenta);
        panelA.add(panela,BorderLayout.EAST);

        frame.add(panel1,BorderLayout.EAST);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.NORTH);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);

    }
}
