package strategy;

public interface RouteStrategy {
    void buildRoute(String startPoint, String endPoint);
    int getEstimatedTimeMinutes();
}