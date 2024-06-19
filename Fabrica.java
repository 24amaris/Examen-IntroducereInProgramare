import java.util.ArrayList;

public class Fabrica {
    public static void main(String[] args) {
        
        Fabrica fabrica=new Fabrica();

        Muncitor m1=new Muncitor("Popescu" , "Ion", 3000, 5);
        Muncitor m1=new Muncitor("Ionescu" , "Ana", 4000, 3);
        Muncitor m1=new Muncitor("Georgescu" , "Vasile", 5000, 6); 
        
        private List<Angajat> angajati= new ArrayList<>();
        private List<Client> clienti= new ArrayList<>();
        private List<Act> acte= new ArrayList<>();

        public void adaugaAngajat(Angajat angajat) {
            angajati.add(angajat) ;
        }
        public void concediazaAngajat(Angajat angajat) {
            angajati.remove(angajat) ;
        }
        
        public void afiseazaClient(){
            for (Client client : client){
                System.out.println(client.getNume());
            }
        }

        
    }
}
