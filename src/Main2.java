import java.util.ArrayList;
import java.util.Collections;

public class Main2
{
    public static void main(String[] args)
    {
        Pendrive pendrive = new Pendrive(50);
        ArrayList<Pdf> listaPdfs = new ArrayList<Pdf>();

        listaPdfs.add(new Pdf("PDF 1", 10, 20)); //0,5
        listaPdfs.add(new Pdf("PDF 2", 11, 45)); //0,2444
        listaPdfs.add(new Pdf("PDF 3", 15, 55)); //0,272
        listaPdfs.add(new Pdf("PDF 4", 5, 5)); //1
        listaPdfs.add(new Pdf("PDF 5", 10, 12)); //0,83
        listaPdfs.add(new Pdf("PDF 6", 45, 80)); //0,56
        listaPdfs.add(new Pdf("PDF 7", 35, 35)); //1
        listaPdfs.add(new Pdf("PDF 8", 2, 4)); //0,5
        listaPdfs.add(new Pdf("PDF 9", 1, 1)); //1
        listaPdfs.add(new Pdf("PDF 10", 14, 19)); //0,73

        Collections.sort(listaPdfs);

        for(Pdf pdf : listaPdfs)
        {
            pendrive.addPdf(pdf);
        }

        pendrive.mostrarConteudo();

    }
}