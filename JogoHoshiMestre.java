package CursoEmVideo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoHoshiMestre extends JFrame {
    private JPanel MainPanel;
    private JSpinner spnValor;
    private JButton btnPalp;
    private JLabel lblFrase;

    public JogoHoshiMestre() {
        //COMANDO PRINCIPAL PARA FUNCIONAR O PAINEL PRINCIPAL
        lblFrase.setText("<html>Vou pensar em um valor entre <strong>1 e 5.</strong> Tente adivinhar qual o número</html>");
        setContentPane(MainPanel);
        setVisible(true);
        setTitle("HOSHI O GÊNIO");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(720, 440);

        //COMANDO DO BOTÃO
        btnPalp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*double ale = 1 + Math.random() * (6 - 1);
                 * OUTRA FORMA QUE PODE SER FEITA O SORTEIO ALEATÓRIO DE NÚMERO. */

                //SORTEAR UM NÚMERO
                int ale = (int) (Math.random() * 6);
                int valor = (int) ale;

                //PEGA O NÚMERO QUE FOI DIGITADO
                int num = Integer.parseInt(spnValor.getValue().toString());

                //CONFIGURAR AS FRASES
                String f1 = "ACERTOU!";
                String f2 = "ERROU! Eu pensei no valor " + valor;

                //ATRIBUIR A VARIÁVEL RES
                String res = (valor == num) ? f1 : f2;

                //MOSTRAR O RES NO BALÃO
                lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 20));
                lblFrase.setText(res);
            }
        });
    }

    //SPINNER COMANDO
    private void createUIComponents() {
        // TODO: place custom component creation code here
        SpinnerNumberModel sm = new SpinnerNumberModel(1, 1, 5, 1);
        spnValor = new JSpinner(sm);
    }

    public static void main(String[] args) {
        new JogoHoshiMestre();
    }
}
