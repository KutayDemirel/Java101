public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbal;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbal = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("Teacher is designated");
        } else
            System.out.println("Teacher doesn't give this course");
    }

    void printTeacher() {
        System.out.println("Teacher's name  : " + this.teacher.name);
        System.out.println("Teacher gives \t: " + this.name);
    }

    void printTeacherInfo() {
        if (this.teacher != null)
            this.teacher.print();
    }

}

