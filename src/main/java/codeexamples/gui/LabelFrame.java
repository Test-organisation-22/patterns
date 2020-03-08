package codeexamples.gui;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {

    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame() {
        super("Testing JLabel");
        setLayout(new FlowLayout());

        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label 1");
        label1.setHorizontalTextPosition(SwingConstants.LEFT);
        label1.setText("This is Label 1");
        add(label1);

        label2 = new JLabel("Label 2");
        label2.setToolTipText("This is Label 2");
        label2.setText("Label 2");
        label2.setHorizontalTextPosition(SwingConstants.CENTER);
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is a label");
        add(label3);
    }

}
