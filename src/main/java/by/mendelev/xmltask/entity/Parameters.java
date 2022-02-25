package by.mendelev.xmltask.entity;

public class Parameters {
    private String color;
    private int transparency;
    private int numberOfFaces;

    public Parameters() {
    }

    public Parameters(String color, int transparency, int numberOfFaces) {
        this.color = color;
        this.transparency = transparency;
        this.numberOfFaces = numberOfFaces;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    public void setNumberOfFaces(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parameters that = (Parameters) o;

        if (transparency != that.transparency) return false;
        if (numberOfFaces != that.numberOfFaces) return false;
        return color != null ? color.equals(that.color) : that.color == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + transparency;
        result = 31 * result + numberOfFaces;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parameters{");
        sb.append("color='").append(color).append('\'');
        sb.append(", transparency=").append(transparency);
        sb.append(", numberOfFaces=").append(numberOfFaces);
        sb.append('}');
        return sb.toString();
    }
}
