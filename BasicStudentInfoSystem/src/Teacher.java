public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher (String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Teacher's name \t\t: " + this.name);
        System.out.println("Teacher's no \t\t: " + this.mpno);
        System.out.println("Teacher's branch \t: " + this.branch);
    }
}
