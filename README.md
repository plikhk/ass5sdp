# ass5sdp
classDiagram
    direction LR
    class RouteStrategy {
        <<interface>>
        +buildRoute(String startPoint, String endPoint)
        +getEstimatedTimeMinutes() int
    }
    class CarStrategy {
        +buildRoute(String startPoint, String endPoint)
        +getEstimatedTimeMinutes() int
    }
    class WalkingStrategy {
        +buildRoute(String startPoint, String endPoint)
        +getEstimatedTimeMinutes() int
    }
    class PublicTransportStrategy {
        +buildRoute(String startPoint, String endPoint)
        +getEstimatedTimeMinutes() int
    }
    class Navigator {
        -RouteStrategy routeStrategy
        +Navigator(RouteStrategy routeStrategy)
        +setRouteStrategy(RouteStrategy routeStrategy)
        +executeRoute(String startPoint, String endPoint)
    }
    class Main {
        +main(String[] args)$
    }

    RouteStrategy <|.. CarStrategy : implements
    RouteStrategy <|.. WalkingStrategy : implements
    RouteStrategy <|.. PublicTransportStrategy : implements
    Navigator o-- RouteStrategy : uses
    Main --> Navigator : creates & configures
    Main --> CarStrategy : instantiates
    Main --> WalkingStrategy : instantiates
    Main --> PublicTransportStrategy : instantiates
