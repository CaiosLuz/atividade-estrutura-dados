
/*Autor:Prof. Rodrigo Diver - FACENS 1S2025*/

package jogodamemoria;

import jogodamemoria.Controle;

import javax.swing.DefaultListModel;
import javax.swing.JButton;


public class Tela extends javax.swing.JFrame {
    
    /*Instancia da classe Controle*/
    private Controle ctr;
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        /*Passa a própria Tela por parametro para Controle pode manipular*/
        ctr =new Controle(this);
    }
    
    /*Método que permite ao controle obter as instancias dos botões*/
    public JButton[] obterInstanciaBotoesAcao(){
        return new JButton[]{bto1,bto2,bto3,bto4,bto5,bto6,bto7,bto8,bto9};
    }
    public JButton obterInstaciaBotaoIniciar(){
        return btoIniciar;
    }
    // --- Métodos Públicos para o Controle Manipular a UI ---

    public void atualizarRanking(String[] dados) {
            DefaultListModel<String> model = new DefaultListModel<>();
            for (String item : dados) {
                model.addElement(item);
            }
            listRanking.setModel(model); 
    }

    public void atualizarRodada(String texto) {
        // Garante que a atualização da UI ocorra na Event Dispatch Thread (EDT)
       
        lblRodada.setText(texto);
        
    }
    public void atualizarPontuacao(String texto) {
        
        lblPontuacao.setText(texto);      
        
    }  
    
    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bto2 = new javax.swing.JButton();
        bto3 = new javax.swing.JButton();
        bto1 = new javax.swing.JButton();
        bto5 = new javax.swing.JButton();
        bto4 = new javax.swing.JButton();
        bto6 = new javax.swing.JButton();
        bto9 = new javax.swing.JButton();
        bto8 = new javax.swing.JButton();
        bto7 = new javax.swing.JButton();
        btoIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBoxNivel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listRanking = new javax.swing.JList<>();
        txtbJogador = new javax.swing.JTextField();
        lblRodada = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bto2.setPreferredSize(new java.awt.Dimension(50, 50));
        bto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bto2MousePressed(evt);
            }
        });

        bto3.setPreferredSize(new java.awt.Dimension(50, 50));
        bto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bto3MousePressed(evt);
            }
        });

        bto1.setPreferredSize(new java.awt.Dimension(50, 50));
        bto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bto1MouseClicked(evt);
            }
        });

        bto5.setPreferredSize(new java.awt.Dimension(50, 50));
        bto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bto5MousePressed(evt);
            }
        });

        bto4.setPreferredSize(new java.awt.Dimension(50, 50));
        bto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bto4MousePressed(evt);
            }
        });

        bto6.setPreferredSize(new java.awt.Dimension(50, 50));
        bto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bto6MousePressed(evt);
            }
        });

        bto9.setPreferredSize(new java.awt.Dimension(50, 50));
        bto9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bto9MousePressed(evt);
            }
        });

        bto8.setPreferredSize(new java.awt.Dimension(50, 50));
        bto8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bto8MousePressed(evt);
            }
        });

        bto7.setPreferredSize(new java.awt.Dimension(50, 50));
        bto7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bto7MousePressed(evt);
            }
        });

        btoIniciar.setBackground(new java.awt.Color(153, 255, 0));
        btoIniciar.setText("Iniciar");
        btoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoIniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("RODADA:");

        jLabel2.setText("PONTUAÇÃO:");

        jLabel3.setText("DIFICULDADE");

        jLabel4.setText("Nome do Jogo - Nome do Aluno - RA");

        comboBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Médio", "Díficil" }));
        comboBoxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNivelActionPerformed(evt);
            }
        });

        listRanking.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Jogador: Pontuação" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listRanking);

        txtbJogador.setText("Nome do Jogador");

        lblRodada.setText("........");

        lblPontuacao.setText("........");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btoIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRodada, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bto1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bto2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(bto3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bto4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bto5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bto6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bto7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bto8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bto9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(lblRodada))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(comboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lblPontuacao)
                                    .addComponent(txtbJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 3, Short.MAX_VALUE))))
                    .addComponent(btoIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bto2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bto1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bto3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bto5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bto6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bto4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bto8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bto9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bto7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto1MouseClicked
        
        ctr.acaoClick(evt);
    }//GEN-LAST:event_bto1MouseClicked

    private void bto2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto2MousePressed
        
       ctr.acaoClick(evt);
       
    }//GEN-LAST:event_bto2MousePressed

    private void btoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoIniciarActionPerformed
        
        // ***** Inicia um novo Jogo ******
        
        //****Apenas para exemplo *****
        ctr.iniciarNovoJogo("Zé", "Facil");
        ctr.iniciarRodada();
        
                   
    }//GEN-LAST:event_btoIniciarActionPerformed
    
    private void bto4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto4MousePressed
        ctr.acaoClick(evt);
    }//GEN-LAST:event_bto4MousePressed

    private void bto5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto5MousePressed
        ctr.acaoClick(evt);
    }//GEN-LAST:event_bto5MousePressed

    private void bto6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto6MousePressed
        ctr.acaoClick(evt);
    }//GEN-LAST:event_bto6MousePressed

    private void bto7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto7MousePressed
        ctr.acaoClick(evt);
    }//GEN-LAST:event_bto7MousePressed

    private void bto8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto8MousePressed
        ctr.acaoClick(evt);
    }//GEN-LAST:event_bto8MousePressed

    private void bto9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto9MousePressed
        ctr.acaoClick(evt);
    }//GEN-LAST:event_bto9MousePressed

    private void comboBoxNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNivelActionPerformed

    private void bto3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bto3MousePressed
        ctr.acaoClick(evt);
    }//GEN-LAST:event_bto3MousePressed
    
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto1;
    private javax.swing.JButton bto2;
    private javax.swing.JButton bto3;
    private javax.swing.JButton bto4;
    private javax.swing.JButton bto5;
    private javax.swing.JButton bto6;
    private javax.swing.JButton bto7;
    private javax.swing.JButton bto8;
    private javax.swing.JButton bto9;
    private javax.swing.JButton btoIniciar;
    private javax.swing.JComboBox<String> comboBoxNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblRodada;
    private javax.swing.JList<String> listRanking;
    private javax.swing.JTextField txtbJogador;
    // End of variables declaration//GEN-END:variables
}
