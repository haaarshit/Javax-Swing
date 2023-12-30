import javax.swing.*;
import java.awt.*;

public class ColorSelector {
    ColorSelector(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setBackground(Color.white);
        label.setText("Color Choose");
        label.setOpaque(true);
        label.setFont(new Font("Sans Serif",Font.BOLD,25));

        JButton button = new JButton("Choose Color");

        button.addActionListener(e->{
            if(e.getSource() == button){
                JColorChooser colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(null,"Pick a color",Color.BLACK);
                label.setBackground(color);
            }
        });


        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
