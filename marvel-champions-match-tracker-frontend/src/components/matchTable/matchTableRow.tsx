import MatchTableRowProps from "../../interfaces/MatchTableRowProps";

const MatchTableRow: React.FC<MatchTableRowProps> = ({index, match}) => {
    return (
        <tr>
            <td>{index}</td>
            <td>{match?.hero}</td>
            <td>{match?.deck}</td>
            <td>{match?.villain}</td>
            <td>{match?.expertMode ? "Yes" : "No"}</td>
            <td>{match?.modules}</td>
            <td>{match?.won ? "Yes" : "No"}</td>
            <td>{match?.timestamp.toString()}</td>
        </tr>
    )
}

export default MatchTableRow;