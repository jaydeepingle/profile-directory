//import packages

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Professional extends JFrame implements ActionListener, WindowListener {
    //Declaration
    Container contentPane;
    int v, h;
    JScrollPane jsp;
    Button b[] = new Button[3];
    Label l[] = new Label[16];
    Label newL[] = new Label[16];
    Choice ch[] = new Choice[4];
    TextField tx[] = new TextField[9];
    TextArea ta[] = new TextArea[3];
    Panel mainp;
    Panel p[] = new Panel[34];

    //constructor
    public Professional() {
        super("Professional");
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //allocation of memory to controls
        for (int i = 0; i < 16; i++)
            newL[i] = new Label("");

        b[0] = new Button("Edit");
        b[1] = new Button("Update");
        b[2] = new Button("Cancel");

        for (int i = 0; i < 3; i++)
            b[i].addActionListener(this);

        for (int i = 0; i < 4; i++)
            ch[i] = new Choice();
        for (int i = 0; i < 9; i++)
            tx[i] = new TextField(15);
        for (int i = 0; i < 3; i++)
            ta[i] = new TextArea(2, 15);
        for (int i = 0; i < 34; i++) {
            p[i] = new Panel();
            p[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        }

        mainp = new Panel();
        mainp.setLayout(new GridLayout(9, 4));
        mainp.setBackground(Color.pink);
        l[0] = new Label("Education");
        l[1] = new Label("Highschool");
        l[2] = new Label("College/university");
        l[3] = new Label("Major");
        l[4] = new Label("Degree");
        l[5] = new Label("Year");
        l[6] = new Label("Occupation");
        l[7] = new Label("Industry");
        l[8] = new Label("Sub-industry");
        l[9] = new Label("Company/ Organization");
        l[10] = new Label("Comapany Webpage Title");
        l[11] = new Label("Job Description");
        l[12] = new Label("Work E-mail");
        l[13] = new Label("Work Phone");
        l[14] = new Label("Career Skills");
        l[15] = new Label("Career Interests");

        ch[0].add("No answer");
        ch[0].add("Elementry");
        ch[0].add("Highschool");
        ch[0].add("Some College");
        ch[0].add("Associats degree");
        ch[0].add("Bachelor's degree");
        ch[0].add("Master's degree");
        ch[0].add("Ph.D.");
        ch[0].add("Post Doctoral");

        ch[1].add("No answer");
        ch[1].add("BE");
        ch[1].add("ME");
        ch[1].add("BSc");
        ch[1].add("MSc");
        ch[1].add("BBA");
        ch[1].add("MBA");
        ch[1].add("BEd");
        ch[1].add("MEd");
        ch[1].add("BCA");
        ch[1].add("MCA");
        ch[1].add("MBBS");
        ch[1].add("BHMS");

        ch[2].add("No answer");
        ch[2].add("2000");

        ch[3].add("No answer");
        ch[3].add("Agriculture");
        ch[3].add("Arts");
        ch[3].add("Construction");
        ch[3].add("Consumer Goods");
        ch[3].add("Corporate Services");
        ch[3].add("Education");
        ch[3].add("Finance");
        ch[3].add("Government");
        ch[3].add("High Technology");
        ch[3].add("Legal");
        ch[3].add("Manufacturing");
        ch[3].add("Media");
        ch[3].add("Medical & Healthcare");
        ch[3].add("Non profit");
        ch[3].add("Recreation, Travel & Entertainment");
        ch[3].add("Scientific");
        ch[3].add("Service Industry");
        ch[3].add("Company/ Organization");


        p[0].add(l[0]);
        p[1].add(ch[0]);
        p[2].add(l[1]);
        p[3].add(tx[0]);
        p[4].add(l[2]);
        p[5].add(tx[1]);
        p[6].add(l[3]);
        p[7].add(tx[2]);
        p[8].add(l[4]);
        p[9].add(ch[1]);
        p[10].add(l[5]);
        p[11].add(ch[2]);
        p[12].add(l[6]);
        p[13].add(tx[3]);
        p[14].add(l[7]);
        p[15].add(ch[3]);
        p[16].add(l[8]);
        p[17].add(tx[4]);
        p[18].add(l[9]);
        p[19].add(tx[5]);
        p[20].add(l[10]);
        p[21].add(tx[6]);
        p[22].add(l[11]);
        p[23].add(ta[0]);
        p[24].add(l[12]);
        p[25].add(tx[7]);
        p[26].add(l[13]);
        p[27].add(tx[8]);
        p[28].add(l[14]);
        p[29].add(ta[1]);
        p[30].add(l[15]);
        p[31].add(ta[2]);


        for (int i = 0; i < 3; i++)
            p[32].add(b[i]);

        for (int i = 0; i < 34; i++)
            mainp.add(p[i]);


        addWindowListener(this);
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
            newL[1].setText(": " + tx[0].getText());
            p[3].remove(tx[0]);
            p[3].add(newL[1]);

            newL[2].setText(": " + tx[1].getText());
            p[5].remove(tx[1]);
            p[5].add(newL[2]);

            newL[3].setText(": " + tx[2].getText());
            p[7].remove(tx[2]);
            p[7].add(newL[3]);

            newL[6].setText(": " + tx[3].getText());
            p[13].remove(tx[3]);
            p[13].add(newL[6]);

            newL[8].setText(": " + tx[4].getText());
            p[17].remove(tx[4]);
            p[17].add(newL[8]);

            newL[9].setText(": " + tx[5].getText());
            p[19].remove(tx[5]);
            p[19].add(newL[9]);

            newL[10].setText(": " + tx[6].getText());
            p[21].remove(tx[6]);
            p[21].add(newL[10]);

            newL[11].setText(": " + ta[0].getText());
            p[23].remove(ta[0]);
            p[23].add(newL[11]);

            newL[12].setText(": " + tx[7].getText());
            p[25].remove(tx[7]);
            p[25].add(newL[12]);

            newL[13].setText(": " + tx[8].getText());
            p[27].remove(tx[8]);
            p[27].add(newL[13]);

            newL[14].setText(": " + ta[1].getText());
            p[29].remove(ta[1]);
            p[29].add(newL[14]);

            newL[15].setText(": " + tx[1].getText());
            p[31].remove(ta[2]);
            p[31].add(newL[15]);


            newL[0].setText(": " + ch[0].getSelectedItem());
            p[1].remove(ch[0]);
            p[1].add(newL[0]);

            newL[4].setText(": " + ch[1].getSelectedItem());
            p[9].remove(ch[1]);
            p[9].add(newL[4]);

            newL[5].setText(": " + ch[2].getSelectedItem());
            p[11].remove(ch[2]);
            p[11].add(newL[5]);

            newL[7].setText(": " + ch[3].getSelectedItem());
            p[15].remove(ch[3]);
            p[15].add(newL[7]);


            for (int i = 0; i < 3; i++)
                p[32].add(b[i]);

            for (int i = 0; i < 34; i++)
                mainp.add(p[i]);

            addWindowListener(this);
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
        Professional p = new Professional();
    }
}
