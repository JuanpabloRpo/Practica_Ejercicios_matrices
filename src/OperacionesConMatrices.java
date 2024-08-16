import java.util.Random;
import java.io.*;

public class OperacionesConMatrices {
    public OperacionesConMatrices() {
    }

    // Metodo para crear matriz
    public int[][] crearMatriz(int filas,int columnas){

        Random rm = new Random();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numeroAleatorio=rm.nextInt(-5,5);
                while (!inMatriz(numeroAleatorio,matriz)){
                    numeroAleatorio=rm.nextInt(-5,5);
                }
                matriz[i][j] = numeroAleatorio;
            }
        }

        return matriz;
    }

    // Metodo para verficar que un numero no este repetido
    private boolean inMatriz(int num, int[][] matriz){
        for (int i = 0; i<matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

    // Metodo para mostrar una matriz tipo String
    public void mostrar(String [][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }

    // Metodo para mostrar una matriz tipo double
    public void mostrar(double [][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }

    // Metodo para mostrar una matriz tipo int
    public void mostrar(int [][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }

    // Metodo para mostrar una vector tipo int
    public void mostrar(int [] vector){

        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);

            if (i<vector.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    // Metodo para mostrar una vector tipo String
    public void mostrar(String [] vector){

        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);

            if (i<vector.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }


    // Metodo para sumar todos los elementos de la matriz
    public int sumaElementosMatriz(int[][] matriz){
        int suma=0;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                suma+=matriz[i][j];
            }
        }
        return suma;
    }

    // Metodo para saber la posicion del numero menor
    public int[] posicionNumeroMenor(int[][] matriz,int[] posicionMayor){
        int menor=matriz[posicionMayor[0]][posicionMayor[1]];
        int[] posicion =new int[2];

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if (matriz[i][j]<menor) {
                    menor=matriz[i][j];
                    posicion[0]=i;
                    posicion[1]=j;
                }
            }
        }
        return posicion;
    }


    // Metodo para saber la posicion del numero mayor
    public int[] posicionNumeroMayor(int[][] matriz){
        int mayor=0;
        int[] posicion =new int[2];

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if (matriz[i][j]>mayor) {
                    mayor=matriz[i][j];
                    posicion[0]=i;
                    posicion[1]=j;
                }
            }
        }
        return posicion;
    }

    // Metodo para sumar cada fila
    public int[] sumaFilas(int [][] matriz){
        int[] sumaFila=new int[matriz.length];
        int sum=0;
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[0].length; j++){
                sum+=matriz[i][j];
            }
            sumaFila[i]=sum;
            sum=0;
        }
        return sumaFila;
    }

    // Metodo para sumar cada columna
    public int[] sumaColumnas(int [][] matriz){
        int[] sumaColumna=new int[matriz[0].length];
        int sum=0;
        for (int i=0; i < matriz[0].length; i++){
            for (int j=0; j < matriz.length; j++){
                sum+=matriz[j][i];
            }
            sumaColumna[i]=sum;
            sum=0;
        }
        return sumaColumna;
    }

    // Metodo para saber la posicion de la fila con mayor suma
    public int posicionFilaMayorSuma(int [] sumaFila){
        int mayor=0;
        int indice=0;
        for (int i=0;i<sumaFila.length;i++){
            if(sumaFila[i]>=mayor){
                mayor=sumaFila[i];
                indice=i;
            }
        }
        return indice;
    }

    // Metodo para saber la posicion de la columna con mayor suma
    public int posicionColumnaMayorSuma(int [] sumaColumna){
        int mayor=0;
        int indice=0;
        for (int i=0;i<sumaColumna.length;i++){
            if(sumaColumna[i]>=mayor){
                mayor=sumaColumna[i];
                indice=i;
            }
        }
        return indice;
    }

    //Metodo para almacenar toda la matriz en un vector
    public int[] matrizEnVector(int[][] matriz){
        int[] vector =new int[matriz.length*matriz[0].length];
        int indice=0;
        for (int[] fila:matriz){
            for (int dato:fila){
                vector[indice]=dato;
                indice++;
            }
        }
        return vector;
    }

    // Metodo para almacenar la suma de las filas y las columnas
    public int[] vectorSumaFilasYColumnas(int[] vectorSumaFilas,int[] vectorSumaColumnas ){

        int[] vectorSumaFilaYColumna=new int[vectorSumaFilas.length+vectorSumaColumnas.length];
        for (int i=0;i<vectorSumaFilas.length;i++){
            vectorSumaFilaYColumna[i]=vectorSumaFilas[i];
        }

        for (int i=vectorSumaFilas.length;i<vectorSumaColumnas.length+vectorSumaFilas.length;i++){
            vectorSumaFilaYColumna[i]=vectorSumaColumnas[i-vectorSumaFilas.length];
        }

        return vectorSumaFilaYColumna;
    }

    // Metodo para verificar cuantos numeros son: Ceros, Positivos, Negativos
    public int[] tipoDeNumeros(int[][] matriz){
        int[] vectorConTipos=new int[3];
        int contadorCeros=0;
        int contadorPositivos=0;
        int contadorNegativos=0;

        for (int[] fila:matriz){
            for (int dato:fila){
                if (dato==0){
                    contadorCeros++;
                } else if (dato>0) {
                    contadorPositivos++;

                }else {
                    contadorNegativos++;
                }
            }
        }
        vectorConTipos[0]=contadorCeros;
        vectorConTipos[1]=contadorPositivos;
        vectorConTipos[2]=contadorNegativos;

        return vectorConTipos;
    }

    // Creacion de matriz tipo cadena
    public BufferedReader cp=new BufferedReader(new InputStreamReader(System.in));
    //
    public String[][] matrizTipoCadena(int filas,int columnas) throws IOException{

        String[][] matriz=new String[filas][columnas];
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.println("Ingerse el dato: ");
                matriz[i][j]=cp.readLine();

            }
        }
        return matriz;
    }

    // Metodo para saber la longitud de cada elemento dentro de la matriz
    public int[][] matrizConCadaLongitud(String[][] matrizTipoCadena){

        int[][] matrizLongitudes=new int[matrizTipoCadena.length][matrizTipoCadena[0].length];
        for (int i=0;i<matrizTipoCadena.length;i++){
            for (int j=0;j<matrizTipoCadena[0].length;j++){
                matrizLongitudes[i][j] = matrizTipoCadena[i][j].length();
            }
        }
        return matrizLongitudes;
    }

    // Metodo para obtener la columna del numero mayor
    public int[] columnaNumeroMayor(int[][] matriz,int posicionColumna){

        int[] columnaMayor=new int[matriz[0].length];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                if (j==posicionColumna){
                    columnaMayor[i]=matriz[i][j];
                }

            }
        }
        return  columnaMayor;
    }

    // Metodo para obtener la fila del numero mayor
    public int[] filaNumeroMayor(int[][] matriz,int posicionFila){

        int[] FilaMayor=new int[matriz.length];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                if (i==posicionFila){
                    FilaMayor[j]=matriz[i][j];
                }

            }
        }
        return  FilaMayor;

    }

    // Metodo para crear matriz con estudiantes y sus calificaciones
    public double[][] estudiantesConSusCalificaciones(int cantidadEstudiantes) throws IOException{
        double [][] matrizEstudiantes=new double[cantidadEstudiantes][5];
        for (int i=0;i<cantidadEstudiantes;i++){
            for (int j=0;j<5;j++){
                System.out.println("Ingrese la nota #"+(j+1)+" para el estudiante #"+(i+1));
                double nota=Double.parseDouble(cp.readLine());
                matrizEstudiantes[i][j]=nota;
            }
        }

        return matrizEstudiantes;
    }

    // Metodo para saber el promedio de cada estudiante
    public String[] promedioEstudiantes(double[][] matrizEstudiantes){
        String[] promedioEstudiante=new String[matrizEstudiantes.length];

        for (int i=0;i<matrizEstudiantes.length;i++){
            double prom=0;
            for (int j=0;j<matrizEstudiantes[0].length;j++){
                prom+=matrizEstudiantes[i][j];
            }
            prom/=matrizEstudiantes[0].length;
            promedioEstudiante[i]= String.format("%.2f", prom);
        }
        return promedioEstudiante;
    }

    //





}
