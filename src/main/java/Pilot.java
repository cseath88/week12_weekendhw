public class Pilot extends CrewMember{
    private CrewMemberRank rank;
    private String licenseNumber;

    public Pilot(String name, CrewMemberRank rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String flyPlane() {
        return "This is your Captain speaking, we are now at cruising altitude.";
    }
}
