package jp.co.hoge.model;

public class Member {
    private final String value;

    public Member(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
