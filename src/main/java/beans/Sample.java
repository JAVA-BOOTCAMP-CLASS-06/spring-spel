package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sample")
public class Sample {

	@Value("#{'JDK ' + systemProperties['java.version']}")
	private String version;
	
	@Value("#{'1,2,3,4'.split(',')}")
	private List<String> lStr;

	@Value("#{T(java.util.stream.Stream).of(1,2,3,4,5).toList()}")
	private List<Integer> lInt;
	
	@Value("#{sample.lStr[2]}")
	private String str;

	public String getVersion() {
		return version;
	}

	public List<String> getlStr() {
		return lStr;
	}

	public String getStr() {
		return str;
	}



}