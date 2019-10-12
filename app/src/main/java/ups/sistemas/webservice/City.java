package ups.sistemas.webservice;

public class City {
    private int id;
    private String name;
    private long habitantes;

    public City() {}
    public City(int id, String name, long habitantes) {
        this.id = id;
        this.name = name;
        this.habitantes = habitantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(long habitantes) {
        this.habitantes = habitantes;
    }
}
