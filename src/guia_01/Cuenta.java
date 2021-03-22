package guia_01;

/****************************************************************
 *
 * 4   Modele el objeto que representa la cuenta de un banco, con identificador, nombre
 *     y balance. Considere los getters, setters y constructores necesarios. Tenga en
 *     cuenta los siguientes métodos.
 *     a. El método crédito que representa un depósito de dinero en la cuenta. Este
 *     método debe devolver el balance luego de la operación.
 *     b. El método débito que representa una sustracción de dinero de la cuenta.
 *     Este método debe devolver el balance luego de la operación. Si el dinero en
 *     la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
 *     pantalla un aviso.
 *     c. Un método que imprima por pantalla las características del objeto.
 *     Realice las siguientes operaciones:
 *     1. Inicialice una cuenta con un monto inicial de 15000.
 *     2. Realice una operación de crédito de 2500.
 *     3. Realice una operación de compra de 1500.
 *     4. Realice una operación de compra de 30000.
 *     5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
 *     correcto.
 *
 ***************************************************************/


public class Cuenta {

    //Atributos
    private int id;
    private String name;
    private double balance;

    //Constructor
    public Cuenta() {

    }

    public Cuenta(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     *  a. El método crédito que representa un depósito de dinero en la cuenta. Este
     *     método debe devolver el balance luego de la operación.
     */


    public double deposito(double dinero) {
        return this.balance = this.balance + dinero;
    }
    /*
     *  b. El método débito que representa una sustracción de dinero de la cuenta.
     *     Este método debe devolver el balance luego de la operación. Si el dinero en
     *     la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
     *     pantalla un aviso.
     */

    public double debito(double retiro) {
        if (this.balance >= retiro) {
            this.balance = this.balance - retiro;
        } else {
            System.out.println("Fondos insuficientes en la cuenta");
        }

        return this.balance;
    }

    /*
     * c. Un método que imprima por pantalla las características del objeto.
     *    Realice las siguientes operaciones:
     *     1. Inicialice una cuenta con un monto inicial de 15000.
     *     2. Realice una operación de crédito de 2500.
     *     3. Realice una operación de compra de 1500.
     *     4. Realice una operación de compra de 30000.
     *     5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
     *     correcto.
     */

    public String muestraCuenta() {
        return "Cuenta Nro: " + this.id + "\n" + "Nombre Usuario: " + this.name + "\n" + "Saldo: " + this.balance;
    }

}
