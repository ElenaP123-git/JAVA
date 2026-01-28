package programacion.Tema1.ActividadesU1Java.Matrices;

public class IntroduccionEj1 {
    static void main() {
        String [][] matriz=new String[3][4]; //me creo una matriz de 3 filas y 4 columnas
        int[][]maquina={
                {5,0,8},
                {2,10,0},
                {0,4,1}};
        IntroduccionEj1 referencia=new IntroduccionEj1();
        referencia.detectorAgotado(maquina);
    }
    //recorro la matriz maquina
    void detectorAgotado(int[][] maquina){
        for(int i=0;i<maquina.length;i++){ //primer for para la fila que fila=maquina[i]
            int[] fila=maquina[i];
            for(int b=0;b<fila.length;b++){ //segundo for para las columnas que el num de columnas es la b
                if(fila[b]==0){
                    System.out.println("Producto agotado en la fila: "+fila[i]+" y columna: "+b);
                }
            }
        }
    }
}
