package ch.furthermore.poc;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Run sample:
 * <pre>
 * mvn clean install
 * java -jar target/wildfly-swarm-jaxws-sample-0.0.1-SNAPSHOT-swarm.jar
 * </pre>
 * 
 * WSDL- und service URLs: 
 * <pre>
 * http://localhost:8080/StringUtils?wsdl
 * http://nsa2001.local:8080/StringUtils
 * </pre>
 */
@WebService
public class StringUtils {
	@WebMethod
	public String upperCase(String s) {
		return s.toUpperCase();
	}
}
