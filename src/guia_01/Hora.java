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
    private int hora=1;
    private int min=04;
    private int seg=22;

    //Constructor
    public Hora(){

    }

    //Constructor
    public Hora(int hora,int min, int seg){
        this.hora=(hora>= 0 && hora<=24)? hora : 0;
        this.min=(min>=0 && min<=60)? min : 0;
        this.seg=(seg>=0 && seg<=60)? seg : 0;
    }

    //Getter y Setter

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        this.hora=hora;
    }

    public int getMin(){
        return min;
    }
    public void setMin(int min){
        this.min=min;
    }

    public int getSeg(){
        return seg;
    }
    public void setSeg(int seg){
        this.seg=seg;
    }

    /*
     * 1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
     * usando zero a la izquierda ejemplo 13:04:22 .
     */
    public String imprimirHora(){

       String hora2 = String.format("%02d",hora);
       String min2 = String.format("%02d",min);
       String seg2 = String.format("%02d",seg);
       return hora2 + ":"+ min2 +":"+ seg2;
    }


    /*
     *  2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
     */
    public int avanzaSegundo(){
        if(this.seg == 59){
            this.seg= 00;
        }else
        {
            this.seg= this.seg +1;
        }
        return this.seg;
    }


    /*
     *  3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
     */
    public int retrocedeSegundo(){
        if(this.seg == 00){
            this.seg= 59;
        }else
        {
            this.seg= this.seg -1;
        }
        return this.seg;
    }





}
