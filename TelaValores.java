package CursoEmVideo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaValores extends JFrame{
    private JTextField txtNum;
    private JTextField txtDen;
    private JButton btnDividir;
    private JPanel MainPanel;
    private JLabel lblDiv;
    private JLabel lblRes;

    public TelaValores() {
        setContentPane(MainPanel);
        setSize(520, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getText());
                int d = Integer.parseInt(txtDen.getText());
                float div = (float) n / d;
                float res = n % d;
                lblDiv.setText(Float.toString(div));
                lblRes.setText(Float.toString(res));
            }
        });
    }

    public static void main(String[] args) {
        new TelaValores();
    }
}
