package CursoEmVideo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEquacao extends JFrame {
    private JSpinner txtA;
    private JSpinner txtB;
    private JSpinner txtC;
    private JLabel lblB;
    private JLabel lblA;
    private JLabel lblC;
    private JPanel MainPanel;
    private JButton btnCalc;
    private JPanel PanelSumi;
    private JLabel lblDelta;
    private JLabel lblRaiz;

    public TelaEquacao() {
        //FUNÇÕES PARA O PAINEL APARECER, TAMANHO E TEXTO
        PanelSumi.setVisible(false);
        setContentPane(MainPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 550);
        setTitle("Tela Equação");
        txtA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //MUDANDO O TEXTO JUNTO COM O QUE FOR SELECIONADO PELO USUARIO
                lblA.setText(txtA.getValue().toString());
            }
        });
        txtB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //MUDANDO O TEXTO JUNTO COM O QUE FOR SELECIONADO PELO USUARIO
                lblB.setText(txtB.getValue().toString());
            }
        });
        txtC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //MUDANDO O TEXTO JUNTO COM O QUE FOR SELECIONADO PELO USUARIO
                lblC.setText(txtC.getValue().toString());
            }
        });
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TRANSFORMANDO O TEXTO EM NUM INTEIRO
                int a = Integer.parseInt(txtA.getValue().toString());
                int b = Integer.parseInt(txtB.getValue().toString());
                int c = Integer.parseInt(txtC.getValue().toString());

                //CALCULANDO DELTA
                double d = Math.pow(b, 2) - 4 * a * c;
                lblDelta.setText(String.format("%.1f", d));

                //TIPOS DE RAIZES
                if (d < 0){
                    lblRaiz.setText("Não existem raízes Reais");
                } else {
                    lblRaiz.setText("Existem raízes Reais");
                }

                //MOSTRANDO O PAINEL DE RESULTADO
                PanelSumi.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new TelaEquacao();
    }
}
