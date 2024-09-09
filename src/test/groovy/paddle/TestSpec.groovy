package paddle

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TestSpec extends Specification implements DomainUnitTest<Test> {

     void "test domain constraints"() {
        when:
        Test domain = new Test()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
