import java.util.Objects;

public class Cores implements Comparable<Cores>{
    private String cor;

    public Cores(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cores cores = (Cores) o;
        return cor.equals(cores.cor);
    }


    @Override
    public int compareTo(Cores c) {
        return this.getCor().compareTo(c.getCor());
    }
}
