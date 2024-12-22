package prototype;

public class MarginData {

    private Double marginTop;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;

    public MarginData(Double marginTop, Double marginBottom, Double marginLeft, Double marginRight) {
        this.marginTop = marginTop;
        this.marginBottom = marginBottom;
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(Double marginTop) {
        this.marginTop = marginTop;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(Double marginBottom) {
        this.marginBottom = marginBottom;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(Double marginLeft) {
        this.marginLeft = marginLeft;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(Double marginRight) {
        this.marginRight = marginRight;
    }

    @Override
    public String toString() {
        return "{" +
                "marginTop=" + marginTop +
                ", marginBottom=" + marginBottom +
                ", marginLeft=" + marginLeft +
                ", marginRight=" + marginRight +
                '}';
    }
}
