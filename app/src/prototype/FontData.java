package prototype;

public class FontData {

    private String style;
    private Double size;
    private String color;
    private String type;

    public FontData(String style, Double size, String color, String type) {
        this.style = style;
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                "style='" + style + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
