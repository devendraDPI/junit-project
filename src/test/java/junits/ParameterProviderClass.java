package junits;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class ParameterProviderClass implements ParameterResolver {

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		// TODO Auto-generated method stub
		
		return parameterContext.getParameter().getType() == String.class;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		// TODO Auto-generated method stub
		
		String name = "radar";
		
		return name;
	}

}
