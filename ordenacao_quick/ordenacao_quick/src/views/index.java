/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.usuarios;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fatec-dsm2
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        consultarusuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_quick = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_usuarios = new javax.swing.JTable();
        lbl_tempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quick_sort");

        btn_buscar.setText("buscar Usuarios banco");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_quick.setText("reordenar quick sort");
        btn_quick.setActionCommand("Reordenar quick sort");
        btn_quick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quickActionPerformed(evt);
            }
        });

        tbl_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_usuario", "Nome_usuario", "nome_completo", "email_usuario", "telefone"
            }
        ));
        jScrollPane1.setViewportView(tbl_usuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btn_buscar)
                        .addGap(90, 90, 90)
                        .addComponent(btn_quick))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_tempo)
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_quick))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tempo)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_quickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quickActionPerformed
        DefaultTableModel modeloTabela = (DefaultTableModel) tbl_usuarios.getModel();
        int rowCount = modeloTabela.getRowCount();
        int colCount = modeloTabela.getColumnCount();

        // Extrair os dados da tabela para um array
        Object[][] data = new Object[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i][j] = modeloTabela.getValueAt(i, j);
            }
        }

        // Medir o tempo de ordenação com maior precisão
        long startTime = System.nanoTime();
        quickSort(data, 0, rowCount - 1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Atualizar a tabela com os dados ordenados
        modeloTabela.setRowCount(0); // Limpar a tabela
        for (Object[] row : data) {
            modeloTabela.addRow(row);
        }

        // Exibir o tempo de ordenação na label em microssegundos
        lbl_tempo.setText("Tempo de ordenação: " + duration / 1000 + " µs");
    }//GEN-LAST:event_btn_quickActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        consultarusuarios();
    }//GEN-LAST:event_btn_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
    usuarios usu = new usuarios();

    private void quickSort(Object[][] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    private int partition(Object[][] data, int low, int high) {
        int mid = low + (high - low) / 2;  // Calcula o índice do meio
        int pivot = Integer.parseInt(data[mid][0].toString());  // Pivô é o elemento do meio

        // Trocar o pivô com o último elemento
        Object[] temp = data[mid];
        data[mid] = data[high];
        data[high] = temp;

        int i = (low - 1);  // Índice do menor elemento

        for (int j = low; j < high; j++) {
            if (Integer.parseInt(data[j][0].toString()) > pivot) {  // Ordenar em ordem decrescente
                i++;

                // Trocar data[i] com data[j]
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        // Trocar data[i + 1] com data[high] (ou seja, o pivô)
        temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    private void consultarusuarios() {
        DefaultTableModel modeloTabela = (DefaultTableModel) tbl_usuarios.getModel();
        modeloTabela.setRowCount(0);
        usu.consultarUsuarios(modeloTabela);
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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_quick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_tempo;
    private javax.swing.JTable tbl_usuarios;
    // End of variables declaration//GEN-END:variables
}