import context.Navigator;
import strategy.CarStrategy;
import strategy.PublicTransportStrategy;
import strategy.WalkingStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация паттерна Стратегия (Navigation) ===\n");

        // Клиент выбирает начальную стратегию (Автомобиль)
        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println("1. Выбрана стратегия: Автомобиль");
        navigator.executeRoute("Университет AITU", "ТРЦ Mega Silk Way");

        // Динамическое переключение стратегии на общественный транспорт в рантайме
        System.out.println("2. Смена стратегии на рантайме: Общественный транспорт");
        navigator.setRouteStrategy(new PublicTransportStrategy());
        navigator.executeRoute("Университет AITU", "ТРЦ Mega Silk Way");

        // Динамическое переключение стратегии на пешеходную
        System.out.println("3. Смена стратегии на рантайме: Пешком");
        navigator.setRouteStrategy(new WalkingStrategy());
        navigator.executeRoute("Университет AITU", "ТРЦ Mega Silk Way");
    }
}