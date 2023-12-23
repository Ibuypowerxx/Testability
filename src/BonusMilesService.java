public class BonusMilesService {
    public int calculate(int price) {
        int result;
        int prices = 10_000; // Стоимость билета
        int miles = 20; // Стоимость одной мили
        int bonusmiles = prices / miles; //Количество бонусных миль
        result = bonusmiles;
        return result;
    }
}
