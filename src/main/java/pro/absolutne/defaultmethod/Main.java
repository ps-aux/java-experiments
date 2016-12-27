package pro.absolutne.defaultmethod;

public class Main {

    public static void main(String[] args) {
        System.out.println(new A().foo());
        System.out.println(new B().foo());
        System.out.println(new C().foo());
        System.out.println(new All().foo());

    }
}


class A implements Default1 {

}

class B implements Default1, Default2 {

    /**
     * Compilation error otherwise
     */
    @Override
    public String foo() {
        return Default1.super.foo();
    }
}

class C extends Super implements Default1, Default2 {

}

class All extends Super implements Default1, Default2 {

    @Override
    public String foo() {
        return super.foo() + "|"
                + Default1.super.foo() + "|"
                + Default2.super.foo();
    }
}
