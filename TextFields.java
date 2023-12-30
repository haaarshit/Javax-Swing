import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    CustomFrame(){
        button = new JButton("submit");
        button.addActionListener(this);
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,50));
        textField.setFont(new Font("Consolas",Font.BOLD,24));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.BLUE); // line behind the text
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true); // make frame visible
        this.add(textField);
        this.add(button);
        this.pack();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            this.dispose();
            System.out.println(textField.getText());
            textField.setEnabled(false);
            button.setEnabled(false);
        }
    }
}

public class TextFields {
    public static void main(String[] args) {
        //        JTextField  = A GUI textbox component that can be used to add, set, or get text
        CustomFrame frame = new CustomFrame();
    }
}
