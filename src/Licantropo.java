public class Licantropo extends Eroe implements Mostro{
    private boolean uomo;
    protected int forzaUomo, forzaMostro;

    public Licantropo(boolean luna) {
        uomo = !luna;
        if(luna) {
            forzaMostro = 15; forzaUomo = 0;
        } else {
            forzaMostro = 0; forzaUomo = 10;
        }
    }

    public String getForza () {
        return "\nForza rimanente uomo: " + forzaUomo + "\nForza rimanente mostro: " + forzaMostro;
    }

    public void azzanna() {
        if (!uomo) forzaMostro=forzaMostro - 2;
    }

    public void combatti () {
        if (uomo) forzaUomo = forzaUomo - 3;
    }
}
