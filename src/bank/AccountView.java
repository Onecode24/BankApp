/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo
 */
public class AccountView extends javax.swing.JPanel {

    /**
     * Creates new form AccountView
     */
    
    private ArrayList<Account> list;
    
    public AccountView(ArrayList<Account> accountList) {
        initComponents();
        list = new ArrayList<Account>();
        for(Account i : accountList){
            list.add(i);
        }
        list=accountList;
        this.AccountList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 try{
                     if(AccountList.getSelectedItem().toString().equals("Normal")){
                        interestText.setText("0");
                     }else{
                         interestText.setText("0.95");
                     }
                 }catch(Error e){
                     e.printStackTrace();
                 }
            }
        });
        
        if(AccountList.getSelectedItem().toString().equals("Normal")){
            interestText.setText("0");
        }else{
            interestText.setText("0.95");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccountList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OwnerText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accountNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SoldeText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        interestText = new javax.swing.JTextField();
        Valider = new javax.swing.JButton();

        AccountList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Sparing" }));
        AccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountListMouseClicked(evt);
            }
        });
        AccountList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jLabel1.setText("Account type :");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jLabel2.setText("Owner :");

        OwnerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jLabel3.setText("Number :");

        accountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jLabel4.setText("Solde :");

        SoldeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoldeTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        jLabel5.setText("Interest :");

        interestText.setEditable(false);
        interestText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestTextActionPerformed(evt);
            }
        });

        Valider.setText("Create");
        Valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValiderMouseClicked(evt);
            }
        });
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OwnerText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SoldeText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(interestText))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccountList, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(OwnerText))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(accountNumber))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(SoldeText))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(interestText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jLabel1.getAccessibleContext().setAccessibleName("type");
    }// </editor-fold>//GEN-END:initComponents

    private void OwnerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OwnerTextActionPerformed

    private void accountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberActionPerformed

    private void SoldeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoldeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoldeTextActionPerformed

    private void interestTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interestTextActionPerformed

    private void AccountListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountListActionPerformed
        // TODO add your handling code here:
        if(this.AccountList.getSelectedItem().toString().equals("Normal")){
            this.interestText.setText("0");
        }
    }//GEN-LAST:event_AccountListActionPerformed

    private void AccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountListMouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_AccountListMouseClicked

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValiderActionPerformed

    private void ValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderMouseClicked
        String nom= this.OwnerText.getText();
        String number = this.accountNumber.getText();
        String sold = this.SoldeText.getText();
        String interes = this.interestText.getText();
        String accountType = this.AccountList.getSelectedItem().toString();
        Double solde;
        Double interest;
        if(checkAccount(this.list,number)){
            JOptionPane.showMessageDialog(this, "Account Number already exist");
        }else{
            if(number.isEmpty() || sold.isEmpty() || interes.isEmpty() || nom.isEmpty()){
            JOptionPane.showMessageDialog(this,"All field are required");
            
            }else{

                try{
                    solde=parseDouble(sold);
                    interest=parseDouble(interes);
                    if(solde<=0){
                        JOptionPane.showMessageDialog(this, "Solde Invalid");
                    }else{
                        if(accountType.equals("Normal")){
                            NormalAccount newAccount = new NormalAccount(nom,number,solde,interest);
                            this.list.add(newAccount);
                            JOptionPane.showMessageDialog(this, "New Normal Account add \n with number account : "+number);
                            this.OwnerText.setText("");
                            this.SoldeText.setText("");
                            this.accountNumber.setText("");

                        }else{
                            SparingAccount newAccount = new SparingAccount(nom,number,solde,interest);
                            this.list.add(newAccount);
                            JOptionPane.showMessageDialog(this, "New Sparing Account add \n with number account : "+number);
                            this.OwnerText.setText("");
                            this.SoldeText.setText("");
                            this.accountNumber.setText("");
                        }
                    }
                } catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,"Solde invalid");
                }
            }
        }
        
    }//GEN-LAST:event_ValiderMouseClicked

    public boolean checkAccount(ArrayList<Account> accounts, String number){
        for(Account account : accounts){
              if(account.getNumber().equals(number)) return true;
              System.out.println(list.size());
        }
        return false;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccountList;
    private javax.swing.JTextField OwnerText;
    private javax.swing.JTextField SoldeText;
    private javax.swing.JButton Valider;
    private javax.swing.JTextField accountNumber;
    private javax.swing.JTextField interestText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
