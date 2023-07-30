import { Table } from "react-bootstrap";
import Match from "../../interfaces/Match";
import MatchTableProps from "../../interfaces/MatchTableProps";
import MatchTableRow from "./matchTableRow";
  

const MatchTable: React.FC<MatchTableProps> = ({matches}) => {
    return (
        <Table striped bordered hover>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Hero</th>
                    <th>Deck</th>
                    <th>Villain</th>
                    <th>Expert mode</th>
                    <th>Modules</th>
                    <th>Win</th>
                    <th>Timestamp</th>
                </tr>
            </thead>
            <tbody>
                {matches?.map((match, index) => <MatchTableRow index={index} match={match} key={match.id}/>)}
            </tbody>
        </Table>
    )
}

export default MatchTable;