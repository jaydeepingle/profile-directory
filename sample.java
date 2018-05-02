import java.awt.*;
import java.awt.event.*;

class sample extends Frame implements ItemListener {
    Label l;
    Button b;

    sample() {
        setLayout(new FlowLayout());
        b = new Button("Happy New Year!!!");
        l = new Label("Wish and greeting!!!");
        l.addItemListener();
        add(l);
        add(b);
        setSize(400, 400);
        setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getItem() == l)
            b.setLabel("Happy Diwali!!!");
    }

    public static void main(String args[]) {
        sample s = new sample();
    }
}
