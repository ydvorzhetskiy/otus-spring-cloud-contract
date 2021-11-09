package contracts

import org.springframework.cloud.contract.spec.Contract;

Contract.make {
    description "should say hello for world"
    request {
        method GET()
        url("/hello") {
            queryParameters {
                parameter("name", "World")
            }
        }
    }
    response {
        body("Hello, World!")
        status 200
    }
}
