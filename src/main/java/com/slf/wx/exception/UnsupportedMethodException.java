package com.slf.wx.exception;
public class UnsupportedMethodException extends BaseWebApplicationException {

	private static final long serialVersionUID = 1L;

	public UnsupportedMethodException() {
		super(500, "服务器不支持的业务类型", "该业务正在测试阶段，敬请期待");
		// TODO Auto-generated constructor stub
	}

}
