public class Monster {
    private String name;
    private String type;
    private String description;

    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
        this.description = String.format("%s is a %s-type monster from the Neon Ark training program.", name, type);
        System.out.println("Your monster has been created.");
    }

    public String info(){
        return String.format("Name= %s\nType=%s", name, type);
    }

    public String getDescription(){
        return description;
    }

}