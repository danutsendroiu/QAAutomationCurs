package JavaBasic3;

public class Caine extends Animal {
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

    public void aduBatul(){
        System.out.println("Cainele aduce batul");
    }

    @Override
    public void scoateSunet() {
        System.out.println("Ham Ham");;
    }
}
