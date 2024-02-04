package academy.devdojo.maratonajava.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double price;

    private int quant;




    public Manga(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Manga(Long  id, String name, double price, int quant) {
        this(id, name, price);
        this.quant = quant;

    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amout=" + quant +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Manga outroManga) {
//        if (this.id < outroManga.getId()) {
//            return -1;
//        } else if (this.id.equals(outroManga.getId())) {
//            return 0;
//        } else
//            return 1;
//    }
        return this.name.compareTo(outroManga.getName());
    }
}
