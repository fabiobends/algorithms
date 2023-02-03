function getHowManyDuplicates(str1: string, str2: string) {
  if (str1.length > str2.length) return 0;
  const map = new Map<string, Array<number>>();
  for (let i = 0; i < str1.length; i++) {
    const letter = str1[i];
    if (!map.has(letter)) {
      map.set(letter, [1, 0]);
    } else {
      const arr = map.get(letter);
      if (arr) {
        arr[0]++;
        map.set(letter, arr);
      }
    }
  }
  for (let i = 0; i < str2.length; i++) {
    const letter = str2[i];
    if (map.has(letter)) {
      const arr = map.get(letter);
      if (arr) {
        arr[1]++;
        map.set(letter, arr);
      }
    }
  }
  let min = Number.MAX_VALUE;
  map.forEach((value, key) => {
    let result: number = Math.floor(value[1] / value[0]);
    if (result < min) {
      min = result;
    }
  });
  return min;
}
