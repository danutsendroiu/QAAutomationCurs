package Test;

public class ElevSky extends Persoane{
    private int elevId;

    public ElevSky(String name, int age, int elevId){
        super(name, age);
        this.elevId = elevId;
    }
    public void invat(){
        System.out.println("Sunt student " + elevId);
    }
}
