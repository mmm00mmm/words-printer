package conversion

import spock.lang.Specification
import spock.lang.Unroll

class CapitalizeTest extends Specification {
    def "test for 各単語の先頭１文字を大文字にする"() {
        setup:
        Capitalize capitalize = new Capitalize(["this","book","is","so","funny"]);

        expect:
        capitalize.各単語の先頭1文字を大文字にする() == ["This","Book","Is","So","Funny"]
    }
}
