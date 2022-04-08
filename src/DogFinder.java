public class DogFinder implements Finder{

    @Override
    public Dog find() {
        return new Dog(3);
    }
}
