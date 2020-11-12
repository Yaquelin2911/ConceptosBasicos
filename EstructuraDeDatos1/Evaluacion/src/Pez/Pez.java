package Pez;

public class Pez {
    String Tipo_pez;
    int [][] por_nacimiento;

    public Pez() {
        Tipo_pez = Tipo_pez;
        this.por_nacimiento = por_nacimiento;
    }//constructor

    public int [][] nacimientoporaño() {
        int [][]  nacimiento=this.por_nacimiento;
        for (int x=0;x<nacimiento.length;x++){
            nacimiento[x][0]=this.por_nacimiento[x][0]*2-this.por_nacimiento[x][0]*2/10;
        }//operacion.
        return nacimiento;

    }//calculi

    public String getTipo_pez() {
        return Tipo_pez;
    }

    public void setTipo_pez(String tipo_pez) {
        Tipo_pez = tipo_pez;
    }

    public static int[][] getPor_nacimiento(double dato) {
        return por_nacimiento;
    }

    public void setPor_nacimiento(int[][] por_nacimiento) {
        this.por_nacimiento = por_nacimiento;
    }
}
