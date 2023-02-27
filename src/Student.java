public class Student {
    private double birthDate;
    private String studentName;
    private int studentAge;

    public void setBirthDate(double birthDate){
        this.birthDate = birthDate;
    }
    public double getBirthDate(){
        return getBirthDate();
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentAge(int studentAge){
        if(studentAge<=0){
            System.out.println("Возраст ученика неверный");
        }else{
        this.studentAge = studentAge;
        }
    }
    public int getStudentAge(){
        return studentAge;
    }

}
