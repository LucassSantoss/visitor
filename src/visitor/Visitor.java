package visitor;

import elements.Directory;
import elements.File;

public interface Visitor {
    void visit(File file);

    void visit(Directory directory);
}
