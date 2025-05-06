import java.lang.reflect.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double saldo = 0.0;

    public static boolean continuar = true;
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {


        while (continuar) {
            System.out.println("Menu de banco");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");

            System.out.println("Seleccione una opcion: ");
            String opciones = teclado.nextLine();

            switch (opciones) {

                case "1":
                    ConsultarSaldo();
                    break;
                case "2":
                    Retirar();
                    break;
                case "3":
                    Depositar();
                    break;
                case "4":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }

        }

        teclado.close();
    }

    public static void ConsultarSaldo(){

        System.out.println("El saldo de su cuenta es: " + saldo);

    }

    public static void Retirar(){

        System.out.println("Ingrese la cantidad que desea retirar: ");
        double NuevoRetiro = teclado.nextDouble();

        if(saldo < NuevoRetiro){
            System.out.println("Cantidad insuficiente para retiro");
        }else if(NuevoRetiro <=0){
            System.out.println("Ingrese una cantidad mayor a 0");
        }else{
            saldo -= NuevoRetiro;
            System.out.println("Retiro completado correctamente, Su nuevo saldo es: " + saldo);
        }
        teclado.nextLine();

    }
    public static void Depositar(){

        System.out.println("Ingrese la cantidad que desea depositar: ");
        double NuevoDeposito = teclado.nextDouble();

        if (NuevoDeposito <= 0) {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        } else {
            saldo += NuevoDeposito;  // Add the amount to the balance
            System.out.println("Deposito exitoso. Su nuevo saldo es: " + saldo);
        }
        teclado.nextLine();

    }
}