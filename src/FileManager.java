import elements.Directory;
import elements.File;
import visitor.CountFilesVisitor;
import visitor.FullSizeVisitor;

public class FileManager {
    public static void main(String[] args) {
        Directory root = new Directory();
        root.add(new File(10));

        Directory subDir = new Directory();
        subDir.add(new File(20));
        root.add(subDir);

        FullSizeVisitor fullSizeVisitor = new FullSizeVisitor();
        root.accept(fullSizeVisitor);
        System.out.println("Full size: " + fullSizeVisitor.getFullSize());

        CountFilesVisitor countFilesVisitor = new CountFilesVisitor();
        root.accept(countFilesVisitor);
        System.out.println("Quantity of files: " + countFilesVisitor.getCountFiles());

        System.out.println("--------------------------------------------------");
        System.out.println("Adding a new file with size = 5");
        root.add(new File(5));

        fullSizeVisitor.resetFullSize();
        root.accept(fullSizeVisitor);
        System.out.println("Full size: " + fullSizeVisitor.getFullSize());

        countFilesVisitor.resetCount();
        root.accept(countFilesVisitor);
        System.out.println("Quantity of files: " + countFilesVisitor.getCountFiles());
    }
}
