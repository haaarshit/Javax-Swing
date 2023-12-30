/*
JPanel, a part of the Java Swing package, is a container that can store
a group of components. The main task of JPanel is to organize components,
various layouts can be set in JPanel which provide better organization of components,
however, it does not have a title bar.
*/
import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        // Icon Image
        ImageIcon icon = new ImageIcon("start-svg.png");

        // LABEL
        JLabel label = new JLabel();
        label.setText("Hii");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        // red panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        // green panel
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(250,0,250,250);

        // blue panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0,250,500,250);
        bluePanel.setLayout(new BorderLayout());


        // yellow panel
//        JPanel yellowPanel = new JPanel();
//        yellowPanel.setBackground(Color.yellow);
//        yellowPanel.setBounds(250,250,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(720,580);
        frame.setVisible(true);
        frame.setTitle("MY FRAME");
        frame.getContentPane().setBackground(Color.black);
        bluePanel.add(label);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
//        frame.add(yellowPanel);

    }
}
