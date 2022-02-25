package by.mendelev.xmltask.entity;

import java.time.YearMonth;

public class PreciousGem extends AbstractGem{
    private int hardnessMohs;


    public PreciousGem(int hardnessMohs) {
        this.hardnessMohs = hardnessMohs;
    }

    public PreciousGem(String name, Country extractionPlace, Parameters parameters, YearMonth productionDate,
                       double value, int hardnessMohs) {
        super(name, extractionPlace, parameters, productionDate, value);
        this.hardnessMohs = hardnessMohs;
    }

    public int getHardnessMohs() {
        return hardnessMohs;
    }

    public void setHardnessMohs(int hardnessMohs) {
        this.hardnessMohs = hardnessMohs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PreciousGem preciousGem = (PreciousGem) o;

        return hardnessMohs == preciousGem.hardnessMohs;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + hardnessMohs;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PreciousGem{");
        sb.append(super.toString());
        sb.append("hardnessMohs=").append(hardnessMohs);
        sb.append('}');
        return sb.toString();
    }


}
