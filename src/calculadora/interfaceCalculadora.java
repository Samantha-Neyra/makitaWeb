/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

/**
 *
 * @author m-gla
 */
public class interfaceCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form interfaceCalculadora
     */
    public interfaceCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unobutton = new javax.swing.JButton();
        dosbutton = new javax.swing.JButton();
        tresbutton = new javax.swing.JButton();
        cuatrobutton = new javax.swing.JButton();
        cincobutton = new javax.swing.JButton();
        seisbutton = new javax.swing.JButton();
        sietebutton = new javax.swing.JButton();
        ochobutton = new javax.swing.JButton();
        nuevebutton = new javax.swing.JButton();
        cerobutton = new javax.swing.JButton();
        puntobtton = new javax.swing.JButton();
        igualbtton = new javax.swing.JButton();
        porbutton = new javax.swing.JButton();
        divisionbtton = new javax.swing.JButton();
        sumabtton = new javax.swing.JButton();
        menosbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        expresiontxt = new javax.swing.JTextPane();
        pizquierdobtton = new javax.swing.JButton();
        pderechobtton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        potenciabtton = new javax.swing.JButton();
        borrarbtton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        unobutton.setText("1");
        unobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unobuttonActionPerformed(evt);
            }
        });

        dosbutton.setText("2");
        dosbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosbuttonActionPerformed(evt);
            }
        });

        tresbutton.setText("3");
        tresbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresbuttonActionPerformed(evt);
            }
        });

        cuatrobutton.setText("4");
        cuatrobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatrobuttonActionPerformed(evt);
            }
        });

        cincobutton.setText("5");
        cincobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincobuttonActionPerformed(evt);
            }
        });

        seisbutton.setText("6");
        seisbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisbuttonActionPerformed(evt);
            }
        });

        sietebutton.setText("7");
        sietebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sietebuttonActionPerformed(evt);
            }
        });

        ochobutton.setText("8");
        ochobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochobuttonActionPerformed(evt);
            }
        });

        nuevebutton.setText("9");
        nuevebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevebuttonActionPerformed(evt);
            }
        });

        cerobutton.setText("0");
        cerobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerobuttonActionPerformed(evt);
            }
        });

        puntobtton.setText(".");
        puntobtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntobttonActionPerformed(evt);
            }
        });

        igualbtton.setBackground(new java.awt.Color(102, 102, 255));
        igualbtton.setText("=");
        igualbtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualbttonActionPerformed(evt);
            }
        });

        porbutton.setBackground(new java.awt.Color(153, 153, 255));
        porbutton.setText("x");
        porbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porbuttonActionPerformed(evt);
            }
        });

        divisionbtton.setBackground(new java.awt.Color(153, 153, 255));
        divisionbtton.setText("÷");
        divisionbtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionbttonActionPerformed(evt);
            }
        });

        sumabtton.setBackground(new java.awt.Color(153, 153, 255));
        sumabtton.setText("+");
        sumabtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumabttonActionPerformed(evt);
            }
        });

        menosbutton.setBackground(new java.awt.Color(153, 153, 255));
        menosbutton.setText("-");
        menosbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosbuttonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(expresiontxt);

        pizquierdobtton.setBackground(new java.awt.Color(204, 204, 255));
        pizquierdobtton.setText("(");
        pizquierdobtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizquierdobttonActionPerformed(evt);
            }
        });

        pderechobtton.setBackground(new java.awt.Color(204, 204, 255));
        pderechobtton.setText(")");
        pderechobtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pderechobttonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane2);

        jLabel1.setText("Resultados:");

        potenciabtton.setBackground(new java.awt.Color(153, 153, 255));
        potenciabtton.setText("^");
        potenciabtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciabttonActionPerformed(evt);
            }
        });

        borrarbtton.setText("Borrar");
        borrarbtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarbttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrarbtton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(unobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dosbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tresbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cuatrobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cincobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seisbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cerobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sietebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ochobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nuevebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(puntobtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(igualbtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(porbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisionbtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menosbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potenciabtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sumabtton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pizquierdobtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pderechobtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarbtton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dosbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tresbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisionbtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumabtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seisbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuatrobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cincobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(porbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pizquierdobtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pderechobtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ochobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sietebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menosbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cerobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puntobtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igualbtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potenciabtton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosbuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"2");
    }//GEN-LAST:event_dosbuttonActionPerformed

    private void cuatrobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatrobuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"4");
    }//GEN-LAST:event_cuatrobuttonActionPerformed

    private void nuevebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevebuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"9");
    }//GEN-LAST:event_nuevebuttonActionPerformed

    private void cerobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerobuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"0");
    }//GEN-LAST:event_cerobuttonActionPerformed

    private void puntobttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntobttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+".");
    }//GEN-LAST:event_puntobttonActionPerformed

    private void igualbttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualbttonActionPerformed
        String texto,expresion,resul;
        double resultado=0;
        texto=this.expresiontxt.getText();
        Posfijo pos = new Posfijo();
        EvaluacionPostfija ev = new EvaluacionPostfija();
        EvaluacionSintaxis s= new EvaluacionSintaxis();
        if(!s.expresionValida(texto)){
            this.jTextPane2.setText("Error de sintaxis");
        }
        else{
            expresion=pos.cadena(texto);
            try{
                resultado=ev.evaluaPost(expresion);
                this.jTextPane2.setText(Double.toString(resultado));
            }catch(Exception e){
                this.jTextPane2.setText("Error: resultado indefinido");
            }
            
        }  
    }//GEN-LAST:event_igualbttonActionPerformed

    private void porbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porbuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"*");
    }//GEN-LAST:event_porbuttonActionPerformed

    private void divisionbttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionbttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"/");
    }//GEN-LAST:event_divisionbttonActionPerformed

    private void sumabttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumabttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"+");
    }//GEN-LAST:event_sumabttonActionPerformed

    private void menosbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosbuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"-");
    }//GEN-LAST:event_menosbuttonActionPerformed

    private void pizquierdobttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizquierdobttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"(");
    }//GEN-LAST:event_pizquierdobttonActionPerformed

    private void pderechobttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pderechobttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+")");
    }//GEN-LAST:event_pderechobttonActionPerformed

    private void potenciabttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciabttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"^");
    }//GEN-LAST:event_potenciabttonActionPerformed

    private void unobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unobuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"1");
    }//GEN-LAST:event_unobuttonActionPerformed

    private void seisbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisbuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"6");
    }//GEN-LAST:event_seisbuttonActionPerformed

    private void tresbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresbuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"3");
    }//GEN-LAST:event_tresbuttonActionPerformed

    private void cincobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincobuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"5");
    }//GEN-LAST:event_cincobuttonActionPerformed

    private void sietebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sietebuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"7");
    }//GEN-LAST:event_sietebuttonActionPerformed

    private void ochobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochobuttonActionPerformed
        this.expresiontxt.setText(this.expresiontxt.getText()+"8");
    }//GEN-LAST:event_ochobuttonActionPerformed

    private void borrarbttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarbttonActionPerformed
        this.expresiontxt.setText("");
    }//GEN-LAST:event_borrarbttonActionPerformed

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
            java.util.logging.Logger.getLogger(interfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarbtton;
    private javax.swing.JButton cerobutton;
    private javax.swing.JButton cincobutton;
    private javax.swing.JButton cuatrobutton;
    private javax.swing.JButton divisionbtton;
    private javax.swing.JButton dosbutton;
    private javax.swing.JTextPane expresiontxt;
    private javax.swing.JButton igualbtton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JButton menosbutton;
    private javax.swing.JButton nuevebutton;
    private javax.swing.JButton ochobutton;
    private javax.swing.JButton pderechobtton;
    private javax.swing.JButton pizquierdobtton;
    private javax.swing.JButton porbutton;
    private javax.swing.JButton potenciabtton;
    private javax.swing.JButton puntobtton;
    private javax.swing.JButton seisbutton;
    private javax.swing.JButton sietebutton;
    private javax.swing.JButton sumabtton;
    private javax.swing.JButton tresbutton;
    private javax.swing.JButton unobutton;
    // End of variables declaration//GEN-END:variables
}
