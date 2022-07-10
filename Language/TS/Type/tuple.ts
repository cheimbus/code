const person : {
    name : string;
    age : number;
    details : any[];
    role : [number, string, [string, number], boolean];
} = {
    name : "siu",
    age : 100,
    details : ["hi", "hello", 1],
    role : [1, "hi", ["hi", 2], true]
}

// push() 내장 메서드를 사용할 경우
const man : {
    role : [number, string];
} = {
    role : [1, "hi"]
};

man.role.push(true); // error
man.role.push("hello"); // [1, "hi", "hello"]

// pop() 내장 메서드를 사용할 경우
const man : {
    role : [number, string];
} = {
    role : [1, "hi"]
};

man.role[0] = 400; // [400, "hi"]
man.role[1] = 100; // [1, 100]
man.role[1] = true; // error
man.role[3] = "hello"; // [1, "hi", undefined, "hello"]