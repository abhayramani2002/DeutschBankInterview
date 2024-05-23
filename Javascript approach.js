const arr = [
  //Given output
  {
    id: 1,
    stationName: "Halasuru",
    city: "Bangalore",
    state: "Karnataka",
  },
  {
    id: 2,
    stationName: "MG Road",
    city: "Delhi",
    state: "Karnataka",
  },
];

const output = {
  //Needs to be printed like this
  Bangalore: [
    {
      id: 1,
      stationName: "Halasuru",
      city: "Bangalore",
      state: "Karnataka",
    },
    {
      id: 2,
      stationName: "MG Road",
      city: "Bangalore",
      state: "Karnataka",
    },
  ],
  Delhi: [
    {
      id: 6,
      stationName: "Janakpuri West",
      city: "Delhi",
      state: "New Delhi",
    },
    {
      id: 7,
      stationName: "Karolbhagh",
      city: "Delhi",
      state: "New Delhi",
    },
  ],
};

const cityMetroMap = new Map();
arr.forEach((station) => {
  const city = station.city;
  if (!cityMetroMap.has(city)) {
    cityMetroMap.set(city, []);
  }
  cityMetroMap.get(city).push(station);
});

//converting our map to object
const Result = Object.fromEntries(cityMetroMap);
console.log(Result);
