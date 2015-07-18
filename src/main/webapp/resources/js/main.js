/**
 * Created by Chann on 7/18/2015.
 */
jQuery(document).ready(function($) {
    $('#msg').html("Fill this form to add a new Student");

});

var viewStudent = function(id){
        $.ajax({
            type: "GET",
            cache: false,
            data: "",
            url:  '/student/view?id='+id,
            success: function (response) {
                if(response){
                $('#viewStudent').html(response);
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert(jqXHR.status + ' ' + jqXHR.responseText);
            }
        });

};


