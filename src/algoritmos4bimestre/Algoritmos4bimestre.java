package algoritmos4bimestre;

public class Algoritmos4bimestre {
    
    public static void quadrado(double n){
    
        double r = n * n;
        
    }
    
    public static double metade(double v){
        
        double r = v / 2;
        return r;
        
    }
    
    public static void main(String[] args) {
       
        //Calculando a raiz quadrada
        double raiz;
        raiz =  Math.sqrt(15);
        
        System.out.println("A raiz quadrade de 15 é: "+raiz);
        
        Algoritmos4bimestre.quadrado(15);
        
        double result;
        result = metade(15);
        
    }
    
}
