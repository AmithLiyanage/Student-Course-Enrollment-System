/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package takehomeassignment;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class InstructorDetails extends AbstractTableModel{
    private static final String[] COLUMN_NAME = {"Ins ID", "Ins Fullname", "Ins Name", "NIC", "Gender", "Address", "Qualification", "Contact No", "Email"};
    private static ArrayList<Instructor> list;
    
    public InstructorDetails(ArrayList<Instructor> InsList) {
        list = InsList;
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAME[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAME.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: 
                return list.get(rowIndex).getInsID();
            case 1: 
                return list.get(rowIndex).getInsFullName();
            case 2: 
                return list.get(rowIndex).getInsName();
            case 3: 
                return list.get(rowIndex).getNic();
            case 4: 
                return list.get(rowIndex).getGender();
            case 5: 
                return list.get(rowIndex).getAddress();
            case 6: 
                return list.get(rowIndex).getQualification();
            case 7: 
                return list.get(rowIndex).getContactNo();
            case 8: 
                return list.get(rowIndex).getEmail();              
            default:
                return "Error";
        }
    }
    
}
