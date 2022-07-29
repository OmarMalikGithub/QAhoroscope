"use strict"

document.querySelector("#test").addEventListener("click", function (event) {
    event.preventDefault();

    axios.get("http://localhost:8080/horrorscope")
        .then(res => {
            console.log(res);
            this.reset();
        }).catch(err => console.log(err));

})