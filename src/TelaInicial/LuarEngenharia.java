package TelaInicial;

/**
 *
 * @author Fernando
 */
public class LuarEngenharia extends javax.swing.JFrame {

    int NB;
    float[] vnbloco;

    public LuarEngenharia() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nBlocos = new javax.swing.JComboBox<>();
        Button_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Luar Engenharia");
        setResizable(false);

        jLabel1.setText("Quantos blocos rompidos?");

        nBlocos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 bloco", "2 blocos", "3 blocos", "4 blocos", "5 blocos", "6 blocos", "7 blocos", "8 blocos", "9 blocos", "10 blocos", "11 blocos", "12 blocos", "13 blocos", "14 blocos", "15 blocos", "16 blocos", "17 blocos", "18 blocos", "19 blocos", "20 blocos" }));

        Button_OK.setText("OK");
        Button_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(nBlocos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Button_OK)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(nBlocos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(Button_OK)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_OKActionPerformed

        String numBlocos = nBlocos.getSelectedItem() + "";
        if (numBlocos.equals("1 bloco")) {
            NB = 1;
        }
        if (numBlocos.equals("2 blocos")) {
            NB = 2;
        }
        if (numBlocos.equals("3 blocos")) {
            NB = 3;
        }
        if (numBlocos.equals("4 blocos")) {
            NB = 4;
        }
        if (numBlocos.equals("5 blocos")) {
            NB = 5;
        }
        if (numBlocos.equals("6 blocos")) {
            NB = 6;
        }
        if (numBlocos.equals("7 blocos")) {
            NB = 7;
        }
        if (numBlocos.equals("8 blocos")) {
            NB = 8;
        }
        if (numBlocos.equals("9 blocos")) {
            NB = 9;
        }
        if (numBlocos.equals("10 blocos")) {
            NB = 10;
        }
        if (numBlocos.equals("11 blocos")) {
            NB = 11;
        }
        if (numBlocos.equals("12 blocos")) {
            NB = 12;
        }
        if (numBlocos.equals("13 blocos")) {
            NB = 13;
        }
        if (numBlocos.equals("14 blocos")) {
            NB = 14;
        }
        if (numBlocos.equals("15 blocos")) {
            NB = 15;
        }
        if (numBlocos.equals("16 blocos")) {
            NB = 16;
        }
        if (numBlocos.equals("17 blocos")) {
            NB = 17;
        }
        if (numBlocos.equals("18 blocos")) {
            NB = 18;
        }
        if (numBlocos.equals("19 blocos")) {
            NB = 19;
        }
        if (numBlocos.equals("20 blocos")) {
            NB = 20;
        }

        vnbloco = new float[NB];
        for (int i = 0; i < NB; i++) {
            i++;
            String valor = javax.swing.JOptionPane.showInputDialog("Informe o valor do bloco: " + i);
            i--;
            valor = valor.replace(",",".");  
            vnbloco[i] = Float.parseFloat(valor);
        }

        new Calculo(NB, vnbloco).setVisible(true);
        dispose();

    }//GEN-LAST:event_Button_OKActionPerformed

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
            java.util.logging.Logger.getLogger(LuarEngenharia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LuarEngenharia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LuarEngenharia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LuarEngenharia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LuarEngenharia().setVisible(true);
            }
        });
        
        
        //java.awt.EventQueue.invokeLater(new LuarEngenharia.3());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> nBlocos;
    // End of variables declaration//GEN-END:variables
}
