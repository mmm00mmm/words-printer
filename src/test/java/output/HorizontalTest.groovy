package output

import spock.lang.Specification

class HorizontalTest extends Specification {
    // 参考:https://qiita.com/tasogarei/items/c7bd926375985275f306
    def "test for 単語を半角スペースで区切って出力する"() {
        def savedSystemOut = System.out
        def printStream = Mock(PrintStream)
        System.out = printStream

        setup:
        Horizontal horizontal = new Horizontal(["this", "book", "is", "so", "funny"]);

        when:
        horizontal.単語を半角スペースで区切って出力する()

        then:
        1 * printStream.println("this book is so funny")

        cleanup:
        System.out = savedSystemOut
    }
}
