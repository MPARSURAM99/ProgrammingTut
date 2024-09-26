var target = document.querySelector("#box");
var left = 0 ;
var up = 0 ;

document.querySelector("body").addEventListener("keydown", function(e){
    var keyPrassed = e.key;


    switch (keyPrassed) {
        case "ArrowRight":
            left = left + 5;
            break;
        case "ArrowLeft" :
            left = left - 5;
            break;
        case "ArrowDown":
            up = up + 5;
            break;
        case "ArrowUp":
            up = up - 5;
            break;        
        default:
            console.log("Other key is pressed")
            break;
    }
    target.style.marginLeft = left + "px";
    target.style.marginTop = up + "px";
})