package test

import grails.rest.RestfulController

abstract class BaseController<T> extends RestfulController<T> {
    static responseFormats = ['json', 'xml']
    BaseController(Class<T> resource) {
        this(resource, false)
    }

    BaseController(Class<T> resource, boolean readOnly) {
        super(resource, readOnly)
    }

    def index() {
        log.error("Log message from BaseController::index")
        render(text: 'BaseController::index')
    }

}
