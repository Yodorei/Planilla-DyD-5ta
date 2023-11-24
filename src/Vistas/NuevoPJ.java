/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.*;
import Entidades.*;
import javax.swing.JOptionPane;


public class NuevoPJ extends javax.swing.JInternalFrame {
    
    Conexion con = new Conexion("jdbc:mariadb://localhost:3306/planilla_dyd_5ta","root","");
    
    
    public NuevoPJ() {
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

        jpInfo = new javax.swing.JPanel();
        jcbRaza = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbClase = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtJugador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtPersonaje = new javax.swing.JTextField();
        jpBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jpStats = new javax.swing.JPanel();
        jsFue = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jsDes = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jsCon = new javax.swing.JSpinner();
        jsInt = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jsSab = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jsCar = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jsStatTotal = new javax.swing.JSpinner();

        jcbRaza.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel3.setText("Raza");

        jcbClase.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel4.setText("Clase");

        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel1.setText("Jugador");

        jtJugador.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel2.setText("Personaje");

        jtPersonaje.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N

        javax.swing.GroupLayout jpInfoLayout = new javax.swing.GroupLayout(jpInfo);
        jpInfo.setLayout(jpInfoLayout);
        jpInfoLayout.setHorizontalGroup(
            jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jcbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jcbClase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jpInfoLayout.setVerticalGroup(
            jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jcbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jcbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jButton1.setText("Crear Personaje");

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        jsFue.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jsFue.setModel(new javax.swing.SpinnerNumberModel(10, 10, 15, 1));

        jLabel5.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel5.setText("FUE");

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel6.setText("DES");

        jsDes.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jsDes.setModel(new javax.swing.SpinnerNumberModel(10, 10, 15, 1));

        jLabel7.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel7.setText("CON");

        jsCon.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jsCon.setModel(new javax.swing.SpinnerNumberModel(10, 10, 15, 1));

        jsInt.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jsInt.setModel(new javax.swing.SpinnerNumberModel(10, 10, 15, 1));

        jLabel8.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel8.setText("INT");

        jLabel9.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel9.setText("SAB");

        jsSab.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jsSab.setModel(new javax.swing.SpinnerNumberModel(10, 10, 15, 1));

        jLabel10.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel10.setText("CAR");

        jsCar.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jsCar.setModel(new javax.swing.SpinnerNumberModel(10, 10, 15, 1));

        jLabel11.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel11.setText("Stats");

        jsStatTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jsStatTotal.setModel(new javax.swing.SpinnerNumberModel(15, null, 15, 1));
        jsStatTotal.setEnabled(false);

        javax.swing.GroupLayout jpStatsLayout = new javax.swing.GroupLayout(jpStats);
        jpStats.setLayout(jpStatsLayout);
        jpStatsLayout.setHorizontalGroup(
            jpStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatsLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jpStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpStatsLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jsFue, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jsDes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jsCon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jpStatsLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jsStatTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jsInt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jsSab, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jsCar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpStatsLayout.setVerticalGroup(
            jpStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jsStatTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jpStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jsFue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jsDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jsCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jsInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jsSab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jsCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JComboBox<Raza> jcbClase;
    private javax.swing.JComboBox<Raza> jcbRaza;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpInfo;
    private javax.swing.JPanel jpStats;
    private javax.swing.JSpinner jsCar;
    private javax.swing.JSpinner jsCon;
    private javax.swing.JSpinner jsDes;
    private javax.swing.JSpinner jsFue;
    private javax.swing.JSpinner jsInt;
    private javax.swing.JSpinner jsSab;
    private javax.swing.JSpinner jsStatTotal;
    private javax.swing.JTextField jtJugador;
    private javax.swing.JTextField jtPersonaje;
    // End of variables declaration//GEN-END:variables

    public int rollDice(int cantidad, int caras) {
        int roll = 0;
        int random;

        if (cantidad < 0 || caras < 0) {
            JOptionPane.showMessageDialog(null, "Error en la tirada");
        } else {
            for (int i = 0; i < cantidad; i++) {
                random = (int) (Math.random() * caras) + 1;
                roll += random;
            }
        }

        return roll;
    }
    public void limitRoll(){
    
    }
    
    
}
