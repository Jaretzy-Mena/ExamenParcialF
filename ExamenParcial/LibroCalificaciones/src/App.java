import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        System.out.println("Bienvenido al libro de calificaciones");
        System.out.println("Por favor ingrese la cantidad de estudiantes que hay en el grupo");
        int std=lector.nextInt();

        while(std<=0){
            System.out.println("Disculpe no se permiten valores menores o iguales a cero");
            System.out.println("Ingrese la cantidad de estudiantes del grupo");
            std=lector.nextInt();
        }

        int []cosito=new int[5];

        for(int i=0; i<std; i++){

            System.out.print("Nota["+(i+1)+"] = ");
            int notas=lector.nextInt();
            
            while(notas<0||notas>100){
                System.out.println("No son valido valores menores a cero ni mayores de cien");
                System.out.println("Por favor vuelva a intentarlo");
                System.out.print("Nota["+(i+1)+"] = ");
                notas=lector.nextInt();
            }

            if (notas >= 0 && notas <= 59) {
                cosito[0]++;
            } else if (notas >= 60 && notas <= 69) {
                cosito[1]++;
            } else if (notas >= 70 && notas <= 79) {
                cosito[2]++;
            } else if (notas >= 80 && notas <= 89) {
                cosito[3]++;
            } else if (notas >= 90 && notas <= 100) {
                cosito[4]++;
            }

        }

        System.out.println("Categoria(Cantidad):");
        System.out.println("Reprobados ("+cosito[0]+")");
        System.out.println("Barras: ");
        for (int i = 0; i < cosito[0]; i++) {
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.println("Reprobados ("+cosito[1]+")");
        System.out.println("Barras: ");
        for (int i = 0; i < cosito[1]; i++) {
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.println("Reprobados ("+cosito[2]+")");
        System.out.println("Barras: ");
        for (int i = 0; i < cosito[2]; i++) {
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.println("Reprobados ("+cosito[3]+")");
        System.out.println("Barras: ");
        for (int i = 0; i < cosito[3]; i++) {
            System.out.print("*");
        }
        System.out.println();
        //
        System.out.println("Reprobados ("+cosito[4]+")");
        System.out.println("Barras: ");
        for (int i = 0; i < cosito[4]; i++) {
            System.out.print("*");
        }
        System.out.println();
        //
        
        lector.close();
    }
}
