/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package erp;
import java.util.Scanner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/*
 * @author adral
 */
    @WebService(serviceName = "Restaurant")
    public class Restaurant {
        public long id_restaurant;
        public String nom_restaurant;
        public String[] menu_restau={"foufou","ayimolou","spagheutti blanc","spagheutti rouge","pizza","burger","chawarma"};
        public Commandes comds;
        
        @WebMethod(operationName="ServiceClient")
        public void ServiceClient(){
            Scanner sc=new Scanner(System.in);
            System.out.println("-----Menu----");
            for(int i=0;i<7;i++){
                System.out.println(menu_restau[i]);
            }
            System.out.println("Que vous voulez vous Commander Monsieur...?");
            
        }
    
    }
