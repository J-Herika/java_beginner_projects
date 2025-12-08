public class StudentGrade {
    private double grade;

    StudentGrade(double grade){
        this.grade = grade;
    }

    public String getGrade(){
        return "Your Grade is: " + grade;
    }
    public String setGrade(double newGrade){
        if(newGrade > 100 || newGrade < 0 ){
            return "Error setting grade. grade must be less than 100 and upove or equal to 0.";
        }
        grade = newGrade;
        return "New grade has been set successfully.";
    }


}
