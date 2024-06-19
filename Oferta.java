public class Oferta extends Act {

    private int valoareTotala;
    private Client client;

    public Oferta(valoareTotala, Client client ) {
        this.valoareTotala = valoareTotala;
        this.client = client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String getInfo() {
        return "Oferta: " + Id() + ", Client: " + getNume() + ", Valoare: " + valoareTotala;
    }

}
