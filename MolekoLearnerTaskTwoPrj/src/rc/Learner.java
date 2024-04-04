package rc;

/**
 *
 * @author Motheo Moleko [ST10461408]
 */
public class Learner {
    // Attributes [ full name, subject, Assignment Mark, Test Mark, Exam Mark]
    // declaration of variables/attributes
    String fullName, subject;
    double assignMark, testMark, examMark;
    
    // Default Constructor for Learner
    public Learner(){
        this.fullName = "";
        this.subject = "";
        this.assignMark = 0.0;
        this.testMark = 0.0;
        this.examMark = 0.0;
    }
    
    // Accessor methods
    public String getFName(){
        return this.fullName;
    }
    public String getSubject(){
        return this.subject;
    }
    public double getAssignMark(){
        return this.assignMark;
    }
    public double getTestMark(){
        return this.testMark;
    }
    public double getExamMark(){
        return this.examMark;
    }
    // Mutator methods
    public void setFName(String fname) {
        this.fullName = fname;
    }
    public void setSubject(String subj) {
        this.subject = subj;
    }
    public void setAssignmentMark(double aMark) {
        this.assignMark = aMark;
    }
    public void setTestMark(double tMark){
        this.testMark = tMark;
    }
    public void setExamMark(double eMark) {
        this.examMark = eMark;
    }
}
