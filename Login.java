//importing packages

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class Login extends Frame implements WindowListener, ActionListener {
    //Declaration
    Panel[] p = new Panel[50];
    Label id, pwd;
    TextField txid, txpwd;
    Button submit, reset, signup;

    //constructor
    public Login() {
        super("Login");

        setBackground(Color.pink);
        for (int i = 0; i < 50; i++) {
            p[i] = new Panel();
        }
        //setting layout
        p[0].setLayout(new GridLayout(1, 2));
        p[1].setLayout(new BorderLayout());
        p[2].setLayout(new GridLayout(4, 2));

        //memory allocation
        id = new Label("User ID :");
        txid = new TextField(15);
        pwd = new Label("Password :");
        txpwd = new TextField(15);
        txpwd.setEchoChar('*');
        submit = new Button("Submit");
        reset = new Button("Reset");
        signup = new Button("Sign up now!!!");

        //add components
        p[3].add(id);
        p[4].add(txid);
        p[5].add(pwd);
        p[6].add(txpwd);
        p[7].add(submit);
        p[8].add(reset);
        p[9].add(signup);

        submit.addActionListener(this);
        reset.addActionListener(this);
        signup.addActionListener(this);

        for (int i = 3; i < 10; i++) {
            p[i].setLayout(new FlowLayout(FlowLayout.LEFT));
            p[2].add(p[i]);
        }


        p[0].add(p[1]);
        p[0].add(p[2]);
        add(p[0]);
        addWindowListener(this);
        setSize(600, 400);
        setResizable(false);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {
            Profile p = new Profile("", "", "", "", "", "");
        }

        if (e.getSource() == signup) {
            Sign_up sgn = new Sign_up();
        }

        if (e.getSource() == reset) {
            txid.setText(null);
            txpwd.setText(null);
        }


    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        System.exit(1);
    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowOpened(WindowEvent e) {

    }


    public static void main(String args[]) {
        Login g = new Login();
    }
}

