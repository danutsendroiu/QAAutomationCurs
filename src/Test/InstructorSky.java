package Test;

public class InstructorSky extends Persoane{
    private String atestare;

    public InstructorSky(String name, int age, String atestare){
       super(name, age);
    }
    public void trainer(){
        System.out.println("Pot sa predau: " + atestare);
    }
}
