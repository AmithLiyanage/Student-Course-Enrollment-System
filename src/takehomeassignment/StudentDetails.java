/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package takehomeassignment;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Amith
 */
public class StudentDetails extends AbstractTableModel{
    private static final String[] COLUMN_NAME = {"Index No", "Name", "Full Name", "Faculty", "NIC", "Gender", "Address", "Contact No", "Email", "Year", "Batch", "Course Type"};
    private static ArrayList<Student> list;

    public StudentDetails(ArrayList<Student> stList) {
        list = stList;
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
                return list.get(rowIndex).getIndexNo();
            case 1: 
                return list.get(rowIndex).getName();
            case 2: 
                return list.get(rowIndex).getFullName();
            case 3: 
                return list.get(rowIndex).getFaculty();
            case 4: 
                return list.get(rowIndex).getNic();
            case 5: 
                return list.get(rowIndex).getGender();
            case 6: 
                return list.get(rowIndex).getAddress();
            case 7: 
                return list.get(rowIndex).getContactNo();
            case 8: 
                return list.get(rowIndex).getEmail();
            case 9: 
                return list.get(rowIndex).getYear();
            case 10: 
                return list.get(rowIndex).getBatch();
            case 11: 
                return list.get(rowIndex).getCourseType();               
            default:
                return "Error";
        }
    }
    
}
