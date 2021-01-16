$(document).ready(function () {
    $(".div_exe").click(function () {
        var typename = $("#typename").val();
        var typedesc = $("#typedesc").val();
        insert(typename,typedesc);
    });
})
function insert(typename, typedesc) {
    var data = {
        questionTypeName: typename,
        questionTypeDesc: typedesc
    }
    $.ajax({
        url: 'http://localhost:8080/questiontypeinfo/insertQuestionType',
        data: JSON.stringify(data),
        contentType: "application/json;charset=UTF-8",
        type: 'post',
        success: function (r) {
            console.log(r);
            location.reload();
        }
    })
}