import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame {
    MyFrame(){
        // Icon Image
        ImageIcon img = new ImageIcon("instalogo.jpeg");
        // Label
        JLabel label = new JLabel();
        label.setBounds(150,250,150,150);
        label.setVisible(false);
        label.setForeground(Color.green);
        label.setText("Hello");
        label.setIcon(img);
        // Button
        JButton button = new JButton();
        button.setBounds(200,200,100,50);
        button.addActionListener(e-> {
            System.out.println("Button Got Clicked");
            button.setEnabled(false);
            label.setVisible(true);
        });
     button.setText("Click");
     button.setFocusable(false);
//     button.setIcon(img);
     button.setHorizontalTextPosition(JButton.CENTER);
     button.setVerticalTextPosition(JButton.BOTTOM);
     button.setFont(new Font("Comic Sins",Font.ITALIC,25));
     button.setForeground(Color.GREEN);
     button.setBackground(Color.BLACK);
     button.setBorder(BorderFactory.createDashedBorder(Color.GREEN));
//     button.setEnabled(false);

        // Frame
     this.setSize(920,620);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(null);
     this.setVisible(true); // make frame visible
     this.add(button);
     this.add(label);

 }
}
