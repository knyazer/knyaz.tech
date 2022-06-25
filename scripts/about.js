// Calculate my age for the current date - I'm too lazy to update this every year
let ageDifMs = Date.now() - (new Date("May 6, 2004"));
let ageDate = new Date(ageDifMs);
document.getElementById("age").innerHTML = Math.abs(ageDate.getUTCFullYear() - 1970);

document.onkeydown = function(e) {
    e = e || window.event;
    console.log(e.code);

    // On escape press return to home page
    if (e.code == "Escape")
    {
        document.location.href = "../";
    }
}