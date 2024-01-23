
package CalculadoraGit;

/**
 *
 * @author Flavio Santos Sousa 
 */
public class CalculadoraGitHub extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraGitHub
     */
    public CalculadoraGitHub() {
        initComponents();
    }
  
     Double valor1,valor2;
     String sinal;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSomar = new javax.swing.JButton();
        btnExponencial = new javax.swing.JButton();
        btnRaizQuadrada = new javax.swing.JButton();
        btnRaizCubica = new javax.swing.JButton();
        btnLogaritmoBase2 = new javax.swing.JButton();
        btnLogaritmoBase10 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        textResultado = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        textPreresultado = new javax.swing.JLabel();
        btn6 = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        btn8 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnLimparTudo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnSomar.setBackground(new java.awt.Color(204, 153, 0));
        btnSomar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSomar.setText("+");
        btnSomar.setAutoscrolls(true);
        btnSomar.setDoubleBuffered(true);
        btnSomar.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        btnExponencial.setBackground(new java.awt.Color(204, 204, 204));
        btnExponencial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExponencial.setText("Exp");
        btnExponencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExponencialActionPerformed(evt);
            }
        });

        btnRaizQuadrada.setBackground(new java.awt.Color(204, 204, 204));
        btnRaizQuadrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRaizQuadrada.setText("√");
        btnRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizQuadradaActionPerformed(evt);
            }
        });

        btnRaizCubica.setBackground(new java.awt.Color(204, 204, 204));
        btnRaizCubica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRaizCubica.setText("∛");
        btnRaizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCubicaActionPerformed(evt);
            }
        });

        btnLogaritmoBase2.setBackground(new java.awt.Color(204, 204, 204));
        btnLogaritmoBase2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogaritmoBase2.setText("Log 2");
        btnLogaritmoBase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoBase2ActionPerformed(evt);
            }
        });

        btnLogaritmoBase10.setBackground(new java.awt.Color(204, 204, 204));
        btnLogaritmoBase10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogaritmoBase10.setText("Log 10");
        btnLogaritmoBase10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoBase10ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(204, 153, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.setAutoscrolls(true);
        btn1.setDoubleBuffered(true);
        btn1.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(204, 153, 0));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.setAutoscrolls(true);
        btn2.setDoubleBuffered(true);
        btn2.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(204, 153, 0));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.setAutoscrolls(true);
        btn3.setDoubleBuffered(true);
        btn3.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(204, 153, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.setAutoscrolls(true);
        btn4.setDoubleBuffered(true);
        btn4.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        textResultado.setBackground(new java.awt.Color(255, 204, 51));
        textResultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textResultado.setForeground(new java.awt.Color(255, 255, 255));
        textResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn5.setBackground(new java.awt.Color(204, 153, 0));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.setAutoscrolls(true);
        btn5.setDoubleBuffered(true);
        btn5.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        textPreresultado.setBackground(new java.awt.Color(255, 204, 51));
        textPreresultado.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        textPreresultado.setForeground(new java.awt.Color(255, 255, 255));
        textPreresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textPreresultado.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btn6.setBackground(new java.awt.Color(204, 153, 0));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.setAutoscrolls(true);
        btn6.setDoubleBuffered(true);
        btn6.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnPorcentagem.setBackground(new java.awt.Color(204, 204, 204));
        btnPorcentagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPorcentagem.setText("%");
        btnPorcentagem.setAutoscrolls(true);
        btnPorcentagem.setDoubleBuffered(true);
        btnPorcentagem.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(204, 153, 0));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.setAutoscrolls(true);
        btn7.setDoubleBuffered(true);
        btn7.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(255, 204, 51));
        titulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CALCULADORA");

        btn8.setBackground(new java.awt.Color(204, 153, 0));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.setAutoscrolls(true);
        btn8.setDoubleBuffered(true);
        btn8.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnResultado.setBackground(new java.awt.Color(102, 204, 255));
        btnResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnResultado.setText("=");
        btnResultado.setAutoscrolls(true);
        btnResultado.setDoubleBuffered(true);
        btnResultado.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(204, 153, 0));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.setAutoscrolls(true);
        btn9.setDoubleBuffered(true);
        btn9.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnLimparTudo.setBackground(new java.awt.Color(204, 153, 0));
        btnLimparTudo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimparTudo.setText("CE");
        btnLimparTudo.setAutoscrolls(true);
        btnLimparTudo.setDoubleBuffered(true);
        btnLimparTudo.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnLimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTudoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Div");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(204, 153, 0));
        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpar.setText("C");
        btnLimpar.setAutoscrolls(true);
        btnLimpar.setDoubleBuffered(true);
        btnLimpar.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Mod");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(204, 153, 0));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton15.setText(",");
        jButton15.setAutoscrolls(true);
        jButton15.setDoubleBuffered(true);
        jButton15.setMargin(new java.awt.Insets(2, 15, 3, 14));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(153, 204, 255));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoltar.setText("←");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(204, 153, 0));
        btnDividir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setAutoscrolls(true);
        btnDividir.setDoubleBuffered(true);
        btnDividir.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(204, 153, 0));
        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMultiplicar.setText("x");
        btnMultiplicar.setAutoscrolls(true);
        btnMultiplicar.setDoubleBuffered(true);
        btnMultiplicar.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(204, 153, 0));
        btn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.setAutoscrolls(true);
        btn0.setDoubleBuffered(true);
        btn0.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPotencia.setBackground(new java.awt.Color(204, 204, 204));
        btnPotencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPotencia.setText("^");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnSubtrair.setBackground(new java.awt.Color(204, 153, 0));
        btnSubtrair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSubtrair.setText("-");
        btnSubtrair.setAutoscrolls(true);
        btnSubtrair.setDoubleBuffered(true);
        btnSubtrair.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(textPreresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnLogaritmoBase2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnLogaritmoBase10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnRaizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnExponencial, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnLimparTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(textPreresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPotencia)
                            .addComponent(btnLogaritmoBase2)
                            .addComponent(btnLogaritmoBase10))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRaizQuadrada)
                    .addComponent(btnRaizCubica)
                    .addComponent(btnExponencial)
                    .addComponent(jButton1))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnDividir))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btnMultiplicar))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnSubtrair))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15)
                    .addComponent(btn0)
                    .addComponent(btnResultado)
                    .addComponent(btnSomar))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed

        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(Double.toString(valor1)+ "+");

        textResultado.setText(""); // Limpar

        sinal = "somar" ;

    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnExponencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExponencialActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(textPreresultado.getText()+ "Exp" );

        sinal = "Exponencial" ;
    }//GEN-LAST:event_btnExponencialActionPerformed

    private void btnRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizQuadradaActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(textPreresultado.getText()+ "√" );

        sinal = "Raiz" ;
    }//GEN-LAST:event_btnRaizQuadradaActionPerformed

    private void btnRaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCubicaActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(textPreresultado.getText()+ "∛" );

        sinal = "RaizCubica";
    }//GEN-LAST:event_btnRaizCubicaActionPerformed

    private void btnLogaritmoBase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoBase2ActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(textPreresultado.getText()+ "logB2" );

        sinal = "LogaritmoBase2" ;
    }//GEN-LAST:event_btnLogaritmoBase2ActionPerformed

    private void btnLogaritmoBase10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoBase10ActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(textPreresultado.getText()+ "logB10" );

        sinal = "LogaritmoBase10" ;
    }//GEN-LAST:event_btnLogaritmoBase10ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        textResultado.setText(textResultado.getText()+ "1"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        textResultado.setText(textResultado.getText()+ "2"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        textResultado.setText(textResultado.getText()+ "3"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        textResultado.setText(textResultado.getText()+ "4"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        textResultado.setText(textResultado.getText()+ "5"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        textResultado.setText(textResultado.getText()+ "6"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(Double.toString(valor1)+ "%");
        
        textResultado.setText(""); // Limpar

        sinal = "porcentagem" ;
      
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        textResultado.setText(textResultado.getText()+ "7"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        textResultado.setText(textResultado.getText()+ "8"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        valor2 = Double.parseDouble(textResultado.getText()); // converter variavel tipo Double valor2 para String textResultado

        textPreresultado.setText(textPreresultado.getText()+ valor2 + "=");

        if (sinal== "somar"){
            textResultado.setText(String.valueOf (valor1 + valor2));}

        if (sinal== "subtrair"){
            textResultado.setText(String.valueOf (valor1 - valor2));}

        if (sinal== "multiply"){
            textResultado.setText(String.valueOf (valor1 * valor2));}

        if (sinal== "dividir"){
            textResultado.setText(String.valueOf (valor1 / valor2));}

        if (sinal== "porcentagem"){
            textResultado.setText(String.valueOf (valor1 * valor2 /100 ));}

        if (sinal== "potencializar"){
            textResultado.setText(String.valueOf (Math.pow(valor1,valor2) ));}

        if (sinal== "Quociente"){
            textResultado.setText(String.valueOf (Math.pow(valor1,valor2) ));}

        if (sinal== "Resto"){
            textResultado.setText(String.valueOf (Math.pow(valor1,valor2) ));}

        if (sinal== "Raiz"){
            textResultado.setText(String.valueOf (Math.sqrt(valor1) ));}

        if (sinal== "RaizCubica"){
            textResultado.setText(String.valueOf (Math.cbrt(valor1) ));}

        if (sinal== "LogaritmoBase2"){
            textResultado.setText(String.valueOf (Math.cbrt(valor1) ));}

        if (sinal== "LogaritmoBase10"){
            textResultado.setText(String.valueOf (Math.cbrt(valor1) ));}

        if (sinal== "Exponencial"){
            textResultado.setText(String.valueOf (Math.exp(valor1) ));}
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        textResultado.setText(textResultado.getText()+ "9"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
     
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnLimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTudoActionPerformed
        textResultado.setText(""); // Limpar tudo na caixa de texto textResultado
        textPreresultado.setText(""); // Limpar tudo na caixa de texto textResultado
    }//GEN-LAST:event_btnLimparTudoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(Double.toString(valor1)+ "Div");
        
        textResultado.setText(""); // Limpar

        sinal = "Quociente" ;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        textResultado.setText(""); // Limpar tudo na caixa de texto textResultado
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(Double.toString(valor1)+ "Mod");
        
        textResultado.setText(""); // Limpar

        sinal = "Resto" ;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        textResultado.setText(textResultado.getText()+ "."); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_jButton15ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        String apagar = textResultado.getText();          // Pegar dado da caixa textResultado e colocar na variavel apagar
        apagar=apagar.substring(0,apagar.length()-1);     // apagar = deletar ultimo digito
        textResultado.setText(apagar);                    // colocar apagar na caixa textResultado

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(Double.toString(valor1)+ "/");

               textResultado.setText(""); // Limpar

        sinal = "dividir" ;
        
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(Double.toString(valor1)+ "x");
               textResultado.setText(""); // Limpar

        sinal = "multiply" ;
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        textResultado.setText(textResultado.getText()+ "0"); // Na caixa de texto textResultado getText(pegar) e setText (colocar) dado cada vez que clicar
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(Double.toString(valor1 )+ "^");
      
        textResultado.setText(""); // Limpar

        sinal = "potencializar" ;
       
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        valor1 = Double.parseDouble(textResultado.getText()); // variavel variavel tipo Double igual tipo String textResultado - Conversão
        textPreresultado.setText(Double.toString(valor1)+ "-");
      
        textResultado.setText(""); // Limpar

        sinal = "subtrair" ;
       
    }//GEN-LAST:event_btnSubtrairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGitHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGitHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGitHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGitHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGitHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnExponencial;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparTudo;
    private javax.swing.JButton btnLogaritmoBase10;
    private javax.swing.JButton btnLogaritmoBase2;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaizCubica;
    private javax.swing.JButton btnRaizQuadrada;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textPreresultado;
    private javax.swing.JLabel textResultado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
