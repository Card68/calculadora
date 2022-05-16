import java.util.Scanner;

public class Calculadora{

    static public void main(String[] args){
       Scanner scan=new Scanner(System.in);
       double soma, subtracao, multiplicacao, divisao;
       double n1,n2;
       int operacao;
       
       

       System.out.printf("%n Digite o primeiro numero: ");
       n1 = scan.nextDouble();
       System.out.printf("%n Digite o segundo  numero: ");
       n2 = scan.nextDouble();

       System.out.println("digite 1 Para Somar");
       System.out.println("digite 2 Para Subtrair");
       System.out.println("digite 3 Para Multiplicar");
       System.out.println("digite 4 Para Dividir");
       System.out.println("digite 5 Para Sair");
       operacao = scan.nextInt();


       
       switch(operacao){
           case 1:
                soma = n1 + n2;
                System.out.println("Soma =" + soma);
                break;
            case 2:
                subtracao = n1 - n2;
                 System.out.println("Subtração =" + subtracao);
                 break;
            case 3:
                multiplicacao = n1 * n2;
                 System.out.println("multiplicação =" + multiplicacao);
                 break;  
            case 4:
            if(n1 < n2){
                System.out.println("Erro!!" );
            }        
            else{
                divisao = n1 / n2;
                 System.out.println("divisao =" + divisao);
            }
            case 5:
            System.exit(0);

            break;
       }

    }
}