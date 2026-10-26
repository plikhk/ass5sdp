package strategy;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Построение маршрута на общественном транспорте из " + startPoint + " в " + endPoint + ": на автобусе и метро с пересадками.");
    }

    @Override
    public int getEstimatedTimeMinutes() {
        return 40;
    }
}