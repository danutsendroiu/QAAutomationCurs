package Test;

public class Persoane {
    private String name;

    private int age;

    public Persoane(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        InstructorSky instructorSky = new InstructorSky("Octavian",35, "intructor sky");
        instructorSky.trainer();
        ElevSky elevSky = new ElevSky("Danut", 38, 150985);
        elevSky.invat();
    }

}

