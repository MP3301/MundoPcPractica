import com.mx.mundopc.*;


public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP",1);
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP );

        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer",1);
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonGamer );

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);

        orden1.mostrarOrden();
    }
}