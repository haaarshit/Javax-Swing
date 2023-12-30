import javax.swing.*;
import java.awt.*;

public class FlowLayoutManager {
    public static void main(String[] args) {
        // Flowlayout -> places components in a row sized at their preferred size.
        //               If horizontal space in the container is too small the FlowLayout uses the next available row

        // Frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,25,25));

        // Panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);

        frame.setVisible(true);
    }
}
