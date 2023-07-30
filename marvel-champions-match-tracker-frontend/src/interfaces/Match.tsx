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

export default Match;