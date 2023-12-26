public class BonusMilesService {
    public int calculate(int price) {
        int mile = 20; // Стоимость одной мили
        int result;
        result = price / mile;
        return result;
    }
}
