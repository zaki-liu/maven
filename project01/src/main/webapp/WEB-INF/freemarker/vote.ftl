<script>
var attendId = -1;
var url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx56bacb6a72b3183a&redirect_uri="
										+"http%3a%2f%2fkanj02.bidaround.cn%2fInit%2f"+attendId
										+"&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect";
//alert(url);								
window.location.href=url;
</script>