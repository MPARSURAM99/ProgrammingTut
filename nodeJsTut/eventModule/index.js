// creating a class

const EventEmitter = require("events");
const event = new EventEmitter();

event.on("checkPage", (status, message) => {
    console.log(`My status code is ${status} & Message is ${message}`);
})

event.emit("checkPage", 200, "success");