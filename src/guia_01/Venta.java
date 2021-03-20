package guia_01;


/****************************************************************
 *
 * 3    Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
 *      descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
 *      total teniendo en cuenta el precio unitario y cantidad. Un método que permita
 *      imprimir por pantalla los atributos del objeto de la siguiente forma:
 *      ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
 *      a. Inicialice el objeto con los atributos necesarios
 *      b. Imprima por pantalla el objeto inicializado.
 *
 ***************************************************************/


public class Venta {

    //Atributos
    private int id ;
    private String description;
    private int cant;
    private double price;
   // private double preciofinal;

    //Constructor
    public Venta (){

    }
    //Constructor
    public Venta(int id, String description, int cant, double price){
        this.id= id;
        this.description=description;
        this.cant=cant;
        this.price=price;

    }
    //getters y setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public int getCant() {
        return cant;
    }
    public void setCant(int cant){
        this.cant=cant;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double precioFinal(){
        return this.cant * this.price;
    }

    public String muestraCompra(){
        return "ItemVentaa Id " +this.id +" | " + "Description: "+ this.description +" | "  +" Amount: " +  this.cant +" | " + "Unit Price: " + this.price+ " | " + "Total: " + precioFinal()+" | ";
    }

}
