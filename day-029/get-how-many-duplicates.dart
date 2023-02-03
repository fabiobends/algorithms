int getHowManyDuplicates(str1, str2){
  if (str1.length > str2.length) return 0;
  final map = <String, List<int>>{};
  for (int i = 0; i < str1.length; i++){
    if(!map.containsKey(str1[i])){
      map[str1[i]] = [1,0];
    } else {
      map[str1[i]]?[0]++;
    }
  }
  for (int i = 0; i < str2.length; i++){
    if(map.containsKey(str2[i])){
      map[str2[i]]?[1]++;
    }
  }
  int min = double.maxFinite.toInt();
  map.forEach((_, value){
    var result = (value[1]/value[0]).floor();
    if (result < min){
      min = result;
    }    
  });
  return min;
}