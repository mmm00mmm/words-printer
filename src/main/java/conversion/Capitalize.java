package conversion;

import java.util.List;
import java.util.stream.Collectors;

public class Capitalize {
    private List<String> list;

    public Capitalize(List<String> list){
        this.list = list;
    }

    public List<String> 各単語の先頭1文字を大文字にする(){
        return list.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.toList());
    }
}
