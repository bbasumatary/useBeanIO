package com.useofjava.examples;

import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;

/**
 * @author	Biswajeet.Basumatary
 * @date	Saturday, 7 October 2017 20:14:54
 * @project	useBeanIO
 *
 *
 */
public class BadDoubleHandler implements TypeHandler {

	@Override
	public Object parse(String text) throws TypeConversionException {

		if (text.contains("#")) {
			text = text.replace("#", " ");
		}

		try {
			return Double.parseDouble(text);
		} catch (NumberFormatException ex) {
			// throw new TypeConversionException("Invalid Double because of ######", ex);
		}

		return null;

	}

	@Override
	public String format(Object value) {
		return value.toString();
	}

	@Override
	public Class<?> getType() {
		return Double.class;
	}
}