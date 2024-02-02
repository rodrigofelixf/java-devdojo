package academy.devdojo.maratonajava.ZZHPadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class  AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("737-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

}
