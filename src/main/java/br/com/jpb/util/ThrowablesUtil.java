package br.com.jpb.util;

import com.google.common.base.Throwables;

public final class ThrowablesUtil {

	public static boolean verifyClientAbortException(Throwable t) {
		String stackTraceAsString = Throwables.getStackTraceAsString(t);
		return stackTraceAsString.contains("ClientAbortException");
	}

}
