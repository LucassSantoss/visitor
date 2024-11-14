package elements;

import visitor.Visitor;

public class File implements SystemElement {
    private int size;

    public File(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
