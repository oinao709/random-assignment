package jp.co.hoge.model;

public class MemberAndProbability {
    private final Member member;
    private final Probability probability;

    public MemberAndProbability(Member member, Probability probability) {
        this.member = member;
        this.probability = probability;
    }

    @Override
    public String toString() {
        return member + "(" + probability +")";
    }
}
