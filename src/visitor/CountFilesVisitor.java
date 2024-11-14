package visitor;

import elements.Directory;
import elements.File;
import elements.SystemElement;

public class CountFilesVisitor implements Visitor{
    private int countFiles = 0;

    @Override
    public void visit(File file) {
        countFiles++;
    }

    @Override
    public void visit(Directory directory) {
        for (SystemElement element : directory.getContent()) {
            element.accept(this);
        }
    }

    public void resetCount() {
        countFiles = 0;
    }

    public int getCountFiles() {
        return countFiles;
    }
}
