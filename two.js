function main(){
let num = prompt("Enter a number:"); // Get user input
let splitNum = num.split(""); // split the input to get individual nums
let calc = 0; // an empty int to catch all the added values
for (let i = 0; i < splitNum.length; i++){ // iterates through the splitted list
    let allNums = parseInt(splitNum[i]); // assigns the index of i to allNums while making it an integer
    calc += allNums; // adds the value of allNums to the empty calc int
}
console.log(calc); // prints the sum of the splitted list
}
main();
