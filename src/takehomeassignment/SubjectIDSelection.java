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
public class SubjectIDSelection extends AbstractTableModel{
    private static final String[] COLUMN_NAME = {"Subject ID"};
    private static ArrayList<Subject> list;
    
    public SubjectIDSelection(ArrayList<Subject> SubSelecetionList) {
        list = SubSelecetionList;
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
                return list.get(rowIndex).getSubjectID();
            default:
                return "Error";
        }
    }
}
