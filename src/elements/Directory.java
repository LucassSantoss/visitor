package elements;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements SystemElement {
    private final List<SystemElement> content;

    public Directory() {
        content = new ArrayList<>();
    }

    public void add(SystemElement element) {
        content.add(element);
    }

    public List<SystemElement> getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
