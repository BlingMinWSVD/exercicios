package CursoEmVideo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SomadorSwing extends JFrame {
    private JPanel MainPanel;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;
    private JLabel lblSoma;

    public SomadorSwing() {
        setContentPane(MainPanel);
        setTitle("Somador LALALI");
        setSize(1020, 520);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int s = n1 + n2;
                lblSoma.setText(Integer.toString(s));
            }
        });
    }

    public static void main(String[] args) {
        new SomadorSwing();
    }
}
