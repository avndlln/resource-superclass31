# resource-superclass31
Grails 3.1.0 application the demonstrates an apparent issue with @Resource(superClass=)

Beginning with the 3.1.0 release, using superClass in a domain class' Resource annotation causes an exception (No such property: log for class ...) in the generated controller.
This behavior appears to be a regression in 3.1.0 (exception was not present in 3.1 milestones and release candidates)

This application defines two domain classes:

* `Super` which uses `@Resource(superClass=BaseController)`
* `NoSuper` which uses an explcitly-created controller that is a subclass of `BaseController`

Running `grails test-app` causes 1 failure on an integration test for `Super`