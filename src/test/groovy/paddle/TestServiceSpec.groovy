package paddle

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class TestServiceSpec extends Specification implements ServiceUnitTest<TestService> {

     void "test something"() {
        expect:
        service.doSomething()
     }
}
