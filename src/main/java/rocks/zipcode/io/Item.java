package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    private Long idNum;
    private String name;
    private Double price;

    public Item() {
        this.idNum = 0L;
        this.name = "";
        this.price = 0.01;
    }

    public Item(Long id, String name, Double price) {
        idNum = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {

        return idNum;
    }

    public void setId(Long id) {
        idNum = id;
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {
        this.price = price;

    }
}
