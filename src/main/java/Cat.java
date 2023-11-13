public class Cat extends Animal {

    public void makeSound() {
        System.out.println("Miauv Miauv");
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }
    @Override
    public void showMood() {
        System.out.println("Spinder eller hvæser");

    }
}

