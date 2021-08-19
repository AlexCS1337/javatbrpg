public class NPC {

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
        NPC genericNPC = new NPC("Bob", "Theif", 1);
        System.out.println(genericNPC);
    }
}
