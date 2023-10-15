package managecandidate;

public class Experience extends Candidate {

  private int yearExperience;
  private String professionalSkill;


  public Experience(int yearExperience, String professionalSkill,
      String id, String firstName, String lastName, String birthDate,
      String address, String phone, String email, int typeCandidate) {
    super(id, firstName, lastName, birthDate, address, phone, email,
        typeCandidate);
    this.yearExperience = yearExperience;
    this.professionalSkill = professionalSkill;
  }

  public int getYearExperience() {
    return yearExperience;
  }

  public void setYearExperience(int yearExperience) {
    this.yearExperience = yearExperience;
  }

  public String getProfessionalSkill() {
    return professionalSkill;
  }

  public void setProfessionalSkill(String professionalSkill) {
    this.professionalSkill = professionalSkill;
  }

}