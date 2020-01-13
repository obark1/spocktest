import spock.lang.Specification

class MyFirstSpec extends Specification {
    def "let's try this!"() {
        given: "Hello World introduction to Spock Test"
        def firstWord = "Hello"
        def secondWord = "World"
        def tony = "tony"

        when: "They are concatenated"
        def result = firstWord + " " + secondWord

        then: "We get a lovely greeting"
        result + tony == "Hello World"
    }



}
