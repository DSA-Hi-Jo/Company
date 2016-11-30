package Company;

/**
 * Created by hicham.az on 30/11/2016.
 */
public class Departamento {

    private String description;
    private String name;

    public Departamento(String name,String description){
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
