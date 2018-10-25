public class Mustang implements Horse{
    private String name;
    private int weight;
    public Mustang(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    private String getName(String name)
    {
        return this.name;
    }
    private int getWeight(int weight)
    {
        return this.weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public String toString()
    {
        return name;
    }
}
