let date = new Date();
let year = date.getFullYear();
let month = date.getMonth();

const months = [
    "Januari",
    "Februari",
    "Maart",
    "April",
    "Mei",
    "Juni",
    "Juli",
    "Augustus",
    "September",
    "Oktober",
    "November",
    "December"
];

const days = [
  "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday"
];

function myCalender() {
let myMonth = months[month];
let cDate = myMonth + " " + year;
document.getElementById("cDate").innerHTML = cDate;
document.getElementById("cDate2").innerHTML = cDate;

let myDay = [];
for (i=0; i<14; i++) {
let newDate = new Date(date);
newDate.setDate(date.getDate()+i);
let dayNumber = newDate.getDate();
let weekDay = days[newDate.getDay()];
let myDay2 = dayNumber + " " + weekDay;
myDay.push(myDay2);
}

let endDay1 = myDay.slice(0,7);
let endDay2 = myDay.slice(7,14); 
document.getElementById("days").innerHTML = endDay1.join("<br><br>");
document.getElementById("days2").innerHTML = endDay2.join("<br><br>");
} 