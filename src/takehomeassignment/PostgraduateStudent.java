
package takehomeassignment;

/**
 *
 * @author Amith
 */
public class PostgraduateStudent extends Student {
    //private int indexNo;
    private String qualificationType;
    private String institute;
    private int yearOfCompletion;
    private String status;

    /**
     * @return the qualificationType
     */
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * @param qualificationType the qualificationType to set
     */
    public void setQualificationType(String qualificationType) {
        this.qualificationType = qualificationType;
    }

    /**
     * @return the institute
     */
    public String getInstitute() {
        return institute;
    }

    /**
     * @param institute the institute to set
     */
    public void setInstitute(String institute) {
        this.institute = institute;
    }

    /**
     * @return the yearOfCompletion
     */
    public int getYearOfCompletion() {
        return yearOfCompletion;
    }

    /**
     * @param yearOfCompletion the yearOfCompletion to set
     */
    public void setYearOfCompletion(int yearOfCompletion) {
        this.yearOfCompletion = yearOfCompletion;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the indexNo
     */
    public int getIndexNo() {
        return this.indexNo;
    }

    /**
     * @param indexNo the indexNo to set
     */
    public void setIndexNo(int indexNo) {
        this.indexNo = indexNo;
    }
}
