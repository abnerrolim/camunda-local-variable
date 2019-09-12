package abner.report.bugs.camunda;

import org.camunda.bpm.engine.RuntimeService
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.EventListener

@Configuration
class FlowDeployListener {

    @Autowired
    private val runtimeService: RuntimeService? = null

    @EventListener
    fun notify(unused: PostDeployEvent) {
            runtimeService?.createMessageCorrelation("START_EVENT")?.
                    processInstanceBusinessKey("XPTO-001")?.
                    setVariableLocal("local-var", "Some Message")?.
                    correlateWithResult()
    }

}
