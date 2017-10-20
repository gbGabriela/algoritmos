package funcoes;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        
        Random r = new Random();
        
        int n = r.nextInt(60);
        
        System.out.println(n);
        
    }
    
/*1. Crie uma função para pedir um número inteiro ao usuário. Toda vez que você 
precisar de um número informado pelo usuário, utilize ela. Ela não tem parâmetro
e o retorno é o valor digitado pelo usuário.*/

    public static int numeroInteiro(){
    
        int n = 0;
        
        System.out.println("Insira um número inteiro:");
        
        return n;
        
    }
    
    /*2. Faça uma função para gerar números aleatórios. Esta função deve receber
    um número inteiro como limite de valor e retornar um número entre 1 e esse 
    limite. Assim, toda vez que você precisar de um número qualquer pode usar a 
    função do exercício anterior ou a deste.*/
    
    public static Random numerosAleatorios(){
        
        Scanner e = new Scanner(System.in);
        
        Random r = new Random();
        
        System.out.println("Insira um número de limite máximo: ");
        int l = e.nextInt();
        
        int n = r.nextInt(l);
        
        System.out.println(n);
        
        return r;
        
    }
    
    /*3.Faça uma função que receba um número inteiro e imprima o mês correspondente
    ao número. Por exemplo, 2 corresponde à “fevereiro”. A função deve mostrar uma
    mensagem de erro caso o número recebido não faça sentido.  Dica: verifique no
    texto o tipo do retorno e o tipo do parâmetro. Em funções eles podem ser iguais
    ou diferentes, não tem problema.*/
    
    public static String mes(int n){
    
        Scanner e = new Scanner(System.in);
        
        String mes;
        
        System.out.println("Insira um número inteiro: ");
        n = e.nextInt();
        
        if(n==1){
            
            mes = "Janeiro";
            
        }else if(n==2){
            
            mes = "Fevereiro";
            
        }else if(n==3){
            
            mes = "Março";
            
        }else if(n==4){
            
            mes = "Abril";
            
        }else if(n==5){
            
            mes = "Maio";
            
        }else if(n==6){
            
            mes = "Junho";
            
        }else if(n==7){
            
            mes = "Julho";
            
        }else if(n==8){
            
            mes = "Agosto";
            
        }else if(n==9){
            
            mes = "Setembro";
            
        }else if(n==10){
            
            mes = "Outubro";
            
        }else if(n==11){
            
            mes = "Novembro";
            
        }else if(n==12){
            
            mes = "Dezembro";
            
        }else{
        
            mes = "NÚMERO INVÁLIDO, esse mês não existe!";
            
        }
        
        return mes;
        
    }
    
    /*Desafio: Faça um programa para calcular o Fatorial de um número. Para o 
    cálculo do fatorial, sabemos que n! depende de (n-1)!; este por sua vez depende
    de (n-2)!; e, assim por diante, até que n seja 1, quando então tem-se que fatorial
    de 1 é igual a 1 mesmo. Utilize uma função que recebe como parâmetro de entrada o
    número a ser calculado o fatorial, do tipo inteiro, e retorna o fatorial deste número,
    também do tipo inteiro. (Não utilize laço de repetição)*/
   
    public static int fatorial(int f){
        
    Scanner e = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        f = e.nextInt();
        
        fatorialFatorial(int fa);
        
        return f;
        
    
          
    }
    
}
