public class Hero {

    private String name;
    private String rank;
    private int level;

    public Hero(String name, String rank, int level) {
        this.name = name;
        this.rank = rank;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    //testing the class
    public static void main(String args[]) throws Exception {
        Hero hero = new Hero("Hero", "Black Mage", 6);
        System.out.println(hero);
    }
}
