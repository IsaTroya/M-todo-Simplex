

/*
 
 */

package metodosimplex;

import metodosimplex.MetodoSimplexView;

/**
 *
 * @author 
 */
public class mensaje extends javax.swing.JFrame {

    /** Creates new form mensaje */
    public mensaje() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtmensaje = new javax.swing.JTextPane();
        btncerrar = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(400, 300, 400, 100));
        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        txtmensaje.setName("txtmensaje"); // NOI18N
        jScrollPane1.setViewportView(txtmensaje);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(metodosimplex.MetodoSimplexApp.class).getContext().getResourceMap(mensaje.class);
        btncerrar.setText(resourceMap.getString("btncerrar.text")); // NOI18N
        btncerrar.setName("btncerrar"); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addComponent(btncerrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.hide();
    }//GEN-LAST:event_btncerrarActionPerformed

    
    /**
    * @param args the command line arguments
    */
    public static void show(String ms) {
        
                mensaje m= new mensaje();
                m.txtmensaje.setText(ms);
                m.show();
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtmensaje;
    // End of variables declaration//GEN-END:variables

}
