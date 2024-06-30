package CursoEmVideo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaIdade extends JFrame{
    private JPanel MainPanel;
    private JTextField txtAno;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JLabel lblSituacao;

    public TelaIdade() {
        setContentPane(MainPanel);
        setSize(720,380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Tela Idade Mingyu");
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano = Integer.parseInt(txtAno.getText());
                int idade = 2024 - ano;
                lblIdade.setText(Integer.toString(idade));
                String sit = ((idade>=16 && idade<18) || (idade>70)) ? "É OPCIONAL" : "NÃO É OPCIONAL";
                lblSituacao.setText(sit);
            }
        });
    }

    public static void main(String[] args) {
        new TelaIdade();
    }
}
