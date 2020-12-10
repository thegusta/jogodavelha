import javax.swing.JButton;
import javax.swing.JOptionPane;


//iniciar atributos:
public class Principal extends javax.swing.JFrame {

    
/* 
qtde - Verifica quantas jogadas ocorreram no jogo
    
jogador - Verifica quem é o jogador que está jogando no momento - Jogador X é 1 e o Jogador 0 é 2.
    
mat[][] - Marca a posição de cada jogador
    
b[] - Mapeia os botões do jogo. 
    
ganhador - Armazena o nome do jogador vencedor.
    
jogador1 - Armazena o nome do jogador 1.
    
jogador2 - Armazena o nome do jogador 2.
*/   
   
    int qtde;
    int jogador;
    int mat[][] = new int [3][3];
    JButton b[] = new JButton[9];
    String ganhador;
    String jogador1;
    String jogador2;
    
    
        public Principal() {
        initComponents();
        
        
        qtde = 1;
        jogador = 1;
        b[0] = bt_1;
        b[1] = bt_2;
        b[2] = bt_3;
        b[3] = bt_4;
        b[4] = bt_5;
        b[5] = bt_6;
        b[6] = bt_7;
        b[7] = bt_8;
        b[8] = bt_9;
                
        this.setLocationRelativeTo(null);
    }

    
    
        public void novojogo()
    {
        jogador1 = JOptionPane.showInputDialog("Digite o nome do jogador 1");
        jogador2 = JOptionPane.showInputDialog("Digite o nome do jogador 2");
    }
    
    public void jogada(JButton b, int x, int y){
        
        b.setEnabled(false);
        if(jogador == 1)
        {
            mat[x][y] = 1;
            b.setText("X");
            jogador = 2;
            ganhador = jogador1;
            checarjogada(1);
        }
        
        else
        {
            mat[x][y] = 2;
            b.setText ("O");
            jogador = 1;
            ganhador = jogador2;
            checarjogada(2);
        }
        
        qtde++;
    }
    
    //Verifica qual foi a jogada de qual jogador, e automaticamente ele verificará se houve algum ganhador através do procedimento checarjogada.
   
    public void checarjogada(int x)
    {
        
        if (qtde==9 && vitoria(x)==false)
        {
            JOptionPane.showMessageDialog(null, "Deu Velha!", "Empate", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        if (vitoria(x)==true)
        {
            JOptionPane.showMessageDialog(null, "Jogador: " + ganhador + " " + "Venceu!! ", "Vitória", JOptionPane.INFORMATION_MESSAGE);
            
            fimjogo();  
        }   
    }
    
    //Verifica se houve algum ganhador através da função vitoria
    
    public boolean vitoria(int x){
        
        for(int i = 0; i <mat.length; i++)
        {
            if(mat [i][0] == x && mat[i][1] == x && mat[i][2] == x)
            {
                return true;
            }
            if(mat [0][i] == x && mat[1][i] == x && mat[2][i] == x)
            {
                return true;
            }
            
        }
        
            if(mat [0][0] == x && mat[1][1] == x && mat[2][2] == x)
            {
                return true;
            }
            if(mat [0][2] == x && mat[1][1] == x && mat[2][0] == x)
            {
                return true;
            }
            return false;
    }
   
    //verifica se o jogo já cabou e finaliza
    
    public void fimjogo()
    {
        for(int i = 0; i < 9; i++)
        {
            b[i].setEnabled(false);
        }
    }
      

    //limpa tudo
    public void limpar()
    {
        for(int i = 0; i<9; i++)
        {
            b[i].setEnabled(true);
            b[i].setText("");
        }
        
        for(int x=0; x<3; x++)
        {
            for(int y=0; y<3; y++)
            {
                mat[x][y] = 0;
            }
        }
        
        jogador = 1;
        jogador1 = "";
        jogador2 = "";
        ganhador = "";
        qtde = 1;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(87, 87, 87));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        bt_1.setBackground(new java.awt.Color(221, 221, 221));
        bt_1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_1.setEnabled(false);
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_2.setBackground(new java.awt.Color(221, 221, 221));
        bt_2.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_2.setEnabled(false);
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_3.setBackground(new java.awt.Color(221, 221, 221));
        bt_3.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_3.setEnabled(false);
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        bt_4.setBackground(new java.awt.Color(221, 221, 221));
        bt_4.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_4.setEnabled(false);
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });

        bt_5.setBackground(new java.awt.Color(221, 221, 221));
        bt_5.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_5.setEnabled(false);
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_6.setBackground(new java.awt.Color(221, 221, 221));
        bt_6.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_6.setEnabled(false);
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_7.setBackground(new java.awt.Color(221, 221, 221));
        bt_7.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_7.setEnabled(false);
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        bt_8.setBackground(new java.awt.Color(221, 221, 221));
        bt_8.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_8.setEnabled(false);
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });

        bt_9.setBackground(new java.awt.Color(221, 221, 221));
        bt_9.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        bt_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_9.setEnabled(false);
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setMnemonic('N');
        jMenuItem1.setText("Novo Jogo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(bt_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_7, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(bt_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        
        jogada(bt_1, 0, 0);
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed

        jogada(bt_2, 0, 1);
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed

        jogada(bt_3, 0, 2);
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed

        jogada(bt_4, 1, 0);
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed

        jogada(bt_5, 1, 1);
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed

        jogada(bt_6, 1, 2);
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed

        jogada(bt_7, 2, 0);
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed

        jogada(bt_8, 2, 1);
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed

        jogada(bt_9, 2, 2);
    }//GEN-LAST:event_bt_9ActionPerformed

    
    //menu sair
    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected

        System.exit(0);
    }//GEN-LAST:event_jMenu2MenuSelected

    
    //novo jogo
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        limpar();
        novojogo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}