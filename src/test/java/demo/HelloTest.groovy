package demo

class HelloTest extends spock.lang.Specification {
    def "SayHello"() {
        expect: hello == "HelloWorld from Gradle!"

        where: hello = new Hello().sayHello()
    }
}
