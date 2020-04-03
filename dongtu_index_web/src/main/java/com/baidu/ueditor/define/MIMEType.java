package com.baidu.ueditor.define;

import java.util.HashMap;
import java.util.Map;
/**
 *  ueditor class文件反编译的java代码
 *  @author 赵方
 */
public class MIMEType {

	public static final Map<String, String> types = new HashMap<String, String>(){{
		put( "image/gif", ".gif" );
		put( "image/jpeg", ".jpg" );
		put( "image/jpg", ".jpg" );
		put( "image/png", ".png" );
		put( "image/bmp", ".bmp" );
	}};
	
	public static String getSuffix ( String mime ) {
		return types.get( mime );
	}
	
}
