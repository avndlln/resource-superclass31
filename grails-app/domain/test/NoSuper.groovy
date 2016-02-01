package test

import grails.rest.Resource

@Resource(uri='/not-using-super')
class NoSuper {
    static constraints = {
    }
}
