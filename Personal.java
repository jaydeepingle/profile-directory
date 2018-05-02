//import packages

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Personal extends JFrame implements ActionListener, WindowListener {
    //Declaration
    Container contentPane;
    int v, h;
    JScrollPane jsp;
    Button b[] = new Button[3];
    Label centi;
    Label l[] = new Label[15];
    Label newL[] = new Label[15];
    Choice ch[] = new Choice[5];
    TextField tx[] = new TextField[4];
    Checkbox c1[] = new Checkbox[6];
    Checkbox c2[] = new Checkbox[16];
    TextArea ta[] = new TextArea[4];
    Panel mainp;
    Panel p[] = new Panel[32];

    //constructor
    public Personal() {
        super("Personal");
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //Labels
        for (int i = 0; i < 15; i++)
            newL[i] = new Label("");

        //Buttons
        b[0] = new Button("Edit");
        b[1] = new Button("Update");
        b[2] = new Button("Cancel");
        for (int i = 0; i < 3; i++)
            b[i].addActionListener(this);

        //main panel
        mainp = new Panel();
        mainp.setLayout(new GridLayout(8, 4));
        mainp.setBackground(Color.pink);
        //panels
        for (int i = 0; i < 32; i++) {
            p[i] = new Panel();
            p[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        }
        //choice
        for (int i = 0; i < 5; i++)
            ch[i] = new Choice();

        for (int i = 0; i < 4; i++)
            tx[i] = new TextField(20);

        //for centimeters
        tx[2] = new TextField(4);

        l[0] = new Label("Headline");
        l[1] = new Label("First thing you will notice about me");
        l[2] = new Label("Height");
        l[3] = new Label("Eye Color");
        l[4] = new Label("Hair Color");
        l[5] = new Label("Build");
        l[6] = new Label("Body Art");
        l[7] = new Label("Looks");
        l[8] = new Label("Best Feature");
        l[9] = new Label("Turn ons");
        l[10] = new Label("Turn offs");
        l[11] = new Label("My idea of a first perfect date");
        l[12] = new Label("From my past relationships i learned ");
        l[13] = new Label("Five things i can't live without");
        l[14] = new Label("In my bedroom you will find");

        c1[0] = new Checkbox("Strategically placed tattoo");
        c1[1] = new Checkbox("Pierced ears");
        c1[2] = new Checkbox("Other piercing");
        c1[3] = new Checkbox("Visible tattoo");
        c1[4] = new Checkbox("Pierced tongue");
        c1[5] = new Checkbox("Navel ring");

        c2[0] = new Checkbox("Assertiveness");
        c2[1] = new Checkbox("Candle light");
        c2[2] = new Checkbox("Erotica");
        c2[3] = new Checkbox("Intelligence");
        c2[4] = new Checkbox("Public displays of affection");
        c2[5] = new Checkbox("Sarcasm");
        c2[6] = new Checkbox("Tattoos");
        c2[7] = new Checkbox("Thunderstorms");
        c2[8] = new Checkbox("Body piercing(s)");
        c2[9] = new Checkbox("Dancing");
        c2[10] = new Checkbox("Flirting");
        c2[11] = new Checkbox("Long hair");
        c2[12] = new Checkbox("Power");
        c2[13] = new Checkbox("Skinny dipping");
        c2[14] = new Checkbox("Thrills");
        c2[15] = new Checkbox("Wealth");

        for (int i = 0; i < 4; i++)
            ta[i] = new TextArea(2, 20);


        ch[0].add("No answer");
        ch[0].add("Black");
        ch[0].add("Blue");
        ch[0].add("Brown");
        ch[0].add("Gray");
        ch[0].add("Green");
        ch[0].add("Hazel");

        ch[1].add("No answer");
        ch[1].add("Auburn");
        ch[1].add("Black");
        ch[1].add("Blonde");
        ch[1].add("Light Brown");
        ch[1].add("Dark Brown");
        ch[1].add("Red");
        ch[1].add("Gray");
        ch[1].add("Salt & Pepper");
        ch[1].add("Bald");
        ch[1].add("Changes Often");
        ch[1].add("Other");

        ch[2].add("No answer");
        ch[2].add("Slim");
        ch[2].add("Athletic");
        ch[2].add("About Average");
        ch[2].add("A few extra pounds");
        ch[2].add("Large");

        ch[3].add("No answer");
        ch[3].add("Beauty Contest winner");
        ch[3].add("Very Attractive");
        ch[3].add("Attractive");
        ch[3].add("Average");
        ch[3].add("Mirror Cracking material");

        ch[4].add("No answer");
        ch[4].add("Eyes");
        ch[4].add("Hair");
        ch[4].add("Lips");
        ch[4].add("Neck");
        ch[4].add("Arms");
        ch[4].add("Hands");
        ch[4].add("Chest");
        ch[4].add("Belly button");
        ch[4].add("Butt");
        ch[4].add("Legs");
        ch[4].add("Calves");
        ch[4].add("Feet");
        ch[4].add("Not on List");

        for (int i = 0; i < 15; i++)
            p[(i * 2)].add(l[i]);


        p[1].add(tx[0]);
        p[3].add(tx[1]);

        centi = new Label("Centimeters");

        p[5].add(tx[2]);
        p[5].add(centi);
        p[7].add(ch[0]);
        p[9].add(ch[1]);
        p[11].add(ch[2]);

        for (int i = 0; i < 6; i++)
            p[13].add(c1[i]);

        p[15].add(ch[3]);
        p[17].add(ch[4]);

        for (int i = 0; i < 16; i++)
            p[19].add(c2[i]);

        p[21].add(tx[3]);
        p[23].add(ta[0]);
        p[25].add(ta[1]);
        p[27].add(ta[2]);
        p[29].add(ta[3]);


        for (int i = 0; i < 3; i++)
            p[30].add(b[i]);

        for (int i = 0; i < 32; i++)
            mainp.add(p[i]);

        addWindowListener(this);
        v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        jsp = new JScrollPane(mainp, v, h);
        contentPane.add(jsp, BorderLayout.CENTER);

        setSize(900, 700);
//     setResizable(false);
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
            p[5].remove(centi);
            p[5].add(newL[2]);
            p[5].add(centi);

            newL[10].setText(": " + tx[3].getText());
            p[21].remove(tx[3]);
            p[21].add(newL[10]);

            newL[11].setText(": " + ta[0].getText());
            p[23].remove(ta[0]);
            p[23].add(newL[11]);

            newL[12].setText(": " + ta[1].getText());
            p[25].remove(ta[1]);
            p[25].add(newL[12]);

            newL[13].setText(": " + ta[2].getText());
            p[27].remove(ta[2]);
            p[27].add(newL[13]);

            newL[14].setText(": " + ta[3].getText());
            p[29].remove(ta[3]);
            p[29].add(newL[14]);


            if (c1[0].getState() == true) {
                newL[6].setText(": " + c1[0].getLabel() + ", ");
            }
            if (c1[1].getState() == true) {
                newL[6].setText(newL[6].getText() + "" + c1[1].getLabel() + ", ");
            }
            if (c1[2].getState() == true) {
                newL[6].setText(newL[6].getText() + "" + c1[2].getLabel() + ", ");
            }
            if (c1[3].getState() == true) {
                newL[6].setText(newL[6].getText() + "" + c1[3].getLabel() + ", ");
            }
            if (c1[4].getState() == true) {
                newL[6].setText(newL[6].getText() + "" + c1[4].getLabel() + ", ");
            }
            if (c1[5].getState() == true) {
                newL[6].setText(newL[6].getText() + "" + c1[5].getLabel());
            }

            for (int i = 0; i < 6; i++)
                p[13].remove(c1[i]);
            p[13].add(newL[6]);


            if (c2[0].getState() == true) {
                newL[9].setText(": " + c2[0].getLabel() + ", ");
            }
            if (c2[1].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[1].getLabel() + ", ");
            }
            if (c2[2].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[2].getLabel() + ", ");
            }
            if (c2[3].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[3].getLabel() + ", ");
            }
            if (c2[4].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[4].getLabel() + ", ");
            }
            if (c2[5].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[5].getLabel() + ", ");
            }
            if (c2[6].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[6].getLabel() + ", ");
            }
            if (c2[7].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[7].getLabel() + ", ");
            }
            if (c2[8].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[8].getLabel() + ", ");
            }
            if (c2[9].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[9].getLabel() + ", ");
            }
            if (c2[10].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[10].getLabel() + ", ");
            }
            if (c2[11].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[11].getLabel() + ", ");
            }
            if (c2[12].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[12].getLabel() + ", ");
            }
            if (c2[13].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[13].getLabel() + ", ");
            }
            if (c2[14].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[14].getLabel() + ", ");
            }
            if (c2[15].getState() == true) {
                newL[9].setText(newL[9].getText() + "" + c2[15].getLabel());
            }


            for (int i = 0; i < 16; i++)
                p[19].remove(c2[i]);
            p[19].add(newL[9]);


            newL[3].setText(": " + ch[0].getSelectedItem());
            p[7].remove(ch[0]);
            p[7].add(newL[3]);

            newL[5].setText(": " + ch[1].getSelectedItem());
            p[9].remove(ch[1]);
            p[9].add(newL[5]);

            newL[7].setText(": " + ch[2].getSelectedItem());
            p[11].remove(ch[2]);
            p[11].add(newL[7]);

            newL[11].setText(": " + ch[3].getSelectedItem());
            p[15].remove(ch[3]);
            p[15].add(newL[11]);

            newL[13].setText(": " + ch[4].getSelectedItem());
            p[17].remove(ch[4]);
            p[17].add(newL[13]);


            addWindowListener(this);
            for (int i = 0; i < 3; i++)
                p[30].add(b[i]);

            for (int i = 0; i < 32; i++)
                mainp.add(p[i]);

            add(mainp);
            setSize(900, 700);
//      setResizable(false);
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

    //main
    public static void main(String args[]) {
        Personal p = new Personal();
    }
}
