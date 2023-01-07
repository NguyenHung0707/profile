
function checksend() {
    var name = document.getElementById('firstname');
    var name2 = document.getElementById('lastname');
    var email1 = document.getElementById('email');
    var phone2 = document.getElementById('phone');
    var message0 = document.getAnimations('message');

    var firstname = name.value;
    var lastname = name2.value;
    var email = email1.value;
    var phone = phone2.value;
    var message = message0.value;
    if(firstname == "" || lastname == "" || email == "" || phone == "" || message == "") {
        alert("Please enter enough.");
        return;
    }
    else
        alert("Successful");
}



