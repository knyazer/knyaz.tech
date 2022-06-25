let scrolled = (window.scrollY != 0);
let helper = document.getElementsByClassName('helper')[0];

const hideHelper = function() {
    helper.style.display = "none";
    helper.style.zIndex = -9999;
    helper.style.animationDuration = 0;

    localStorage.setItem("helperUsed", true);
}

if (scrolled || localStorage.getItem("helperUsed"))
    hideHelper();

window.onscroll = function() {
    if (scrolled == false) {
        scrolled = true;

        hideHelper();
    }
}

// On escape press go to root
document.onkeyup = function(e) {
    e = e || window.event;
    console.log(e.code);

    if (e.code == "Escape")
    {
        document.location.href = "../";
    }
}