public class Data {
  private Long id;
  private String name;
  private String description;
  private int rank;

  public Data(Long id, String name, String description, int rank) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.rank = rank;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getRank() {
    return rank;
  }

  @Override
  public String toString() {
    return "Data{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", rank=" + rank +
        '}';
  }
}
