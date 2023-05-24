package home.work.praka8.visitor;

public interface Visitor {
    void visit(XmlElement xe);

    void visit(JsonElement je);
}
