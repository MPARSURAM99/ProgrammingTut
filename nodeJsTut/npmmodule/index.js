const chalk = require("chalk");
// console.log(chalk.blue.bold("Hello world"));
// console.log(chalk.red.bold.underline("Hello World"));

var validator = require('validator');
const correctEmail = validator.isEmail('mparsuram99@gmail.com');
console.log(correctEmail ? chalk.green.inverse(correctEmail) : chalk.red.inverse(correctEmail));