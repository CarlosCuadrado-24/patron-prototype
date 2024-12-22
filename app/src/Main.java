import prototype.Document;
import prototype.FontData;
import prototype.GeneralSettings;
import prototype.MarginData;

public class Main {
    public static void main(String[] args) {

        System.out.println("-|-|-|-|-|-|PLANTILLA-|-|-|-|-|-|");
        FontData fontData = new FontData("Normal", 11.0, "Black", "Arial");
        MarginData marginData = new MarginData(1.0, 1.0, 1.0, 1.0);
        GeneralSettings generalSettings = new GeneralSettings("Left", 1.15, 1, "Portrait");
        Document template = new Document("Documento sin titulo", fontData, marginData, generalSettings);
        System.out.println(template.toString());


        System.out.println("-|-|-|-|-|-|NUEVO DOCUMENTO (COPIA)-|-|-|-|-|-|");
        Document document1 = template.cloneObject();
        // Document document1 = template;
        System.out.println(document1.toString());

        System.out.println("-|-|-|-|-|-|DOCUMENTO MODIFICADO (COPIA)-|-|-|-|-|-|");
        document1.setTitle("Aprendiendo el patron Prototype");
        document1.write("patron prototype aplicado y aprendido con exito :)");
        document1.getFont().setColor("Red");
        document1.getMargin().setMarginLeft(3.25);
        System.out.println(document1.toString());

        System.out.println("-|-|-|-|-|-|PLANTILLA-|-|-|-|-|-|");
        System.out.println(template.toString());


    }
}