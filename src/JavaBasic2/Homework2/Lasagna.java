package JavaBasic2.Homework2;

public class Lasagna {

   int expectedMinutesInOven = 40;
   int minutePerLayer = 2;

   public int expectedMinutesInOven (){
       return expectedMinutesInOven;
   }
   public int remainingMinutesInOven(int elapsedMin){
       return expectedMinutesInOven - elapsedMin;
   }
   public int preparationTimeInMinutes(int numberOfLayers){
       return numberOfLayers*minutePerLayer;
   }
   public int totalTimeInMinutes(int numbersOfLayers, int elapsedMin ){
       return preparationTimeInMinutes(numbersOfLayers) + remainingMinutesInOven(elapsedMin);
   }

}
