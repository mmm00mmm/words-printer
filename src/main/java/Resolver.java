import conversion.Capitalize;
import conversion.Compress;
import conversion.Reverse;
import output.Horizontal;
import output.Vertical;

import java.util.Arrays;
import java.util.List;

public class Resolver {
    private final List<String> strings;

    public Resolver(List<String> strings) {
        this.strings = strings;
        run();
    }

    public void run(){
        List<String> words = Arrays.asList(strings.get(0).split(" "));

        for (int i = 1; i < strings.size(); i++) {
            switch (strings.get(i)) {
                case "--capitalize":
                    Capitalize capitalize = new Capitalize(words);
                    words = capitalize.各単語の先頭1文字を大文字にする();
                    break;
                case "--reverse":
                    Reverse reverse = new Reverse(words);
                    reverse.単語の順番を逆にする();
                    break;
                case "--compress":
                    Compress compress = new Compress(words);
                    words = compress.各単語の中の連続する文字を1文字にする(); //TODO impl
                    break;
                case "--horizontal":
                    Horizontal horizontal = new Horizontal(words);
                    horizontal.単語を半角スペースで区切って出力する();
                    break;
                case "--vertical":
                    Vertical vertical = new Vertical(words);
                    vertical.単語を改行で区切って出力する();
                    break;
            }
        }
    }

}
