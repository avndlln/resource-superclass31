package test

import grails.test.mixin.TestFor
import spock.lang.Specification
import static javax.servlet.http.HttpServletResponse.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(NoSuperController)
class NoSuperControllerSpec extends Specification {
    void "test index"() {
        when:
        controller.index()

        then:
        response.status == SC_OK
    }
}
