import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return list of tall people"
    request {
        url "/people/tall"
        method GET()
    }
    response {
        headers {
            contentType(applicationJson())
        }
        status 200
        body(["Dawid", "Marcin"])
    }
}