package JavaBasic3;

public class JavaClassInterface extends JavaClassInterface2 implements JavaInterface{

    @Override
    public void mamanca() {
        System.out.println("Mananca");
    }

    @Override
    public void seJoaca() {
        System.out.println("Alearga");

    }

    @Override
    public void scoateSunet() {
        System.out.println("Ham Ham");

    }

    @Override
    public void doarme() {
        System.out.println("Zzzzz");

    }

    @Override
    public void zboara() {
        System.out.println("Fly");

    }

    @Override
    public String newValue(String value) {
        return value + "This is the new value";
    }
}
