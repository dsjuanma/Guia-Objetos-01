package guia_01;


/****************************************************************
 *
 * 5 Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
 *  Tenga en cuenta el rango de valores aceptados para cada uno de estos.
 *  a. Hora: 0 … 23
 *  b. Minuto: 0 … 59
 *  c. Segundo: 0 … 59
 *  Considere el siguiente comportamiento:
 *  1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
 *  usando zero a la izquierda ejemplo 13:04:22 .
 *  2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
 *  3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
 *  4. Instanciar el objeto y probar los métodos creados.
 *
 ***************************************************************/

public class Hora {

    //Atributos
    private int hora;
    private int min;
    private int seg;

    //Constructor
    public Hora() {

    }

    //Constructor
    public Hora(int hora, int min, int seg) {
        this.hora = (hora >= 0 && hora <= 24) ? hora : 0;
        this.min = (min >= 0 && min <= 60) ? min : 0;
        this.seg = (seg >= 0 && seg <= 60) ? seg : 0;
    }

    //Getter y Setter

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    /*
     * 1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
     * usando zero a la izquierda ejemplo 13:04:22 .
     */
    public String imprimirHora() {

        String hora2 = String.format("%02d", hora);
        String min2 = String.format("%02d", min);
        String seg2 = String.format("%02d", seg);
        return hora2 + ":" + min2 + ":" + seg2;
    }


    /*
     *  2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
     */
    public void avanzarHora() {
        if (this.hora == 23) {
            this.hora = 0;
        } else {
            this.hora++;
        }
    }

    public void avanzarMinuto() {
        if (this.min == 59) {
            this.min = 0;
            avanzarHora();
        } else {
            this.min++;
        }
    }

    public void avanzaSegundo() {
        if (this.seg == 59) {
            this.seg = 0;
            avanzarMinuto();
        } else {
            this.seg++;
        }
    }


    /*
     *  3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
     */
    public void retrocederHora() {
        if (this.hora == 0) {
            this.hora = 23;
        } else {
            this.hora--;
        }
    }

    public void retrocederMinuto() {
        if (this.min == 0) {
            this.min = 59;
            retrocederHora();
        } else {
            this.min--;
        }
    }

    public void retrocederSegundo() {
        if (this.seg == 0) {
            this.seg = 59;
            retrocederMinuto();
        } else {
            this.seg--;
        }
    }
}
