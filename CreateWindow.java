import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CreateWindow {
    JFrame frame;
    JLabel label;

    CreateWindow(){
        frame = new JFrame();
        label = new JLabel("CreateAccount");

        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setBounds(200, 200, 400, 50);
        label.setFont(new Font("Ariel",Font.BOLD,40));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        

        frame.add(label);
    }

}
