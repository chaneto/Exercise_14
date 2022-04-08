public class main {

    public static void main(String[] args) {
        DogFinder dogFinder = new DogFinder();
        Dog dog = dogFinder.find();
        BugFinder bugFinder = new BugFinder();
        Bug bug = bugFinder.find();
        System.out.println(dog.getAge());
        System.out.println(bug.getDescription());
    }
}
