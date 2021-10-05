
package calculadora.basica;
import java.util.Scanner;
public class CalculadoraBasica {
//
    
    public static void main(String[] args) {
    Calculadora Calcular = new Calculadora();
    Scanner Entrada= new Scanner(System.in);
    double numero1 , numero2,  resultado, numeroinvertido;
    String Cadena; 
    String CadenaInvertida="";
   
    int opcion;
    do {
    System.out.println("...................................." );  
    System.out.println(" Bienvenido al Menu de Operaciones" );
    System.out.println("1.Sumar" );
    System.out.println("2.Restar" );
    System.out.println("3.Multiplicaion" );
    System.out.println("4.Division" );
    System.out.println("5.Verificaion de numero primo" );    
    System.out.println("6.Verificaion de numero palindromo" );
    System.out.println("7.Salir" );
    System.out.println("...................................." );    
    System.out.println("Digite el numero de la operacion deseada:" );
    
    opcion= Entrada.nextInt();
    
    switch(opcion){
            case 1:
                 System.out.println("Inserte el primer numero:" );
                  numero1 = Entrada.nextDouble();
                 System.out.println("Inserte el segundo numero:" );
                  numero2 = Entrada.nextDouble();
                 resultado = Calcular.Sumar(numero1, numero2 );
                 System.out.println("el resultado de la suma es:"  +resultado  );
                 
                 break;
                 
            case 2:
                 System.out.println("Inserte el primer numero:" );
                  numero1 = Entrada.nextDouble();
                 System.out.println("Inserte el segundo numero:" );
                 numero2 = Entrada.nextDouble();
                 resultado = Calcular.Restar(numero1, numero2);
                 System.out.println("el resultado de la resta es:"  +resultado  );
                 break;
                 
            case 3: 
                 System.out.println("Inserte el primer numero:" );
                 numero1 = Entrada.nextDouble();
                 System.out.println("Inserte el segundo numero:" );
                 numero2 = Entrada.nextDouble();
                 resultado = Calcular.Multiplicar(numero1, numero2);
                 System.out.println("el resultado de la multiplicacion es:"  +resultado  );
                 break;
            
            case 4:
                 System.out.println("Inserte el primer numero:" );
                 numero1 = Entrada.nextDouble();
                 System.out.println("Inserte el segundo numero:" );
                 numero2 = Entrada.nextDouble();
                 resultado = Calcular.Dividir(numero1, numero2);
                 System.out.println("el resultado de la division es:"  + resultado  );
                break;
            
            case 5:
                  System.out.print("Ingresa un numero: ");
                  numero1 = Entrada.nextDouble();
                  double I, contador;
                  contador = 0;
                  for(I = 1; I <= numero1; I++)
                  {
                  if((numero1 % I) == 0)
                  {
                  contador++;
                  }
                  }    
                  if(contador <= 2)
                  {
                  System.out.println("El numero es primo");
                  }else{
                  System.out.println("El numero no es primo");
                  }
                  break;   
            
            case 6:
                 System.out.print("Ingresa un numero: ");
                 numero1 = Entrada.nextDouble();
                 Cadena=numero1+"";
                 for (int i=0; i<Cadena.length(); i++){
                     CadenaInvertida=Cadena.charAt(i)+CadenaInvertida;
                 }
                 numeroinvertido=Integer.parseInt(CadenaInvertida);
                 System.out.print("original:"+numero1);
                 System.out.print("invertido:"+numeroinvertido);
                 if(numero1==numeroinvertido){
                  System.out.print("El numero es palindromo");   
                 } else {
                  System.out.print("El numero no es palindromo"); 
                 }
                 break;   
            
            case 7:
                System.out.print("Sistema concluido,Muchas gracias ");
                System.exit(0);
                break;       
    
    } if ((opcion>7)||(opcion<1))
    {
    System.out.println ("NO EXISTE LA OPCION SELECCIONADA");
    }
    }while ((opcion>4)||(opcion<1));
    System.out.println ("");
    } 
}
    

