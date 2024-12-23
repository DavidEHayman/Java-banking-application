import java.awt.Font;
import java.util.Scanner;
import javax.swing.*;

public class LoginWindow {
    JLabel label;
    Scanner scanner;
    JTextField login, pass;
    JButton loginbutton, createbutton;
    JFrame frame;


    public LoginWindow(){
        frame = new JFrame();
        label = new JLabel("Login");
        loginbutton = new JButton("Login");
        login = new JTextField();
        pass = new JTextField();
        createbutton = new JButton("No Account?");

        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setBounds(200, 200, 400, 50);
        label.setFont(new Font("Ariel",Font.BOLD,40));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        login.setBounds(200, 300, 400, 30);
        pass.setBounds(200, 350, 400, 30);

        loginbutton.setBounds(425, 400, 150, 40);
        loginbutton.addActionListener( a -> {

        });
        createbutton.setBounds(225, 400, 150, 40);
        createbutton.addActionListener(a -> {
            frame.dispose();
            new CreateWindow();
        });

        frame.add(login);
        frame.add(loginbutton);
        frame.add(pass);
        frame.add(createbutton);
        frame.add(label);
    }

}
