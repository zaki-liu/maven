<!DOCTYPE html>
<html>
	<head>
		<title>友推互动</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0 , user-scalable=no">
		<link href="${cssRoot}/font-awesome.min.css" rel="stylesheet"/>
		<link href="${cssRoot}/swiper3.1.0.min.css"  rel="stylesheet" />
		<link href="${cssRoot}/main.css" rel="stylesheet"/>
		<!--<link href="../../media/css/font-awesome.min.css" rel="stylesheet"/>
		<link href="../../media/css/swiper3.1.0.min.css"  rel="stylesheet" />
		<link href="../../media/css/main.css" rel="stylesheet"/>-->

	</head>
	<body>
<form class="editActivityForm"  id="editActivityForm" action="/upload" method="post" enctype="multipart/form-data">
				<div class="uploadImgSect" onclick="selectImg()">
					<label>商品图片<span>(分辨率建议为600*600,png格式)</span></label>
					<input type="file" id="imgUploader" name="actImg"/>
				</div>
				<button type="submit" class="btnPay">确定</button>
			</form>
			</body>
</html>
