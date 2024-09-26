const os = require("os");
/*var osData = os.arch();
console.log(osData);*/
/*let freeMemoryInByte = os.freemem();
var freeMemory = freeMemoryInByte/1024/1024/1024;
console.log(freeMemory);*/
const totalMemoryInByte = os.totalmem();
console.log(`Total memory is ${totalMemoryInByte/1024/1024/1024}`);