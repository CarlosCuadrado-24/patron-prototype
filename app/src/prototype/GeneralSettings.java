package prototype;

public class GeneralSettings {
    private String aling;
    private Double paragraphSpacing;
    private Integer columns;
    private String orientation;

    public GeneralSettings(String aling, Double paragraphSpacing, Integer columns, String orientation) {
        this.aling = aling;
        this.paragraphSpacing = paragraphSpacing;
        this.columns = columns;
        this.orientation = orientation;
    }

    public String getAling() {
        return aling;
    }

    public void setAling(String aling) {
        this.aling = aling;
    }

    public Double getParagraphSpacing() {
        return paragraphSpacing;
    }

    public void setParagraphSpacing(Double paragraphSpacing) {
        this.paragraphSpacing = paragraphSpacing;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "{" +
                "aling='" + aling + '\'' +
                ", paragraphSpacing=" + paragraphSpacing +
                ", columns=" + columns +
                ", orientation='" + orientation + '\'' +
                '}';
    }
}
