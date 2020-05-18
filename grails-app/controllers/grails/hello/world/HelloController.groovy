package grails.hello.world

class HelloController {

    def index() {
        return [
            one: 'Hello',
            two: 'World',
        ]
    }
}
