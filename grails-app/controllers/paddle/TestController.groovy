package paddle
import grails.rest.RestfulController
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class TestController extends RestfulController<Test> {
   TestService testService


    def registrar() {
        def body = request.JSON
        try {
            def usuario = testService.registrarUsuario(body.nombre, body.email, body.password)
            respond usuario, [status: CREATED]
        } catch (ValidationException e) {
            respond e.errors, [status: UNPROCESSABLE_ENTITY]
        } catch (Exception e) {
            respond([error: e.message], [status: BAD_REQUEST])
        }
    }
}