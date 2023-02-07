function myfun(){
var team1=document.getElementById("t1").value;
var score1=document.getElementById("ts1").value;
var team2=document.getElementById("t2").value;
var score2=document.getElementById("ts2").value;

var s1=score1.split('/')
var s2=score2.split('/')

if (s1[1]>10 || s2[1]>10 || s1[1] == null || s2[1] == null) {
    console.log("error");
    document.getElementById('result').innerText = `score board is wrong`
}
else if(team1 === team2){
    console.log("team names are same");
    document.getElementById('result').innerText = ` both team can not be same`
}
else{

    if(s1[0] > s2[0]){
        document.getElementById('result').innerText = `${team1} wins by ${s1[0] - s2[0]} runs`
    }
    else{
        document.getElementById('result').innerText = `${team2} wins by ${10-s2[1]} wickets`
    }
}
}