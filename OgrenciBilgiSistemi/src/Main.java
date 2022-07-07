public class Main {

    public static void main(String[] args) {


        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Course mat = new Course(t1, "MAT101", "MAT","MAT");
        Course fizik = new Course(t2, "FZK101", "FZK","FZK");
        Course kimya = new Course(t3, "KMY101", "KMY","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,65,75);
        s1.addBulkOralExam(70,80,90);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(50,65,40);
        s2.addBulkOralExam(70,80,90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkOralExam(70,80,90);
        s3.isPass();

    }
}
