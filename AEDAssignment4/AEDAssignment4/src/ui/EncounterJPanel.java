/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.House;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author adepu
 */
public class EncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterJPanel
     */
    private PersonDirectory personHistory;
    DefaultTableModel defaultTableModel;
    
    private EncounterHistory encounterHistory;
    int row1, column;
    private LocalDate date;
    public EncounterJPanel(PersonDirectory personHistory) {
        initComponents();
        this.personHistory = personHistory;
        
        this.encounterHistory = encounterHistory;
        defaultTableModel = (DefaultTableModel) tblVitalDetails.getModel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtSystolicBp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiastolicBp = new javax.swing.JTextField();
        txtSugar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalDetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Encounter");

        jLabel2.setText("ID:");

        jLabel3.setText("Blood Pressure:");

        jLabel4.setText("Sugar:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel5.setText("/");

        tblVitalDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "BP", "Community", "Created Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalDetails);

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtID)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtSystolicBp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtDiastolicBp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSugar, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(0, 511, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)
                        .addGap(31, 31, 31)
                        .addComponent(jButton3)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSystolicBp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiastolicBp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(542, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ID = txtID.getText();
        String systolicBP = txtSystolicBp.getText();
        String diastolicBP = txtDiastolicBp.getText();
        String pulseRate = txtSugar.getText();
        
        if(ID.equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter ID!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            Integer.parseInt(ID);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please Enter Valid ID!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if(systolicBP.equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Systolic Value!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            Integer.parseInt(systolicBP);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Systolic Value!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(diastolicBP.equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Diastolic Value!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            Integer.parseInt(diastolicBP);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Diastolic Value!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(pulseRate.equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Pulse Rate!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            Integer.parseInt(pulseRate);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Pulse Rate!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int id = Integer.parseInt(ID);
        int sBP = Integer.parseInt(systolicBP);
        int dBP = Integer.parseInt(diastolicBP);
        int pRate = Integer.parseInt(pulseRate);
        
        for(Person patient: personHistory.getPersonDirectory()){
          if(personHistory.isPatientExist(id)){
          JOptionPane.showMessageDialog(null,"Entered ID is not Present!!", " Warning", JOptionPane.WARNING_MESSAGE); 
              return;}
           if(patient.getID() == id){
               
           if(patient.getIsPatient().equals("No")){
              System.out.println(patient.getIsPatient());
            
                JOptionPane.showMessageDialog(null,"Entered ID is not Patient!!", " Warning", JOptionPane.WARNING_MESSAGE); 
              return;
            
            
           }
        }
        }
        
           
           VitalSigns vitalSign = new VitalSigns(sBP, dBP, pRate);
        date = java.time.LocalDate.now();
        Encounter eCounter = new Encounter(date, vitalSign, id);
        Person person = personHistory.getPerson(id);
        person.addEncounter(eCounter);
        
        JOptionPane.showMessageDialog(this, "Successfully added encounter", "Encounter",1);
    
        //clearAllData(); 
        displayEncouns(person.getEncounteDirectory().getEncounterHistory(),person);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String selectedPatientId = defaultTableModel.getValueAt(row1, 0).toString();
        String patientId = txtID.getText();
        String strSysPressure = txtSystolicBp.getText();
        String strDiaPressure  = txtDiastolicBp.getText();
        String strPulse  = txtSugar.getText();
        
        

        if (patientId.isEmpty() || strSysPressure.isEmpty() || strDiaPressure.isEmpty() || strPulse.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields",2);
        }

        

        
       
        int sysPressure = Integer.parseInt(strSysPressure);
        int diaPresure = Integer.parseInt(strDiaPressure);
        int pulse = Integer.parseInt(strPulse);
        int ID = Integer.parseInt(patientId);
        
        VitalSigns vitalSign = new VitalSigns(sysPressure,diaPresure,pulse);
        date = java.time.LocalDate.now();
        Encounter encounter = new Encounter(date ,vitalSign, ID);

        Person patient = personHistory.getPerson(ID);
        EncounterHistory eh = patient.getEncounteDirectory();
        List<Encounter> list = eh.getEncounterHistory();
        list.set(row1, encounter);
        defaultTableModel.setRowCount(0);
        displayEncouns(list, patient);

        JOptionPane.showMessageDialog(this, "Successfully Updated encounter", " Update Encounter",1);

        //clearAllData();
        txtID.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int dButton = JOptionPane.YES_NO_OPTION;
        int dResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dButton);
        if (dButton == 0)
        {
            String selectedPatientId = defaultTableModel.getValueAt(row1, 0).toString();
        Person patient = personHistory.getPerson(Integer.parseInt(selectedPatientId));
        EncounterHistory eh = patient.getEncounteDirectory();
        eh.removeEncounter(row1);
        
        defaultTableModel.setRowCount(0);
        displayEncouns(eh.getEncounterHistory(), patient);
        //clearAllData();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtID.setEnabled(false);
        row1 = tblVitalDetails.getSelectedRow();
        if(row1<0){
            JOptionPane.showMessageDialog(this, "Please Select a row to view.");
            return;
        }
        txtID.setText(defaultTableModel.getValueAt(row1,0).toString());
        String str = defaultTableModel.getValueAt(row1,3).toString();
        String[] arrOfStr = str.split("/", 2);
        txtSystolicBp.setText(arrOfStr[0]);
        txtDiastolicBp.setText(arrOfStr[1]);
        txtSugar.setText(defaultTableModel.getValueAt(row1,4).toString());
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVitalDetails;
    private javax.swing.JTextField txtDiastolicBp;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSugar;
    private javax.swing.JTextField txtSystolicBp;
    // End of variables declaration//GEN-END:variables
 public void displayEcounter(Encounter encounter, Person person){
        
        House house = person.getHouse();
        VitalSigns vitalsign = encounter.getVitalSign();
        LocalDate localdate = encounter.getDate();
        String date = localdate.getMonth()+" "+localdate.getDayOfMonth()+", "+localdate.getYear();
        
            Object[] obj = {person.getID(), person.getPersonName(), vitalsign.getSystolic_bp()+"/"+vitalsign.getDiastolic_bp(),vitalsign.getSugar(),house.getCommunityName().getCommunityName(),date};
            defaultTableModel.addRow(obj);
        
    }
    
    
    
    public void displayEncouns(List<Encounter> encounterList, Person patient){
        defaultTableModel.setRowCount(0);
        for(Encounter encouns : encounterList){ 
           displayEcounter(encouns, patient);
        
    }
   }
}
