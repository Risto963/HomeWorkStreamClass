package vehicle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Ship> ships = Arrays.asList(
                new Ship("titanic","white","steam", 110),
                new Ship("Queen mary2","orange", "diesel", 18 ),
                new Ship("harmony of the seas", "orange", "diesel", 6),
                new Ship("norwegian bliss", "orange", "diesel", 3),
                new Ship("Oasis of the seas", "green", "diesel", 12)
        );
        List<Ship> sortedShipByName = ships.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());
        System.out.println("Sorted ships by name: ");
        sortedShipByName.forEach(s -> System.out.println(s.getName()));

        List<Ship> orangeShips = ships.stream()
                .filter(s -> s.getColor().equals("orange"))
                .collect(Collectors.toList());
        System.out.println("Orange ships: " + orangeShips);

        List<String> shipsNames = ships.stream()
                .map(Ship::getName)
                .collect(Collectors.toList());
        System.out.println("Ship names: " + shipsNames);
    }
}
