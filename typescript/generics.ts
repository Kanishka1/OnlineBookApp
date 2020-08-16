function getArray<T>(items : T[] ) : T[] {  
    return new Array<T>().concat(items);  
    }  
    let genNumArr = getArray([100, 200, 300]);  
    let genStrArr = getArray(["Hello", "World"]);  
    genNumArr.push(400); // OK  
    genStrArr.push("Hello TypeScript"); // OK  
    //genNumArr.push("Hi"); // compiler error  
    //genStrArr.push(500); // compilererror  
    console.log(genNumArr);  
    console.log(genStrArr);