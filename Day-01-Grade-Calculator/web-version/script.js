function calculateGrade(){
    let marks = document.getElementById("marks").value;
    let resultText = "";

    if(marks >= 75 && marks <=100){
        resultText = "Result: A";
    }
    else if(marks >= 65 && marks <75){
        resultText = "Result: B";
    }
    else if(marks >= 55 && marks <65){
        resultText = "Result: C";
    }
    else if(marks >= 35 && marks <55){
        resultText = "Result: S";
    }
    else if(marks >= 0 && marks < 35){
        resultText = "Result: F";
    }
    else{
        resultText = "Invalid Marks"
    }

    document.getElementById("result").innerText = resultText;
}