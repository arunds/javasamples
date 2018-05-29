package com.mytest;

import java.util.List;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class Java6 {
	public static void main(String[] args) {
		Java6 java6 = new Java6();
		java6.scripts();
	}

	private void scripts() {
		ScriptEngineManager a = new ScriptEngineManager();
		List<ScriptEngineFactory> allFactories = a.getEngineFactories();

		for(ScriptEngineFactory engineFactory : allFactories){
		    System.out.println("Engine Name" + engineFactory.getEngineName() + engineFactory.getLanguageName());
		}
	}
}
