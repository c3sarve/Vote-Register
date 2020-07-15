/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ConexaoBD.ColaboradorDAO;
import javax.swing.table.DefaultTableModel;
import Entidades.Eleitor;
import ConexaoBD.EleitorDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class TelaCadastroEleitor extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroEleitor
     */
    public TelaCadastroEleitor() {
        initComponents();
        
        ColaboradorDAO colaboradorDao = new ColaboradorDAO();
        
        colaboradorDao.getColaboradoresNames().stream().forEach(s -> {
            colaborador.addItem(s);
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jCadastro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nascimento = new javax.swing.JFormattedTextField();
        funcionario = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        telefone1 = new javax.swing.JFormattedTextField();
        telefone2 = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JTextField();
        voto = new javax.swing.JComboBox<>();
        pleito = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        alcance = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        colaborador = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        bairro = new javax.swing.JComboBox<>();
        zona = new javax.swing.JComboBox<>();
        regiao = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        secao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Cadastro Eleitor");

        jCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data de Nascimento", "Funcionário", "E-mail", "Telefone - 1", "Telefone - 2", "Voto", "Pleito", "Colaborador", "Endereço", "Bairro", "Observação", "Zona", "Região", "Seção", "Alcance"
            }
        ));
        jScrollPane1.setViewportView(jCadastro);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Eleitor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Nome");

        jLabel2.setText("Data de Nascimento");

        jLabel3.setText("E-mail");

        jLabel4.setText("Funcionário");

        jLabel5.setText("Voto");

        jLabel6.setText("Telefone - 1");

        jLabel7.setText("Telefone - 2");

        jLabel8.setText("Pleito");

        try {
            nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        funcionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));

        try {
            telefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        voto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Voto conquistado", "Voto à conquistar", "Voto não conquistado" }));

        jLabel13.setText("Colaborador");

        alcance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+10", " " }));

        jLabel16.setText("Alcance");

        colaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        colaborador.setSelectedItem("Selecione");
        colaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaboradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefone2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(pleito, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alcance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(colaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addComponent(voto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pleito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alcance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel9.setText("Endereço");

        jLabel10.setText("Bairro");

        jLabel11.setText("Zona");

        jLabel12.setText("Região");

        bairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "FORA DO MUNICÍPIO", "BARRA DE JANGADA", "ALTO DA UNIÃO", "ALTO DO CEMITERIO", "ARITANA", "BORBOREMA", "BULHÕES", "CAJÁ", "CAJUEIRO SECO ", "CANDEIAS ", "CASCATA ", "CAVALEIRO", "CENTRO ", "COLÔNIA DOS PADRES ", "COMPORTA", "CORREGO DA BATALHA", "CORREGO DA ROSA", "CURADO", "CURADO I", "CURADO II", "CURADO III", "CURADO IV", "CURCURANA", "DISTRITO INDUSTRIAL", "DOIS CARNEIROS", "DUAS UNAS", "ENGENHO CORVETA", "ENGENHO MACUJÉ", "ENGENHO MEGALP", "ENGENHO PALMEIRA", "ENGENHO SACUPEMA", "ENGENHO VELHO", "ENTRE RIOS", "FLORIANO", "GAMELEIRA", "GENERAL DERBY", "GOIABEIRA", "GUARARAPES", "JABOATÃO CENTRO", "JARDIM JORDÃO", "JARDIM PIEDADE", "JARDIM SANTO ANDRÉ", "LORETO ", "LOTE 19 ", "LOTE 31 ", "LOTE 56 ", "LOTE 92 ", "LOTEAMENTO BOLA DE OURO ", "LOTEAMENTO COVA DA ONÇA ", "LOTEAMENTO EDMAR DE OLIVEIRA ", "LOTEAMENTO GRANDE RECIFE ", "LOTEAMENTO SANTA HELENA ", "LOTEAMENTO SANTA INÊS ", "LOTEAMENTO SANTA JOANA ", "LOTEAMENTO SÃO CRISTOVÃO ", "LOTEAMENTO SÃO FRANCISCO ", "LOTEAMENTO SONHO VERDE ", "LOTEAMENTO VILA RICA ", "MANASSU ", "MARCOS FREIRE ", "MASSANGANA ", "MASSARANDUBA ", "MOEDA DE BRONZE ", "MURIBECA ", "MURIBEQUINHA ", "PARQUE SANTANA ", "PIEDADE ", "PORTA LARGA ", "PRAIAS ", "PRAZERES ", "RIO DAS VELHAS ", "SANTANA ", "SANTO ALEIXO ", "SANTO ANDRÉ ", "SÃO JOSÉ ", "SOCORRO ", "SOTAVE ", "SUCUPIRA ", "TERRA MAR ", "TRÊS CARNEIROS ", "UR-10", "UR-11 ", "UR-6 ", "VARGEM FRIA ", "VILA MARIO GOUVEIA ", "VILA NESTLÉ ", "VILA RICA ", "VISTA ALEGRE ", "ZUMBI DO PACHECO", " " }));

        zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "11", "101", "118", "147" }));

        regiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7" }));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Seção");

        jLabel14.setText("Observação");

        observacao.setColumns(20);
        observacao.setRows(5);
        jScrollPane2.setViewportView(observacao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairro, 0, 244, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(227, 227, 227)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(secao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 22, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        
         if (nome.getText().equals("")) {
        
        JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
        
        
    }else if (nascimento.getText().equals("  /  /    ")){
        
        JOptionPane.showMessageDialog(null, "Preencha a data de nascimento corretamente!");
        
    }else if (funcionario.getSelectedItem().equals("Selecione")){
        
         JOptionPane.showMessageDialog(null, "Preencha a funcionario corretamente!");
        
    }else if (email.getText().equals("")){
        
         JOptionPane.showMessageDialog(null, "Preencha a o e-mail corretamente!");
        
    }else if (telefone1.getText().equals("(  )      -    ")){
        
         JOptionPane.showMessageDialog(null, "Preencha o Telefone 1 corretamente");
        
    }else if (telefone1.getText().equals("(  )      -    ")){
        
         JOptionPane.showMessageDialog(null, "Preencha o Telefone 1 corretamente");
        
    }else if(voto.getSelectedItem().equals("Selecione")){
        JOptionPane.showMessageDialog(null, "Preencha o voto corretamente");
    
    }else if(pleito.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Preencha o pleito corretamente");
    
    }else if (alcance.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null, "Preencha a alcance corretamente");
            
    }else if(endereco.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Preencha o endereço corretamente");
    
    }else if(bairro.getSelectedItem().equals("Selecione")){
        JOptionPane.showMessageDialog(null, "Preencha o bairro corretamente");
    
    }else if (secao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha a seção corretamente");
                
    }else if(zona.getSelectedItem().equals("Selecione")){
        JOptionPane.showMessageDialog(null, "Preencha o bairro corretamente");
    
    }else if(regiao.getSelectedItem().equals("Selecione")){
        JOptionPane.showMessageDialog(null, "Preencha o bairro corretamente");
    }
    else{
        
        DefaultTableModel dtmEleitores = (DefaultTableModel) jCadastro.getModel();
        Object[] dados = {nome.getText(),nascimento.getText(),funcionario.getSelectedItem().toString(),
            email.getText(),telefone1.getText(),telefone2.getText(),voto.getSelectedItem().toString(),
            pleito.getText(),colaborador.getSelectedItem().toString(),endereco.getText(),bairro.getSelectedItem().toString(),
            observacao.getText(),zona.getSelectedItem().toString(),regiao.getSelectedItem().toString(),
            secao.getText(), alcance.getSelectedItem().toString()
        };
        
        EleitorDAO dao = new EleitorDAO();
        
        dao.criarTabela();
        
        Eleitor eleitor = new Eleitor(
               nome.getText(), nascimento.getText(), funcionario.getSelectedItem().toString(),
               email.getText(),telefone1.getText(),telefone2.getText(),
               voto.getSelectedItem().toString(),pleito.getText(),colaborador.getSelectedItem().toString(),
               endereco.getText(),bairro.getSelectedItem().toString(), observacao.getText(),
               zona.getSelectedItem().toString(),regiao.getSelectedItem().toString(), 0,
               secao.getText(), alcance.getSelectedItem().toString()
        );  
        
             System.out.println(observacao.getText());
        System.out.println(eleitor);
        

        dao.insert(eleitor);
        
        
        dtmEleitores.addRow(dados);
        
           
      }  
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void colaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colaboradorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alcance;
    private javax.swing.JComboBox<String> bairro;
    private javax.swing.JComboBox<String> colaborador;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JComboBox<String> funcionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField nascimento;
    private javax.swing.JTextField nome;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTextField pleito;
    private javax.swing.JComboBox<String> regiao;
    private javax.swing.JTextField secao;
    private javax.swing.JFormattedTextField telefone1;
    private javax.swing.JFormattedTextField telefone2;
    private javax.swing.JComboBox<String> voto;
    private javax.swing.JComboBox<String> zona;
    // End of variables declaration//GEN-END:variables
}
