package estudos.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading Database...");
    }

    @Override
    public void remover() {
        System.out.println("Removing Database...");
    }

    @Override
    public void checking() {
        System.out.println("Checking Database...");
    }
}
