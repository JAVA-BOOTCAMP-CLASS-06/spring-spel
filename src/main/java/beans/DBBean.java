package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DBBean {

	@Value("${database.url}")
	private String url;

	@Value("${database.username}")
	private String user;
	
	@Value("${database.password}")
	private String password;
	
	public String getUrl() {
		return url;
	}
	
	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	

}