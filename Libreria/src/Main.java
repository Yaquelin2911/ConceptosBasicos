import Conversiones.Cconversion;


public class Main {
    public static void main(String[] args) {
        Cconversion conversion=new Cconversion();
        String res=conversion.binario(2);
        System.out.println(res);
        res=conversion.hex(160);
        System.out.println(res);
    }
}
