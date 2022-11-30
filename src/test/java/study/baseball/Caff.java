package study.baseball;

public abstract class Caff {
    String si = "qwe";

    public Caff(String si) {
        this.si = si;
    }

    abstract void make();

    void send() {
        System.out.println("보낸다.");
    }
}
