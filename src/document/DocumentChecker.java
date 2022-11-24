package document;

public class DocumentChecker {

    public static void main(String[] args) {
        Document excelDocument = new ExcelDoucment();
        Document pdfDocument=new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
