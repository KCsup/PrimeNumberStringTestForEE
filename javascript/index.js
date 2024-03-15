const getPrimeString = (n) => {
  let primeStore = [2]
  let primeConcat = "2"

  for(let i = 0; i < (n + 5); i++) {
    let nextPrime = primeStore[i] + 1
    
    let primeFound = false
    while(!primeFound) {
      for(let c = 2; c < nextPrime; c++) {
        if(nextPrime % c == 0) {
          nextPrime += 1
          break
        }
        else if(c == nextPrime - 1) {
          primeFound = true
          break
        }
      }
    }

    primeStore.push(nextPrime)
    primeConcat += nextPrime
  }

  return primeConcat.substring(n, n + 5)
}

for(let i = 0; i < 500; i++)
  console.log(getPrimeString(i))
