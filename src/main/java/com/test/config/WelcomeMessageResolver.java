package com.test.config;


import org.springframework.core.MethodParameter;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.test.core.WelcomeMessage;

public class WelcomeMessageResolver implements HandlerMethodArgumentResolver {



	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.getParameterType().equals(WelcomeMessage.class) && parameter.hasParameterAnnotation(WelcomeMessage.class);
	}
	
	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
			WebDataBinderFactory binderFactory) throws Exception {
		WelcomeMessage welcomeMessage = (WelcomeMessage) webRequest.getAttribute("welcomeMessage" , RequestAttributes.SCOPE_REQUEST);
		
		return welcomeMessage;
	}
}
