public class Angajat {

    public String nume;
    public String prenume;
    public int salariul;
    public int ani;

    public Angajat(String nume, String prenume, int salariul, int ani) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariul = salariul;
        this.ani = ani;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getSalariul() {
        return salariul;
    }

    public int calculSalariu() {
        return salariul + (salariul * 0.10 * ani);
    }

    public String getNumeComplet() {
        return nume + " " + prenume;
    }
}
