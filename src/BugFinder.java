public class BugFinder implements Finder{
    @Override
    public Bug find() {
        return new Bug("Error");
    }
}
