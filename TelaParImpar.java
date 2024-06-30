package CursoEmVideo;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaParImpar extends JFrame{
    private JPanel MainPanel;
    private JTextField txtValor;
    private JButton btnVerificar;
    private JLabel lblResultado;

    public TelaParImpar() {
        setContentPane(MainPanel);
        setSize(530, 660);
        setTitle("Telinha Par ou Impar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v = Integer.parseInt(txtValor.getText());
                if (v % 2 == 0) {
                    lblResultado.setText("PAR");
                } else {
                    lblResultado.setText("ÍMPAR");
                }
            }
        });
    }

    public static void main(String[] args) {
        new TelaParImpar();
    }
}
