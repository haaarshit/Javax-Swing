import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import  javax.swing.*;
import java.awt.*;

public class Sliders implements ChangeListener {
    JFrame frame ;
    JPanel panel;
    JLabel label;
    JSlider slider;
    Sliders(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();

        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(250,250));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,25));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(e->{
            if(e.getSource() == slider){
                label.setText("°C ="+slider.getValue());
            }
        });

        label.setText("°C ="+slider.getValue());

        panel.add(slider);
        panel.add(label);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(450,450);
        frame.setVisible(true);

    }

    public void stateChanged(ChangeEvent e){}
}
