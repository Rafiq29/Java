package classwork.November18;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class WarmUp {
    public static void main(String[] args) {
        System.out.println(solution(subjects(),verbs(),objects()));
    }


    private static ArrayList<String> subjects() {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Noel");
        subjects.add("The cat");
        subjects.add("The dog");
        return subjects;
    }

    private static ArrayList<String> objects() {
        ArrayList<String> verbs = new ArrayList<>();
        verbs.add("wrote");
        verbs.add("chased");
        verbs.add("slept on");
        return verbs;
    }

    private static ArrayList<String> verbs() {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("the book");
        objects.add("the ball");
        objects.add("the bed");
        return objects;
    }

    private static String sentences() {
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < subjects().size(); i++) {
            for (int j = 0; j < verbs().size(); j++) {
                for (int k = 0; k < objects().size(); k++) {
                    sentence.append(subjects().get(i)).append(" ").append(verbs().get(j))
                            .append(" ").append(objects().get(k)).append("\n");
                }
            }
        }
        return sentence.toString();
    }
    private static List<String> solution(List<String> subjects, List<String> verbs, List<String> object){
        return subjects.stream().flatMap(subj ->
                verbs.stream().flatMap(verb ->
                object.stream().map(obj -> combine(subj,verb,obj) )))
                .collect(Collectors.toList());
    }

    private static String combine(String subj, String verb, String obj) {
        StringJoiner sj = new StringJoiner(" ");
        sj.add(subj).add(verb).add(obj).add("\n");
        return sj.toString();
    }
}
