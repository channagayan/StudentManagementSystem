/**
 * Created by Chann on 7/18/2015.
 */
jQuery(document).ready(function($) {
    $('#msg').html("This is updated by jQuery");

});

var viewStudent = function(id){
        $.ajax({
            type: "GET",
            cache: false,
            data: "",
            url:  '/cinglevue/student/view?id='+id,
            success: function (response) {
                $('#viewStudent').html(response);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert(jqXHR.status + ' ' + jqXHR.responseText);
            }
        });

};

var setStudentPage = function(result){
    //$("#viewStudent").html("<b>"+result+"</b>");
    $('#viewStudent').css('display','block');
    $('#viewStudent').dialog();
};

