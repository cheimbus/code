const first = 1;
const second = 2;
const third = 3;

enum Age { first = 1, second = 2, third = 3 };

const man : {
    role : [number, string];
    age : number;
} = {
    role : [1, "hello"],
    age : Age.second
};

console.log(man.age);