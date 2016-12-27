package pro.absolutne.defaultmethod;

public interface Default1 {

    default public String foo() {
        return "foo in " + getClass().getSimpleName();
    }

}
