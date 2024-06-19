public class Client {

    public String nume;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

     Client client1 = new Client("SC Exemplu1 SRL");
     Client client2 = new Client("SC Exemplu2 SRL");
     fabrica.adaugaClient(client1);
     fabrica.adaugaClient(client2);

     fabrica.afiseazaClienti();

}
