$(function(){
    $("#regist-button").click(regist);
});
function regist() {
    var name=$("#name").val().trim();
    var password=$("#password").val().trim();
    $.ajax({
        url:"/user/regist",
        type:"post",
        data:{"name":name, "password":password},
        dataType:"json",
        success:function (result) {
            if(result.status==1){
                $("#fail").text(result.msg);
            }else if(result.status==0){
                $("#fail").text(result.msg);
            }
        }
    })
}
