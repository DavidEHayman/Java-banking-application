import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.*;

public class CreateWindow {
    JFrame frame;
    JLabel label;
    JTextField firstname, lastname, email, pass;
    JButton createaccount;
    HashMap<Integer,Account> data;

    CreateWindow(){
        frame = new JFrame();
        label = new JLabel("CreateAccount");
        firstname = new JTextField();
        lastname = new JTextField();
        email = new JTextField();
        pass = new JTextField();
        createaccount = new JButton("Create Account");
        data = new HashMap<>();
        

        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setBounds(200, 150, 400, 50);
        label.setFont(new Font("Ariel",Font.BOLD,40));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        firstname.setBounds(220,250,150,30);
        lastname.setBounds(420,250,150,30);
        email.setBounds(220,330, 350, 30);
        pass.setBounds(270,410,250,30);
        
        createaccount.setBounds(270, 490, 250, 60);
        createaccount.addActionListener(a -> {

            String filepath = "";

            try (FileWriter fwrite = new FileWriter(filepath, true)) {
                fwrite.write("Account" + "\n" + firstname.getText() +"\n" + lastname.getText() + "\n" + email.getText() + "\n" + pass.getText());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            frame.dispose();
        });


        

        frame.add(label);
        frame.add(firstname);
        frame.add(lastname);
        frame.add(email);
        frame.add(pass);
        frame.add(createaccount);
    }

}
