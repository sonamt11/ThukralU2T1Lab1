public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mercury", 3, 12);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Venus", 8, 15);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
