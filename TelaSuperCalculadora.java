package CursoEmVideo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSuperCalculadora extends JFrame{
    private JPanel MainPanel;
    private JSpinner spnNum;
    private JButton btnCalc;
    private JLabel lblDiv;
    private JLabel lblCubo;
    private JLabel lblQuadrada;
    private JLabel lblCubica;
    private JLabel lblAbsoluto;
    private JPanel PanelInvi;

    //PRINCIPAIS ENTRADAS PARA O PAINEL
    public TelaSuperCalculadora() {
        PanelInvi.setVisible(false);
        setContentPane(MainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1050, 750);
        setTitle("SUPER CALCULADORA SVT");

        //COMANDO PARA O BOTÃO
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelInvi.setVisible(true);
                int num = Integer.parseInt(spnNum.getValue().toString());
                float div = num % 2;
                float cubo = (float) Math.pow(num, 3);
                int qua = (int) Math.sqrt(num);
                float cubi = (float) Math.cbrt(num);
                lblDiv.setText(Float.toString(div));
                lblCubo.setText(String.format("%.2f", cubo));
                lblQuadrada.setText(Integer.toString(qua));
                lblCubica.setText(String.format("%.2f", cubi));
                lblAbsoluto.setText(Integer.toString(num));

            }
        });
    }

    //COMANDO PARA O SPINNER IMPORTANTE!
    private void createUIComponents() {
        // TODO: place custom component creation code here
        SpinnerNumberModel spin = new SpinnerNumberModel(1, 1, 100, 1);
        spnNum = new JSpinner(spin);
    }

    //COMANDO PARA RODAR O PROJETO
    public static void main(String[] args) {
        new TelaSuperCalculadora();
    }
}
