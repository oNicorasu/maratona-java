package estudos.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    void load();
    default void checking() {
        System.out.println("Checking data...");
    }
}
