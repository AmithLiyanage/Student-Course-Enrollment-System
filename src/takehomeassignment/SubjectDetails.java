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
public class SubjectDetails extends AbstractTableModel{
    private static final String[] COLUMN_NAME = {"Subject ID", "Subject Name", "Degree", "Year", "Semester", "Fees", "Lecturer", "Instructor", "Time", "No of Assignment", "Credit", "Compulsory Type", "Place Lec", "Place Practical", "Note"};
    private static ArrayList<Subject> list;
    
    public SubjectDetails(ArrayList<Subject> SubjectList) {
        list = SubjectList;
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
            case 1: 
                return list.get(rowIndex).getSubjectName();
            case 2: 
                return list.get(rowIndex).getDegree();
            case 3: 
                return list.get(rowIndex).getYear();
            case 4: 
                return list.get(rowIndex).getSemester();
            case 5: 
                return list.get(rowIndex).getFees();
            case 6: 
                return list.get(rowIndex).getLecturer();
            case 7: 
                return list.get(rowIndex).getInstructors();
            case 8: 
                return list.get(rowIndex).getTimeSchedule();
            case 9: 
                return list.get(rowIndex).getNoOfAssignment();
            case 10: 
                return list.get(rowIndex).getCredit();
            case 11: 
                return list.get(rowIndex).getcompulsoryType();
            case 12: 
                return list.get(rowIndex).getPlaceLecture();
            case 13: 
                return list.get(rowIndex).getPlacePractical();
            case 14: 
                return list.get(rowIndex).getNote();
            default:
                return "Error";
        }
    }
    
}
