package by.mendelev.xmltask.parser;

public enum GemXmlTag {
    GEMS("gems"),
    NAME("name"),
    EXTRACTION_PLACE ("extraction_place"),
    PRODUCTION_DATE ("production_date"),
    COLOR ("color"),
    TRANSPARENCY("transparency"),
    NUMBER_OF_FACES("number_of_faces"),
    PRECIOUS_GEM ("gem_stone"),
    SEMIPRECIOUS_GEM("jewerly_stone"),
    HARDNESS_MOHS("hardness_mohs"),
    PROPERTY("property"),
    VALUE ("value");

    private String value;

    GemXmlTag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
