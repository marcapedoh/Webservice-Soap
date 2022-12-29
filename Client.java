/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package erp;
//import java.util.List;
//import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Client")
public class Client {

    private long id_client;
    public String nom_client;
    public String prenom;
    public String email;
    public Reservation res;
    public Commandes comd;
    
    @WebMethod(operationName="FaireUneReservation")
    public void FaireUneReservation() throws Exception{
        Scanner sc=new Scanner(System.in);
        String str,str1,heuredebut;
        if(res.nb_chambre !=0){
            System.out.println("Reservation effectué");
        }else{
            System.out.println("pas de reservation pour le moment");
            System.out.println("----------------------------------");
            System.out.println("Reservation");
            System.out.println("Entrez  la date de debut de reservation au format date jj/mm/aaaa");
            str=sc.nextLine();
            Date datedebut =new SimpleDateFormat("jj/mm/aaaa").parse(str);
            res.datedebut=datedebut;
            System.out.println("Entrez  la date de fin de reservation au format date jj/mm/aaaa");
            str1=sc.nextLine();
            Date datefin =new SimpleDateFormat("jj/mm/aaaa").parse(str);
            res.date_fin=datefin;
            System.out.println("Entrez  le nombre de chambre à reserver:");
            res.nb_chambre=sc.nextInt();
            Reservation r1=new Reservation();
            r1.datedebut=res.datedebut;
            r1.date_fin=res.date_fin;
           
            /*System.out.println("Entrez l'heure de debut de reservation au format date hh/mm/ss");
            heuredebut=sc.nextLine();
            res.heure_debut=Time.valueOf(heuredebut);*/
        }
          
    }
    @WebMethod(operationName="AjouterReservation")
        public void AjouterReservation() throws Exception{
            Scanner sc=new Scanner(System.in);
            String str,str1,heuredebut,rep;
           while(true){
            if(res.nb_chambre !=0){
                System.out.println("Reservation effectué");
            }else{
                System.out.println("pas de reservation pour le moment");
                System.out.println("----------------------------------");
                System.out.println("Reservation");
                System.out.println("Entrez  la date de debut de reservation au format date jj/mm/aaaa");
                str=sc.nextLine();
                Date datedebut =new SimpleDateFormat("jj/mm/aaaa").parse(str);
                res.datedebut=datedebut;
                System.out.println("Entrez  la date de fin de reservation au format date jj/mm/aaaa");
                str1=sc.nextLine();
                Date datefin =new SimpleDateFormat("jj/mm/aaaa").parse(str);
                res.date_fin=datefin;
                /*System.out.println("Entrez l'heure de debut de reservation au format date hh/mm/ss");
                heuredebut=sc.nextLine();
                res.heure_debut=Time.valueOf(heuredebut);*/
                //List l1=new ArrayList();
                

               }
            System.out.println("Aimeriez-vous faire une nouvelle reservation: O/N");
            rep=sc.next();
            if(rep=="N"){
                break;
            }
            
            }
        }
        @WebMethod(operationName="AnnulerReservation")
        public void AnnulerReservation(@WebParam(name="id") long id_client){
            //je penses que la bd doit intervenir 
            
            
        }
        
        @WebMethod(operationName="CommanderUnPlat")
        public void CommanderUnPlat(@WebParam(name="plat_nom") String nom){
            System.out.println("Vous avez commandez un plat de "+nom);
            //pour un les infos concernant le prix il y a tout dans la Bd
            
        }
        @WebMethod(operationName="AnnulerCommande")
        public void AnnulerCommande(@WebParam(name="identifiant") long id_command){
            //encore une fois apres la connection aek la bd on fera ça
            
        }
        
        
}
