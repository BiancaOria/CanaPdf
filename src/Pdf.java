public class Pdf implements Comparable<Pdf> {

    private String nome;
    private int paginas;
    private int tamanho;
    public Pdf(String nome, int paginas, int tamanho) {
        this.nome = nome;
        this.paginas = paginas;
        this.tamanho = tamanho;
    }
    public int getPaginas() {
        return paginas;
    }
    public int getTamanho() {
        return tamanho;
    }
    @Override
    public int compareTo(Pdf o) {

        double eficienciaAtual = (double) this.paginas / this.tamanho;
        double eficienciaOutro = (double) o.getPaginas() / o.getTamanho();
        return Double.compare(eficienciaOutro, eficienciaAtual);
    }
    public String toString() {
        return nome + " (Páginas: " + paginas + ", Tamanho: " + tamanho + "MB)";
    }
}
