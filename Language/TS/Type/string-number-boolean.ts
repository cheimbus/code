function add(num1: number, num2: number, case1: string, case2: boolean) {
    const result = num1 + num2; // number로 명시를 하여 사용됨
        console.log(case1 + num1 + num2); // 자바스크립트 오류로 string으로 됨
        console.log(case1+ result); // this is 15.1
    }

const number1 = 5.1;
const number2 = 10;
const string = "this is ";
const boolean = true;

add(number1, number2, string, boolean);