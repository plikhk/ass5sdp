package context;

import strategy.RouteStrategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    // Динамическая смена стратегии во время выполнения (runtime)
    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void executeRoute(String startPoint, String endPoint) {
        if (routeStrategy == null) {
            throw new IllegalStateException("Стратегия маршрута не установлена!");
        }
        routeStrategy.buildRoute(startPoint, endPoint);
        System.out.println("Ориентировочное время в пути: " + routeStrategy.getEstimatedTimeMinutes() + " минут.\n");
    }
}