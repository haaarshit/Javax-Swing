import javax.swing.*;
import java.awt.*;

public class ComboBoxes {
    public static void main(String[] args) {

        // JComboBox - A component that combines a button or editable field and a drop-down list

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        String[] animals = {"dog","cat","bird"};
        JComboBox comboBox= new JComboBox(animals);
        comboBox.addItem("Horse");
        comboBox.setEditable(true);
        comboBox.removeItem("cat");
        comboBox.addActionListener(e->{
            if(e.getSource() == comboBox){
                System.out.println(comboBox.getSelectedItem());
                System.out.println(comboBox.getSelectedIndex());
            }
        });
        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);

    }
}
