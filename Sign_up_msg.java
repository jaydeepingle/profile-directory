//import package

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Sign_up_msg extends Frame implements ActionListener {
    Label LabelFrame;
    Button ButtonFrame;

    public Sign_up_msg() {
        super("Message Box");
        //Plz make the Entries
        LabelFrame = new Label("Please make all the Entries!!!");
        ButtonFrame = new Button("OK");
        setLayout(new FlowLayout());
        ButtonFrame.addActionListener(this);
        add(LabelFrame);
        add(ButtonFrame);
        setSize(200, 100);
        setLocation(200, 200);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        Sign_up s = new Sign_up();
    }

    public static void main(String args[]) {
        Sign_up_msg s = new Sign_up_msg();
    }
}