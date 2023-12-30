import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SelectFile {
    SelectFile() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Select File");
        button.setFocusable(false);
        button.addActionListener(e->{
            if(e.getSource() == button){
                JFileChooser fileChoser = new JFileChooser();
                fileChoser.setCurrentDirectory(new File("C:\\Users\\dell\\Desktop"));

//                int resp = fileChoser.showOpenDialog(null); // select file to open
//                System.out.println(resp);
//                if(resp == JFileChooser.APPROVE_OPTION){
//                    File file = new File(fileChoser.getSelectedFile().getAbsolutePath());
//                    System.out.println(file);
//                }
                int resp = fileChoser.showSaveDialog(null);
                if(resp == JFileChooser.APPROVE_OPTION){
                    File file = new File(fileChoser.getSelectedFile().getAbsolutePath());
                    System.out.println(file);
                }

            }
        });
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
