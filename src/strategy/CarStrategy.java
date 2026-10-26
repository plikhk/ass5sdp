package strategy;

public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Построение маршрута на автомобиле из " + startPoint + " в " + endPoint + ": по автомагистралям с учетом пробок.");
    }

    @Override
    public int getEstimatedTimeMinutes() {
        return 25;
    }
}