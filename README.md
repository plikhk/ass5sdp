# ass5sdp
# Assignment 5: Strategy Pattern (Navigation System)

**Student:** Alikhan Kadashov  
**Group:** SE-2524  
**Course:** Software Design Patterns (Astana IT University)  
**Academic Year:** 2026–2027  

---

## 📋 Project Overview
This project implements the **Strategy behavioral design pattern** in Java (JDK 17)[cite: 1]. As the chosen domain, we implemented a **Navigation and Route Planning system**[cite: 1, 4]. 

Instead of using messy conditional statements (`if-else` or `switch`) inside the context to determine travel modes, the application encapsulates each route-planning algorithm (car, walking, public transport) into separate classes implementing a common interface[cite: 1, 2, 4]. This allows the client to switch strategies dynamically at runtime[cite: 1, 2, 4].

---

## 🗂️ Project Structure

```text
ass5sdp/
├── src/
│   ├── strategy/
│   │   ├── RouteStrategy.java          # Common strategy interface
│   │   ├── CarStrategy.java            # Concrete strategy: Driving
│   │   ├── WalkingStrategy.java        # Concrete strategy: Walking
│   │   └── PublicTransportStrategy.java # Concrete strategy: Public Transport
│   ├── context/
│   │   └── Navigator.java              # Context class holding a strategy reference
│   └── Main.java                       # Client class demonstrating runtime switching
└── README.md                           # Project documentation

⚙️ How to Build and Run
Prerequisites: Make sure you have Java JDK 17 or higher installed, along with an IDE like IntelliJ IDEA.

Clone the repository:

Bash
git clone [https://github.com/plikhk/ass5sdp.git](https://github.com/plikhk/ass5sdp.git)
cd ass5sdp
Open the project in your IDE (ensure src is marked as the Sources Root).

Run the application:

Open src/Main.java.

Click the Run button (Shift + F10 in IntelliJ IDEA).
