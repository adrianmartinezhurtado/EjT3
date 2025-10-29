import java.util.Scanner;

public class EjerciciosT3 {
    Scanner lectorTeclado;


    //Desarrolla un programa que pida un número al usuario
    // y determine si es positivo, negativo o cero.
    // Muestra el resultado por consola.
    public void Ejercicio2(){
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = lectorTeclado.nextInt();
        //positivo, negativo
        if (numero >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo");
        }
    }

    public void Ejercicio3(){
        //Escribe un programa que pida la nota de un examen (entre 0 y 10)
        //y determine si el alumno ha aprobado (nota mayor o igual a 5) o ha suspendido.}
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce la nota de tu examen:");
        float nota = lectorTeclado.nextFloat();
        // Aprobado o suspenso
        if (nota <= 4.99){
            System.out.println("Tu examen está suspenso.");
        } else {
            System.out.println("!Enhorabuena¡ Has aprobado");
        }
    }

    public void Ejercicio4 (){
        //Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€,
        // aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.
        Scanner lectorTeclado = new Scanner(System.in)
    }
}
