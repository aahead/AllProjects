function isPrime() {
  const inputNumber = parseInt(document.getElementById('numberInput').value);

  if (isNaN(inputNumber) || inputNumber < 2) {
      alert('Please enter a valid number greater than 1.');
      return;
  }

  let isPrime = true;

  for (let i = 2; i <= Math.sqrt(inputNumber); i++) {
      if (inputNumber % i === 0) {
          isPrime = false;
          break;
      }
  }

  if (isPrime) {
      alert(inputNumber + ' is a prime number.');
  } else {
      alert(inputNumber + ' is not a prime number.');
  }
}
