package prototype;

public class Document implements Clonable{

    private String title;
    private String content;
    private FontData font;
    private MarginData margin;
    private GeneralSettings otherSettings;

    public Document(String title, FontData font, MarginData margin, GeneralSettings otherSettings) {
        this.title = title;
        this.content = "";
        this.font = font;
        this.margin = margin;
        this.otherSettings = otherSettings;
    }

    public void write(String text){
        this.content=this.content+text;
    }

    @Override
    public Document cloneObject() {
        FontData copyFont = new FontData(this.getFont().getStyle(),this.getFont().getSize(),this.getFont().getColor(),this.getFont().getType());
        MarginData copyMargin = new MarginData(this.getMargin().getMarginTop(), this.getMargin().getMarginBottom(), this.getMargin().getMarginLeft(),this.margin.getMarginRight());
        GeneralSettings copyOtherSettings = new GeneralSettings(this.otherSettings.getAling(),this.otherSettings.getParagraphSpacing(), this.otherSettings.getColumns(),this.otherSettings.getOrientation());
        return new Document(this.title,copyFont,copyMargin,copyOtherSettings);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public FontData getFont() {
        return font;
    }

    public void setFont(FontData font) {
        this.font = font;
    }

    public MarginData getMargin() {
        return margin;
    }

    public void setMargin(MarginData margin) {
        this.margin = margin;
    }

    public GeneralSettings getOtherSettings() {
        return otherSettings;
    }

    public void setOtherSettings(GeneralSettings otherSettings) {
        this.otherSettings = otherSettings;
    }

    @Override
    public String toString() {
        return "title= " + title + '\n' +
                "content= " + content + '\n' +
                "font= " + font + '\n' +
                "margin= " + margin + '\n' +
                "otherSettings= " + otherSettings +'\n'
                +"-------------------------------";
    }
}
