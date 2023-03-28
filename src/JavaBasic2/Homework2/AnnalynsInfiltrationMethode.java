package JavaBasic2.Homework2;

public class AnnalynsInfiltrationMethode {


    public boolean canFastAttack(boolean knightIsAwake) {
        boolean canAttack = true;
        if (canAttack == knightIsAwake) {
            System.out.println("It is time to attack!");
        } else {
            System.out.println("You cannot start the attack");

        }

        return knightIsAwake;

    }

    public boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpy = true;
        if (canSpy == knightIsAwake) {
            System.out.println("It's time to spy");
        } else if (canSpy == archerIsAwake) {
            System.out.println("It's time to spy");
        } else if (canSpy == prisonerIsAwake) {
            System.out.println("It's time to spy");
        } else {
            canSpy = false;
            System.out.println("Spying is a waste of time ");
        }

        return canSpy;
    }

    public boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonierIsAwake) {
        if (archerIsAwake == false && prisonierIsAwake == true) {
            System.out.println("The prisoner can be signalled using bird sounds!");
        } else if (archerIsAwake == false && prisonierIsAwake == false) {
            System.out.println("No one can intercept the signal!");
        } else {
            System.out.println("Attention!!!!The signals could be intercepted!");
        }

        return prisonierIsAwake;
    }

    public boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean freePrisoner = true;

        while (petDogIsPresent == true) {
            System.out.println("The dog is present");
            if (archerIsAwake == false) {
                freePrisoner = true;
                System.out.println("The prisoner is resqued");
                break;
            } else {
                freePrisoner = false;
                System.out.println("The prisoner is stil captive");
                break;
            }
        }
        while (petDogIsPresent == false) {
            System.out.println("Annalin is alone");
            if (prisonerIsAwake = true && knightIsAwake == false && archerIsAwake == false) {
                freePrisoner = true;
                System.out.println("The prisoner is resqued");
                break;
            } else {
                freePrisoner = false;
                System.out.println("The prisoner is stil captive");
                break;
            }
        }

        return freePrisoner;
    }
}
