import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        Pendrive pendrive = new Pendrive(50);
        ArrayList<Pdf> listaPdfs = new ArrayList<Pdf>();

        listaPdfs.add(new Pdf("PDF 1", 10, 2));
        listaPdfs.add(new Pdf("PDF 2", 20, 4));
        listaPdfs.add(new Pdf("PDF 3", 15, 3));
        listaPdfs.add(new Pdf("PDF 4", 30, 6));
        listaPdfs.add(new Pdf("PDF 5", 25, 5));
        listaPdfs.add(new Pdf("PDF 6", 18, 4));
        listaPdfs.add(new Pdf("PDF 7", 40, 8));
        listaPdfs.add(new Pdf("PDF 8", 22, 5));
        listaPdfs.add(new Pdf("PDF 9", 35, 7));
        listaPdfs.add(new Pdf("PDF 10", 50, 10));
        listaPdfs.add(new Pdf("PDF 11", 12, 2));
        listaPdfs.add(new Pdf("PDF 12", 28, 6));
        listaPdfs.add(new Pdf("PDF 13", 45, 9));
        listaPdfs.add(new Pdf("PDF 14", 33, 7));
        listaPdfs.add(new Pdf("PDF 15", 20, 5));
        listaPdfs.add(new Pdf("PDF 16", 18, 4));
        listaPdfs.add(new Pdf("PDF 17", 60, 12));
        listaPdfs.add(new Pdf("PDF 18", 25, 5));
        listaPdfs.add(new Pdf("PDF 19", 22, 6));
        listaPdfs.add(new Pdf("PDF 20", 30, 8));
        listaPdfs.add(new Pdf("PDF 21", 55, 11));
        listaPdfs.add(new Pdf("PDF 22", 35, 9));
        listaPdfs.add(new Pdf("PDF 23", 40, 10));
        listaPdfs.add(new Pdf("PDF 24", 65, 13));
        listaPdfs.add(new Pdf("PDF 25", 25, 6));
        listaPdfs.add(new Pdf("PDF 26", 45, 10));
        listaPdfs.add(new Pdf("PDF 27", 50, 12));
        listaPdfs.add(new Pdf("PDF 28", 38, 8));
        listaPdfs.add(new Pdf("PDF 29", 48, 9));
        listaPdfs.add(new Pdf("PDF 30", 55, 11));
        listaPdfs.add(new Pdf("PDF 31", 20, 4));
        listaPdfs.add(new Pdf("PDF 32", 15, 3));
        listaPdfs.add(new Pdf("PDF 33", 25, 6));
        listaPdfs.add(new Pdf("PDF 34", 18, 4));
        listaPdfs.add(new Pdf("PDF 35", 10, 2));
        listaPdfs.add(new Pdf("PDF 36", 28, 6));
        listaPdfs.add(new Pdf("PDF 37", 45, 9));
        listaPdfs.add(new Pdf("PDF 38", 33, 7));
        listaPdfs.add(new Pdf("PDF 39", 20, 5));
        listaPdfs.add(new Pdf("PDF 40", 18, 4));
        listaPdfs.add(new Pdf("PDF 41", 60, 12));
        listaPdfs.add(new Pdf("PDF 42", 25, 5));
        listaPdfs.add(new Pdf("PDF 43", 22, 6));
        listaPdfs.add(new Pdf("PDF 44", 30, 8));
        listaPdfs.add(new Pdf("PDF 45", 55, 11));
        listaPdfs.add(new Pdf("PDF 46", 35, 9));
        listaPdfs.add(new Pdf("PDF 47", 40, 10));
        listaPdfs.add(new Pdf("PDF 48", 65, 13));
        listaPdfs.add(new Pdf("PDF 49", 25, 6));
        listaPdfs.add(new Pdf("PDF 50", 45, 10));
        listaPdfs.add(new Pdf("PDF 51", 10, 2));
        listaPdfs.add(new Pdf("PDF 52", 20, 4));
        listaPdfs.add(new Pdf("PDF 53", 15, 3));
        listaPdfs.add(new Pdf("PDF 54", 30, 6));
        listaPdfs.add(new Pdf("PDF 55", 25, 5));
        listaPdfs.add(new Pdf("PDF 56", 18, 4));
        listaPdfs.add(new Pdf("PDF 57", 40, 8));
        listaPdfs.add(new Pdf("PDF 58", 22, 5));
        listaPdfs.add(new Pdf("PDF 59", 35, 7));
        listaPdfs.add(new Pdf("PDF 60", 50, 10));
        listaPdfs.add(new Pdf("PDF 61", 12, 2));
        listaPdfs.add(new Pdf("PDF 62", 28, 6));
        listaPdfs.add(new Pdf("PDF 63", 45, 9));
        listaPdfs.add(new Pdf("PDF 64", 33, 7));
        listaPdfs.add(new Pdf("PDF 65", 20, 5));
        listaPdfs.add(new Pdf("PDF 66", 18, 4));
        listaPdfs.add(new Pdf("PDF 67", 60, 12));
        listaPdfs.add(new Pdf("PDF 68", 25, 5));
        listaPdfs.add(new Pdf("PDF 69", 22, 6));
        listaPdfs.add(new Pdf("PDF 70", 30, 8));
        listaPdfs.add(new Pdf("PDF 71", 55, 11));
        listaPdfs.add(new Pdf("PDF 72", 35, 9));
        listaPdfs.add(new Pdf("PDF 73", 40, 10));
        listaPdfs.add(new Pdf("PDF 74", 65, 13));
        listaPdfs.add(new Pdf("PDF 75", 25, 6));
        listaPdfs.add(new Pdf("PDF 76", 45, 10));
        listaPdfs.add(new Pdf("PDF 77", 50, 12));
        listaPdfs.add(new Pdf("PDF 78", 38, 8));
        listaPdfs.add(new Pdf("PDF 79", 48, 9));
        listaPdfs.add(new Pdf("PDF 80", 55, 11));
        listaPdfs.add(new Pdf("PDF 81", 20, 4));
        listaPdfs.add(new Pdf("PDF 82", 15, 3));
        listaPdfs.add(new Pdf("PDF 83", 25, 6));
        listaPdfs.add(new Pdf("PDF 84", 18, 4));
        listaPdfs.add(new Pdf("PDF 85", 10, 2));
        listaPdfs.add(new Pdf("PDF 86", 28, 6));
        listaPdfs.add(new Pdf("PDF 87", 45, 9));
        listaPdfs.add(new Pdf("PDF 88", 33, 7));
        listaPdfs.add(new Pdf("PDF 89", 20, 5));
        listaPdfs.add(new Pdf("PDF 90", 18, 4));
        listaPdfs.add(new Pdf("PDF 91", 60, 12));
        listaPdfs.add(new Pdf("PDF 92", 25, 5));
        listaPdfs.add(new Pdf("PDF 93", 22, 6));
        listaPdfs.add(new Pdf("PDF 94", 30, 8));
        listaPdfs.add(new Pdf("PDF 95", 55, 11));
        listaPdfs.add(new Pdf("PDF 96", 35, 9));
        listaPdfs.add(new Pdf("PDF 97", 40, 10));
        listaPdfs.add(new Pdf("PDF 98", 65, 13));
        listaPdfs.add(new Pdf("PDF 99", 25, 6));
        listaPdfs.add(new Pdf("PDF 100", 45, 10));


        Collections.sort(listaPdfs);

        for(Pdf pdf : listaPdfs)
        {
            pendrive.addPdf(pdf);
        }

        pendrive.mostrarConteudo();

    }
}