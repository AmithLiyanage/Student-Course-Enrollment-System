/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package takehomeassignment;

/**
 *
 * @author Amith
 */
public class Subject {
    
    private String subjectID;
    private String subjectName;
    private String Degree;
    private int year;
    private int semester;
    private int fees;
    private String Lecturer;
    private String Instructors;
    private String timeSchedule;
    private int noOfAssignment;
    private int credit;
    private String compulsoryType;
    private String placeLecture;
    private String placePractical;
    private String note;
    private String oldCourseID;

    /**
     * @return the subjectID
     */
    public String getSubjectID() {
        return subjectID;
    }

    /**
     * @param subjectID the subjectID to set
     */
    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    /**
     * @return the subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * @return the Degree
     */
    public String getDegree() {
        return Degree;
    }

    /**
     * @param Degree the Degree to set
     */
    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    /**
     * @return the fees
     */
    public int getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(int fees) {
        this.fees = fees;
    }

    /**
     * @return the Lecturer
     */
    public String getLecturer() {
        return Lecturer;
    }

    /**
     * @param Lecturer the Lecturer to set
     */
    public void setLecturer(String Lecturer) {
        this.Lecturer = Lecturer;
    }

    /**
     * @return the Instructors
     */
    public String getInstructors() {
        return Instructors;
    }

    /**
     * @param Instructors the Instructors to set
     */
    public void setInstructors(String Instructors) {
        this.Instructors = Instructors;
    }

    /**
     * @return the timeSchedule
     */
    public String getTimeSchedule() {
        return timeSchedule;
    }

    /**
     * @param timeSchedule the timeSchedule to set
     */
    public void setTimeSchedule(String timeSchedule) {
        this.timeSchedule = timeSchedule;
    }

    /**
     * @return the noOfAssignment
     */
    public int getNoOfAssignment() {
        return noOfAssignment;
    }

    /**
     * @param noOfAssignment the noOfAssignment to set
     */
    public void setNoOfAssignment(int noOfAssignment) {
        this.noOfAssignment = noOfAssignment;
    }

    /**
     * @return the credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * @return the noOfStudents
     */
    public String getcompulsoryType() {
        return compulsoryType;
    }

    /**
     * @param noOfStudents the noOfStudents to set
     */
    public void setcompulsoryType(String compulsoryType) {
        this.compulsoryType = compulsoryType;
    }

    /**
     * @return the placeLecture
     */
    public String getPlaceLecture() {
        return placeLecture;
    }

    /**
     * @param placeLecture the placeLecture to set
     */
    public void setPlaceLecture(String placeLecture) {
        this.placeLecture = placeLecture;
    }

    /**
     * @return the placePractical
     */
    public String getPlacePractical() {
        return placePractical;
    }

    /**
     * @param placePractical the placePractical to set
     */
    public void setPlacePractical(String placePractical) {
        this.placePractical = placePractical;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the oldCourseID
     */
    public String getOldCourseID() {
        return oldCourseID;
    }

    /**
     * @param oldCourseID the oldCourseID to set
     */
    public void setOldCourseID(String oldCourseID) {
        this.oldCourseID = oldCourseID;
    }

    /**
     * @return the year
     */
    public int getYear() {
        System.out.println("get sem"+this.year);
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
        System.out.println("set year"+this.year);
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        System.out.println("get sem"+this.semester);
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) { 
        this.semester = semester;
        System.out.println("set sem"+this.semester);
    }
    
}
