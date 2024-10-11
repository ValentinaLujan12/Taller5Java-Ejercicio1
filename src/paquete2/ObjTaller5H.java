package paquete2;

public class ObjTaller5H {
    public static void main(String[]args){
        Moto moto = new Moto("XYZ123", "2019");
        Bus bus =new Bus("ABC345", 20);
        moto.adelantar();
        bus.arrancar();
        bus.pitar();
        moto.getVelocidad();
    }
}
