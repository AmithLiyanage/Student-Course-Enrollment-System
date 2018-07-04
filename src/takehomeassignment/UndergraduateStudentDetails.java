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
public class UndergraduateStudentDetails extends AbstractTableModel {

    private static final String[] COLUMN_NAME = {"Index No", "A/L Year", "Shy", "Subject 1", "Subject 2", "Subject 3", "Gen.English", "Z-Score"};
    private static ArrayList<UndergraduateStudent> list;

    public UndergraduateStudentDetails(ArrayList<UndergraduateStudent> UstList) {
        list = UstList;
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
                return list.get(rowIndex).getIndexNo();
            case 1:
                return list.get(rowIndex).getALYear();
            case 2:
                return list.get(rowIndex).getShy();
            case 3:
                return list.get(rowIndex).getSubject1();
            case 4:
                return list.get(rowIndex).getSubject2();
            case 5:
                return list.get(rowIndex).getSubject3();
            case 6:
                return list.get(rowIndex).getGeneralEnglish();
            case 7:
                return list.get(rowIndex).getzScore();
            default:
                return "Error";
        }

    }
}