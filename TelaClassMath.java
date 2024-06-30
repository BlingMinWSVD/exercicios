package CursoEmVideo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaClassMath extends JFrame {
    private JTextField txtNum;
    private JPanel MainPanel;
    private JTextField txtDen;
    private JButton btnCalc;
    private JLabel lblDiv;
    private JLabel lblRaiz;

    public TelaClassMath() {
        setContentPane(MainPanel);
        setSize(520, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getText());
                int d = Integer.parseInt(txtDen.getText());
                float div = (float) n / d;
                float res = (float)  Math.sqrt(n);
                lblDiv.setText(Float.toString(div));
                lblRaiz.setText(String.format("%.2f", res));
            }
        });
    }

    public static void main(String[] args) {
        new TelaClassMath();
    }
}
