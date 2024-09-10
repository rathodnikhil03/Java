
public class GetterAndSetter {

    public static void main(String[] args) {


        detail dil = new detail();
        dil.setId(101);
        dil.setName("nikhil");

        System.out.println(dil);
    }

}

class detail {

    private String name;
    private int id;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "detail [name=" + name + ", id=" + id + "]";
    }


    

}
