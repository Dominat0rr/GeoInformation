/**
 * @version 1.0
 * @author Dominik Claerman
 */

public enum Province {
    ANTWERPEN("Antwerpen", "Anvers", "", "", "ANT"),
    BRUSSEL("Brussel", "Bruxelles", "", "", "BRU"),
    WEST_VLAANDEREN("West-Vlaanderen", "Flandre occidentale", "", "", "WVL"),
    OOST_VLAANDEREN("Oost-Vlaanderen", "Flandre orientale", "", "", "OVL"),
    HENEGOUWEN("Henegouwen", "Hainaut", "", "", "HAI"),
    LUIK("Luik", "Li\u00e8ge", "", "", "LIE"),
    LIMBURG("Limburg", "Limbourg", "", "", "LIM"),
    LUXEMBURG("Luxemburg", "Luxembourg", "", "", "LUX"),
    NAMEN("Namen", "Namur", "", "", "NAM"),
    WAALS_BRABANT("Waals-Brabant", "Brabant wallon", "", "", "BRW"),
    VLAAMS_BRABANT("Vlaams-Brabant", "Brabant flamand", "", "", "VBR");

    public final String nameNL;
    public final String nameFR;
    public final String nameDE;
    public final String nameEN;
    public final String abbreviation;

    private Province(String nameNL, String nameFR, String nameDE, String nameEN, String abbreviation) {
        this.nameNL = nameNL;
        this.nameFR = nameFR;
        this.nameDE = nameDE;
        this.nameEN = nameEN;
        this.abbreviation = abbreviation;
    }
}
