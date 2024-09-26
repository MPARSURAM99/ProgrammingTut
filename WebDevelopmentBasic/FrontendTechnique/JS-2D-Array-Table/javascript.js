var ary = [
    ["Parsu", 23, "Male", "Cuttack"],
    ["Rojalin", 19, "Female", "Balasore"],
    ["Rashmi", 19, "Male", "Nakhara"],
    ["Ashutosh", 20, "Male", "Jajpur"],
    ["Pritam", 23, "Male", "Bhanjanagar"],
    ["Rakesh", 22, "Male", "Ganjam"],
    ["Abhipsa", 19, "Female", "Kalahandi"]
];
document.write("<table id='tbl' >");

// document.write("<div id='heading'>");
document.write("<td class='heading'>" + "Name" + "</td>" );
document.write("<td class='heading'>" + "Age" + "</td>");
document.write("<td class='heading'>" + "Gender" + "</td>");
document.write("<td class='heading'>" + "City" + "</td>");
// document.write("</div>");

for(var i = 0; i < ary.length; i++){
    document.write("<tr>");
    for(var j = 0; j < ary[i].length; j++){
        document.write( "<td id='tdata'>" + ary[i][j] + "</td>");
    }
    document.write("</tr>");
}
document.write("</table>")