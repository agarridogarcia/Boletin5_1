
package boletin5_1;


public class Positivo {
    //atributos
    private int num1;
   //constructores
   public Positivo(){
       int n1=0;
   }
   public Positivo(int n1){
      num1=n1;
   }
   //metodos
   public void comparar(int n1){
           if(n1>0)
               System.out.println(n1 + " é positivo");
           System.out.println("Adios");
   }
    
}
