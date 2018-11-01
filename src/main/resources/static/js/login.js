$(function(){
    $("#login-button").click(checkLogin);
});
function checkLogin() {
    var name=$("#name").val().trim();
    var password=$("#password").val().trim();
    $.ajax({
        url:"/user/login",
        type:"post",
        data:{"name":name, "password":password},
        dataType:"json",
        success:function (result) {
            if(result.status==0){
                window.location.href="/main";
            }else if(result.status==1){
                $("#fail").text(result.msg);
            }
        }
    })
}
