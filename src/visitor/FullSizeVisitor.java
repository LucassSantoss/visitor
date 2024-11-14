package visitor;

import elements.Directory;
import elements.File;
import elements.SystemElement;

public class FullSizeVisitor implements Visitor{
    private int fullSize = 0;

    @Override
    public void visit(File file) {
        fullSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        for (SystemElement element : directory.getContent()) {
            element.accept(this);
        }
    }

    public void resetFullSize() {
        fullSize = 0;
    }

    public int getFullSize(){
        return fullSize;
    }
}
