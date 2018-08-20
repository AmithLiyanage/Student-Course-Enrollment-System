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
public class MarksDetails extends AbstractTableModel{
    private static final String[] COLUMN_NAME = {"Index No", "Semester", "Sub1", "Sub2", "Sub3", "Sub4", "Sub5", "Sub6", "GPA", "Email", "Send?"};
    private static ArrayList<Marks> list;
    
    public MarksDetails(ArrayList<Marks> Marklist) {
        list = Marklist;
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
                return list.get(rowIndex).getSemester();
            case 2: 
                return list.get(rowIndex).getSubject1();
            case 3: 
                return list.get(rowIndex).getSubject2();
            case 4: 
                return list.get(rowIndex).getSubject3();
            case 5: 
                return list.get(rowIndex).getSubject4();
            case 6: 
                return list.get(rowIndex).getSubject5();
            case 7: 
                return list.get(rowIndex).getSubject6();
            case 8: 
                return list.get(rowIndex).getGPA();      
            case 9: 
                return list.get(rowIndex).getEmail();  
            case 10: 
                return list.get(rowIndex).getSendOrNot();  
            default:
                return "Error";
        }
    }
    
}
