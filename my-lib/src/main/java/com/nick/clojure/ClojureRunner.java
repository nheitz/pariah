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
