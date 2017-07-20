<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.andychan.org/mytaglib" prefix="mytag"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><s:text name="loginPage"/></title>
</head>
<body>
	<span style="color:blue; font-weight:bold;">
		<mytag:helloWorld />
	</span>
	<s:form action="login">
		<s:textfield name="userId" key="user"/>
		<s:textfield name="password" key="pass"/>
		<s:submit value="%{getText('login')}"/>
	</s:form>
</body>
</html>