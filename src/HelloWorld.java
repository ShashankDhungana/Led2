import javax.swing.*;
import java.awt.*;
public class HelloWorld extends JFrame {
    JLabel labelHello;
    JLabel labelName;
    public HelloWorld(){
        setTitle("Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(400,150,600,400);
        setResizable(true);

        //for welcome
        labelHello= new JLabel("Hello World");
        labelHello.setForeground(Color.black);
        labelHello.setFont(new Font("Arial", Font.BOLD, 20));
        labelHello.setBounds(500,300,200,25);
        add(labelHello);

        //for name
        labelName= new JLabel("Alpha Q");
        labelName.setForeground(Color.black);
        labelName.setFont(new Font("Cambria", Font.ITALIC, 20));
        labelName.setBounds(0,0,100,25);
        add(labelName);
    }
    public static void main(String[] args){
        new HelloWorld().setVisible(true);

    }

}
