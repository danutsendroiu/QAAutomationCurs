package JavaBasic2.Homework2;

import java.util.Arrays;

public class BirdWatcherMethodes {
    private final int[] birdsPerDay;


    public BirdWatcherMethodes(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }


    public int[] getLastWeek(int[] birdLastWeek) {
        System.out.println(Arrays.toString(birdLastWeek));
//        throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        return birdLastWeek;
    }

    public int getToday(int[] birdsThisWeek) {
        int todayVisits = birdsThisWeek[birdsThisWeek.length-1];
        System.out.println(todayVisits);
//        throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        return 0;
    }

    public void incrementTodaysCount(int[] birdsThisWeek) {
        int lastIndex = birdsThisWeek.length - 1;
        birdsThisWeek[lastIndex] = birdsThisWeek[lastIndex] + 1;
        System.out.println(birdsThisWeek[lastIndex]);
//        throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds(int[] birdsThisWeek) {
        boolean check = true;

        for (int i = 0; i < birdsThisWeek.length; i++) {
            if (birdsThisWeek[i] != 0) {
                System.out.println(check);
                break;
            } else {
                System.out.println(check);
            }
        }
//        throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        return false;
    }

    public int getCountForFirstDays(int days) {
        int count = 0;
        int daysCount = Math.min(days,birdsPerDay.length);
        for (int i = 0; i < daysCount; i++) {
            count += birdsPerDay[i];

        }

//        throw new UnsupportedOperationExceptionupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        return count;
    }

    public int getBusyDays(int[] birdsThisWeek) {
        int busyDays = 0;
        for (int i = 0; i < birdsThisWeek.length; i++) {
            if (birdsThisWeek[i] >= 5) {
                busyDays++;


            }

        }

        return busyDays;
    }
}
