package output;

import java.util.List;
import java.util.stream.Collectors;

public class Horizontal {
    private List<String> list;

    public Horizontal(List<String> list) {
        this.list = list;
    }

    public void 単語を半角スペースで区切って出力する() {
        System.out.println(
                list.stream().collect(Collectors.joining(" "))
        );
    }
}
