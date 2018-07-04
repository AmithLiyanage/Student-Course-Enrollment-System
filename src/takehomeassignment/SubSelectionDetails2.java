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
public class SubSelectionDetails2 extends AbstractTableModel {

    private static final String[] COLUMN_NAME = {"Subject ID", "Subject Name", "Fees", "Credit"};
    private static ArrayList<Subject> list;

    public SubSelectionDetails2(ArrayList<Subject> SubSelecetionList) {
        list = SubSelecetionList;
    }

    public String getColumnName(int columnIndex) {
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
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getSubjectID();
            case 1:
                return list.get(rowIndex).getSubjectName();
            case 2:
                return list.get(rowIndex).getFees();
            case 3:
                return list.get(rowIndex).getCredit();
            default:
                return "Error";
        }
    }
}
