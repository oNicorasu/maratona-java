package estudos.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading file...");
    }

    @Override
    public void remover() {
        System.out.println("Removing file...");
    }

    @Override
    public void checking() {
        System.out.println("Checking file...");
    }
}
