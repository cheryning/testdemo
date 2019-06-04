package com.foreseers.tj.config;

import com.foreseers.tj.redis.util.WeiXinUtil;

public class Test {
	public static void main(String[] args) {
		String access_token = WeiXinUtil.getAccess_Token();
		System.out.println("调用成功access_token:"+access_token);
	}

}
