package machine;

public enum Action {
    BUY ("buy"),
    FILL("fill"),
    TAKE("take"),
    REMAINING("remaining"),
    EXIT("exit");

    final String value;

    Action (String value) {
        this.value = value;
    }

    public static Action findByValue(String val) {
        for (Action value: values()) {
            if (val.equals(value.value)) {
                return value;
            }
        }
        return null;
    }
}
