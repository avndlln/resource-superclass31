package test


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*
import static javax.servlet.http.HttpServletResponse.*
import wslite.rest.*

@Integration
@Rollback
class DemoSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    // in Grails 3.1.0, this fails (HTTP 500) with underlying message:  "No such property: log for class: test.SuperController"
    void "test with Resource superClass"() {
        when:
        def client = new RESTClient("http://localhost:8080")
        def response = client.get(path: '/super')

        then:
        response.statusCode == SC_OK
    }

    void "test explicit derived Controller"() {
        when:
        def client = new RESTClient("http://localhost:8080")
        def response = client.get(path: '/noSuper')

        then:
        response.statusCode == SC_OK
    }

}
