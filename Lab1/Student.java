
public class Student {
    public String nume;
    public String prenume;
    public long CNP;
    public int nr_matricol;
    public String specializare;

    public Student(String nume, String prenume, long CNP, int nr_matricol, String specializare){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.nr_matricol = nr_matricol;
        this.specializare = specializare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public long getCNP() {
        return CNP;
    }

    public void setCNP(long CNP) {
        this.CNP = CNP;
    }

    public int getNrMatricol() {
        return nr_matricol;
    }

    public void setNrMatricol(int nr_matricol) {
        this.nr_matricol = nr_matricol;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public static void main(String[] args) {

        Student student = new Student("Popescu", "Vlad", 508080625563L, 45467, "Informatica");

        System.out.println("Nume: " + student.getNume());
        System.out.println("Prenume: " + student.getPrenume());
        System.out.println("CNP: " + student.getCNP());
        System.out.println("Nr_matricol: " + student.getNrMatricol());
        System.out.println("Specializare: " + student.getSpecializare());

        student.setSpecializare("Inginerie Medicala");
        System.out.println("Specializare actualizata: " + student.getSpecializare());
    }
}
