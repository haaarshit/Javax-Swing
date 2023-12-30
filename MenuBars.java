import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuBars {
    MenuBars(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(560,560);
        frame.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // drop down for fileMenu
        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for fileMenu

        loadItem.setMnemonic(KeyEvent.VK_L); // l for Load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_Q); // q for quit/exit

        loadItem.addActionListener(e->{
            if(e.getSource() == loadItem) System.out.println("File loaded");
        });
        saveItem.addActionListener(e->{
            if(e.getSource() == saveItem) System.out.println("File saved");
        });
        exitItem.addActionListener(e->{
//            if(e.getSource() == exitItem) System.out.println("File Exited");
            frame.dispose();
        });

//        JMenuItem editItem = new JMenuItem("Edit");
//        JMenuItem cancel = new JMenuItem("Cancel");

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

//        editMenu.add(editItem);
//        editMenu.add(cancel);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}