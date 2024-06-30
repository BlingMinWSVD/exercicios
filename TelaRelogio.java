package CursoEmVideo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TelaRelogio extends JFrame{
    private JPanel MainPanel;
    private JButton btnClique;
    private JLabel lblClique;
    private JLabel lblData;

    public TelaRelogio() {
        setContentPane(MainPanel);
        setSize(430, 230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Telinha Coups");
        setVisible(true);
        btnClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                lblClique.setText(relogio.toString());
            }
        });
    }

    public static void main(String[] args) {
        new TelaRelogio();
    }
}
