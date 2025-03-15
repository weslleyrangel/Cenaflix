/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uc10e3.view;

import com.uc10e3.controller.PodcastController;
import com.uc10e3.model.Podcast;
import com.uc10e3.model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Interface gráfica para listagem e filtragem de podcasts cadastrados no sistema.
 * Exibe os podcasts em uma tabela e permite filtrar por produtor. Usuários administradores
 * podem acessar a tela de cadastro diretamente desta interface.
 * 
 * @author Wesll
 * @version 1.2
 * @since 2023-10-01
 */
public class TelaListagem extends javax.swing.JFrame {
    private Usuario usuarioLogado;
    /**
     * Creates new form TelaListagem
     */
    public TelaListagem() {
        initComponents();
    }

    public TelaListagem(Usuario usuario) {
        initComponents();
        this.usuarioLogado = usuario;

        setLocationRelativeTo(null);

        // Habilita botões conforme permissão
        boolean isAdmin = usuario.getTipo().equals("Administrador");
        boolean isUsuarioComum = usuario.getTipo().equals("Usuário");

        btnCadastrar.setEnabled(!isUsuarioComum); // Operador e Admin podem cadastrar
        btnExcluir.setEnabled(isAdmin); // Somente Admin pode excluir

        carregarPodcasts();  // Carrega os podcasts ao abrir a tela
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFiltrarListagem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagem = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("CENAFLIX");

        jLabel2.setText("Pesquisar podcast por produtor:");

        txtFiltrarListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltrarListagemActionPerformed(evt);
            }
        });

        tblListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Produtor", "Nome do Episódio", "Nº do Episódio", "Duração", "URL do Repositório"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListagem);
        if (tblListagem.getColumnModel().getColumnCount() > 0) {
            tblListagem.getColumnModel().getColumn(0).setResizable(false);
            tblListagem.getColumnModel().getColumn(1).setResizable(false);
            tblListagem.getColumnModel().getColumn(2).setResizable(false);
            tblListagem.getColumnModel().getColumn(3).setResizable(false);
            tblListagem.getColumnModel().getColumn(4).setResizable(false);
            tblListagem.getColumnModel().getColumn(5).setResizable(false);
        }

        btnCadastrar.setBackground(new java.awt.Color(153, 255, 153));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("LISTAGEM");

        btnExcluir.setBackground(new java.awt.Color(255, 153, 153));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFiltrarListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(33, 33, 33)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFiltrarListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Filtra os podcasts na tabela pelo nome do produtor.
     * 
     * A filtragem é feita em tempo real conforme o usuário digita.
     * 
     * @param evt Evento de digitação no campo de filtro.
     */
    private void txtFiltrarListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltrarListagemActionPerformed
       TelaListagem telaListagem = new TelaListagem(usuarioLogado);
        telaListagem.setLocationRelativeTo(this); // Centraliza em relação à tela atual
        telaListagem.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_txtFiltrarListagemActionPerformed
/**
     * Navega de volta para a tela de cadastro de podcasts.
     * 
     * Mantém a sessão do usuário logado ao reabrir a tela de cadastro.
     * 
     * @param evt Evento de clique no botão "Cadastrar".
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new TelaDeCadastroDePodcast(usuarioLogado).setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = tblListagem.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(
            this, 
            "Selecione um podcast para excluir!", 
            "Aviso", 
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    // Confirmação da exclusão
    int confirm = JOptionPane.showConfirmDialog(
        this, 
        "Tem certeza que deseja excluir este podcast?", 
        "Confirmação", 
        JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            DefaultTableModel model = (DefaultTableModel) tblListagem.getModel();
            Long id = (Long) model.getValueAt(selectedRow, 0); // ID deve ser do tipo Long
            
            PodcastController controller = new PodcastController();
            controller.excluirPodcast(id);
            
            carregarPodcasts(); // Atualiza a tabela
            JOptionPane.showMessageDialog(this, "Podcast excluído com sucesso!");
        } catch (ClassCastException e) {
            JOptionPane.showMessageDialog(
                this, 
                "Erro ao excluir podcast: ID deve ser do tipo Long.", 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this, 
                "Erro ao excluir podcast: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

       /**
     * Carrega todos os podcasts do banco de dados para a tabela.
     * 
     * Atualiza a tabela com os dados mais recentes do sistema.
     * 
     * @throws DatabaseException Se ocorrer um erro ao acessar o banco de dados.
     */
    private void carregarPodcasts() {
     try {
        PodcastController controller = new PodcastController();
        List<Podcast> podcasts = controller.listarPodcasts();

        DefaultTableModel model = (DefaultTableModel) tblListagem.getModel();
        model.setRowCount(0); 

        for (Podcast podcast : podcasts) {
            model.addRow(new Object[]{
                podcast.getId(), // Certifique-se de que getId() retorna Long
                podcast.getProdutor(),
                podcast.getNomeDoEpisodio(),
                podcast.getNumeroDoEpisodio(),
                podcast.getDuracao(),
                podcast.getUrlDoRepositorio()
            });
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(
            this, 
            "Erro ao carregar podcasts!", 
            "Erro", 
            JOptionPane.ERROR_MESSAGE
        );
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListagem;
    private javax.swing.JTextField txtFiltrarListagem;
    // End of variables declaration//GEN-END:variables
}
