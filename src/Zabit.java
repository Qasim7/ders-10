public class Zabit extends Herbichi {
    private String rutbe;

    public Zabit(String name, String surname, int age, String rutbe, int qulluqdaOlmaMuddeti) {
        super(name, surname, age);
        this.rutbe = rutbe;
        this.qulluqdaOlmaMuddeti = qulluqdaOlmaMuddeti;
    }

    private int qulluqdaOlmaMuddeti;

    public String getRutbe() {
        return rutbe;
    }

    public void setRutbe(String rutbe) {
        this.rutbe = rutbe;
    }

    public int getQulluqdaOlmaMuddeti() {
        return qulluqdaOlmaMuddeti;
    }

    public void setQulluqdaOlmaMuddeti(int qulluqdaOlmaMuddeti) {
        this.qulluqdaOlmaMuddeti = qulluqdaOlmaMuddeti;
    }

    public Zabit(String name, String surname, int age) {
        super(name, surname, age);
    }
}
