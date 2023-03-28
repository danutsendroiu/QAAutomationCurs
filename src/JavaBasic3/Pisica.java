package JavaBasic3;

public class Pisica extends Animal {

    private String nume;
    private int varsta;

    public String getNume() {
        return nume;
    }

    public void setNume() {
        this.nume = Valori.randomString();
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta() {
        this.varsta = Valori.randomInt();
    }

    public void seJoaca(){
        System.out.println("Pisica se joaca!");
    }
    @Override
    public void scoateSunet() {
        System.out.println("Miau Miau");
    }

}
