class student{
    constructor(name){
        this.studentName = name;
        document.write("Hello " + this.studentName);
    }
}

class wellcome extends student{
    hello(){
        document.write(" You are selected");
    }
}

let a = new wellcome("Parsu");
a.hello();