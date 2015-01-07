/*
 * Copyright (c) 2015, Andrey Lavrov <lavroff@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package cy.alavrov.jminerguide.forms;

import cy.alavrov.jminerguide.data.DataContainer;
import cy.alavrov.jminerguide.data.api.APIKeyLoader;
import cy.alavrov.jminerguide.data.api.IKeyLoadingResultReceiver;
import cy.alavrov.jminerguide.data.character.APIKey;
import cy.alavrov.jminerguide.log.JMGLogger;
import cy.alavrov.jminerguide.util.IntegerDocumentFilter;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;

/**
 * New API adding dialog.
 * @author alavrov
 */
public class JNewAPIDialog extends javax.swing.JDialog implements IKeyLoadingResultReceiver{
    private final DataContainer dCont;
    private volatile boolean loading;
    private final JAPIDialog parent;
    
    private volatile APIKey tempKey;
    /**
     * Creates new form JNewAPIDialog
     */
    public JNewAPIDialog(JAPIDialog parent, boolean modal, DataContainer cont) {
        super(parent, modal);
        initComponents();
        dCont = cont;
        this.parent = parent;
        
        AbstractDocument idDoc = ((AbstractDocument)jTextFieldKeyID.getDocument());
        idDoc.setDocumentFilter(new IntegerDocumentFilter());
        idDoc.addDocumentListener(new NewAPIDocumentListener());
        
        AbstractDocument verDoc = ((AbstractDocument)jTextFieldVerification.getDocument());
        verDoc.addDocumentListener(new NewAPIDocumentListener());
        
        disableOKButton();
        checkDataOnType();
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
        jTextFieldKeyID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldVerification = new javax.swing.JTextField();
        jButtonCreatePredefined = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonLoad = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCharacters = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabelExpires = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add New API Key");
        setModal(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Key ID");

        jTextFieldKeyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKeyIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Verification Code");

        jTextFieldVerification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVerificationActionPerformed(evt);
            }
        });

        jButtonCreatePredefined.setText("Create Predefined");
        jButtonCreatePredefined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreatePredefinedActionPerformed(evt);
            }
        });

        jButtonLoad.setText("Load");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel3.setText("Charaters");

        jScrollPane1.setViewportView(jListCharacters);

        jLabel4.setText("Expires:");

        jLabelExpires.setText("never");

        jLabel5.setText("Status:");

        jLabelStatus.setText("Ready");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jTextFieldVerification)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldKeyID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCreatePredefined))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonLoad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancel)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelExpires)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldKeyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreatePredefined, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVerification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLoad)
                    .addComponent(jButtonOK)
                    .addComponent(jButtonCancel)
                    .addComponent(jLabel5)
                    .addComponent(jLabelStatus))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabelExpires))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreatePredefinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreatePredefinedActionPerformed
        if (loading) return;
        
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI("https://community.eveonline.com/support/api-key/CreatePredefined?accessMask=8"));
            } catch (Exception e) {
                JMGLogger.logSevere("Cannot create predefined API Key", e);
            }
        } else {
            JMGLogger.logSevere("Cannot create predefined API Key, no Desktop available");
        }
    }//GEN-LAST:event_jButtonCreatePredefinedActionPerformed

    private void jTextFieldKeyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKeyIDActionPerformed
        if (loading) return;
        checkDataOnType();
    }//GEN-LAST:event_jTextFieldKeyIDActionPerformed

    private void jTextFieldVerificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVerificationActionPerformed
        if (loading) return;
        checkDataOnType();
    }//GEN-LAST:event_jTextFieldVerificationActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if (tempKey == null || loading) {
            disableOKButton();
            return;
        }
        
        dCont.getCharacterContainer().addAPIKey(tempKey);
        dCont.save();
        parent.loadKeys(false);
        parent.selectKey(tempKey);
        parent.loadSelectedKey();
        
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        if (loading) return;
        
        String id = jTextFieldKeyID.getText();
        String ver = jTextFieldVerification.getText();
        if (id == null || ver == null || id.isEmpty() || ver.isEmpty()) {
            jButtonLoad.setEnabled(false);
            jLabelStatus.setText("Fields can't be empty");
            return;
        }
        
        Integer realid; 
        try {
            realid = Integer.parseInt(id);            
        } catch (NumberFormatException e) {
            jButtonLoad.setEnabled(false);
            jLabelStatus.setText("Bad ID, should be integer.");
            return;
        }
        
        jButtonLoad.setEnabled(false);
        jTextFieldKeyID.setEnabled(false);
        jTextFieldVerification.setEnabled(false);
        jButtonOK.setEnabled(false);
        jButtonCancel.setEnabled(false);
        jButtonCreatePredefined.setEnabled(false);
        jLabelStatus.setText("Fetching key data...");
        loading = true;
        
        APIKey key = new APIKey(realid, ver);
        APIKeyLoader loader = new APIKeyLoader(key, this);
        dCont.startAPILoader(loader);
    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!loading) {
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        if (!loading) {
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed


    public void disableOKButton() {
        jButtonOK.setEnabled(false);
    }
    
    public void checkDataOnType() {
        tempKey = null;
        disableOKButton();
        String id = jTextFieldKeyID.getText();
        String ver = jTextFieldVerification.getText();
        if (id == null || ver == null || id.isEmpty() || ver.isEmpty()) {
            jButtonLoad.setEnabled(false);
            jLabelStatus.setText("Fields can't be empty");
        } else {
            Integer realid;
            try {
                realid = Integer.parseInt(id);
                APIKey key = dCont.getCharacterContainer().getAPIKey(realid);
                if (key == null) {
                    jButtonLoad.setEnabled(true);
                    jLabelStatus.setText("Ready to verify");
                } else {
                    jButtonLoad.setEnabled(false);
                    jLabelStatus.setText("There is a key with this ID");
                }
            } catch (NumberFormatException e) {
                    jButtonLoad.setEnabled(false);
                    jLabelStatus.setText("Bad ID");
            }            
        }
        
        jLabelExpires.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreatePredefined;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelExpires;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JList jListCharacters;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldKeyID;
    private javax.swing.JTextField jTextFieldVerification;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loadingDone(boolean success, String result, APIKey processed) {
        jButtonCancel.setEnabled(true);
        jButtonCreatePredefined.setEnabled(true);
        loading = false;
        
        if (success) {
            tempKey = processed;
            jButtonLoad.setEnabled(false);
            jTextFieldKeyID.setEnabled(false);
            jTextFieldVerification.setEnabled(false);
            jButtonOK.setEnabled(true);
            jLabelStatus.setText("Key loaded successfully");
            jLabelExpires.setText(processed.getExpires());
        } else {
            tempKey = null;
            jButtonLoad.setEnabled(false);
            jTextFieldKeyID.setEnabled(true);
            jTextFieldVerification.setEnabled(true);
            jButtonOK.setEnabled(false);
            jLabelStatus.setText(result);
            jLabelExpires.setText("");
        }
    }

    private class NewAPIDocumentListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            checkDataOnType();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            checkDataOnType();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            checkDataOnType();
        }
        
    }
}
