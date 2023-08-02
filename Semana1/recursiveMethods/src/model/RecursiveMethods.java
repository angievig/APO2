package model;
/**
 * Class containing the solutionf for recursive methods in the first class
 * @author angievig
 * @version 1.0
 * @since August 2023
 */
public class RecursiveMethods {
    public int factorial(int n){
        int out=0;
        if (n==0)
            out=1;
        else
            out= n * factorial (n-1);
        return out;
    }
/*
    public <tipo_salida> metodoRecursivo(<tipo_entrada> entrada){
        <tipo_salida> out=0;
        if (<entrada == parada>) //-->> caso base
            <solucion simple>
        else //--> caso recursivo
            //operaciones
            metodoRecursivo (<entrada_modificada>); //Llamado recursivo

        return out; //--> salida
    }
*/
    public int factorialIterative(int n, int acc){
        int out=0;
        if (n==0)
            out=acc;
        else{
            out= factorialIterative(n-1, n*acc);
        }
        return out;
        //return (n==1)? acc: factorialIterative(n-1, acc*n);
    }
}
