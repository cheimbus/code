const count = 0;
const text = "";
const boolean = false;

const firtst = count || 22;
const second = text || "hello!";
const third = boolean || true

console.log(firtst); // 22
console.log(second); // hello
console.log(third); // true


const text1 = "";

const one = text1 || "hi, hello, bye!";
const two = text1 ?? "hi, hello, bye!";

console.log(one); // "hi, hello, bye!"
console.log(two); // ""
