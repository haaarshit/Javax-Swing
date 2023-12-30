import javax.swing.*;

public class DialogBox {

    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompt user for a value
//        JOptionPane.showMessageDialog(null,"hello","mainbox",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"hello","mainbox",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"hello","mainbox",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"hello","mainbox",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"hello","mainbox",JOptionPane.ERROR_MESSAGE);

//        int answer = JOptionPane.showConfirmDialog(null,"Hurra","Title",JOptionPane.YES_NO_CANCEL_OPTION);

//        String name  = JOptionPane.showInputDialog("What is your name");
//        System.out.println("Hello "+name);

        JOptionPane.showOptionDialog(null,"Hell0","enrypted message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,0);

    }
}
