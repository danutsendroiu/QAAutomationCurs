package JavaBasic2;

public class HexagonAreaComputed {
    public static void main(String[] args) {
        HexagonAreaComputed object = new HexagonAreaComputed();
        System.out.println("The area of a hexagon is: " + object.hexagonAreaComputed(Utils.Utils.scanner().nextInt()));



    }
    public double hexagonAreaComputed(double area){
        return (6 * (area*area))/(4*Math.tan(Math.PI/6));

    }

}
