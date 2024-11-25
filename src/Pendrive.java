import java.util.ArrayList;

public class Pendrive {

    private int capacidadeInicial;
    private int capacidadeAtual;
    private ArrayList<Pdf> listaPdfs;
    private int totalpaginas;
    public Pendrive(int capacidadeInicial) {
        this.capacidadeInicial = capacidadeInicial;
        this.capacidadeAtual = capacidadeInicial;
        this.listaPdfs = new ArrayList<Pdf>();
    }

    public void addPdf(Pdf arquivo)
    {
        if(arquivo.getTamanho() <= this.capacidadeAtual)
        {
            listaPdfs.add(arquivo);
            capacidadeAtual -= arquivo.getTamanho();
        }
    }
    public void mostrarConteudo() {

        System.out.println("Arquivos no pendrive:");
        for (Pdf pdf : listaPdfs) {
            totalpaginas += pdf.getPaginas();
            System.out.println(pdf);
        }
        System.out.println("Espaço restante no pendrive: " + capacidadeAtual + "MB");
        System.out.println("Total de paginas:: " + totalpaginas);

    }
}
