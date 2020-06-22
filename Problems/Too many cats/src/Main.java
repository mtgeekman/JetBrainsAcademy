class Cat {

    // write static and instance variables
    String name;
    int age;
    static int numberOfCats = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfCats += 1;
        if (numberOfCats > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {

        return numberOfCats;
    }
}