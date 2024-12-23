import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CreateWindow {
    JFrame frame;
    JLabel label;
    JTextField firstname, lastname, email, pass;
    JButton createaccount;
    AccountList data;

    CreateWindow(){
        frame = new JFrame();
        label = new JLabel("CreateAccount");
        firstname = new JTextField();
        lastname = new JTextField();
        email = new JTextField();
        pass = new JTextField();
        createaccount = new JButton("Create Account");
        data = new AccountList();

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

            Account account = new Account(firstname.getText(), lastname.getText(), email.getText(), pass.getText());
            data.list.put(data.list.size(),account);
            System.out.println(data.list.size());
        });


        

        frame.add(label);
        frame.add(firstname);
        frame.add(lastname);
        frame.add(email);
        frame.add(pass);
        frame.add(createaccount);
    }

}
