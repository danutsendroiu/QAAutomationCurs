package JavaBasic3;

public class RunnerAnimal {
    public static void main(String[] args) {
        Caine caine = new Caine();
        Pisica pisica = new Pisica();

        caine.setNume();
        System.out.println(caine.getNume());
        caine.setVarsta();
        System.out.println(caine.getVarsta());
        caine.aduBatul();
        caine.scoateSunet();
        caine.mananca();
        caine.alearga();
        System.out.println("______________________________________________________________");
        pisica.setNume();
        System.out.println(pisica.getNume());
        pisica.setVarsta();
        System.out.println(pisica.getVarsta());
        pisica.seJoaca();
        pisica.scoateSunet();
        pisica.mananca();
        pisica.alearga();

        JavaClassInterface object = new JavaClassInterface();
        object.seJoaca();
        object.mamanca();
        object.scoateSunet();
        object.doarme();

        object.zboara();
        System.out.println(object.newValue("255: "));
        object.nume();
        System.out.println("Varsta este: " + object.varsta(5));


    }
}
