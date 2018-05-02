//import package

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Sign_up extends Frame implements ActionListener, WindowListener {
    //Declaration


    Panel p[] = new Panel[50];
    Panel mainp;
    Button b[] = new Button[2];
    Label l[] = new Label[8];
    TextArea ta[] = new TextArea[1];
    TextField tx[] = new TextField[6];
    Choice ch[] = new Choice[3];
    public String str_ta0 = "";
    public String str_tx0 = "";
    public String str_tx1 = "";
    public String str_tx4 = "";
    public String str_tx5 = "";
    public String str_tx6 = "";


    //constructor
    public Sign_up() {
        super("Sign up");

        //memory allocation to components
        for (int i = 0; i < 20; i++) {
            p[i] = new Panel();
        }

        mainp = new Panel();
        mainp.setLayout(new GridLayout(11, 2));
        mainp.setBackground(Color.gray);
        ta[0] = new TextArea(null, 2, 30);

        //buttons
        b[0] = new Button("Submit");
        b[1] = new Button("Cancel");
        b[0].addActionListener(this);
        b[1].addActionListener(this);


        //Textfields
        for (int i = 0; i < 6; i++)
            tx[i] = new TextField(null, 30);

        tx[2].setEchoChar('*');
        tx[3].setEchoChar('*');

        //Labels
        l[0] = new Label("Name : ");
        l[1] = new Label("ID");
        l[2] = new Label("Password : ");
        l[3] = new Label("Re-enter Password");
        l[4] = new Label("Address");
        l[5] = new Label("Contact");
        l[6] = new Label("E-mail");
        l[7] = new Label("DOB");


        //setting layout of panels
        for (int i = 0; i < 20; i++) {
            p[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        }

        //Choice
        for (int i = 0; i < 3; i++)
            ch[i] = new Choice();

        //1st choice
        ch[0].add("January");
        ch[0].add("February");
        ch[0].add("March");
        ch[0].add("April");
        ch[0].add("May");
        ch[0].add("June");
        ch[0].add("July");
        ch[0].add("August");
        ch[0].add("Septeber");
        ch[0].add("October");
        ch[0].add("November");
        ch[0].add("December");


        //choice using valueOf() and for loop
        String str[] = new String[10000];
        for (int i = 1; i < 32; i++) {
            str[i] = String.valueOf(i);
            ch[1].add(str[i]);
        }

        for (int i = 1900; i < 2020; i++) {
            str[i] = String.valueOf(i);
            ch[2].add(str[i]);
        }


        //adding labels
        for (int i = 0; i < 8; i++)
            p[(i * 2)].add(l[i]);

        //adding other components
        p[1].add(tx[0]);
        p[3].add(tx[1]);
        p[5].add(tx[2]);
        p[7].add(tx[3]);
        p[9].add(ta[0]);
        p[11].add(tx[4]);
        p[13].add(tx[5]);


        for (int i = 0; i < 3; i++)
            p[15].add(ch[i]);

        //adding buttons
        p[16].add(b[0]);
        p[17].add(b[1]);

        for (int i = 0; i < 18; i++) {
            mainp.add(p[i]);
        }


        addWindowListener(this);
        add(mainp);
        setSize(600, 550);
        setResizable(false);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b[0]) {
            str_tx0 = tx[0].getText();
            str_tx1 = tx[1].getText();
            str_ta0 = ta[0].getText();
            str_tx4 = tx[4].getText();
            str_tx5 = tx[5].getText();

            str_tx6 = (ch[0].getSelectedItem() + " -");
            str_tx6 = (str_tx6 + ch[1].getSelectedItem() + " -");
            str_tx6 = (str_tx6 + ch[2].getSelectedItem());

            Profile p = new Profile(str_tx0, str_tx1, str_tx4, str_tx5, str_ta0, str_tx6);
        }


        if (e.getSource() == b[1]) {
            this.setVisible(false);
        }
    }


    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        setVisible(false);
    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowOpened(WindowEvent e) {

    }


    public static void main(String args[]) {
        Sign_up p = new Sign_up();
    }

}
