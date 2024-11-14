package elements;

import visitor.Visitor;

public interface systemElement {
    void accept(Visitor visitor);
}
