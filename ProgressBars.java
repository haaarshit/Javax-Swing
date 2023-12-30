import javax.swing.*;
import java.awt.*;

public class ProgressBars {
        // Progress Bar = let the user know that an operation is in progress
    JFrame frame = new JFrame();
    JProgressBar bar  = new JProgressBar();
    ProgressBars(){
        bar.setValue(0);
        bar.setBounds(0,0,500,25);
        bar.setStringPainted(true);
        bar.setBackground(Color.BLACK);
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        fill();
    }
    public void fill(){
        int counter = 0;
        while (counter <= 100){
            try {
                Thread.sleep(50);
            }
            catch (Exception e){
                System.out.println("Error");
            }
        bar.setValue(counter);
        counter+=1;
        }
        frame.dispose();
    }
}
