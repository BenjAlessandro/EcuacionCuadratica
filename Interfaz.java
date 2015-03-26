package ecuacionCuadratica;


/*
 * @author Benja
 */

public class Interfaz extends javax.swing.JFrame {

    Proceso p = new Proceso();
    
    public Interfaz() {
        initComponents();
        super.setTitle("Ecuación Cuadrática del Benja");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        numA = new javax.swing.JTextField();
        numB = new javax.swing.JTextField();
        numC = new javax.swing.JTextField();
        Ecuacion = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        Graficar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        ValPos = new javax.swing.JLabel();
        ResPos = new javax.swing.JLabel();
        ValNeg = new javax.swing.JLabel();
        ResNeg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numA.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        numA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        numB.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        numB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        numC.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        numC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Ecuacion.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        Ecuacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ecuacion.setText("Ax^2 + Bx + C = 0");

        a.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("A =");

        b.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setText("B =");

        c.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText("C =");

        Calcular.setFont(new java.awt.Font("Caviar Dreams", 1, 11)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Graficar.setFont(new java.awt.Font("Caviar Dreams", 1, 11)); // NOI18N
        Graficar.setText("Graficar");
        Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActionPerformed(evt);
            }
        });

        Limpiar.setFont(new java.awt.Font("Caviar Dreams", 1, 11)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        ValPos.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        ValPos.setText("Valor Positivo:");

        ResPos.setFont(new java.awt.Font("Caviar Dreams", 1, 11)); // NOI18N

        ValNeg.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        ValNeg.setText("Valor Negativo:");

        ResNeg.setFont(new java.awt.Font("Caviar Dreams", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ValPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(b)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ValNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResNeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Ecuacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Calcular)
                        .addGap(18, 18, 18)
                        .addComponent(Graficar)
                        .addGap(18, 18, 18)
                        .addComponent(Limpiar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Ecuacion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a)
                    .addComponent(numB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b)
                    .addComponent(numC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ValPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ValNeg)
                    .addComponent(ResNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calcular)
                    .addComponent(Graficar)
                    .addComponent(Limpiar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>                        

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if ((numA.getText().trim().length() != 0) && 
                (numB.getText().trim().length() != 0) && 
                (numC.getText().trim().length() != 0)) {
            p.leer();
            p.calcularPositivo(); 
            p.calcularNegativo();
        }
    }                                        

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        numA.setText(null);
        numB.setText(null);
        numC.setText(null);
        ResPos.setText(null);
        ResNeg.setText(null);
    }                                       

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        p.graficar();
    }                                        

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Calcular;
    private javax.swing.JLabel Ecuacion;
    private javax.swing.JButton Graficar;
    private javax.swing.JButton Limpiar;
    public static javax.swing.JLabel ResNeg;
    public static javax.swing.JLabel ResPos;
    private javax.swing.JLabel ValNeg;
    private javax.swing.JLabel ValPos;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    public static javax.swing.JTextField numA;
    public static javax.swing.JTextField numB;
    public static javax.swing.JTextField numC;
    // End of variables declaration                   
}
