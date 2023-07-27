import React, { useEffect, useState } from 'react';

interface Match {
  id: number;
  hero: string;
  deck: string;
  villain: string;
  expertMode: boolean;
  modules: string[];
  won: boolean;
  timestamp: Date;
}

function App() {

  const [matches, setMatches] = useState<Match[] | null>(null);

  useEffect(() => {
    fetch('http://localhost:8080/api/match')
      .then(data => {
        data.json().then((json: Match[]) => {
          setMatches(json);
        })
      });
  }, [])

  return (
    <div className="App">
      <h1>Matches</h1>
      {matches?.map(match => <p>- {match.timestamp.toString()}: {match.hero} vs {match.villain}: {match.won ? "WIN" : "LOSS"}</p>)}
    </div>
  );
}

export default App;