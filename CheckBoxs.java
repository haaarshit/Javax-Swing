import javax.swing.*;
import java.awt.*;

public class CheckBoxs {
    public static void main(String[] args) {
        // JCheckBox = A GUI component that can be selected or deselected
        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Console",Font.PLAIN,35));

        JButton button = new JButton("Submit");
        button.addActionListener(e->{
            if(e.getSource() == button){
                System.out.println("Hello");
            }
        });

        frame.add(button);
        frame.add(checkBox);
        frame.pack();
        frame.setVisible(true);
    }
}
