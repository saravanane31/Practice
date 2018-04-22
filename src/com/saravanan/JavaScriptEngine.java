package com.saravanan;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		for(ScriptEngineFactory factory:manager.getEngineFactories()){
			System.out.println(factory.getNames());
		}
		String s="4*4";
		try {
			System.out.println(engine.eval(s));
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
