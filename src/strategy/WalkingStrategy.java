package strategy;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Построение пешеходного маршрута из " + startPoint + " в " + endPoint + ": через парки и тротуары.");
    }

    @Override
    public int getEstimatedTimeMinutes() {
        return 60;
    }
}