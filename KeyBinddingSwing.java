import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class Game{
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    JFrame frame;
    JLabel label;
    Game(){
        frame =  new JFrame("Key Binding demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.BLACK);
        label.setBounds(100,100,450,450);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction  = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
        label.getActionMap().put("upAction",upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        label.getActionMap().put("downAction",downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        label.getActionMap().put("leftAction",leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        label.getActionMap().put("rightAction",rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(),label.getY()-10);
        }
    }
    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(),label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX()-10,label.getY());
        }
    }
    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX()+10,label.getY());
        }
    }
}

public class KeyBinddingSwing {

    // Key Binding =  bind an Action to a KeyStroke don't require you to click a component to give it focus
    // key bindings provide more flexibility than keyListeners

//    KeyBinddingSwing(){
//        Game game = new Game();
//    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}
