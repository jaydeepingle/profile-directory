//import packages

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Social extends JFrame implements ActionListener {
    //Declaration
    Container contentPane;
    int v, h;
    JScrollPane jsp;
    Button b[] = new Button[3];
    Panel[] p = new Panel[40];
    Panel mainp;
    Label l[] = new Label[20];
    Label newL[] = new Label[20];
    TextField tx[] = new TextField[2];
    TextArea ta[] = new TextArea[9];
    Choice ch[] = new Choice[5];
    Checkbox c1[] = new Checkbox[7];
    Checkbox c2[] = new Checkbox[11];
    Checkbox c3[] = new Checkbox[8];

    //constructor
    public Social() {
        super("Social");
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //allocation of memory to controls
        b[0] = new Button("Edit");
        b[1] = new Button("Update");
        b[2] = new Button("Cancel");

        for (int i = 0; i < 3; i++)
            b[i].addActionListener(this);


        for (int i = 0; i < 20; i++)
            newL[i] = new Label("");

        mainp = new Panel();

        mainp.setBackground(Color.pink);
        mainp.setLayout(new GridLayout(10, 4));
        for (int i = 0; i < 40; i++) {
            p[i] = new Panel();
            p[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        }

        l[0] = new Label("Children");
        l[1] = new Label("Ethicnity");
        l[2] = new Label("Humor");
        l[3] = new Label("Fashion");
        l[4] = new Label("Smoking");
        l[5] = new Label("Drinking");
        l[6] = new Label("Pets");
        l[7] = new Label("Living");
        l[8] = new Label("Hometown");
        l[9] = new Label("Webpage");
        l[10] = new Label("About me");
        l[11] = new Label("Passions");
        l[12] = new Label("Sports");
        l[13] = new Label("Activity");
        l[14] = new Label("Books");
        l[15] = new Label("Music");
        l[16] = new Label("TV Shows");
        l[17] = new Label("Movies");
        l[18] = new Label("Cousines");

        for (int i = 0; i < 2; i++)
            tx[i] = new TextField(15);

        for (int i = 0; i < 9; i++)
            ta[i] = new TextArea(2, 20);

        for (int i = 0; i < 5; i++)
            ch[i] = new Choice();

        ch[0].add("No answer");
        ch[0].add("Yes");
        ch[0].add("No");

        ch[1].add("No answer");
        ch[1].add("African american (Black)");
        ch[1].add("Asian");
        ch[1].add("Cauracian(white)");
        ch[1].add("East Indian");
        ch[1].add("Hispanic/Latino");
        ch[1].add("Middle Eastern");
        ch[1].add("Native American");
        ch[1].add("Pacific Islander");
        ch[1].add("Multi Ethnic");
        ch[1].add("other");

        ch[2].add("No answer");
        ch[2].add("No");
        ch[2].add("Socially");
        ch[2].add("Occasionally");
        ch[2].add("Regularly");
        ch[2].add("Heavily");
        ch[2].add("Trying to Quit");
        ch[2].add("Quit");

        ch[3].add("No answer");
        ch[3].add("No");
        ch[3].add("Socially");
        ch[3].add("Occasionally");
        ch[3].add("Regularly");
        ch[3].add("Heavily");

        ch[4].add("No answer");
        ch[4].add("I love my pet(s)");
        ch[4].add("I like them at the zoos");
        ch[4].add("I like pet(s)");
        ch[4].add("I don't like this");


        c1[0] = new Checkbox("Campy/cheesy");
        c1[1] = new Checkbox("Clever/Quick witted");
        c1[2] = new Checkbox("Goofy/slapstick");
        c1[3] = new Checkbox("Roundry");
        c1[4] = new Checkbox("Dry/sarcastic");
        c1[5] = new Checkbox("Friendly");
        c1[6] = new Checkbox("Obscure");

        c2[0] = new Checkbox("alternative");
        c2[1] = new Checkbox("casual");
        c2[2] = new Checkbox("classic");
        c2[3] = new Checkbox("contemprory");
        c2[4] = new Checkbox("designer");
        c2[5] = new Checkbox("minimal");
        c2[6] = new Checkbox("natural");
        c2[7] = new Checkbox("outdoorsy");
        c2[8] = new Checkbox("smart");
        c2[9] = new Checkbox("trendy");
        c2[10] = new Checkbox("urban");

        c3[0] = new Checkbox("alone");
        c3[1] = new Checkbox("with partner");
        c3[2] = new Checkbox("with kid(s)");
        c3[3] = new Checkbox("friends with often");
        c3[4] = new Checkbox("with roommate(s)");
        c3[5] = new Checkbox("with pet(s)");
        c3[6] = new Checkbox("with parents");
        c3[7] = new Checkbox("party every night");


        //adding controls
        for (int i = 0; i < 19; i++)
            p[(i * 2)].add(l[i]);

        for (int i = 0; i < 20; i++)
            p[((i * 2) + 1)].add(newL[i]);



        for (int i = 0; i < 3; i++)
            p[38].add(b[i]);

        for (int i = 0; i < 40; i++)
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

            p[1].add(ch[0]);
            p[3].add(ch[1]);
            p[5].setLayout(new GridLayout(4, 2));
            for (int i = 0; i < 7; i++)
                p[5].add(c1[i]);

            p[7].setLayout(new GridLayout(6, 2));
            for (int i = 0; i < 11; i++)
                p[7].add(c2[i]);

            p[9].add(ch[2]);
            p[11].add(ch[3]);
            p[13].add(ch[4]);
            p[15].setLayout(new GridLayout(4, 2));
            for (int i = 0; i < 8; i++)
                p[15].add(c3[i]);

            p[17].add(tx[0]);
            p[19].add(tx[1]);
            p[21].add(ta[0]);
            p[23].add(ta[1]);
            p[25].add(ta[2]);
            p[27].add(ta[3]);
            p[29].add(ta[4]);
            p[31].add(ta[5]);
            p[33].add(ta[6]);
            p[35].add(ta[7]);
            p[37].add(ta[8]);

            for (int i = 0; i < 3; i++)
                p[38].add(b[i]);

            for (int i = 0; i < 40; i++)
                mainp.add(p[i]);


            v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
            h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
            jsp = new JScrollPane(mainp, v, h);
            contentPane.add(jsp, BorderLayout.CENTER);

            setSize(900, 700);

            setVisible(true);


        }


        if (e.getSource() == b[1]) {
            newL[8].setText(": " + tx[0].getText());
            p[17].remove(tx[0]);
            p[17].add(newL[8]);

            newL[9].setText(": " + tx[1].getText());
            p[19].remove(tx[1]);
            p[19].add(newL[9]);

            newL[10].setText(": " + ta[0].getText());
            p[21].remove(ta[0]);
            p[21].add(newL[10]);

            newL[11].setText(": " + ta[1].getText());
            p[23].remove(ta[1]);
            p[23].add(newL[11]);

            newL[12].setText(": " + ta[2].getText());
            p[25].remove(ta[2]);
            p[25].add(newL[12]);

            newL[13].setText(": " + ta[3].getText());
            p[27].remove(ta[3]);
            p[27].add(newL[13]);

            newL[14].setText(": " + ta[4].getText());
            p[29].remove(ta[4]);
            p[29].add(newL[14]);

            newL[15].setText(": " + ta[5].getText());
            p[31].remove(ta[5]);
            p[31].add(newL[15]);

            newL[16].setText(": " + ta[6].getText());
            p[33].remove(ta[6]);
            p[33].add(newL[16]);

            newL[17].setText(": " + ta[7].getText());
            p[35].remove(ta[7]);
            p[35].add(newL[17]);

            newL[18].setText(": " + ta[8].getText());
            p[37].remove(ta[8]);
            p[37].add(newL[18]);


            if (c1[0].getState() == true) {
                newL[2].setText(": " + c1[0].getLabel() + ", ");
            }
            if (c1[1].getState() == true) {
                newL[2].setText(newL[2].getText() + "" + c1[1].getLabel() + ", ");
            }
            if (c1[2].getState() == true) {
                newL[2].setText(newL[2].getText() + "" + c1[2].getLabel() + ", ");
            }
            if (c1[3].getState() == true) {
                newL[2].setText(newL[2].getText() + "" + c1[3].getLabel() + ", ");
            }
            if (c1[4].getState() == true) {
                newL[2].setText(newL[2].getText() + "" + c1[4].getLabel() + ", ");
            }
            if (c1[5].getState() == true) {
                newL[2].setText(newL[2].getText() + "" + c1[5].getLabel() + ", ");
            }
            if (c1[6].getState() == true) {
                newL[2].setText(newL[2].getText() + "" + c1[6].getLabel());
            }

            for (int i = 0; i < 7; i++)
                p[5].remove(c1[i]);
            p[5].add(newL[2]);


            if (c2[0].getState() == true) {
                newL[3].setText(": " + "" + c2[0].getLabel() + ", ");
            }
            if (c2[1].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[1].getLabel() + ", ");
            }
            if (c2[2].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[2].getLabel() + ", ");
            }
            if (c2[3].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[3].getLabel() + ", ");
            }
            if (c2[4].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[4].getLabel() + ", ");
            }
            if (c2[5].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[5].getLabel() + ", ");
            }
            if (c2[6].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[6].getLabel() + ", ");
            }
            if (c2[7].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[7].getLabel() + ", ");
            }
            if (c2[8].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[8].getLabel() + ", ");
            }
            if (c2[9].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[9].getLabel() + ", ");
            }
            if (c2[10].getState() == true) {
                newL[3].setText(newL[3].getText() + "" + c2[10].getLabel());
            }


            for (int i = 0; i < 11; i++)
                p[7].remove(c2[i]);
            p[7].add(newL[3]);


            if (c3[0].getState() == true) {
                newL[7].setText(": " + c3[0].getLabel() + ", ");
            }
            if (c3[1].getState() == true) {
                newL[7].setText(newL[7].getText() + "" + c3[1].getLabel() + ", ");
            }
            if (c3[2].getState() == true) {
                newL[7].setText(newL[7].getText() + "" + c3[2].getLabel() + ", ");
            }
            if (c3[3].getState() == true) {
                newL[7].setText(newL[7].getText() + "" + c3[3].getLabel() + ", ");
            }
            if (c3[4].getState() == true) {
                newL[7].setText(newL[7].getText() + "" + c3[4].getLabel() + ", ");
            }
            if (c3[5].getState() == true) {
                newL[7].setText(newL[7].getText() + "" + c3[5].getLabel() + ", ");
            }
            if (c3[6].getState() == true) {
                newL[7].setText(newL[7].getText() + "" + c3[6].getLabel() + ", ");
            }
            if (c3[7].getState() == true) {
                newL[7].setText(newL[7].getText() + "" + c3[7].getLabel());
            }


            for (int i = 0; i < 8; i++)
                p[15].remove(c3[i]);
            p[15].add(newL[7]);


            newL[0].setText(": " + ch[0].getSelectedItem());
            p[1].remove(ch[0]);
            p[1].add(newL[0]);

            newL[1].setText(": " + ch[1].getSelectedItem());
            p[3].remove(ch[1]);
            p[3].add(newL[1]);

            newL[4].setText(": " + ch[2].getSelectedItem());
            p[9].remove(ch[2]);
            p[9].add(newL[4]);

            newL[5].setText(": " + ch[3].getSelectedItem());
            p[11].remove(ch[3]);
            p[11].add(newL[5]);

            newL[6].setText(": " + ch[4].getSelectedItem());
            p[13].remove(ch[4]);
            p[13].add(newL[6]);


            for (int i = 0; i < 3; i++)
                p[38].add(b[i]);

            for (int i = 0; i < 40; i++)
                mainp.add(p[i]);


            v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
            h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
            jsp = new JScrollPane(mainp, v, h);
            contentPane.add(jsp, BorderLayout.CENTER);

            setSize(900, 700);

            setVisible(true);

        }
        if (e.getSource() == b[2]) {
            this.setVisible(false);
        }

    }


    public static void main(String args[]) {
        Social s = new Social();
    }
}

