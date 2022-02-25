package by.mendelev.xmltask.entity;

import java.time.YearMonth;

public class SemipreciousGem extends AbstractGem{
    private String property;

    public SemipreciousGem(String property) {
        this.property = property;
    }

    public SemipreciousGem(String name, Country extractionPlace, Parameters parameters, YearMonth productionDate, double value, String property) {
        super(name, extractionPlace, parameters, productionDate, value);
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SemipreciousGem that = (SemipreciousGem) o;

        return property != null ? property.equals(that.property) : that.property == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (property != null ? property.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SemipreciousGem{");
        sb.append(super.toString());
        sb.append("property='").append(property).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
