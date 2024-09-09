package paddle

class UrlMappings {
    static mappings = {
        "/api/registro"(controller: 'test', action: 'registrar', method: 'POST')
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
