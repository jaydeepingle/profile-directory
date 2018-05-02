//c64xj-3499p-2rjtm-jbj9k-qrpvg
//import packages

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class General extends JFrame implements ActionListener {


    //Declaration
    Container contentPane;
    int v, h;
    JScrollPane jsp;
    Button b[] = new Button[3];
    Panel[] p = new Panel[32];
    JPanel mainp;
    Label newL[] = new Label[15];
    Label l[] = new Label[15];
    Checkbox c1[] = new Checkbox[2];
    Checkbox c2[] = new Checkbox[4];
    CheckboxGroup cbg;
    Choice ch[] = new Choice[8];
    TextField tx[] = new TextField[7];

    //constructor
    public General(String name) {
        super("General");
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        //allocating Buttons
        b[0] = new Button("Edit");
        b[1] = new Button("Update");
        b[2] = new Button("Cancel");

        for (int i = 0; i < 3; i++)
            b[i].addActionListener(this);

        //Label
        for (int i = 0; i < 15; i++)
            newL[i] = new Label("");

        //main panel
        mainp = new JPanel();
        mainp.setBackground(Color.pink);
        mainp.setLayout(new GridLayout(8, 4));


        //Naming Labels
        l[0] = new Label("First name");
        l[1] = new Label("Last name");
        l[2] = new Label("Gender");
        l[3] = new Label("Relationship Status");
        l[4] = new Label("Dat Of Birth");
        l[5] = new Label("City");
        l[6] = new Label("State");
        l[7] = new Label("Country");
        l[8] = new Label("Postal code");
        l[9] = new Label("High School");
        l[10] = new Label("College");
        l[11] = new Label("University");
        l[12] = new Label("Organization");
        l[13] = new Label("Language");
        l[14] = new Label("Interested In");

        //checkboxgroup
        cbg = new CheckboxGroup();

        //checkbox
        c1[0] = new Checkbox("Male", true, cbg);
        c1[1] = new Checkbox("Female", false, cbg);

        //2nd checkbox
        c2[0] = new Checkbox("Friend");
        c2[1] = new Checkbox("Activity Parteners");
        c2[2] = new Checkbox("Business");
        c2[3] = new Checkbox("Dating");

        //textfields
        for (int i = 0; i < 7; i++)
            tx[i] = new TextField(15);

        tx[0].setText(name);
        //Panels
        for (int i = 0; i < 32; i++) {
            p[i] = new Panel();
            p[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        }

        //Choice
        for (int i = 0; i < 8; i++)
            ch[i] = new Choice();

        //adding elements to choice
        ch[0].add("No answer");
        ch[0].add("single");
        ch[0].add("Married");
        ch[0].add("Commited");
        ch[0].add("Open Marriage");
        ch[0].add("Open Relationship");


        //2nd choice
        ch[1].add("January");
        ch[1].add("February");
        ch[1].add("March");
        ch[1].add("April");
        ch[1].add("May");
        ch[1].add("June");
        ch[1].add("July");
        ch[1].add("August");
        ch[1].add("Septeber");
        ch[1].add("October");
        ch[1].add("November");
        ch[1].add("December");


        //choice using valueOf() and for loop
        String str[] = new String[10000];
        for (int i = 1; i < 32; i++) {
            str[i] = String.valueOf(i);
            ch[2].add(str[i]);
        }

        for (int i = 1900; i < 2020; i++) {
            str[i] = String.valueOf(i);
            ch[3].add(str[i]);
        }


        //choice
        ch[4].add("Khamgaon");
        ch[4].add("Buldana");
        ch[4].add("Akola");
        ch[4].add("Nandura");
        ch[4].add("Malkapur");
        ch[4].add("Nagpur");

        ch[5].add("Maharashtra");
        ch[5].add("U. P.");
        ch[5].add("M. P.");
        ch[5].add("Jammu & Kashmir");
        ch[5].add("Aasaam");
        ch[5].add("Sikkim");

        ch[6].add("India");
        ch[6].add("England");
        ch[6].add("Canada");
        ch[6].add("South Africa");
        ch[6].add("Australia");
        ch[6].add("Austria");
        ch[6].add("Keniya");


        ch[7].add("English");
        ch[7].add("French");
        ch[7].add("Marathi");
        ch[7].add("Kannad");
        ch[7].add("Telgu");
        ch[7].add("English U.S");

        //adding labels
        for (int i = 0; i < 15; i++)
            p[(i * 2)].add(l[i]);

        for (int i = 0; i < 15; i++)
            p[((i * 2) + 1)].add(newL[i]);

        for (int i = 0; i < 3; i++)
            p[30].add(b[i]);

        for (int i = 0; i < 32; i++)
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
            for (int i = 0; i < 15; i++)
                p[((i * 2) + 1)].remove(newL[i]);

            p[1].add(tx[0]);
            p[3].add(tx[1]);
            p[5].add(c1[0]);
            p[5].add(c1[1]);
            p[7].add(ch[0]);
            p[9].add(ch[1]);
            p[9].add(ch[2]);
            p[9].add(ch[3]);
            p[11].add(ch[4]);
            p[13].add(ch[5]);
            p[15].add(ch[6]);
            p[17].add(tx[2]);
            p[19].add(tx[3]);
            p[21].add(tx[4]);
            p[23].add(tx[5]);
            p[25].add(tx[6]);
            p[27].add(ch[7]);
            for (int i = 0; i < 4; i++)
                p[29].add(c2[i]);


            for (int i = 0; i < 32; i++)
                mainp.add(p[i]);

            v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
            h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
            jsp = new JScrollPane(mainp);
            contentPane.add(jsp, BorderLayout.CENTER);
            setSize(700, 500);
            setVisible(true);
        }

        if (e.getSource() == b[1]) {
            contentPane = getContentPane();
            contentPane.setLayout(new BorderLayout());
            newL[0].setText(": " + tx[0].getText());
            p[1].remove(tx[0]);
            p[1].add(newL[0]);

            newL[1].setText(": " + tx[1].getText());
            p[3].remove(tx[1]);
            p[3].add(newL[1]);

            newL[8].setText(": " + tx[2].getText());
            p[17].remove(tx[2]);
            p[17].add(newL[8]);

            newL[9].setText(": " + tx[3].getText());
            p[19].remove(tx[3]);
            p[19].add(newL[9]);

            newL[10].setText(": " + tx[4].getText());
            p[21].remove(tx[4]);
            p[21].add(newL[10]);

            newL[11].setText(": " + tx[5].getText());
            p[23].remove(tx[5]);
            p[23].add(newL[11]);

            newL[12].setText(": " + tx[6].getText());
            p[25].remove(tx[6]);
            p[25].add(newL[12]);

            newL[2].setText(": ");
            for (int i = 0; i < 2; i++) {
                if (c1[i].getState() == true) {
                    newL[2].setText(newL[2].getText() + "" + c1[i].getLabel() + " ");
                }
            }
            p[5].remove(c1[0]);
            p[5].remove(c1[1]);
            p[5].add(newL[2]);


            if (c2[0].getState() == true) {
                newL[14].setText(c2[0].getLabel() + ", ");
            }
            if (c2[1].getState() == true) {
                newL[14].setText(newL[14].getText() + "" + c2[2].getLabel() + ", ");
            }
            if (c2[2].getState() == true) {
                newL[14].setText(newL[14].getText() + "" + c2[2].getLabel() + ", ");
            }
            if (c2[3].getState() == true) {
                newL[14].setText(newL[14].getText() + "" + c2[3].getLabel());
            }

            for (int i = 0; i < 4; i++)
                p[29].remove(c2[i]);
            p[29].add(newL[14]);


            newL[3].setText(": " + ch[0].getSelectedItem());
            p[7].remove(ch[0]);
            p[7].add(newL[3]);

            newL[4].setText(": " + ch[2].getSelectedItem() + "- ");
            p[9].remove(ch[2]);
            newL[4].setText(newL[4].getText() + ch[1].getSelectedItem() + "- ");
            p[9].remove(ch[1]);
            newL[4].setText(newL[4].getText() + ch[3].getSelectedItem());
            p[9].remove(ch[3]);
            p[9].add(newL[4]);

            newL[5].setText(": " + ch[4].getSelectedItem());
            p[11].remove(ch[4]);
            p[11].add(newL[5]);

            newL[6].setText(": " + ch[5].getSelectedItem());
            p[13].remove(ch[5]);
            p[13].add(newL[6]);

            newL[7].setText(": " + ch[6].getSelectedItem());
            p[15].remove(ch[6]);
            p[15].add(newL[3]);

            newL[13].setText(": " + ch[7].getSelectedItem());
            p[27].remove(ch[7]);
            p[27].add(newL[3]);

            for (int i = 0; i < 32; i++)
                mainp.add(p[i]);

            v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
            h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
            jsp = new JScrollPane(mainp);
            contentPane.add(jsp, BorderLayout.CENTER);
            setSize(700, 500);
            setVisible(true);
        }

        if (e.getSource() == b[2]) {
            repaint();
            this.setVisible(false);
        }
    }


    //main
    public static void main(String args[]) {
        General g = new General("Jaydeep");
    }
}