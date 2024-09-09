package paddle

import grails.gorm.transactions.Transactional

@Transactional
class TestService {
    def registrarUsuario(String nombre, String email, String password) {
        if (Test.findByEmail(email)) {
            throw new Exception("El correo electrónico ya está registrado.")
        }
        Test usuario = new Test(nombre: nombre, email: email, password: password)
        if (!usuario.save(flush: true)) {
            throw new Exception("Error al registrar usuario.")
        }
        return usuario
    }
}