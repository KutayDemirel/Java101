public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Chloe", "464", "MAT");
        Teacher t2 = new Teacher("Stephan", "465", "PHY");
        Teacher t3 = new Teacher("Martha", "466", "BIO");

        // t1.print();

        Course mat = new Course("Mathematics", "101", "MAT");
        Course phy = new Course("Physics", "102", "PHY");
        Course bio = new Course("Biology", "101", "BIO");
        //  mat.addTeacher(t1);
        // mat.printTeacher();
        // phy.addTeacher(t2);
        // phy.printTeacher();
        // bio.addTeacher(t3);
        // bio.printTeacher();

        Student s1 = new Student("Richard", "123", "1", mat, phy, bio);
        s1.addBulkExamNote(100, 80, 70, 100, 100, 90);
        s1.isPass();
        Student s2 = new Student("Matthew", "124", "2", mat, phy, bio);
        s2.addBulkExamNote(92, 0, 15, 100, 100, 100);
        s2.isPass();
        Student s3 = new Student("Charles", "125", "4", mat, phy, bio);
        s3.addBulkExamNote(45, 4, 15, 12, 65, 78);
        s3.isPass();

    }


}
