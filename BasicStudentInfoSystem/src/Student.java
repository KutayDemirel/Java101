public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int verbal1, int verbal2, int verbal3) {
        if (note1 >= 0 && note1 <= 100)
            this.course1.note = note1;
        if (note2 >= 0 && note2 <= 100)
            this.course2.note = note2;
        if (note3 >= 0 && note3 <= 100)
            this.course3.note = note3;
        if (verbal1 >= 0 && verbal1 <= 100)
            this.course1.verbal = verbal1;
        if (verbal2 >= 0 && verbal2 <= 100)
            this.course2.verbal = verbal2;
        if (verbal3 >= 0 && verbal3 <= 100)
            this.course3.verbal = verbal3;
    }

    int calcAverage() {
        int result = (int) ((this.course1.note * 0.8) + (this.course1.verbal * 0.2)
                + (this.course2.note * 0.8) + (this.course2.verbal * 0.2)
                + (this.course3.note * 0.8) + (this.course3.verbal * 0.2)) / 3;
        return result;
    }

    void isPass() {
        if (calcAverage() > 55) {
            System.out.println("You have passed");
            this.isPass = true;
        } else {
            System.out.println("You have failed");
            this.isPass = false;
        }
        printNote();
        System.out.println("=======");
    }

    void printNote() {
        System.out.println(this.name);
        System.out.println("=============");
        System.out.println("Student number  \t\t:\"" + this.stuNo + "\"");
        System.out.println(this.course1.name + "' Result  \t:" + this.course1.note);
        System.out.println(this.course2.name + "' Result  \t\t:" + this.course2.note);
        System.out.println(this.course3.name + "'s Result  \t\t:" + this.course3.note);
        System.out.println("Your Average  :" + calcAverage());
    }
}
