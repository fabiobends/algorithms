function isBalanced(s: string): string {
  // Write your code here
  if (s.length % 2 !== 0) return 'NO'

  while(s.length >= 1){
    if(s.includes('()')){
      s = s.replace('()', '');
    } else if(s.includes('[]')){
      s = s.replace('[]', '');
    } else if(s.includes('{}')){
      s = s.replace('{}', '');
    } else {
      break;
    }
  }
  if(s.length > 0) return 'NO'
  return 'YES'   
}