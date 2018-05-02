import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;

public class Profile extends Frame implements ActionListener, WindowListener {
    ImageIcon im;
    JLabel li;

    String name = "";
    Button b[] = new Button[5];
    Label[] l = new Label[6];
    JPanel mainp;
    JPanel p[] = new JPanel[17];
    Label newL[] = new Label[8];

    public Profile(String str_tx0, String str_tx1, String str_tx2, String str_tx3, String str_ta0, String str_tx4) {
        super("Profile");

        im = new ImageIcon("img.gif");
        li = new JLabel("", im, SwingConstants.CENTER);

        mainp = new JPanel();
        mainp.setBackground(Color.cyan);


        b[0] = new Button("General");
        b[1] = new Button("Social");
        b[2] = new Button("Professional");
        b[3] = new Button("Personal");
        b[4] = new Button("Contact");

        for (int i = 0; i < 5; i++)
            b[i].addActionListener(this);

        l[0] = new Label("Name");
        l[1] = new Label("ID");
        l[2] = new Label("Contact");
        l[3] = new Label("E-mail");

        l[4] = new Label("Address");
        l[5] = new Label("DOB");


        for (int i = 0; i < 17; i++)
            p[i] = new JPanel();


        newL[0] = new Label(": " + str_tx0);
        newL[1] = new Label(": " + str_tx1);
        newL[2] = new Label(": " + str_tx2);
        newL[3] = new Label(": " + str_tx3);
        newL[4] = new Label(": " + str_ta0);
        newL[5] = new Label(": " + str_tx4);


        mainp.setLayout(new BorderLayout());

        p[0].setLayout(new GridLayout(1, 5));//top
        p[1].setLayout(new GridLayout(2, 1));//center
        p[2].setLayout(new GridLayout(1, 1));//image
        p[3].setLayout(new GridLayout(4, 2));//image-side
        p[4].setLayout(new GridLayout(2, 2));//image-below

        for (int i = 5; i < 17; i++)
            p[i].setLayout(new FlowLayout(FlowLayout.LEFT));

        for (int i = 0; i < 5; i++)
            p[0].add(b[i]);


        p[2].add(li);
        p[5].add(l[0]);
        p[6].add(newL[0]);
        p[7].add(l[1]);
        p[8].add(newL[1]);
        p[9].add(l[2]);
        p[10].add(newL[2]);
        p[11].add(l[3]);
        p[12].add(newL[3]);

        for (int i = 5; i < 13; i++)
            p[3].add(p[i]);

        p[13].add(l[4]);
        p[14].add(newL[4]);
        p[15].add(l[5]);
        p[16].add(newL[5]);

        for (int i = 13; i < 17; i++)
            p[4].add(p[i]);

        for (int i = 2; i < 5; i++)
            p[1].add(p[i]);

        mainp.add(p[0], BorderLayout.NORTH);
        mainp.add(p[1], BorderLayout.CENTER);

        addWindowListener(this);
        add(mainp);
        setSize(700, 500);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b[0]) {
            name = newL[0].getText();
            General g = new General(name);
        }

        if (e.getSource() == b[1]) {
            Social s = new Social();
        }

        if (e.getSource() == b[2]) {
            Professional p = new Professional();
        }

        if (e.getSource() == b[3]) {
            Personal p = new Personal();
        }

        if (e.getSource() == b[4]) {
            Contact c = new Contact();
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
        Profile p = new Profile("", "", "", "", "", "");
    }
}