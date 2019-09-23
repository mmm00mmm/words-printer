package output

import spock.lang.Specification

class VerticalTest extends Specification {
    def "test for 単語を改行で区切って出力する"() {
        def savedSystemOut = System.out
        def printStream = Mock(PrintStream)
        System.out = printStream

        setup:
        Vertical vertical = new Vertical(["this", "book", "is", "so", "funny"]);

        when:
        vertical.単語を改行で区切って出力する()

        then:
        1 * printStream.println("this")
        1 * printStream.println("book")
        1 * printStream.println("is")
        1 * printStream.println("so")
        1 * printStream.println("funny")

        cleanup:
        System.out = savedSystemOut
    }
}
