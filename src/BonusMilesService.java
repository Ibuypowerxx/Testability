public class BonusMilesService {
    public int calculate(int price) {
        int result;
        price = 10_000; // Стоимость билета
        int mile = 20; // Стоимость одной мили
        result = price / mile;
        return result;
    }
}
