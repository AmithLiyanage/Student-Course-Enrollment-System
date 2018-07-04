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
public class LecturerDetails extends AbstractTableModel{
    private static final String[] COLUMN_NAME = {"Lec ID", "Lec Fullname", "Lec Name", "NIC", "Gender", "Address", "Qualification", "Contact No", "Email", "What Course Do"};
    private static ArrayList<Lecturer> list;
    
    public LecturerDetails(ArrayList<Lecturer> LecList) {
        list = LecList;
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
                return list.get(rowIndex).getLecID();
            case 1: 
                return list.get(rowIndex).getLecFullName();
            case 2: 
                return list.get(rowIndex).getLecName();
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
            case 9: 
                return list.get(rowIndex).getWhatCoursesDo();              
            default:
                return "Error";
        }
    }
    
}
