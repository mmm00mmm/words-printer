package conversion

import spock.lang.Specification

class ReverseTest extends Specification {
    def "test for 単語の順番を逆にする"() {
        setup:
        Reverse reverse = new Reverse(["this","book","is","so","funny"]);

        expect:
        reverse.単語の順番を逆にする() == ["funny","so","is","book","this"]
    }
}
