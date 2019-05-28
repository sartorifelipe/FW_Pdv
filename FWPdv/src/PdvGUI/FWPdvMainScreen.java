package PdvGUI;

import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipe
 */
public class FWPdvMainScreen extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("###,##0.00");
    int contador = 1;
    String consulta = "";
    int sqlcount = 0;
    int quantidade = 1;
    Double valorTotal = 0.0;
    Double total = 0.0;
    int linha = 0;

    public FWPdvMainScreen() {
        initComponents();

        this.setExtendedState(MAXIMIZED_BOTH);
        txtOpcao.requestFocus();
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
        lblOpcao = new javax.swing.JLabel();
        txtOpcao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodBarras = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblCodOperador = new javax.swing.JLabel();
        lblNomeOperador = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FWPdv");
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setFocusable(false);

        lblOpcao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblOpcao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpcao.setText("CPF/CNPJ:");

        txtOpcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcaoActionPerformed(evt);
            }
        });
        txtOpcao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOpcaoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOpcaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOpcaoKeyTyped(evt);
            }
        });

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Item", "Descrição ", "Qtd.", "Valor Un.", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompra.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCompra);
        if (tblCompra.getColumnModel().getColumnCount() > 0) {
            tblCompra.getColumnModel().getColumn(0).setResizable(false);
            tblCompra.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblCompra.getColumnModel().getColumn(1).setResizable(false);
            tblCompra.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblCompra.getColumnModel().getColumn(2).setResizable(false);
            tblCompra.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCompra.getColumnModel().getColumn(3).setResizable(false);
            tblCompra.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblCompra.getColumnModel().getColumn(4).setResizable(false);
            tblCompra.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Compra atual");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Descrição");

        txtCodBarras.setEditable(false);

        txtDescricao.setEditable(false);
        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        txtDescricao.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Cód. Produto");

        txtQuantidade.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Quantidade");

        jTextField5.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("CPF/CNPJ");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Cliente");

        txtNome.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Ultimas Compras");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Cupom", "Data", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Cód. Operador:");

        txtCPF.setEditable(false);

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        lblTotal.setText("0.00");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel10.setText("R$");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Consumo Médio:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Nome Operador:");

        lblCodOperador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCodOperador.setText("-");

        lblNomeOperador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNomeOperador.setText("-");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(315, 315, 315))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCodOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel10))
                            .addComponent(lblOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOpcao, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOpcao)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodOperador)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeOperador)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtOpcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcaoActionPerformed

    }//GEN-LAST:event_txtOpcaoActionPerformed

    private void txtOpcaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpcaoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_X) {
            System.out.println("oi");
            String str = txtOpcao.getText();
//            int pos = str.indexOf("*");
//            String a = str.substring(0, pos);
//            quantidade = Integer.parseInt(a);
            System.out.println("quantidade: " + str);

            quantidade = Integer.parseInt(str);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel tabela;
            tabela = (DefaultTableModel) tblCompra.getModel();
            if (sqlcount == 0) {
                lblOpcao.setText("Cód. Barras:");
            }
            Conecta c = new Conecta();
            c.conecta("localhost", "Mercado", "postgres", "postgres");
            if (sqlcount == 1) {
                if(txtOpcao.equals("") && evt.getKeyCode() == KeyEvent.VK_ENTER){
                    new FWBuscarProduto().setVisible(true);
                    
                }else{

                    consulta = "SELECT * FROM produtos WHERE barras = '" + txtOpcao.getText() + "'";
                    txtOpcao.setText("");
                    c.consulta(consulta);
                    ResultSet rs = c.consulta(consulta);
                    System.out.println(consulta + "\n cod barras");
                    try {
                        while (rs.next()) {
                            tabela.addRow(new String[tabela.getColumnCount()]);
                            String descricao = rs.getString("descricao");
                            String barras = rs.getString("barras");
                            String quant = Integer.toString(quantidade);
                            String precoUn = rs.getString("preco");
                            valorTotal = (Double.parseDouble(precoUn) * Double.parseDouble(quant));
                            txtDescricao.setText(descricao);
                            txtCodBarras.setText(barras);
                            txtQuantidade.setText(Integer.toString(quantidade));
                            total = total + valorTotal;
                            lblTotal.setText(df.format(total));

                            tblCompra.setValueAt(linha + 1, linha, 0);
                            tblCompra.setValueAt(descricao, linha, 1);
                            tblCompra.setValueAt(quant, linha, 2);
                            tblCompra.setValueAt(precoUn, linha, 3);
                            tblCompra.setValueAt(df.format(valorTotal), linha, 4);
                            linha++;

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(FWPdvMainScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    quantidade = 1;
                }
            }
            if (sqlcount == 0) {
                consulta = "SELECT * FROM cliente WHERE cpf_cnpj = '" + txtOpcao.getText() + "'";
                txtOpcao.setText("");
                sqlcount = 1;
                c.consulta(consulta);
                ResultSet rs = c.consulta(consulta);
                System.out.println(consulta);
                try {
                    while (rs.next()) {
                        txtCPF.setText(rs.getString("cpf_cnpj"));
                        txtNome.setText(rs.getString("nome"));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(FWPdvMainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if (sqlcount == 1) {
                lblOpcao.setText("CPF/CNPJ:");
                sqlcount = 0;
                txtOpcao.setText("");
            } else {
                lblOpcao.setText("Cód. Barras:");
                sqlcount = 1;
                txtOpcao.setText("");
            }
        }

    }//GEN-LAST:event_txtOpcaoKeyPressed

    private void txtOpcaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpcaoKeyTyped
    }//GEN-LAST:event_txtOpcaoKeyTyped

    private void txtOpcaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpcaoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_X) {
            txtOpcao.setText("");
        }
    }//GEN-LAST:event_txtOpcaoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblCodOperador;
    private javax.swing.JLabel lblNomeOperador;
    private javax.swing.JLabel lblOpcao;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOpcao;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
