package com.mytest.design.singleton;
class SingletonClass {

	private static SingletonClass singletonObject;
	/** A private Constructor prevents any other class from instantiating. */
	private SingletonClass() {
		//	 Optional Code
	}
	public static synchronized SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}
	/*public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}*/
}