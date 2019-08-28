/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dominio.Credito;
import dominio.Cuota;
import javax.swing.JOptionPane;

/**
 *
 * @author alech
 */
public class VentanaNuevoCredito extends javax.swing.JFrame {

    private Credito credito;
    private Cuota cuota;

    /**
     * Creates new form VentanaNuevoCredito
     */
    public VentanaNuevoCredito() {
        initComponents();
        credito = new Credito();
        cuota = new Cuota();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        textMonto = new javax.swing.JTextField();
        textCuotas = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        lblCuota = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adelantarCuota = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        lblgasto = new javax.swing.JLabel();
        lblgastoper = new javax.swing.JLabel();
        lblgastotot = new javax.swing.JLabel();
        lblretirar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMontoActionPerformed(evt);
            }
        });
        textMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textMontoKeyReleased(evt);
            }
        });

        textCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCuotasActionPerformed(evt);
            }
        });
        textCuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCuotasKeyReleased(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTotal.setText("Total a pagar: ");

        lblCuota.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCuota.setText("Precio de cada cuota:");

        jLabel1.setText("Ingrese el monto a solicitar (de $1.000 a $100.000):");

        jLabel2.setText("Ingrese la cantidad de cuotas:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Porcentaje de intrerés: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("%");

        adelantarCuota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adelantarCuota.setText("Adelantar cuota");
        adelantarCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelantarCuotaActionPerformed(evt);
            }
        });

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblgasto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblgasto.setText("Gastos administrativos:");

        lblgastoper.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblgastoper.setText("%");

        lblgastotot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblgastotot.setText("$");

        lblretirar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblretirar.setText("Total a retirar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCuotas, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(textMonto)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblgasto)
                                    .addComponent(jLabel3)
                                    .addComponent(adelantarCuota))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblgastotot)
                                        .addComponent(lblgastoper))
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCuota)
                            .addComponent(lblTotal)
                            .addComponent(lblretirar))))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(textCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(adelantarCuota)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCuota)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotal))
                            .addComponent(lblgasto))
                        .addGap(18, 18, 18)
                        .addComponent(lblretirar)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(85, 85, 85)
                        .addComponent(lblgastoper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblgastotot)
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        VentanaDNI ventdni = new VentanaDNI();
        ventdni.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void textMontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMontoKeyReleased
        if (1000 <= Integer.parseInt(textMonto.getText()) && Integer.parseInt(textMonto.getText()) <= 100000) {
            credito.setMontosolicitado(Integer.parseInt(textMonto.getText()));
            if (adelantarCuota.isSelected()) {
                lblTotal.setText("Total a pagar: $" + credito.getTotalAdelantado());
            } else {
                lblTotal.setText("Total a pagar: $" + credito.getTotalVencido());
                lblgastotot.setText("$" + credito.getGastosadmin());
                lblgastoper.setText("%" + (int) (credito.getPlan().getGastosadmin() * 100));
            }
        }
    }//GEN-LAST:event_textMontoKeyReleased

    private void textCuotasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCuotasKeyReleased
        credito.getPlan().setCantcuotas(Integer.parseInt(textCuotas.getText()));
        cuota.setPrecio(credito.getTotalAdelantado() / credito.getPlan().getCantcuotas());
        if (adelantarCuota.isSelected()) {
            credito.setMontoaentregar(credito.getMontosolicitado() - cuota.getPrecio());
            lblretirar.setText("Total a entregar: $" + String.format("%.2f", credito.getMontoaentregar()));
        } else {
            credito.setMontoaentregar(credito.getMontosolicitado() - credito.getGastosadmin());
            lblretirar.setText("Total a entregar: $" + String.format("%.2f", credito.getMontoaentregar()));
        }
        lblCuota.setText("El precio de cada cuota es: $" + String.format("%.2f", cuota.getPrecio()));
    }//GEN-LAST:event_textCuotasKeyReleased

    private void textMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMontoActionPerformed

    private void textCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCuotasActionPerformed

    private void adelantarCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelantarCuotaActionPerformed
        if (adelantarCuota.isSelected()) {
            lblgasto.setVisible(false);
            lblgastoper.setVisible(false);
            lblgastotot.setVisible(false);
            lblTotal.setText("Total a pagar: $" + credito.getTotalAdelantado());
        } else {
            lblgasto.setVisible(true);
            lblgastoper.setVisible(true);
            lblgastotot.setVisible(true);
            lblTotal.setText("Total a pagar: $" + credito.getTotalVencido());
        }
    }//GEN-LAST:event_adelantarCuotaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (adelantarCuota.isSelected()) {
            credito.getPlan().setEsadelantado(true);
        } else {
            credito.getPlan().setEsadelantado(false);
        }
        for (int i = 0; i < credito.getPlan().getCantcuotas(); i++) {
            credito.addCuota(cuota);
        }
        org.datacontract.schemas._2004._07.sge_service_contracts.ResultadoOperacion result = Financiera.Financiera.informarCreditoOtorgado(credito.getCliente().getDni(), credito.getCodigo(), credito.getMontosolicitado());
        if (result.isOperacionValida()) {
            VentanaComprobante ventanacomp = new VentanaComprobante(credito);
            ventanacomp.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, result.getError());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adelantarCuota;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCuota;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblgasto;
    private javax.swing.JLabel lblgastoper;
    private javax.swing.JLabel lblgastotot;
    private javax.swing.JLabel lblretirar;
    private javax.swing.JTextField textCuotas;
    private javax.swing.JTextField textMonto;
    // End of variables declaration//GEN-END:variables

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

}
