const user = {
    address : { seoul : false }
}

console.log(user.good?.nice) // undefined
console.log(user.address?.good) // undefined
console.log(user.first?.second) // undefined
console.log(user.first.second) // err
