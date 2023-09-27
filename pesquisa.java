/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediaescolar;
import java.util.Scanner;
public class pesquisa {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome,sexo,resp = null,inicio;
        int idade,qttotal,qth,qtm;
        qttotal=0;
        qth=0;
        qtm=0;
         
       
        System.out.println(" Deseja participar da pesquisa?");
        inicio = sc.next();
        
          
      while(inicio.equals("S")|inicio.equals("s")|inicio.equals("sim")|inicio.equals("Sim")){
            System.out.println("Digite Nome: ");
            nome=sc.next();            
            System.out.println("Digite Idade: ");
            idade=sc.nextInt();            
            System.out.println("Digite Sexo: ");
            sexo=sc.next();            
            System.out.println("Gostou do Produto? ");
            resp = sc.next();
       
       qttotal++;
       if(sexo.equals("M")|sexo.equals ("m")){
           qth++;
       }
       else if(sexo.equals("M")|sexo.equals ("m")){
       }
            qtm++;
        }
        
     
        System.out.println("Quantidade de homens "+qth);
        System.out.println("Quantidade de mulheres "+qtm);
        System.out.println("Quantidade de pessoas que responderam a pesquisa"+qttotal);
    }    
}