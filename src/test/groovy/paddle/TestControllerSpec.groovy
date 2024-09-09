package paddle

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TestControllerSpec extends Specification implements ControllerUnitTest<TestController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
