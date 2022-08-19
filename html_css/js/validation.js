$("#formValidation").validate({
    rules:{
        name:{
            required: true,
            minlength: 5   
        },
        email:{
            required: true,
            email:true
        },
        password: {
            required: true,
            minlength: 8
        },
        confirmPassword: {
            required: true,
            minlength: 5,
            equalTo: "#password"
        },
    },

    messages: {
        name:{
            required: "Please enter your name",
            minlength: "Name should be atleast 5 characters"
        },
        email:"Please enter your email",
        password:{
            required: "Please enter password",
            minlength: "Password should have length atleast of 8"
        },
        confirmPassword:{
            required: "Please enter password",
            minlength: "Password should have length atleast of 8",
            equalTo: "Password does not match"
        }
    },

    submitHandler: function(form) {
      form.submit();
    }
});
