/*******************************************************************************
 * Copyright (c) 2012 Pivotal Software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/
package com.nick.clojure;

import javax.script.ScriptEngineManager;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class ClojureRunner {

	public static void niceMethod(String name) {
		System.out.println(name + " is really nice");
	}

	public void callClojure() {
		ScriptEngineManager scriptManager = new ScriptEngineManager();
		
		IFn plus = Clojure.var("clojure.core", "+");
		IFn println = Clojure.var("clojure.core", "println");

		println.invoke(plus.invoke(1, 2));
	}

}
