public class Student {

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    double matAverage,fizAverage,kimAverage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkOralExam(int matematik,int fizik,int kimya){
        if(matematik >= 0 && matematik <= 100){
            this.mat.oralExam = matematik;
        }
        if (fizik >= 0 && fizik <= 100){
            this.fizik.oralExam = fizik;
        }
        if(kimya >= 0 && kimya <= 100){
            this.kimya.oralExam = kimya;
        }
    }

    public void isPass() {
        if ((this.mat.note == 0 && this.mat.oralExam == 0)  || (this.fizik.note == 0 && this.fizik.oralExam == 0)
                || (this.kimya.note == 0 && this.kimya.oralExam == 0)) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {

        this.matAverage = this.mat.note * 0.8 + this.mat.oralExam * 0.2;
        this.fizAverage = this.fizik.note * 0.8 + this.fizik.oralExam * 0.2;
        this.kimAverage = this.kimya.note * 0.8 + this.kimya.oralExam * 0.2;
        this.avarage = (this.matAverage + this.fizAverage + this.kimAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü notu : " + this.mat.oralExam);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü notu : " + this.fizik.oralExam);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü notu : " + this.kimya.oralExam);
    }
}
