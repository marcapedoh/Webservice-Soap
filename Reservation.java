/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package erp;
import java.util.Scanner;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author adral
 */
@WebService(serviceName = "Reservation")
public class Reservation {
    
    private long id_reservation;
    public Date datedebut;
    //public String heure_debut;
    public Date date_fin;
    //public String heure_fin;
    public int nb_chambre;
    
    @WebMethod(operationName="MontantRes")
    public void MontantRes(@WebParam(name="nb_cham") int nb_chambre){
        int prix=0;
        int montant=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<nb_chambre;i++){
            System.out.println("Prix de la chambre n"+(i+1));
            prix=sc.nextInt();
            montant+=prix;
        }
        System.out.println("le cout de votre reservation s'élève à "+montant);
    }
}
