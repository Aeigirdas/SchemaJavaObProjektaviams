
import com.sun.glass.events.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import schema.Elementas;
import schema.Ivestis;
import schema.Schema;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adomas
 */
public class GVS extends javax.swing.JFrame {

    Schema schema;
    Elementas parinktas = null;
    int x_skirt;
    int y_skirt;
    int pridejimas = 0;
    Gija gija = null;
    int laikas = 500;
    ArrayList<Elementas> parinkti = new ArrayList<>();
    
    /**
     * Creates new form GVS
     */
    public GVS() {
        initComponents();
        output.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        output = new Piesinys();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        jMenuItem11.setText("jMenuItem11");

        jMenuItem12.setText("jMenuItem12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laboratorinis 5");

        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        output.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                outputMouseDragged(evt);
            }
        });
        output.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                outputMouseWheelMoved(evt);
            }
        });
        output.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                outputMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                outputMouseReleased(evt);
            }
        });
        output.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                outputKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout outputLayout = new javax.swing.GroupLayout(output);
        output.setLayout(outputLayout);
        outputLayout.setHorizontalGroup(
            outputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        outputLayout.setVerticalGroup(
            outputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        jMenu1.setText("Failas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Kurti nauja");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Baigti darba");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Redaguoti");

        jMenuItem3.setText("Prideti ivesti");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Prideti NOT");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem7.setText("Prideti AND");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Prideti OR");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Prideti XOR");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Isvaizda");

        jMenuItem5.setText("Didinti");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Mazinti");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Rodymas");

        jMenuItem10.setText("Start");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem13.setText("Stop");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem16.setText("Zingsnio greitis");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem14.setText("Zingsniu pirmyn");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Zingsniu atgal");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        schema = new Schema();
        schema.pridetiIvesti();
        schema.pridetiIvesti();
        schema.pridetiIvesti();
        schema.pridetiIvesti();
        schema.nustatytiREiksme(1, false);
        schema.nustatytiREiksme(2, true);
        schema.nustatytiREiksme(3, true);
        schema.nustatytiREiksme(4, false);
        schema.pridetiAND();
        schema.sujungtielementus(1, 5);
        schema.sujungtielementus(2, 5);
        schema.sujungtielementus(3, 5);
        schema.pridetiNOT();
        schema.sujungtielementus(1, 6);
        schema.pridetiOR();
        schema.sujungtielementus(3, 7);
        schema.sujungtielementus(4, 7);
        schema.pridetiXOR();
        schema.sujungtielementus(5, 8);
        schema.sujungtielementus(6, 8);
        schema.sujungtielementus(7, 8);
        output.setSchema(schema);

        this.repaint();    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void outputMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outputMousePressed

        if (schema != null) {
            output.setKeturkampioPradziaX(evt.getX());
            output.setKeturkampioPradziaY(evt.getY());
            int x = evt.getX();
            int y = evt.getY();

            if (pridejimas > 0) {
                int id = Elementas.getELEMENTO_NR();
                switch (pridejimas) {

                    case 1:
                        schema.pridetiIvesti();
                        break;

                    case 2:

                        schema.pridetiNOT();
                        break;

                    case 3:
                        schema.pridetiAND();
                        break;

                    case 4:
                        schema.pridetiOR();
                        break;

                    case 5:
                        schema.pridetiXOR();
                        break;

                }
                Elementas el = schema.gautiElementaPagalID(id);
                el.setX(x - output.zoom / 2);
                el.setY(y - output.zoom / 2);
                pridejimas = 0;
                this.repaint();

            } else {
                for (Elementas e : schema.getElementai()) {
                    int x_e = e.getX();
                    int y_e = e.getY();
                    if (x > x_e && x < (x_e + output.zoom) && y > y_e && y < (y_e + output.zoom)) {
                        if (evt.getButton() == MouseEvent.BUTTON3) {
                            if (e.getClass().equals(Ivestis.class)) {
                                e.setIsvestis(!e.gautiReiksme());
                            }
                            this.repaint();
                        } else {
                            parinktas = e;
                            x_skirt = evt.getX() - parinktas.getX();
                            y_skirt = evt.getY() - parinktas.getY();
                        }
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_outputMousePressed

    public Elementas gautiPagalKoordinates(int x, int y) {
        if (schema != null) {
            for (Elementas ele : schema.getElementai()) {

                if (x > ele.getX() && x < (ele.getX() + output.zoom) && y > ele.getY() && y < (ele.getY() + output.zoom)) {
                    return ele;

                }
            }

        }
        return null;
    }

    private void outputMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outputMouseDragged

        if (parinktas == null) {

            output.setKeturkampioPabaigaX(evt.getX());
            output.setKeturkampioPabaigaY(evt.getY());
            this.repaint();
        }

        if (parinktas != null) {
            if (!evt.isControlDown() && !evt.isShiftDown()) {
                parinktas.setX(evt.getX() - x_skirt);
                parinktas.setY(evt.getY() - y_skirt);
                this.repaint();
            }
        }
    }//GEN-LAST:event_outputMouseDragged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        pridejimas = 1;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        pridejimas = 2;
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        output.zoom += 10;
        this.repaint();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        output.zoom -= 10;
        this.repaint();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        pridejimas = 3;
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        pridejimas = 4;
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        pridejimas = 5;
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void outputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outputMouseReleased

        for (Elementas e : schema.getElementai()) {

            if (e.getX() > output.getKeturkampioPradziaX() && e.getX() + output.getZoom() < output.getKeturkampioPabaigaX()
                    && e.getY() > output.keturkampioPradziaY && e.getY() + output.getZoom() < output.getKeturkampioPabaigaY()) {

                parinkti.add(e);

            }

        }

        if (schema != null && parinktas != null) {
            Elementas iki = gautiPagalKoordinates(evt.getX(), evt.getY());
            if (iki != null) {
                if (evt.isControlDown()) {
                    schema.sujungtielementus(parinktas.getId(), iki.getId());
                }
                if (evt.isShiftDown()) {
                    schema.salintiSujungima(parinktas.getId(), iki.getId());
                }
                output.repaint();
            }
        }
        parinktas = null;
    }//GEN-LAST:event_outputMouseReleased

    private void outputMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_outputMouseWheelMoved
        output.zoom -= evt.getScrollAmount() * evt.getWheelRotation();
        output.repaint();
    }//GEN-LAST:event_outputMouseWheelMoved

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if (gija == null || !gija.isAlive()) {
            gija = new Gija(output, linijuSkaicius(),laikas);
            gija.start();
        }

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    
    public int linijuSkaicius(){
    
    for(Elementas e:schema.getElementai()){
    
    
                }
    
    
    return 10;
    
    }
    
    public int maxGylis() {

        int max = 0;
        for (Elementas e : schema.getElementai()) {
            max = Math.max(e.getLygis(), max);
        }

        return max;
    }

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        if (gija != null) {
            gija.interrupt();
            gija = null;
        }

    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        if (schema != null && output.zingsnis < maxGylis()) {
            output.zingsnis++;
            output.repaint();
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        if (schema != null && output.zingsnis > 1) {
            output.zingsnis--;
            output.repaint();
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void outputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outputKeyPressed
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
     
                for(Elementas e:parinkti){
                    schema.salintiElementa(e);
                        }
                parinkti.clear();
                this.repaint();
        }
        
    }//GEN-LAST:event_outputKeyPressed

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
            java.util.logging.Logger.getLogger(GVS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GVS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GVS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GVS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GVS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private Piesinys output;
    // End of variables declaration//GEN-END:variables
}
