
$(function(){
	$("#userLogin").click(function(){
		var username = $("#username").val();
		var password = $("#password").val();
		$("#loginForm").attr("action","/project01/login").submit();
		
	});
	
	$("#userRegist").click(function(){
		var username = $("#username").val();
		var password = $("#password").val();
		$("#loginForm").attr("action","/project01/regist").submit();
	});
	

//	$.ajax({
//		type: "post",
//		url: "/bargain/adminLogin/getTotalUV",
//		success: function(totalUV){
//			var json = JSON.parse(totalUV);
//			$("#totalUV").append(json.totalUV);
//		}
//	
//	
//	});


});