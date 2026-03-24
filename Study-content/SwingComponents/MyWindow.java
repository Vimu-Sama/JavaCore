import javax.swing.*;
import java.awt.event.*;

public class MyWindow {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Demo");

        JButton button = new JButton("Click");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        frame.add(button);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}