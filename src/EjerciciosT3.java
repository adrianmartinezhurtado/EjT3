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
        lectorTeclado.close();
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
        lectorTeclado.close();
    }

    public void Ejercicio4 (){
        //Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€,
        // aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Indica el importe de tu compra:");
        double importe = lectorTeclado.nextDouble();
        //descuento
        if (importe >= 100){
            double descuento = importe *0.1;
            double descuentoFinal = importe - descuento;
            System.out.println("Importe original:"+importe+"€");
            System.out.println("Descuento aplicado:"+descuento+"€");
            System.out.println("Importe final:"+descuentoFinal+"€");
        } else {
            System.out.println("No superas los 100€, no tienes descuento");
        }
        lectorTeclado.close();
    }

    public void Ejercicio6(){
        //Escribe un programa que pida la edad del usuario y determine
        // si puede acceder a contenido para mayore de 16 años.
        // Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = lectorTeclado.nextInt();
        if (edad >= 16){
            System.out.println("Acceso permitido");
        } else if (edad<=15) {
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        }
        lectorTeclado.close();
    }

    public void Ejercicio7(){
        //Crea un programa que pida una nota numérica (0-10) y determine la calificación: 
        // Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10). hg
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        double nota = lectorTeclado.nextDouble();
        if (nota < 5){
            System.out.println("Suspenso");
        } else if (nota < 7) {
            System.out.println("Aprobado");
        } else if (nota <9) {
            System.out.println("Notable");
        } else if (nota >9) {
            System.out.println("Sobresaliente");
        }
    }
}
