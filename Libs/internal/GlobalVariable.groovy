package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Mandatory</p>
     */
    public static Object environment
     
    /**
     * <p>Profile default : respective url for current environment</p>
     */
    public static Object urlBase
     
    /**
     * <p></p>
     */
    public static Object waitPageFast
     
    /**
     * <p></p>
     */
    public static Object waitPageSlow
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            environment = selectedVariables['environment']
            urlBase = selectedVariables['urlBase']
            waitPageFast = selectedVariables['waitPageFast']
            waitPageSlow = selectedVariables['waitPageSlow']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
