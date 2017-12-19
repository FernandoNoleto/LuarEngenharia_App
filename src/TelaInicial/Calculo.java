package TelaInicial;

/**
 *
 * @author Fernando
 */
public class Calculo extends javax.swing.JFrame {

    private LuarEngenharia luar;
    private final int tam;
    private final float[] vet;
    float media;
    float somatorio = 0.0F;
    float dp;
    float aux = 0.0F;

    public Calculo(int tam, float[] vet) {
        this.setLocationRelativeTo(null);
        initComponents();
        this.tam = tam;
        this.vet = vet;
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/luar/Luar.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Media = new javax.swing.JPanel();
        Label_Media = new javax.swing.JLabel();
        Panel_Somatorio = new javax.swing.JPanel();
        Label_Somatorio = new javax.swing.JLabel();
        Panel_Desvio_Padrao = new javax.swing.JPanel();
        Label_Desvio = new javax.swing.JLabel();
        Panel_Coeficiente_de_Variacao = new javax.swing.JPanel();
        Label_Variacao = new javax.swing.JLabel();
        Panel_FCK = new javax.swing.JPanel();
        Label_FCK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultados");
        setResizable(false);

        Panel_Media.setBorder(javax.swing.BorderFactory.createTitledBorder("Média"));

        Label_Media.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Label_MediaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout Panel_MediaLayout = new javax.swing.GroupLayout(Panel_Media);
        Panel_Media.setLayout(Panel_MediaLayout);
        Panel_MediaLayout.setHorizontalGroup(
            Panel_MediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Media, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Panel_MediaLayout.setVerticalGroup(
            Panel_MediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MediaLayout.createSequentialGroup()
                .addComponent(Label_Media, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        Panel_Somatorio.setBorder(javax.swing.BorderFactory.createTitledBorder("Somatório"));

        Label_Somatorio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Label_SomatorioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout Panel_SomatorioLayout = new javax.swing.GroupLayout(Panel_Somatorio);
        Panel_Somatorio.setLayout(Panel_SomatorioLayout);
        Panel_SomatorioLayout.setHorizontalGroup(
            Panel_SomatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SomatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Somatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        Panel_SomatorioLayout.setVerticalGroup(
            Panel_SomatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Somatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Panel_Desvio_Padrao.setBorder(javax.swing.BorderFactory.createTitledBorder("Desvio Padrão"));

        Label_Desvio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Label_DesvioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout Panel_Desvio_PadraoLayout = new javax.swing.GroupLayout(Panel_Desvio_Padrao);
        Panel_Desvio_Padrao.setLayout(Panel_Desvio_PadraoLayout);
        Panel_Desvio_PadraoLayout.setHorizontalGroup(
            Panel_Desvio_PadraoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Desvio_PadraoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Desvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_Desvio_PadraoLayout.setVerticalGroup(
            Panel_Desvio_PadraoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Desvio_PadraoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Desvio, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_Coeficiente_de_Variacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Coeficiente de Variação"));

        Label_Variacao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Label_VariacaoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout Panel_Coeficiente_de_VariacaoLayout = new javax.swing.GroupLayout(Panel_Coeficiente_de_Variacao);
        Panel_Coeficiente_de_Variacao.setLayout(Panel_Coeficiente_de_VariacaoLayout);
        Panel_Coeficiente_de_VariacaoLayout.setHorizontalGroup(
            Panel_Coeficiente_de_VariacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Coeficiente_de_VariacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Variacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_Coeficiente_de_VariacaoLayout.setVerticalGroup(
            Panel_Coeficiente_de_VariacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Coeficiente_de_VariacaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Label_Variacao, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_FCK.setBorder(javax.swing.BorderFactory.createTitledBorder("FCK"));

        Label_FCK.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Label_FCKAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout Panel_FCKLayout = new javax.swing.GroupLayout(Panel_FCK);
        Panel_FCK.setLayout(Panel_FCKLayout);
        Panel_FCKLayout.setHorizontalGroup(
            Panel_FCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FCKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_FCK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_FCKLayout.setVerticalGroup(
            Panel_FCKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FCKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_FCK, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel_Media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Somatorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Desvio_Padrao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Coeficiente_de_Variacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_FCK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Somatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Desvio_Padrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Coeficiente_de_Variacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_FCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label_MediaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Label_MediaAncestorAdded

        for (int i = 0; i < tam; i++) {
            aux += vet[i];
        }
        media = (aux / tam);

        Label_Media.setText(String.valueOf(media));

        System.out.println("teste media");

    }//GEN-LAST:event_Label_MediaAncestorAdded

    private void Label_SomatorioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Label_SomatorioAncestorAdded

        for (int i = 0; i < tam; i++) {
            somatorio += (media - vet[i]) * (media - vet[i]);
        }

        Label_Somatorio.setText(String.valueOf(somatorio));
        System.out.println("teste som");

    }//GEN-LAST:event_Label_SomatorioAncestorAdded

    private void Label_DesvioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Label_DesvioAncestorAdded

        float x = somatorio / (tam - 1);

        dp = ((float) Math.sqrt(x));

        Label_Desvio.setText(String.valueOf(dp));

        System.out.println("teste dp");

    }//GEN-LAST:event_Label_DesvioAncestorAdded

    private void Label_VariacaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Label_VariacaoAncestorAdded
        
        float cv = dp / media * 100.0F;
    
        Label_Variacao.setText(String.valueOf(cv));
        System.out.println("teste coeficiente");
        
    }//GEN-LAST:event_Label_VariacaoAncestorAdded

    private void Label_FCKAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Label_FCKAncestorAdded
        
        float fck = (float) (media - (1.65 * dp));
        
        Label_FCK.setText(String.valueOf(fck));
        
    }//GEN-LAST:event_Label_FCKAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Desvio;
    private javax.swing.JLabel Label_FCK;
    private javax.swing.JLabel Label_Media;
    private javax.swing.JLabel Label_Somatorio;
    private javax.swing.JLabel Label_Variacao;
    private javax.swing.JPanel Panel_Coeficiente_de_Variacao;
    private javax.swing.JPanel Panel_Desvio_Padrao;
    private javax.swing.JPanel Panel_FCK;
    private javax.swing.JPanel Panel_Media;
    private javax.swing.JPanel Panel_Somatorio;
    // End of variables declaration//GEN-END:variables
}
