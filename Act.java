public class Act {
    private int counter;
    private int id;

    public Act(int counter) {
        this.counter = 0;
    }

    public Act(int counter, int id) {
        this.counter = counter;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void afiseazaAct(){
        for(Act act: act){
            System.out.println(act.get());
        }
    }


}
