/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package surveys;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import static surveys.Surveys.qry;
import static surveys.Surveys.rs;
import static surveys.Surveys.statement;
import static surveys.Surveys.userid;

/**
 *
 * @author Indu
 */
public class SurveyAns extends javax.swing.JFrame {

    /**
     * Creates new form SurveyAns
     */
    boolean load;
    String surveyid;
    public SurveyAns() {
        initComponents();
        try
        {
        load=true    ;
        lblOption.setVisible(false);
        lblQNo.setVisible(false);
        lblQues.setVisible(false);
        qno.setVisible(false);
        ques.setVisible(false);
        ans.setVisible(false);
        btn_next.setVisible(false);
        qry= "select  distinct category from mst_survey";
        rs = statement.executeQuery(qry);
        cat_combo.removeAllItems();
        cat_combo.addItem("Select Category");
        while (rs.next())
        {
            cat_combo.addItem(rs.getString("category"));
        }
        load=false;
        }
        catch(SQLException ex)
        {
            System.out.println(ex);   
        }
        
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ans = new javax.swing.JComboBox<>();
        qno = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        lblQNo = new javax.swing.JLabel();
        lblQues = new javax.swing.JLabel();
        ques = new javax.swing.JLabel();
        lblOption = new javax.swing.JLabel();
        cat_combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        title_combo = new javax.swing.JComboBox<>();
        btn_start = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 100, 100));

        ans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        qno.setText("0");
        qno.setToolTipText("");

        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        lblQNo.setText("Ques No");

        lblQues.setText("Question");

        ques.setText("jLabel4");

        lblOption.setText("Choose Option");

        cat_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cat_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cat_comboItemStateChanged(evt);
            }
        });

        jLabel1.setText("Category");

        jLabel4.setText("Title");

        title_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_start.setText("Start");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQues, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOption)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cat_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ques, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQNo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_start)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_next)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(title_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_start)
                    .addComponent(lblQNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qno)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ques, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQues))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOption)
                        .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_next)
                            .addComponent(jRadioButton2)))
                    .addComponent(jRadioButton1))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
         try
        {
            qry= "INSERT INTO tbl_ans(surveyid,userid,quesno,answer)  VALUES('" + surveyid + "','" +userid + "'," + qno.getText() +",' " + ans.getSelectedItem() + "')";
            
            statement.executeUpdate(qry);
            Panel();
        }
        catch( SQLException  ex)
        {
            System.out.println(qry) ;
        }
        
    }//GEN-LAST:event_btn_nextActionPerformed

    private void cat_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cat_comboItemStateChanged
        if (load==false)
        {       
        try
        {
        
            qry= "select  * from mst_survey where category='" + cat_combo.getSelectedItem() + "'";
            System.out.println(qry);
            rs = statement.executeQuery(qry);
            
            title_combo.removeAllItems();
        while (rs.next())
        {
            title_combo.addItem(rs.getString("title"));
        }
      
        }
        catch(SQLException ex)
        {
        }
    }
    }//GEN-LAST:event_cat_comboItemStateChanged

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
       lblOption.setVisible(true);
        lblQNo.setVisible(true);
        lblQues.setVisible(true);
        qno.setVisible(true);
        ques.setVisible(true);
        ans.setVisible(true);
        btn_next.setVisible(true);
        Panel();
       btn_start.setVisible(false);
       cat_combo.disable();
       title_combo.disable();
       
    }//GEN-LAST:event_btn_startActionPerformed

    private void Panel() {
         try
        {
            qry= "select * from mst_ques a inner join mst_survey b on a.surveyid=b.surveyid where category='" + cat_combo.getSelectedItem() + "' and title='" + title_combo.getSelectedItem() + "' and  quesno>" + qno.getText() + " limit 1";
              
              
               rs = statement.executeQuery(qry);
                rs.next();
                
                if (rs.getRow()==0)
                {
                    JOptionPane.showMessageDialog(null,"Thanks for filling Survey. Do come again for more Surveys!"); 
                    lblOption.setVisible(false);
                    lblQNo.setVisible(false);
                    lblQues.setVisible(false);
                    qno.setVisible(false);
                    ques.setVisible(false);
                    ans.setVisible(false);
                    btn_next.setVisible(false);
                    btn_start.setVisible(true);
                    cat_combo.enable();
                    title_combo.enable();
                    
                }
                else
                {
                  surveyid=rs.getString("surveyid");
                  
                  qno.setText(rs.getString("quesno"));
                  ques.setText(rs.getString("ques"));
                                   
                   ans.removeAllItems();
                   ans.addItem("");
                   String s[]=rs.getString("Options").split(",") ;
                   jRadioButton1.setText(s[0]);
                   
                   for (int i=0;i<s.length;i++)
                   {
                       System.out.println(s[i]); 
                       ans.addItem(s[i]);
                   }
                }       
               
               } 
                
                
     catch( SQLException  ex)
        {
            System.out.println(ex.toString()) ;
        }
    }

    public  void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SurveyAns().setVisible(true);
        });
    }
   
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ans;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_start;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cat_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblOption;
    private javax.swing.JLabel lblQNo;
    private javax.swing.JLabel lblQues;
    private javax.swing.JLabel qno;
    private javax.swing.JLabel ques;
    private javax.swing.JComboBox<String> title_combo;
    // End of variables declaration//GEN-END:variables
}
