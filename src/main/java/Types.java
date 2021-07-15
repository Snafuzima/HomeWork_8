public enum Types {
    CAT("Cat"),HUMAN("Human"),ROBOT("Robot");
    private String type;

    Types(String type) {
        this.type=type;
    }

    public String getType() {
        return type;
    }
}
