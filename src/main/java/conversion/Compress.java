package conversion;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Compress {
    private List<String> list;

    public Compress(List<String> list) {
        this.list = list;
    }

    public List<String> 各単語の中の連続する文字を1文字にする() {
        return list; //TODO impl
//        return list.stream()
//                .filter(s -> s.matches("{2,}"))
//                .collect(Collectors.toList());
    }
}
