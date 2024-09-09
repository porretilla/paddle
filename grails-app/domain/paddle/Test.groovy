package paddle
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
class Test {

    String nombre
    String email
    String password

    static constraints = {
        nombre nullable: false, blank: false
        email nullable: false, blank: false, unique: true, email: true
        password nullable: false, blank: false
    }

    def beforeInsert() {
        password = encodePassword(password)
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            password = encodePassword(password)
        }
    }

    private String encodePassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder()
        return passwordEncoder.encode(password)
    }
}