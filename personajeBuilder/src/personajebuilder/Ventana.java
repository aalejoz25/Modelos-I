package personajebuilder;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        _raza = new javax.swing.JComboBox<>();
        _arma = new javax.swing.JComboBox<>();
        _enviar = new javax.swing.JButton();
        _text = new javax.swing.JLabel();
        _tipo = new javax.swing.JComboBox<>();
        _foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        _raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Elfo", "Orco" }));

        _arma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espada", "Hechizos", "Arco" }));

        _enviar.setText("Enviar");
        _enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _enviarActionPerformed(evt);
            }
        });

        _text.setText("El personaje creado es: ");

        _tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mago", "Luchador" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(_text, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(_enviar)
                    .addComponent(_raza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_tipo, 0, 95, Short.MAX_VALUE)
                    .addComponent(_arma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_enviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)))
                .addComponent(_text)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__enviarActionPerformed
        
        int raza = _raza.getSelectedIndex();
        int arma = _arma.getSelectedIndex();
        int tipo = _tipo.getSelectedIndex();
        String nom_raza = " ";
        String nom_arma = " ";
        String nom_tipo = " ";
        String img = " ";
        if (raza == 0) {
            nom_raza = "Humano";
        }
        if (raza == 1) {
            nom_raza = "Elfo";
        }
        if (raza == 2) {
            nom_raza = "Orco";
        }

        if (arma == 0) {
            nom_arma = "Espada";
        }

        if (arma == 1) {
            nom_arma = "hechizos";
        }

        if (arma == 2) {
            nom_arma = "arco";
        }

        Personaje personaje;
        Personaje luchador;
        Director director = new Director();
        PersonajeBuilder personaje_mago = new PersonajeMagoBuilder();
        PersonajeBuilder personaje_luchador = new PersonajeLuchadorBuilder();

        if (tipo == 0) {
            director.personajeBuilder(personaje_mago);
            director.construirPersonaje(nom_raza, nom_arma);
            personaje = director.getPersonaje();
            img = "0" + raza + arma + ".jpg";
            _text.setText("El mago creado es de: " + "Raza " + personaje.getRaza() + " y tiene como arma " + personaje.getTipo() + "");
            img = "0" + raza + arma + ".jpg";
            ImageIcon foto = new ImageIcon(getClass().getResource("/img/" + img));
            ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(_foto.getWidth(), _foto.getHeight(), Image.SCALE_DEFAULT));
            _foto.setIcon(icono);
        }

        if (tipo == 1) {
            director.personajeBuilder(personaje_luchador);
            director.construirPersonaje(nom_raza, nom_arma);
            personaje = director.getPersonaje();
            _text.setText("El luchador creado es de: " + "Raza " + personaje.getRaza() + " y tiene como arma " + personaje.getTipo());
            img = "1" + raza + arma + ".jpg";
            ImageIcon foto = new ImageIcon(getClass().getResource("/img/"+img));
            ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(_foto.getWidth(), _foto.getHeight(), Image.SCALE_DEFAULT));
            _foto.setIcon(icono);
        }


    }//GEN-LAST:event__enviarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> _arma;
    private javax.swing.JButton _enviar;
    private javax.swing.JLabel _foto;
    private javax.swing.JComboBox<String> _raza;
    private javax.swing.JLabel _text;
    private javax.swing.JComboBox<String> _tipo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
