import javax.swing.*;
import java.awt.*;
public class Login extends JFrame {
     JLabel labeltitle;
     JLabel labelusername;

     public Login(){
         setBounds(0,0,1280,720);
         setTitle("Login");
         setResizable(false);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLayout(null);

         labeltitle = new JLabel("Login");
         labeltitle.setBounds(640,10,50,0);
         add(labeltitle);

         labelusername = new JLabel("Username");
         labelusername.setBounds(360,100,10,10);
         add(labelusername);


     }

    public static void main(String[] args) {
         new Login().setVisible(true);


    }

     }
