
// Супертип всех операций
public interface Visitor {
    void visit (SportCar sportCar);
    void visit (Engine engine);
    void visit (Whell whell);
}
