function truckTour(petrolpumps: number[][]): number {
  let curPetrol = 0;
  let index = 0;
  for(let i = 0; i < petrolpumps.length; i++){
    // petrol at the pump
    curPetrol += petrolpumps[i][0];
    // petrol at arrival to the next petrol station
    curPetrol -= petrolpumps[i][1];
    if(curPetrol < 0){
      curPetrol = 0;
      index = i + 1;
} }
  return index;
}