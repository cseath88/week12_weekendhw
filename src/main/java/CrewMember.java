public class CrewMember extends Person {

    private CrewMemberRank rank;

    public CrewMember(String name, CrewMemberRank rank) {
        super(name);
        this.rank = rank;
    }

    public CrewMemberRank getRank() {
        return rank;
    }
}
