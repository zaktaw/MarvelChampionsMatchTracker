import React, { useEffect, useState } from 'react';
import Match from './interfaces/Match';
import MatchTable from './components/matchTable/matchTable';

const App: React.FC = () => {

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
      <MatchTable matches={matches}/>
    </div>
  );
}

export default App;