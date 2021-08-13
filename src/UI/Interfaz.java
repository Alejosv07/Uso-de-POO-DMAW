/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Ejercicio1.clases.cCalculosExtras;
import Ejercicio1.clases.cFactorial;
import Ejercicio1.clases.cRaices;
import Ejercicio2.clases.CuadradoAreaPerimetroImp;
import Ejercicio2.clases.RectanguloAreaPerimetroImp;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    cFactorial factorial;
    cCalculosExtras calculadora;
    cRaices raices;
    CuadradoAreaPerimetroImp Cuadrado;
    RectanguloAreaPerimetroImp Rectangulo;
    public Interfaz() {
        initComponents();
        factorial = new cFactorial();
        calculadora = new cCalculosExtras();
        raices = new cRaices();
        this.jTextFieldY.setEnabled(false);
        this.jTextFieldX.setEnabled(false);
        this.jTextFieldA.setEnabled(false);
        this.jTextFieldB.setEnabled(false);
        this.jTextFieldC.setEnabled(false);
        this.jTextFieldAltura.setEnabled(false);
        this.jLabel8.setEnabled(false);
    }

    public int indiceCombo = 0;
    public int ejercicio = 0;
    public int indiceFigura = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jRadioFactorial = new javax.swing.JRadioButton();
        jRadioTrigonometricas = new javax.swing.JRadioButton();
        jRadioRaiz = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFactorial = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldY = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonCalcular1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioCuadrado = new javax.swing.JRadioButton();
        jRadioRectangulo = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jButtonCalcularFigura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        buttonGroup1.add(jRadioFactorial);
        jRadioFactorial.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jRadioFactorial.setSelected(true);
        jRadioFactorial.setText("Factorial");
        jRadioFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFactorialActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioTrigonometricas);
        jRadioTrigonometricas.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jRadioTrigonometricas.setText("Trigonometricas");
        jRadioTrigonometricas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTrigonometricasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioRaiz);
        jRadioRaiz.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jRadioRaiz.setText("Raiz");
        jRadioRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRaizActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setText("Calcular el factorial de:");
        jLabel1.setToolTipText("");

        jTextFieldFactorial.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jComboBox1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X^2", "X^Y", "X^3", "Sen(", "Cos(", "Tan(", "n!", "Sumar", "Restar", "Dividir", "Multiplicar" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setText("X:");

        jTextFieldX.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("Y:");

        jTextFieldY.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTextFieldY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(238, 244, 204));

        jTextFieldA.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel4.setText("X^2 +");

        jTextFieldB.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel5.setText("X +");

        jTextFieldC.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel6.setText("= 0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jButtonCalcular1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonCalcular1.setText("Calcular");
        jButtonCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jRadioFactorial)
                .addGap(18, 18, 18)
                .addComponent(jRadioTrigonometricas)
                .addGap(18, 18, 18)
                .addComponent(jRadioRaiz)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCalcular1)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioFactorial)
                    .addComponent(jRadioTrigonometricas)
                    .addComponent(jRadioRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonCalcular1)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Problema 1", jPanel1);

        buttonGroup2.add(jRadioCuadrado);
        jRadioCuadrado.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jRadioCuadrado.setSelected(true);
        jRadioCuadrado.setText("Cuadrado");
        jRadioCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCuadradoActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioRectangulo);
        jRadioRectangulo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jRadioRectangulo.setText("Rectángulo");
        jRadioRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRectanguloActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(251, 241, 223));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel7.setText("Lado:");

        jTextFieldLado.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel8.setText("Altura:");

        jTextFieldAltura.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        jButtonCalcularFigura.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonCalcularFigura.setText("Area");
        jButtonCalcularFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularFiguraActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Perimetro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldLado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonCalcularFigura)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcularFigura)
                    .addComponent(jButton1))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jRadioCuadrado)
                .addGap(34, 34, 34)
                .addComponent(jRadioRectangulo)
                .addContainerGap(105, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioCuadrado)
                    .addComponent(jRadioRectangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Problema 2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Calculos extras, ejercicio 1
        indiceCombo = this.jComboBox1.getSelectedIndex();
        switch (indiceCombo) {
            case 0:
                this.jLabel2.setText("X:");
                this.jLabel3.setText("Y:");
                this.jTextFieldY.setEnabled(false);
                borrarXY();
                break;
            case 1:
                this.jLabel2.setText("X:");
                this.jLabel3.setText("Y:");
                this.jTextFieldY.setEnabled(true);
                borrarXY();
                break;
            case 2:
                this.jLabel2.setText("X:");
                this.jLabel3.setText("Y:");
                this.jTextFieldY.setEnabled(false);
                borrarXY();
                break;
            case 3:
                this.jLabel2.setText("Sen:");
                this.jLabel3.setText("Y:");
                this.jTextFieldY.setEnabled(false);
                borrarXY();
                break;
            case 4:
                this.jLabel2.setText("Cos:");
                this.jLabel3.setText("Y:");
                this.jTextFieldY.setEnabled(false);
                borrarXY();
                break;
            case 5:
                this.jLabel2.setText("Tan:");
                this.jLabel3.setText("Y:");
                this.jTextFieldY.setEnabled(false);
                borrarXY();
                break;
            case 6:
                this.jLabel2.setText("n:");
                this.jLabel3.setText("Y:");
                this.jTextFieldY.setEnabled(false);
                borrarXY();
                break; 
            case 7:
                this.jLabel2.setText("n1:");
                this.jLabel3.setText("n2:");
                this.jTextFieldY.setEnabled(true);
                borrarXY();
                break;
            case 8:
                this.jLabel2.setText("n1:");
                this.jLabel3.setText("n2:");
                this.jTextFieldY.setEnabled(true);
                borrarXY();
                break;
            case 9:
                this.jLabel2.setText("n1:");
                this.jLabel3.setText("n2:");
                this.jTextFieldY.setEnabled(true);
                borrarXY();
                break;
            case 10:
                this.jLabel2.setText("n1:");
                this.jLabel3.setText("n2:");
                this.jTextFieldY.setEnabled(true);
                borrarXY();
                break;
            default:
                System.out.println(":(");
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldYActionPerformed

    private void jRadioFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFactorialActionPerformed
        // Cambio a factorial
        ejercicio = 0;
        borrarXY();
        borrarABC();
        this.jTextFieldFactorial.setEnabled(true);
        this.jTextFieldX.setEnabled(false);
        this.jTextFieldY.setEnabled(false);
        this.jTextFieldA.setEnabled(false);
        this.jTextFieldB.setEnabled(false);
        this.jTextFieldC.setEnabled(false);
    }//GEN-LAST:event_jRadioFactorialActionPerformed

    private void jRadioTrigonometricasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTrigonometricasActionPerformed
        // Cambio a operaciones trigonometricas
        ejercicio = 1;
        borrarFactorial();
        borrarABC();
        this.jTextFieldFactorial.setEnabled(false);
        this.jTextFieldY.setEnabled(true);
        this.jTextFieldX.setEnabled(true);
        this.jTextFieldY.setEnabled(true);
        this.jTextFieldA.setEnabled(false);
        this.jTextFieldB.setEnabled(false);
        this.jTextFieldC.setEnabled(false);
    }//GEN-LAST:event_jRadioTrigonometricasActionPerformed

    private void jRadioRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRaizActionPerformed
        // Cambio a raiz
        ejercicio = 2;
        borrarFactorial();
        borrarXY();
        this.jTextFieldFactorial.setEnabled(false);
        this.jTextFieldX.setEnabled(false);
        this.jTextFieldY.setEnabled(false);
        this.jTextFieldA.setEnabled(true);
        this.jTextFieldB.setEnabled(true);
        this.jTextFieldC.setEnabled(true);
    }//GEN-LAST:event_jRadioRaizActionPerformed

    private void jButtonCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcular1ActionPerformed
        // TODO add your handling code here:
        switch (ejercicio) {
            case 0:
                JOptionPane.showMessageDialog(rootPane, factorial.factorial(Integer.parseInt(this.jTextFieldFactorial.getText())),
                        "Factorial entre 1 y 15", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                switch (indiceCombo) {
                    case 0:
                JOptionPane.showMessageDialog(rootPane, calculadora.nCuadradro(Double.parseDouble(this.jTextFieldX.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                JOptionPane.showMessageDialog(rootPane, calculadora.nExponente(Double.parseDouble(this.jTextFieldX.getText()),
                        Double.parseDouble(this.jTextFieldY.getText())) , "Calculos extras", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                JOptionPane.showMessageDialog(rootPane, calculadora.nCubo(Double.parseDouble(this.jTextFieldX.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                JOptionPane.showMessageDialog(rootPane, calculadora.seno(Double.parseDouble(this.jTextFieldX.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);        
                        break;
                    case 4:
                JOptionPane.showMessageDialog(rootPane, calculadora.coseno(Double.parseDouble(this.jTextFieldX.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);        
                        break;
                    case 5:
                JOptionPane.showMessageDialog(rootPane, calculadora.tangente(Double.parseDouble(this.jTextFieldX.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);        
                        break;
                    case 6:
                JOptionPane.showMessageDialog(rootPane, calculadora.factorialN(Integer.parseInt(this.jTextFieldX.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);        
                        break;
                    case 7:
                JOptionPane.showMessageDialog(rootPane, calculadora.sumar(Double.parseDouble(this.jTextFieldX.getText()),
                                Double.parseDouble(this.jTextFieldY.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 8:
                JOptionPane.showMessageDialog(rootPane, calculadora.restar(Double.parseDouble(this.jTextFieldX.getText()),
                                Double.parseDouble(this.jTextFieldY.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);        
                        break;
                    case 9:
                        if("0".equals(this.jTextFieldY.getText())){
                        JOptionPane.showMessageDialog(rootPane, "Division entre 0", "Atencion", HEIGHT);
                        } else {
                            JOptionPane.showMessageDialog(rootPane, calculadora.dividir(Double.parseDouble(this.jTextFieldX.getText()),
                                Double.parseDouble(this.jTextFieldY.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 10:
                JOptionPane.showMessageDialog(rootPane, calculadora.multiplicar(Double.parseDouble(this.jTextFieldX.getText()),
                                Double.parseDouble(this.jTextFieldY.getText())) ,
                        "Calculos extras", JOptionPane.INFORMATION_MESSAGE);        
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                try{
                    if (raices.calcularRaices(Double.parseDouble(this.jTextFieldA.getText()),
                        Double.parseDouble(this.jTextFieldB.getText()), Double.parseDouble(this.jTextFieldC.getText())).length == 1){
                        JOptionPane.showMessageDialog(rootPane, "X1: " + raices.calcularRaices(Double.parseDouble(this.jTextFieldA.getText()),
                        Double.parseDouble(this.jTextFieldB.getText()), Double.parseDouble(this.jTextFieldC.getText()))[0],
                        "Raices", JOptionPane.INFORMATION_MESSAGE); 
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "X1: " + raices.calcularRaices(Double.parseDouble(this.jTextFieldA.getText()),
                        Double.parseDouble(this.jTextFieldB.getText()), Double.parseDouble(this.jTextFieldC.getText()))[0] + "\n" +
                        "X2: " + raices.calcularRaices(Double.parseDouble(this.jTextFieldA.getText()),
                        Double.parseDouble(this.jTextFieldB.getText()), Double.parseDouble(this.jTextFieldC.getText()))[1],
                        "Raices", JOptionPane.INFORMATION_MESSAGE); 
                    }
                     
                } catch (Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Ingrese los valores correspondientes", "Atencion", HEIGHT);
                }
                break;    
            default:
                break;
        }
    }//GEN-LAST:event_jButtonCalcular1ActionPerformed

    private void jRadioCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCuadradoActionPerformed
        // TODO add your handling code here:
        this.jTextFieldAltura.setEnabled(false);
        this.jLabel8.setEnabled(false);
        this.jLabel7.setText("Lado:");
        this.jTextFieldAltura.setText("");
        this.jTextFieldLado.setText("");
        indiceFigura = 0;
    }//GEN-LAST:event_jRadioCuadradoActionPerformed

    private void jRadioRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRectanguloActionPerformed
        // TODO add your handling code here:
        this.jTextFieldAltura.setEnabled(true);
        this.jLabel8.setEnabled(true);
        this.jLabel7.setText("Base:");
        this.jTextFieldAltura.setText("");
        this.jTextFieldLado.setText("");
        indiceFigura = 1;
    }//GEN-LAST:event_jRadioRectanguloActionPerformed

    private void jButtonCalcularFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularFiguraActionPerformed
        switch (indiceFigura) { //Area
            case 0: //Cuadrado
                Cuadrado = new CuadradoAreaPerimetroImp(Double.parseDouble(this.jTextFieldLado.getText()));
                JOptionPane.showMessageDialog(rootPane, Cuadrado.calcularArea(), "Area de cuadrado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1: //Rectangulo
                Rectangulo = new RectanguloAreaPerimetroImp(Double.parseDouble(this.jTextFieldLado.getText()));
                Rectangulo.setAncho(Double.parseDouble(this.jTextFieldAltura.getText()));
                JOptionPane.showMessageDialog(rootPane, Rectangulo.calcularArea(), "Area de rectangulo", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButtonCalcularFiguraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (indiceFigura) { //Perimetro
            case 0: //Cuadrado
                Cuadrado = new CuadradoAreaPerimetroImp(Double.parseDouble(this.jTextFieldLado.getText()));
                JOptionPane.showMessageDialog(rootPane, Cuadrado.calcularPerimetro(), "Perimetro de cuadrado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1: //Rectangulo
                Rectangulo = new RectanguloAreaPerimetroImp(Double.parseDouble(this.jTextFieldLado.getText()));
                Rectangulo.setAncho(Double.parseDouble(this.jTextFieldAltura.getText()));
                JOptionPane.showMessageDialog(rootPane, Rectangulo.calcularPerimetro(), "Perimetro de rectangulo", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void borrarXY(){
        this.jTextFieldX.setText("");
        this.jTextFieldY.setText("");
    }
    
    public void borrarABC(){
        this.jTextFieldA.setText("");
        this.jTextFieldB.setText("");
        this.jTextFieldC.setText("");
    }
    
    public void borrarFactorial(){
        this.jTextFieldFactorial.setText("");
    }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCalcular1;
    private javax.swing.JButton jButtonCalcularFigura;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioCuadrado;
    private javax.swing.JRadioButton jRadioFactorial;
    private javax.swing.JRadioButton jRadioRaiz;
    private javax.swing.JRadioButton jRadioRectangulo;
    private javax.swing.JRadioButton jRadioTrigonometricas;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldC;
    private javax.swing.JTextField jTextFieldFactorial;
    private javax.swing.JTextField jTextFieldLado;
    private javax.swing.JTextField jTextFieldX;
    private javax.swing.JTextField jTextFieldY;
    // End of variables declaration//GEN-END:variables
}
