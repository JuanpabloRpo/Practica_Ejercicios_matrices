import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader cp=new BufferedReader(new InputStreamReader(System.in));

        OperacionesConMatrices operacion=new OperacionesConMatrices();
        String lines="-----------------------------------------------------";
        boolean enElMenu=true;
        int[][] matriz=new int[0][0];
        int opcion=-1;
        int[] vectorSumaFilas=new int [0];
        int[] vectorSumaColumnas=new int [0];
        int[] posicionMayor=new int[0];
        int[] posicionMenor=new int[0];

        while (enElMenu){
            System.out.println("\n--------- Ejercicio Matrices ---------\n");
            System.out.println("Digita el numero -1 para Salir ");
            System.out.println("Digita el numero 0 para crear una matriz ");
            System.out.println("Digita el numero 1 para Mostrar la suma de los elementos de la matriz ");
            System.out.println("Digita el numero 2 para mostrar la posicion del numero mayor y  del numero menor  ");
            System.out.println("Digita el numero 3 para mostrar la suma de cada fila y cada columna ");
            System.out.println("Digita el numero 4 para crear una matriz ");
            System.out.println("Digita el numero 5 para crear una matriz ");
            System.out.println("Digita el numero 6 para crear una matriz ");
            System.out.println("Digita el numero 7 para crear una matriz ");
            System.out.println("Digita el numero 8 para crear una matriz ");
            System.out.println("Digita el numero 9 para crear una matriz ");
            System.out.println("Digita el numero 10 para crear una matriz ");

            while (true){
                try {
                    opcion=Integer.parseInt(cp.readLine());
                    break;
                }catch (Exception e){
                    System.out.println("Dato erroneo");
                }
            }


            switch (opcion) {
                case -1:
                    enElMenu = false;
                    break;
                case 0:
                    // Crear y mostrar matriz
                    matriz = operacion.crearMatriz(3, 3);
                    operacion.mostrar(matriz);
                    break;
                case 1:
                    // Mostrar la suma de los elementos de la matriz #1
                    System.out.println("\nLa suma de todos los elementos de la matriz es: " + operacion.sumaElementosMatriz(matriz));
                    break;
                case 2:
                    // Mostrar posicion numero mayor #2
                    System.out.println("\nPosicion numero mayor");
                    posicionMayor=operacion.posicionNumeroMayor(matriz);
                    operacion.mostrar(posicionMayor);

                    // Mostrar posicion numero menor #2
                    System.out.println("\nPosicion numero menor");
                    posicionMenor=operacion.posicionNumeroMenor(matriz,posicionMayor);
                    operacion.mostrar(posicionMenor);
                    break;
                case 3:
                    // Mostrar vector sumaFilas #3
                    System.out.println("\nSuma de las filas");
                    vectorSumaFilas=operacion.sumaFilas(matriz);
                    operacion.mostrar(vectorSumaFilas);

                    // Mostrar vector sumaColumnas #3
                    System.out.println("\nSuma de las columnas");
                    vectorSumaColumnas=operacion.sumaColumnas(matriz);
                    operacion.mostrar(vectorSumaColumnas);
                    break;
                case 4:
                    // Mostrar posicion de la mayor suma en las filas #8
                    int indiceMayorSumaFila=operacion.posicionFilaMayorSuma(vectorSumaFilas);
                    System.out.println("\nLa posicion de la fila con mayor suma es: "+indiceMayorSumaFila+ " Con una suma de: "
                            + vectorSumaFilas[indiceMayorSumaFila]);

                    // Mostrar posicion de la mayor suma en las columnas #4
                    int indiceMayorSumaColumna=operacion.posicionColumnaMayorSuma(vectorSumaColumnas);
                    System.out.println("\nLa posicion de la columna con mayor suma es: "+indiceMayorSumaColumna+ " Con una suma de: "
                            + vectorSumaColumnas[indiceMayorSumaColumna]);
                    break;
                case 5:
                    // Mostrar vector con los datos de la matriz #5
                    System.out.println("\nDatos de la matriz en un vector");
                    operacion.mostrar(operacion.matrizEnVector(matriz));
                    break;
                case 6:
                    // Mostrar vector con la suma de las filas y las columnas #6
                    System.out.println("\nSuma de las filas y las columnas en un vector");
                    operacion.mostrar(operacion.vectorSumaFilasYColumnas(vectorSumaFilas,vectorSumaColumnas));
                    break;
                case 7:
                    // Mostrar vector con la cantidad de ceros, de numeros positivos y negativos #7
                    int[] cantidades=operacion.tipoDeNumeros(matriz);
                    System.out.println("\nla cantidad de ceros en la matriz es: "+cantidades[0]+" La cantidad de positivos en la matriz es: "+ cantidades[1]
                            +" La cantidad de negativos en la matriz es: "+cantidades[2]);
                    break;
                case 8:
                    // Mostrar numero mayor y su posicion #9-a
                    System.out.println("El numero mayor es: "+matriz[posicionMayor[0]][posicionMayor[1]]+" en su posicion: "+posicionMayor[0]+","+posicionMayor[1]);

                    // Mostrar numero menor y su posicion #9-b
                    System.out.println("El numero menor es: "+matriz[posicionMenor[0]][posicionMenor[1]]+" en su posicion: "+posicionMenor[0]+","+posicionMenor[1]);

                    // Mostrar la columna que contiene al numero mayor #9-c
                    int[] columnaNumeroMayor=operacion.columnaNumeroMayor(matriz,posicionMayor[1]);
                    System.out.println("La columna que contiene al numero mayor es: ");
                    operacion.mostrar(columnaNumeroMayor);

                    //Mostrar la Fila que contiene al numero mayor #9-d
                    int[] filaNumeroMayor= operacion.filaNumeroMayor(matriz,posicionMayor[0]);
                    System.out.println("La fila que contiene al numero mayor es: ");
                    operacion.mostrar(filaNumeroMayor);
                    break;
                case 9:
                    // Mostrar matris con cadena #10
                    String[][]matrizCadena=operacion.matrizTipoCadena(2,2);


                    // Mostrar matriz con su longitud #10
                    operacion.mostrar(operacion.matrizConCadaLongitud(matrizCadena));
                    operacion.mostrar(matrizCadena);

                    break;
                case 10:
                    // Crear matriz con sus estudiantes y sus notas #11
                    double[][] matrizEstudiantes= operacion.estudiantesConSusCalificaciones(3);
                    operacion.mostrar(matrizEstudiantes);

                    // Mostrar promedio estudiantes #11
                    operacion.mostrar(operacion.promedioEstudiantes(matrizEstudiantes));
                    break;
                default:
                    System.out.println("Dato erroneo");
            }


        }























    }

}