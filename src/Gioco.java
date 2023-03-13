public class Gioco {
    public static void main(String[] args) {

        Eroe eroe = new Eroe();
        Licantropo licantropo = new Licantropo(true);
        Vampiro vampiro = new Vampiro();

        for (int i =0; i<3;i++) eroe.combatti();

        vampiro.azzanna();
        licantropo.azzanna();
        licantropo.azzanna();


        System.out.print(vampiro.getForza());
        System.out.print(licantropo.getForza());
        System.out.print(eroe.getForza());
    }
}