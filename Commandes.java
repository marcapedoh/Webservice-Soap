/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package erp;
import java.util.Scanner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author adral
 */
@WebService(serviceName = "Commandes")
public class Commandes {

   public long id_command;
   public int nb_plat;
   
   @WebMethod(operationName="MontantCommandes")
   public void MontantCommandes(@WebParam(name="nb_plats") int plats){
      Scanner sc=new Scanner(System.in);
      double Montant=0;
      double prix=0;
      nb_plat=plats;
      for(int i=0;i<nb_plat;i++){
          System.out.println("Prix du produit N"+(i+1));
          prix=sc.nextDouble();
          Montant+=prix;
      }
      System.out.println("Vous avez commandé: "+nb_plat+" plats dont le coup total s'élève à: "+Montant);
   }
   
   public static void main(String args[]){
       Commandes c1=new Commandes();
       c1.MontantCommandes(5);
   }
   
}
