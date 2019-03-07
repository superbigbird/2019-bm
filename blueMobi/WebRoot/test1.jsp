<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>富文本测试1</title>
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
				K('input[name=isEmpty]').click(function(e) {
					alert(editor.isEmpty());
				});
				K('input[name=getText]').click(function(e) {
					alert(editor.text());
				});
				K('input[name=selectedHtml]').click(function(e) {
					alert(editor.selectedHtml());
				});
				K('input[name=setHtml]').click(function(e) {
					editor.html('<h3>Hello KindEditor</h3>');
				});
				K('input[name=setText]').click(function(e) {
					editor.text('<h3>Hello KindEditor</h3>');
				});
				K('input[name=insertHtml]').click(function(e) {
					editor.insertHtml('<strong>插入HTML</strong>');
				});
				K('input[name=appendHtml]').click(function(e) {
					editor.appendHtml('<strong>添加HTML</strong>');
				});
				K('input[name=clear]').click(function(e) {
					editor.html('');
				});
			});
		</script>
<form>
	<textarea name="content"
		style="width: 800px; height: 400px; visibility: hidden;">KindEditor</textarea>
	<p>
		<input type="button" name="getHtml" value="取得HTML" /> <input
			type="button" name="isEmpty" value="判断是否为空" /> <input type="button"
			name="getText" value="取得文本(包含img,embed)" /> <input type="button"
			name="selectedHtml" value="取得选中HTML" /> <br /> <br /> <input
			type="button" name="setHtml" value="设置HTML" /> <input type="button"
			name="setText" value="设置文本" /> <input type="button"
			name="insertHtml" value="插入HTML" /> <input type="button"
			name="appendHtml" value="添加HTML" /> <input type="button"
			name="clear" value="清空内容" /> <input type="reset" name="reset"
			value="Reset" />
	</p>
</form>
</head>
<body>
</body>
</html>