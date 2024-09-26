// example 1
/*const add = (a,b) => {
    return a + b;
};
module.exports = add;*/


// example 2
/*const add = (a,b) => {
    return a + b;
};
const sub = (a,b) => {
    return a - b;
};
module.exports.add = add;
module.exports.sub = sub;*/

//example 3
const add = (a,b) => {
    return a + b;
};
const sub = (a,b) => {
    return a - b;
};
const mult = (a,b) => {
    return a * b;
}
module.exports = {add, sub, mult};