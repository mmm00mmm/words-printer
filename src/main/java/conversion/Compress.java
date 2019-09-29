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
        for (int i = 0; i < list.size(); i++) {
            String newWord = "";
            List<String> wordList = Arrays.asList(list.get(i).split(""));

            for (int j = wordList.size() - 1; 0 < j; j--) {
                if (!wordList.get(j).equals(wordList.get(j - 1))) {
                    newWord = wordList.get(j) + newWord;
                }
            }
            newWord = wordList.get(0) + newWord;
            list.set(i, newWord);
        }
        return list;
    }
}
