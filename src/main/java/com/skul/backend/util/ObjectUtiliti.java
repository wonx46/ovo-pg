package com.skul.backend.util;

import org.apache.commons.beanutils.PropertyUtils;

public class ObjectUtiliti {

//	copy dari a ke b
	public final static Object copyObject(Object origin, Object dest){
		try {
			PropertyUtils.copyProperties(dest, origin);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return dest;
	}
}
