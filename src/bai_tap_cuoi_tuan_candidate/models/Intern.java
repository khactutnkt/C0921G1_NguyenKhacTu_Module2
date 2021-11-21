package bai_tap_cuoi_tuan_candidate.models;

public class Intern extends Cadidate{
    private String majors;
    private int semester;
    private String university;

//    public Intern(String majors, int semester, String university) {
//        this.majors = majors;
//        this.semester = semester;
//        this.university = university;
//    }

    public Intern(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, String majors, int semester, String university) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Intern{" +super.toString()+
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", university='" + university + '\'' +
                '}';
    }
}
