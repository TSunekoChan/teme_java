package isp.lab6.exercise1;

public enum Subject {
    MATHEMATICS("mathematics"),
    BIOLOGY("biology"),
    ENGLISH("english"),
    PHYSICS("physics"),
    LITERATURE("literature"),
    GEOGRAPHY("geography"),
    HISTORY("history"),
    SPORT("sport");
    private String displayName;

    Subject(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
