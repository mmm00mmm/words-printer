package conversion;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
    private List<String> list;

    public Reverse(List<String> list) {
        this.list = list;
    }

    public List<String> 単語の順番を逆にする() {
        Collections.reverse(list);
        return list;
    }
}
