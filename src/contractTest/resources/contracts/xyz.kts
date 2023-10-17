import org.springframework.cloud.contract.spec.ContractDsl

ContractDsl.contract {
    input {
        triggeredBy = "toString()"
    }
    outputMessage {
        sentTo("ddd")
        body("xxx")
        headers {
            header("x", "y")
        }
    }
}