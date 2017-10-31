$(function(){
    $("#message_trigger_ok").click(function (e){
        e.preventDefault();
        $.scojs_message("成功！", $.scojs_message.TYPE_OK);
    });
    $("#message_trigger_err").click(function (e){
        e.preventDefault();
        $.scojs_message("失败！", $.scojs_message.TYPE_ERROR);
    });
})