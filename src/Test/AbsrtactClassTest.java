package Test;

public abstract class AbsrtactClassTest {
    protected String nume;

    public AbsrtactClassTest(String nume) {
        this.nume = nume;
    }
    public void print(){
        System.out.println("numele este " + nume);
    }
     public abstract int varsta();

}
