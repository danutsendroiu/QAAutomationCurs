package JavaBasic2.Homework2;

public class BirdWatcherMain {
    public static void main(String[] args) {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        int[] birdsThisWeek = {2, 5, 0, 7, 4, 1};
        BirdWatcherMethodes object = new BirdWatcherMethodes(birdsThisWeek);
        System.out.print("Check how many birds visited the garden last week: ");
        object.getLastWeek(birdsLastWeek);
        System.out.print("Check how many birds visited the garden today: ");
        object.getToday(birdsThisWeek);
        System.out.print("Increse the number of birds that visited the garden today wint one: ");
        object.incrementTodaysCount(birdsThisWeek);
        System.out.print("Check if there is a day when no bird visited the garden: ");
        object.hasDayWithoutBirds(birdsThisWeek);
        System.out.println("The sum of the birds that visited the garden in the first 4 days: " + object.getCountForFirstDays(4));
        System.out.println("The number of days where more than five birds visited the garden is: " + object.getBusyDays(birdsThisWeek));

    }
}
