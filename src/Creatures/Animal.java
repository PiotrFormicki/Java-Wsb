package Creatures;

public class Animal {
    public static final Double DEFAULT_DOG_WEIGHT = 6.0;
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.0;
    private static final Double DEFAULT_HORSE_WEIGHT = 800.0;
    public final String species;
    public String name;
    private Double weight;
    private Boolean isAlive;

    public double getWeight() {
        return this.weight;
    }

    public boolean getAlive() {
        return this.isAlive;
    }

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "equus" -> this.weight = DEFAULT_HORSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;

        }
    }

    public Animal(String species, double weight) {
        this.isAlive = true;
        this.species = species;
        this.weight = weight;

    }


    public void checkIfItIsAlive() {
        if (isAlive) {
            System.out.println("Jasne, że żyje");
        } else {
            System.out.println("no niestety, za późno");
            ;
        }
    }

    public void feed(Double dose) {
        if (isAlive == true) {
            weight += dose * 0.3;
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("Dead");
        }


    }

   public void takeForWalk(Double distance) {
        if (!isAlive) {
            System.out.println("Call police!");
        } else {
            weight -= distance * 0.1;
            if (weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("dzięki za spacer");
            }
        }
    }
}

