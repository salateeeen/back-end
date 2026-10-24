enum Status {
    PENDING,
    APPROVED,
    REJECTED
}

public class EnumMethods {
    public static void main(java.lang.String[] args) {
        Status status = Status.APPROVED;

        System.out.println(status.name());
        // not best practice
        System.out.println(status.ordinal());

        // loop on all enums value
        for (Status value : Status.values()) {
            System.out.println(value);
        }
    }
}
