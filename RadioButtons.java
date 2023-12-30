import javax.swing.*;
import java.awt.*;

public class RadioButtons {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JRadioButton b1 = new JRadioButton("button 1");
        JRadioButton b2 = new JRadioButton("button 2");
        JRadioButton b3 = new JRadioButton("button 3");
        JRadioButton b4 = new JRadioButton("button 4");

        // add all buttons to a button group so that only one button can be selected
        ButtonGroup buttonGroup = new ButtonGroup();
        ButtonGroup buttonGroup1 = new ButtonGroup();

        buttonGroup.add(b1);
        buttonGroup.add(b2);
        buttonGroup.add(b3);
        buttonGroup.add(b4);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        frame.pack();
        frame.setVisible(true);

    }
}
