package jp.co.hoge;

import jp.co.hoge.model.Member;
import jp.co.hoge.model.MemberAndProbability;
import jp.co.hoge.model.Probability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        List<MemberAndProbability> list = new ArrayList<>();

        Member member1 = new Member("テスト１");
        Member member2 = new Member("テスト2");
        Member member3 = new Member("テスト3");
        Probability probability1 = new Probability(6);
        Probability probability2 = new Probability(3);
        Probability probability3 = new Probability(1);

        for (int a = 0; a < Integer.parseInt(probability1.toString()); a++) {
            list.add(new MemberAndProbability(member1, probability1));
        }

        for (int b = 0; b < Integer.parseInt(probability2.toString()); b++) {
            list.add(new MemberAndProbability(member2, probability2));
        }

        for (int c = 0; c < Integer.parseInt(probability3.toString()); c++) {
            list.add(new MemberAndProbability(member3, probability3));
        }

        System.out.println(list);

        for (int i = 0; i < 50; i++) {
            int index = ThreadLocalRandom.current().nextInt(list.size());
            System.out.println(index + ":" + list.get(index) );
        }
    }
}
