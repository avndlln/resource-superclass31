package test

class NoSuperController extends BaseController<NoSuper> {
    NoSuperController() {
        super(NoSuper)
    }
    NoSuperController(boolean readOnly) {
        super(NoSuper, readOnly)
    }

    def index() {
        log.error("Log message from NoSuperController::index")
        render(text: 'NoSuperController::index')
    }
}
