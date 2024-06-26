package asztalFoglaloSwing;

public class Asztal {

    private String asztalNev;
    private int asztal_id;
    private Tipus tipus;

    public Asztal(int asztal_szam, String etterem_nev, int asztal_id, Tipus tipus) {
        this.setAsztalNev(etterem_nev + "_" + asztal_szam);
        this.setAsztal_id(asztal_id);
        this.setTipus(tipus);
    }

    public Asztal(String uresAsztalNev) {
        this.asztalNev = uresAsztalNev;
    }

    public String getAsztalNev() {
        return asztalNev;
    }

    private void setAsztalNev(String asztalNev) {
        this.asztalNev = asztalNev;
    }

    public int getAsztal_id() {
        return asztal_id;
    }

    private void setAsztal_id(int asztal_id) {
        this.asztal_id = asztal_id;
    }

    public Tipus getTipus() {
        return tipus;
    }

    public void setTipus(Tipus tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return this.getAsztalNev();
    }

}
