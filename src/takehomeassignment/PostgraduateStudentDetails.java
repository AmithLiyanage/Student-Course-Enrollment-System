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
public class PostgraduateStudentDetails extends AbstractTableModel{

    private static final String[] COLUMN_NAME = {"Index No", "Qualifcation Type", "Institute", "Year of Completion", "Status"};
    private static ArrayList<PostgraduateStudent> list;
    
    public PostgraduateStudentDetails(ArrayList<PostgraduateStudent> PstList){
        list = PstList;
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
                return list.get(rowIndex).getQualificationType();
            case 2: 
                return list.get(rowIndex).getInstitute();
            case 3: 
                return list.get(rowIndex).getYearOfCompletion();
            case 4: 
                return list.get(rowIndex).getStatus();              
            default:
                return "Error";
        }
    }
    
}
