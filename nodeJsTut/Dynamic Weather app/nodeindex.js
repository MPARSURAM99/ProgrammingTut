const http = require("http");
const fs = require("fs");
const requests = require("requests");

const index = fs.readFileSync("index.html", "utf-8");

// replace method

const replaceVal = (tempVal, orgVal) => {
    let temperature = tempVal.replace("{%tempVal%}", orgVal.main.temp);
        temperature = temperature.replace("{%tempMin%}", orgVal.main.temp_min);
        temperature = temperature.replace("{%tempMax%}", orgVal.main.temp_max);
        temperature = temperature.replace("{%location%}", orgVal.name);
        temperature = temperature.replace("{%country%}", orgVal.sys.country);
        return temperature;
}

const server = http.createServer((req, res) => {
    if(req.url == "/"){
        requests("https://api.openweathermap.org/data/2.5/weather?q=Pune&appid=c2726088afae4de03aa086f5e6852801",).on('data', (chunk) => {
        const objData = JSON.parse(chunk);
        const arrData = [objData];
        // console.log(arrData[0].main.temp);
        const realTimeData = arrData.map((val) => replaceVal(index, val)).join(" ");
        res.write(realTimeData);
        // console.log(realTimeData);

    })
    .on('end', (err) => {
    if (err) return res.end('connection closed due to errors', err);
    res.end();
    });
    }
});

server.listen(8000, "127.0.0.1");