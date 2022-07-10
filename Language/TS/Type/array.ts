const person : {
    name : string;
    age : number;
    details : string[];
} = {
    name : "siu",
    age : 100,
    details : ["hi", "hello"]
}
for(let wow of person.details) {
    console.log(wow.toUpperCase());
} // hi hello