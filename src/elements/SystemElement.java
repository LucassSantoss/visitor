package elements;

import visitor.Visitor;

public interface SystemElement {
    void accept(Visitor visitor);
}
