//import packages

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class Contact extends JFrame implements ActionListener, WindowListener {
    //Declaration
    Container contentPane;
    int v, h;
    JScrollPane jsp;
    Button b[] = new Button[3];
    Panel[] p = new Panel[22];
    Panel mainp;
    Label l[] = new Label[10];
    Label newL[] = new Label[15];
    TextField tx[] = new TextField[5];
    Choice ch[] = new Choice[3];
    TextArea ta[] = new TextArea[2];

    //constructor
    Contact() {
        super("Contact");
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //allocation of memory to controls
        b[0] = new Button("Edit");
        b[1] = new Button("Update");
        b[2] = new Button("Cancel");

        for (int i = 0; i < 3; i++)
            b[i].addActionListener(this);

        for (int i = 0; i < 15; i++)
            newL[i] = new Label("");

        mainp = new Panel();
        mainp.setLayout(new GridLayout(6, 4));
        mainp.setBackground(Color.pink);
        for (int i = 0; i < 22; i++) {
            p[i] = new Panel();
            p[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        }

        l[0] = new Label("Primary E-mail");
        l[1] = new Label("Secondary E-mail");
        l[2] = new Label("Home Phone");
        l[3] = new Label("Cel Phone");
        l[4] = new Label("Address Line 1");
        l[5] = new Label("Address Line 2");
        l[6] = new Label("City");
        l[7] = new Label("Zip/Postal Code");
        l[8] = new Label("State");
        l[9] = new Label("Country");

        for (int i = 0; i < 5; i++)
            tx[i] = new TextField(20);

        for (int i = 0; i < 2; i++)
            ta[i] = new TextArea(2, 15);

        for (int i = 0; i < 3; i++)
            ch[i] = new Choice();

        ch[0].add("Khamgaon");
        ch[1].add("Maharashtra");
        ch[2].add("India");


        for (int i = 0; i < 10; i++)
            p[(i * 2)].add(l[i]);

        p[1].add(tx[0]);
        p[3].add(tx[1]);
        p[5].add(tx[2]);
        p[7].add(tx[3]);
        p[9].add(ta[0]);
        p[11].add(ta[1]);
        p[13].add(ch[0]);
        p[15].add(tx[4]);
        p[17].add(ch[1]);
        p[19].add(ch[2]);


        addWindowListener(this);
        for (int i = 0; i < 3; i++)
            p[20].add(b[i]);

        for (int i = 0; i < 22; i++)
            mainp.add(p[i]);
        v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        jsp = new JScrollPane(mainp, v, h);
        contentPane.add(jsp, BorderLayout.CENTER);

        setSize(900, 700);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b[0]) {

        }
        if (e.getSource() == b[1]) {
            newL[0].setText(": " + tx[0].getText());
            p[1].remove(tx[0]);
            p[1].add(newL[0]);

            newL[1].setText(": " + tx[1].getText());
            p[3].remove(tx[1]);
            p[3].add(newL[1]);

            newL[2].setText(": " + tx[2].getText());
            p[5].remove(tx[2]);
            p[5].add(newL[2]);

            newL[3].setText(": " + tx[3].getText());
            p[7].remove(tx[3]);
            p[7].add(newL[3]);

            newL[4].setText(": " + ta[0].getText());
            p[9].remove(ta[0]);
            p[9].add(newL[4]);

            newL[5].setText(": " + ta[1].getText());
            p[11].remove(ta[1]);
            p[11].add(newL[5]);

            newL[7].setText(": " + tx[4].getText());
            p[15].remove(tx[4]);
            p[15].add(newL[7]);


            newL[6].setText(": " + ch[0].getSelectedItem());
            p[13].remove(ch[0]);
            p[13].add(newL[6]);

            newL[8].setText(": " + ch[1].getSelectedItem());
            p[17].remove(ch[1]);
            p[17].add(newL[8]);

            newL[9].setText(": " + ch[2].getSelectedItem());
            p[19].remove(ch[2]);
            p[19].add(newL[9]);


            addWindowListener(this);
            for (int i = 0; i < 3; i++)
                p[20].add(b[i]);

            for (int i = 0; i < 22; i++)
                mainp.add(p[i]);
            add(mainp);


            setSize(900, 700);
            setVisible(true);

        }
        if (e.getSource() == b[2]) {
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
        Contact c = new Contact();
    }
}
