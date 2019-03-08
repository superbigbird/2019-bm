<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="zh-CN" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8"><%@ include file="../../basePath.jsp"%>
<title>帖子详情</title>
<script src="resource/jquery-1.7.2.min.js" type="text/javascript"></script>
<link href="resource/css/basic.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resource/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="resource/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="resource/js/publicSystem.js"></script>
<script type="text/javascript"
	src="<%=basePath%>resource/js/My97DatePicker/WdatePicker.js"></script>
<link id="easyuiTheme" rel="stylesheet"
	href="resource/js/jquery-easyui-1.3.5/themes/default/easyui.css"
	type="text/css">
<link type="text/css" rel="stylesheet" href="resource/css/icon.css"></link>
<style>
form {
	margin: 0;
}

textarea {
	display: block;
}
</style>
<link rel="stylesheet" href="<%=basePath %>/editor/themes/default/default.css" />
<script charset="utf-8" src="<%=basePath %>/editor/kindeditor-min.js"></script>
<script charset="utf-8" src="<%=basePath %>/editor/lang/zh-CN.js"></script>
<script>
			var editor;
			KindEditor.ready(function(K) {
				editor = K.create('textarea[name="content"]', {
					allowFileManager : true
				});
				K('input[name=getHtml]').click(function(e) {
					alert(editor.html());
				});
				K('input[name=setHtml]').click(function(e) {
					editor.html('<h3>Hello KindEditor</h3>');
				});
			
			});
		</script>
</head>
<body>
	<table>
		<tr>
			<td>发布人：</td>
			<td>${tiezi.uName }</td>
		</tr>
		<tr>
			<td>所属圈子：</td>
			<td>${tiezi.cummunityName }</td>
		</tr>
		<tr>
			<td>帖子内容：</td>
			<td>
				<form>
					<textarea name="content" style="width: 800px; height: 400px; visibility: hidden;">
						${tiezi.content }
					</textarea>
				</form>
			</td>
		</tr>
		<c:forEach items="${tiezi.dicussList }" var="discuss">
			<tr>
				<td>评论人：${discuss.discussUserName }</td>
				<td>
					评论:${discuss.discussContent }   
					<c:choose>
						<c:when test="${discuss.discussStatus=='1' }"><a href="javascript:void(0)" discussId="${discuss.discussId }">隐藏该评论</a></c:when>
						<c:otherwise><a href="javascript:void(0)" discussId="${discuss.discussId }">显示该评论</a></c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>