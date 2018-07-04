
package takehomeassignment;

/**
 *
 * @author Amith
 */
public class UndergraduateStudent extends Student{
    //private int indexNo;
    private int ALyear;
    private String shy;
    private String subject1Name;
    private String subject2Name;
    private String subject3Name;
    private String sub1Result;
    private String sub2Result;
    private String sub3Result;
    private String subject1; // subject1Name + sub1Result
    private String subject2; // subject2Name + sub2Result
    private String subject3; // subject3Name + sub3Result
    private String generalEnglish;
    private double zScore;

    
    /**
     * @return the indexNo
     */
    public int getIndexNo() {
        return this.indexNo;
    }

    /**
     * @param indexNo the indexNo to set from student table
     */
    public void setIndexNo(int indexNo) {
        this.indexNo = indexNo;
    }    
    /**
     * @return the year
     */
    public int getALYear() {
        return ALyear;
    }

    /**
     * @param year the year to set
     */
    public void setALYear(int year) {
        this.ALyear = year;
    }

    /**
     * @return the shy
     */
    public String getShy() {
        return shy;
    }

    /**
     * @param shy the shy to set
     */
    public void setShy(String shy) {
        this.shy = shy;
    }

    /**
     * @return the subject1
     */
    public String getSubject1Name() {
        return subject1Name;
    }

    /**
     * @param subject1 the subject1 to set
     */
    public void setSubject1Name(String subject1Name) {
        this.subject1Name = subject1Name;
    }

    /**
     * @return the subject2
     */
    public String getSubject2Name() {
        return subject2Name;
    }

    /**
     * @param subject2 the subject2 to set
     */
    public void setSubject2Name(String subject2Name) {
        this.subject2Name = subject2Name;
    }

    /**
     * @return the subject3
     */
    public String getSubject3Name() {
        return subject3Name;
    }

    /**
     * @param subject3 the subject3 to set
     */
    public void setSubject3Name(String subject3Name) {
        this.subject3Name = subject3Name;
    }

    /**
     * @return the generalEnglish
     */
    public String getGeneralEnglish() {
        return generalEnglish;
    }

    /**
     * @param generalEnglish the generalEnglish to set
     */
    public void setGeneralEnglish(String generalEnglish) {
        this.generalEnglish = generalEnglish;
    }

    /**
     * @return the zScore
     */
    public double getzScore() {
        return zScore;
    }

    /**
     * @param zScore the zScore to set
     */
    public void setzScore(double zScore) {
        this.zScore = zScore;
    }

    /**
     * @return the sub1Result
     */
    public String getSub1Result() {
        return sub1Result;
    }

    /**
     * @param sub1Result the sub1Result to set
     */
    public void setSub1Result(String sub1Result) {
        this.sub1Result = sub1Result;
    }

    /**
     * @return the sub2Result
     */
    public String getSub2Result() {
        return sub2Result;
    }

    /**
     * @param sub2Result the sub2Result to set
     */
    public void setSub2Result(String sub2Result) {
        this.sub2Result = sub2Result;
    }

    /**
     * @return the sub3Result
     */
    public String getSub3Result() {
        return sub3Result;
    }

    /**
     * @param sub3Result the sub3Result to set
     */
    public void setSub3Result(String sub3Result) {
        this.sub3Result = sub3Result;
    }

    /**
     * @return the subject1
     */
    public String getSubject1() {
        return subject1;
    }

    /**
     * @param subject1 the subject1 to set
     */
    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    /**
     * @return the subject2
     */
    public String getSubject2() {
        return subject2;
    }

    /**
     * @param subject2 the subject2 to set
     */
    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    /**
     * @return the subject3
     */
    public String getSubject3() {
        return subject3;
    }

    /**
     * @param subject3 the subject3 to set
     */
    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }
}
