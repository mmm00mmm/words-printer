package output;

import java.util.List;
import java.util.stream.Collectors;

public class Vertical {
    private List<String> list;

    public Vertical(List<String> list) {
        this.list = list;
    }

    public void 単語を改行で区切って出力する() {
        list.forEach(s -> System.out.println(s));
    }
}
