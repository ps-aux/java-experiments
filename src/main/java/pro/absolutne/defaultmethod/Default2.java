package pro.absolutne.defaultmethod;

public interface Default2 {

    default public String foo() {
        return "foo in " + getClass().getSimpleName();
    }

}
