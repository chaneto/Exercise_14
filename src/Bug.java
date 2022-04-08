public class Bug implements Finder{

    private String description;

    public Bug(String description) {
        this.description = description;
    }

    @Override
    public Bug find() {
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
