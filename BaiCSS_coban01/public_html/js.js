var x=""; // bien
function getid(bt){ // tra ve gia tri bt
    return document.getElementById(bt)
} 
function transform(input){ //  
    x +=input.value;
    getid("input").value = x
}
function result(){ // ket qua
    if(getid("input").value != ""){
        x=eval(getid("input").value)
        return getid("input").value=x;
    }
}
function square(){ // binh phuong
    if(getid("input").value != ""){
        x=getid("input").value * getid("input").value
        return getid("input").value=x
    }
    else getid("input").value=""
}
function factorial(input){ // luy thua
    if(getid("input").value !=""){
        var rs = 1
        x = getid("input").value
        if(x>0){
            for(var i=1;i<=x;i++){
                rs=rs*i
            }
        }
    }
    else reset();
}
function squareroot(){
    if(getid("input").value != ""){
        x=Math.sqrt()(getid("input").value)
    }
}
function deleted(){
    x=getid("input").value;
    x=x.slice(0,-1);
    return getid("input").value==x
}
function reset(){
    x= ""
    return getid("input").value=x;
}
