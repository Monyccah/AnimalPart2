public class Cat extends Animal {
    private Animal name;

    public Cat() {
        this.setName("Stormy");
    }
    protected String sounds()
    {
        return "Meows";
    }
}