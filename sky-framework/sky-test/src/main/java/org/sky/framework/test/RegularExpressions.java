package org.sky.framework.test;

import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		System.out.println(asteriskMobile("18551208215"));
	}

	/**
	 * 替换掉手机号码的中间四位，用“*”号表示
	 * 
	 * @param mobile
	 * @return
	 * @author sky
	 */
	public static String asteriskMobile(String mobile) {

		Pattern pattern = Pattern.compile("(?<=\\d{3})\\d(?=\\d{4})");

		if (mobile != null && !"".equals(mobile.trim())) {
			return pattern.matcher(mobile).replaceAll("*");
		} else {
			return "";
		}

	}

}
