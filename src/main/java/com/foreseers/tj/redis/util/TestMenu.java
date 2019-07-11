package com.foreseers.tj.redis.util;

public class TestMenu {

	public static void main(String[] args) {
		String accessToken  = WeiXinUtil.getAccess_Token();
		System.out.println("得到的accessToken:"+accessToken);
		String menu = MenuUtil.initMenu();
		System.out.println("得到的menu:"+menu);

		int result = MenuUtil.createMenu(accessToken,menu);
		if(result==0){
			System.out.println("菜单创建成功");
		}else{
			System.out.println("错误码"+result);
		}
	}
}
