/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SearchRole;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import model.Product;
import model.SupplierDirectory;


/**
 *
 * @author Lynn Wei
 */
public class ManageSearchJPanel extends javax.swing.JPanel {
	JPanel userProcessContainer;
	SupplierDirectory supplierDirectory;
    SimpleDateFormat aDate=new SimpleDateFormat("yyyy-MM-dd HH:mm");
    SimpleDateFormat aDate1=new SimpleDateFormat("yyyyMMdd");


    /**
     * Creates new form SearchCarJPanel
     */
	public ManageSearchJPanel(JPanel upc, SupplierDirectory sd){
        initComponents();
        userProcessContainer = upc;
        supplierDirectory = sd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btnsearch7 = new javax.swing.JButton();
        btnsearch9 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnsearch1 = new javax.swing.JButton();
        lblCityName = new javax.swing.JLabel();
        btnsearch2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnsearch3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnsearch4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnsearch6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        btnsearch10 = new javax.swing.JButton();
        btnsearch5 = new javax.swing.JButton();
        btnsearch8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel9.setText("——");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        btnsearch7.setText("available");
        btnsearch7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch7ActionPerformed(evt);
            }
        });

        btnsearch9.setText("unavailable");
        btnsearch9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch9ActionPerformed(evt);
            }
        });

        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnsearch1.setText("search");
        btnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch1ActionPerformed(evt);
            }
        });

        lblCityName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        lblCityName.setText("Search Car");

        btnsearch2.setText("search");
        btnsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Car's Serial Number:");

        btnsearch3.setText("search");
        btnsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Car's City:");

        btnsearch4.setText("search");
        btnsearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch4ActionPerformed(evt);
            }
        });

        jLabel3.setText("The scope of Car's Seat Number:");

        btnsearch6.setText("search");
        btnsearch6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch6ActionPerformed(evt);
            }
        });

        jLabel4.setText("Car's Availability:");

        jLabel5.setText("Car's Seat Number:");

        jLabel6.setText("Car's Year:");

        jLabel7.setText("Car's Certification EXP:");

        jLabel8.setText("Car's Model number:");

        jLabel10.setText("Car's Manufacturer:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        btnsearch10.setText("search");
        btnsearch10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch10ActionPerformed(evt);
            }
        });

        btnsearch5.setText("search");
        btnsearch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch5ActionPerformed(evt);
            }
        });

        btnsearch8.setText("search");
        btnsearch8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch8ActionPerformed(evt);
            }
        });

        jButton1.setText("First Available Car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(276, 276, 276)
                                .addComponent(btnsearch8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnsearch7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsearch9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnsearch2)
                                            .addComponent(btnsearch3)
                                            .addComponent(btnsearch6)
                                            .addComponent(btnsearch10)
                                            .addComponent(btnsearch5)
                                            .addComponent(btnsearch1))
                                        .addGap(56, 56, 56)
                                        .addComponent(btnsearch4)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch1))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnsearch3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(btnsearch4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsearch6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnsearch10)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsearch5))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnsearch7)
                                .addComponent(btnsearch9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btnsearch7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch7ActionPerformed
        // TODO add your handling code here:
        List<Product> lists = supplierDirectory.findByAvailable();
    	if (lists.size() != 0) {
    		AvailableJPanel availableJPanel = new AvailableJPanel(userProcessContainer, lists);
			userProcessContainer.add("ManageSearchJPanel",availableJPanel);
	        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
	        layout.next(userProcessContainer);
		}else {
			JOptionPane.showMessageDialog(null, "No query found!");
		}
        
    }//GEN-LAST:event_btnsearch7ActionPerformed

    private void btnsearch9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch9ActionPerformed
        // TODO add your handling code here:
        List<Product> lists = supplierDirectory.findByUnAvailable();
    	if (lists.size() != 0) {
    		unAvailableJPanel unAvailableJPanel = new unAvailableJPanel(userProcessContainer, lists);
			userProcessContainer.add("ManageSearchJPanel",unAvailableJPanel);
	        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
	        layout.next(userProcessContainer);
		}else {
			JOptionPane.showMessageDialog(null, "No query found!");
		}
       
    }//GEN-LAST:event_btnsearch9ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
       
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch1ActionPerformed
        // TODO add your handling code here:
        try {
	    	double d = Double.parseDouble(jTextField3.getText());
	    	Product p = supplierDirectory.findByNumber(d);
	    	if (p != null) {
				OneResultJPanel oneResultJPanel = new OneResultJPanel(userProcessContainer,p);
				userProcessContainer.add("ManageSearchJPanel",oneResultJPanel);
		        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
		        layout.next(userProcessContainer);
	    	}else {
				JOptionPane.showMessageDialog(null, "No query found!");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "input error!");
		}
        
    }//GEN-LAST:event_btnsearch1ActionPerformed

    private void btnsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch2ActionPerformed
        // TODO add your handling code here:
        String c = jTextField2.getText();
    	List<Product> lists = supplierDirectory.findByCity(c);
    	if (lists.size() != 0) {
    		SearchCityJPanel searchCityJPanel = new SearchCityJPanel(userProcessContainer, lists);
			userProcessContainer.add("ManageSearchJPanel",searchCityJPanel);
	        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
	        layout.next(userProcessContainer);
		}else {
			JOptionPane.showMessageDialog(null, "No query found!");
		}
       
    }//GEN-LAST:event_btnsearch2ActionPerformed

    private void btnsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch3ActionPerformed
        // TODO add your handling code here:
        try {
	    	int y = Integer.parseInt(jTextField1.getText());
	    	List<Product> lists = supplierDirectory.findByYear(y);
	    	if (lists.size() != 0) {
				SearchYearJPanel searchYearJPanel = new SearchYearJPanel(userProcessContainer, lists);
				userProcessContainer.add("ManageSearchJPanel",searchYearJPanel);
		        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
		        layout.next(userProcessContainer);
			}else {
				JOptionPane.showMessageDialog(null, "No query found!");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "input error!");
		}
       
    }//GEN-LAST:event_btnsearch3ActionPerformed

    private void btnsearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch4ActionPerformed
        // TODO add your handling code here:
        try {
	    	int s = Integer.parseInt(jTextField4.getText());
	    	int e = Integer.parseInt(jTextField6.getText());
	    	List<Product> lists = supplierDirectory.findBySeat(s,e);
	    	if (lists.size() != 0) {
	    		SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						SearchSeatJPanel searchSeatJPanel = new SearchSeatJPanel(lists);
						searchSeatJPanel.setVisible(true);
						searchSeatJPanel.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					}
				});
			}else {
				JOptionPane.showMessageDialog(null, "No query found!");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "input error!");
		}

        
    }//GEN-LAST:event_btnsearch4ActionPerformed

    private void btnsearch6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch6ActionPerformed
        // TODO add your handling code here:
        String c = jTextField7.getText();
    	List<Product> lists = supplierDirectory.findByModel(c);
    	if (lists.size() != 0) {
    		SearchModelJPanel searchModelJPanel = new SearchModelJPanel(userProcessContainer, lists,c);
			userProcessContainer.add("ManageSearchJPanel",searchModelJPanel);
	        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
	        layout.next(userProcessContainer);
		}else {
			JOptionPane.showMessageDialog(null, "No query found!");
		}
        
    }//GEN-LAST:event_btnsearch6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnsearch10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch10ActionPerformed
        // TODO add your handling code here:
        String m = jTextField10.getText();
    	List<Product> lists = supplierDirectory.findByMaun(m);
    	if (lists.size() != 0) {
    		SearchModelJPanel searchModelJPanel = new SearchModelJPanel(userProcessContainer, lists,m);
			userProcessContainer.add("ManageSearchJPanel",searchModelJPanel);
	        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
	        layout.next(userProcessContainer);
		}else {
			JOptionPane.showMessageDialog(null, "No query found!");
		}
        
    }//GEN-LAST:event_btnsearch10ActionPerformed

    private void btnsearch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch5ActionPerformed
        // TODO add your handling code here:
        try {
	    	int s = Integer.parseInt(jTextField5.getText());
	    	List<Product> lists = supplierDirectory.findBySeat(s,s);
	    	if (lists.size() != 0) {
	    		SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						SearchSeatJPanel searchSeatJPanel = new SearchSeatJPanel(lists);
						searchSeatJPanel.setVisible(true);
						searchSeatJPanel.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					}
				});
			}else {
				JOptionPane.showMessageDialog(null, "No query found!");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "input error!");
		}
       
    }//GEN-LAST:event_btnsearch5ActionPerformed

    private void btnsearch8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch8ActionPerformed
        // TODO add your handling code here:
        List<Product> lists = supplierDirectory.findByDate(aDate1.format(new Date()));
    	if (lists.size() != 0) {
    		EXPJPanel expjPanel = new EXPJPanel(userProcessContainer,lists);
			userProcessContainer.add("ManageSearchJPanel",expjPanel);
	        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
	        layout.next(userProcessContainer);
		}else {
			JOptionPane.showMessageDialog(null, "No query found!");
		}
       
    }//GEN-LAST:event_btnsearch8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    	 String manu = jTextField10.getText();
    	String city = jTextField2.getText();
    	int year = 0;
    	try {
    		year = Integer.parseInt(jTextField1.getText());
    	} catch (NumberFormatException e) {
			
		}
    	int s = 0;
    	try {
    		s = Integer.parseInt(jTextField5.getText());
    	} catch (NumberFormatException e) {
			
		}
    	
    	List<Product> lists = supplierDirectory.findAll();

		Iterator<Product> iterator = lists.listIterator(0);
		Product[] r = new Product[4];
		while(iterator.hasNext()) {
			int i = 3;
			Product p = iterator.next();
			if ("unavailable".equals(p.getAvail())) {
				iterator.remove();
				continue;
			}
			if (!city.isEmpty() && !city.equals(p.getCity())) {
				i--;
			}
			
			if (year != 0 && year != p.getYear()) {
				i--;
			}
			
			if (!manu.isEmpty() && !manu.equals(p.getManu())) {
				i--;
			}
			if (s != 0 && p.getSeat() != s) {
				i--;
			}
			r[i] = p;
		}	
		Product p = null;
		for (int i = 3; i >= 0; i--) {
			if (r[i] != null) {
				p = r[i];
				break;
			}
		}
		if (p != null) {
			FirstAvailJPanel firstAvailJPanel = new FirstAvailJPanel(userProcessContainer, p);
			userProcessContainer.add("ManageSearchJPanel",firstAvailJPanel);
		    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
			layout.next(userProcessContainer);
		}else {
			JOptionPane.showMessageDialog(null, "There is no product that meets the requirements!");
		}
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnsearch1;
    private javax.swing.JButton btnsearch10;
    private javax.swing.JButton btnsearch2;
    private javax.swing.JButton btnsearch3;
    private javax.swing.JButton btnsearch4;
    private javax.swing.JButton btnsearch5;
    private javax.swing.JButton btnsearch6;
    private javax.swing.JButton btnsearch7;
    private javax.swing.JButton btnsearch8;
    private javax.swing.JButton btnsearch9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblCityName;
    // End of variables declaration//GEN-END:variables
}
