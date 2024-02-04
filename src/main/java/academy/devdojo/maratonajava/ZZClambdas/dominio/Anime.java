package academy.devdojo.maratonajava.ZZClambdas.dominio;

public class Anime {
    private String name;
    private Integer episodes;

    public Anime(String name, Integer episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getEpisodes() {
        return episodes;
    }
}
