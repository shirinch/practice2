public class Course {
    private String courseName;
    private int courseNumber;
    private String teacherName;
    private double startDate;
    private double finishDate;
    private Student[]students;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName (){
        return courseName;
    }
    public void setCourseNumber(int courseNumber){
        this.courseNumber = courseNumber;
    }
    public int getCourseNumber(){
        return courseNumber;
    }
    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setStartDate(double startDate){
        this.startDate = startDate;
    }
    public double getStartDate(){
        return startDate;
    }
    public void setFinishDate(double finishDate){
        this.finishDate = finishDate;
    }
    public double getFinishDate(){
        return finishDate;
    }
    public void setStudents(Student[] students){
        this.students = students;
    }
    public Student[] getStudents(){
        return students;
    }
}
