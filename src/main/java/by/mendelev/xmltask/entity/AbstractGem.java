package by.mendelev.xmltask.entity;

import java.time.YearMonth;

public abstract class AbstractGem {
    private String name;
    private Country extractionPlace;
    private Parameters parameters;
    private YearMonth productionDate;
    private double value;

    public AbstractGem() {
    }

    public AbstractGem(String name, Country extractionPlace, Parameters parameters, YearMonth productionDate, double value) {
        this.name = name;
        this.extractionPlace = extractionPlace;
        this.parameters = parameters;
        this.productionDate = productionDate;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getExtractionPlace() {
        return extractionPlace;
    }

    public void setExtractionPlace(Country extractionPlace) {
        this.extractionPlace = extractionPlace;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public YearMonth getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(YearMonth productionDate) {
        this.productionDate = productionDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractGem that = (AbstractGem) o;

        if (Double.compare(that.value, value) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (extractionPlace != that.extractionPlace) return false;
        if (parameters != null ? !parameters.equals(that.parameters) : that.parameters != null) return false;
        return productionDate != null ? productionDate.equals(that.productionDate) : that.productionDate == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (extractionPlace != null ? extractionPlace.hashCode() : 0);
        result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
        result = 31 * result + (productionDate != null ? productionDate.hashCode() : 0);
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractGem{");
        sb.append("name='").append(name).append('\'');
        sb.append(", extractionPlace=").append(extractionPlace);
        sb.append(", parameters=").append(parameters);
        sb.append(", productionDate=").append(productionDate);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
