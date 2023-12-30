import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListeners implements KeyListener {
    JLabel label;
    KeyListeners(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,180,180);
        label.setOpaque(true);
        label.setBackground(Color.DARK_GRAY);

        frame.add(label);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e){
        System.out.println("KEY Typed "+e.getKeyChar());
        int motion = 10;
        switch (e.getKeyChar()) {
            case 'a' -> label.setLocation(label.getX() - motion, label.getY());
            case 'w' -> label.setLocation(label.getX(), label.getY() - motion);
            case 's' -> label.setLocation(label.getX(), label.getY() + motion);
            case 'd' -> label.setLocation(label.getX() + motion, label.getY());
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        System.out.println("KEY Pressed "+e.getKeyCode());
        int motion = 15;
        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX() - motion, label.getY());
            case 38 -> label.setLocation(label.getX(), label.getY() - motion);
            case 40 -> label.setLocation(label.getX(), label.getY() + motion);
            case 39 -> label.setLocation(label.getX() + motion, label.getY());
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        System.out.println("KEY RELeased "+e.getKeyChar());
    }
}