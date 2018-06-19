package utils;

public enum SourceTarget{
    VOICEPAD(0, "VoicePad"),
    BR360(1, "Br360"),
    REALGEEKS(2, "Real Geeks"),
    SIDX(3, "Showcase"),
    SALESFROCE(4, "Salesforce"),
    FOLLOWUPBOSS(5, "Follow Up Boss"),
    CONTACTUALLY(6, "Contactually"),
    BOOMTOWN(7, "Boom Town")
    ;

    private int index;
    private String id;

    SourceTarget(final int index, final String id) {
        this.index = index;
        this.id = id;
    }

    public int getIndex() { return index; }
    public String getId() { return id; }
}
