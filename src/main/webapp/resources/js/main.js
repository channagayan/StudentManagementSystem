/**
 * Created by Chann on 7/18/2015.
 */
jQuery(document).ready(function ($) {
    $('#msgFormName').html("Fill this form to add a new Student");
    $('#msgStudentList').html("Student List");

});

var viewStudent = function (id) {
    $.ajax({
        type: "GET",
        cache: false,
        data: "",
        url: '/student/view?id=' + id,
        success: function (response) {
            if (response) {
                $('#viewStudent').html(response);
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
    });

};

var validateForm = function () {
    if ($('#name').val() == "") {
        alert("Name should not be left blank");
        $('#name').focus();
        return false;
    } else if ($('#lastName').val() == "") {
        alert("Name should not be left blank");
        $('#lastName').focus();
        return false;
    } else if ($('#age').val() == "") {
        alert("age should not be left blank");
        $('#age').focus();
        return false;
    } else if ($('#department').val() == "") {
        alert("department should not be left blank");
        $('#department').focus();
        return false;
    } else if ($('#degree').val() == "") {
        alert("degree should not be left blank");
        $('#degree').focus();
        return false;
    } else if ($('#indexNumber').val() == "") {
        alert("index number should not be left blank");
        $('#indexNumber').focus();
        return false;
    }
    else if (!$.isNumeric($("#age").val())) {
        alert("Age should be numeric");
        $('#age').focus();
        return false;
    }

}


