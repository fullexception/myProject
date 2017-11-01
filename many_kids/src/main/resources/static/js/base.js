$(function () {
    $(".head").css("top", $(document).scrollTop() + 0);
    $(".head-login").click(function () {
        $("#identifier").modal();
    })
    $(".user-login").click(function () {
        $(".login-message").html("账号或密码错误！");
    })
    $('.show-login').click(function () {
        $(".login-message").html("");
    })
    $(".login-username").blur(function () {
        if ($(".login-username").val() == '用户名' || $(".login-username").val() == '') {
            $(".login-username-message").removeClass("glyphicon-ok");
            $(".login-username-message").addClass("glyphicon-remove");
        }
        else{
            $(".login-username-message").removeClass("glyphicon-remove");
            ($(".login-username-message")).addClass("glyphicon-ok");
        }
    })
    $(".login-password").blur(function () {
        if ($(".login-password").val() == '密码' || $(".login-password").val() == '') {
            $(".login-password-message").removeClass("glyphicon-ok");
            $(".login-password-message").addClass("glyphicon-remove");
        }
        else{
            $(".login-password-message").removeClass("glyphicon-remove");
            ($(".login-password-message")).addClass("glyphicon-ok");
        }
    })
})


