/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;


import java.text.DecimalFormat;
import imc.calculo;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class VariableY extends javax.swing.JFrame {

    /**
     * Creates new form VariableY
     */
 private double resaA;
    private double resaB;
    private double R;
    DecimalFormat format;
   
    public VariableY() {
    
        initComponents();
        this.limpiar();
             this.formula.setEditable(false);
       this.A.setEditable(false);
       this.B.setEditable(false);
       this.resaltura.setEditable(false);
         format = new DecimalFormat("#########.###");
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        B = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        formula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Altura = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        r1 = new javax.swing.JTextField();
        r = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resaltura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lAlt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("A");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("B");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 10, -1));

        B.setBackground(new java.awt.Color(255, 204, 204));
        B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 110, 40));

        A.setBackground(new java.awt.Color(255, 204, 204));
        A.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 110, 40));

        formula.setBackground(new java.awt.Color(255, 204, 204));
        formula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(formula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fórmula:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Calculo del Peso Esperado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        Altura.setBackground(new java.awt.Color(255, 204, 204));
        Altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AlturaKeyTyped(evt);
            }
        });
        getContentPane().add(Altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ingrese el Altura (m)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 110, 30));

        r1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 120, 30));

        r.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("r=");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("r²=");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        resaltura.setBackground(new java.awt.Color(255, 204, 204));
        resaltura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(resaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 310, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Y=");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("La altura esperada es:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        lAlt.setBackground(new java.awt.Color(204, 204, 0));
        getContentPane().add(lAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 210, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Coeficiente de Correlación");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img3.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 600, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formFocusGained

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
         String formula = "";
        this.B.setText(format.format(this.resaB));
      this.A.setText(format.format(this.resaA));
        formula = "Ŷ = "+format.format(resaA)+" + ("+format.format(resaB)+")(X)";
        
      this.formula.setText(formula);
    }//GEN-LAST:event_formMouseMoved

    private void AlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlturaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_AlturaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String resAltura;
       
        if (this.Altura.getText().length()>0) {
                if (Double.parseDouble(this.Altura.getText())<=0) {
               JOptionPane.showMessageDialog(null, "Por favor ingrese un valor Positivo", "Error",JOptionPane.ERROR_MESSAGE);  
            }else{

            resAltura = format.format(resaA+(resaB*Double.parseDouble(this.Altura.getText())));
           this.resaltura.setText(resAltura);
           this.r.setText(format.format(this.R));
           this.r1.setText(format.format(Math.pow(R, 2)));
           this.lAlt.setText(resAltura);
           
            }
        }else{
         JOptionPane.showMessageDialog(null, "Por favor ingrese un valor válido", "Error",JOptionPane.ERROR_MESSAGE); 
        }
        this.Altura.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_formWindowActivated
   public void resA(double a){
        this.resaA = a;
    };
    public void resB(double b){
        this.resaB = b;
    };
    public void resR(double R){
        this.R = R;
    };
    public void limpiar(){
            this.A.setText(null);
            this.B.setText(null);
            this.Altura.setText(null);
            this.formula.setText(null);
            this.resaltura.setText(null);
            this.r.setText(null);
            this.r1.setText(null);

        };
    
    
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
            java.util.logging.Logger.getLogger(VariableY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VariableY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VariableY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VariableY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VariableY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JFormattedTextField Altura;
    private javax.swing.JTextField B;
    private javax.swing.JTextField formula;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAlt;
    private javax.swing.JTextField r;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField resaltura;
    // End of variables declaration//GEN-END:variables
}
