package com.ict.day18;

import java.util.function.BinaryOperator;

//reduce(초기값, 수행할 기능)
//reduce(T identity, BinaryOperator<T> accumulator
class Ex09 implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else {

			return s2;
		}
	}

}
