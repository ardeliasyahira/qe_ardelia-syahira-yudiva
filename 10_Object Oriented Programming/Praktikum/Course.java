public class Course {
    //Membuat atribut
    private String title;
    private String description;
    private String pengajar;
    private String level;
    private double harga;

    //Membuat constructor
    public Course(String title, String description, String pengajar, String level, double harga) {
        this.title = title;
        this.description = description;
        this.pengajar = pengajar;
        this.level = level;
        this.harga = harga;
    }

    //Membuat Setter dan Getter untuk title

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    //Setter dan Getter untuk description

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    //Setter dan Getter pengajar

    public void setPengajar(String pengajar) {
        this.pengajar = pengajar;
    }

    public String getPengajar() {
        return pengajar;
    }

    //Setter dan Getter untuk level

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    //Setter dan Getter untuk harga

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    //Membuat method getInfo() untuk menampilkan informasi khusus
    public void getInfo() {
        System.out.println("==="); // Separator
        System.out.println("COURSE INFO");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Lecturer: " + pengajar);
        System.out.println("Level: " + level);
        System.out.println("Price: " + harga);
        System.out.println("==="); // Separator
    }

    //Main method
    public static void main(String[] args) {
        Course course = new Course("Data Science","Learn about Data Science", "John Doe", "All level", 150000);
        course.getInfo();
        Course course1 = new Course("Algorithm","Master the basics of algorithm", "Enki", "Beginner", 75000);
        course1.getInfo();
        Course course2 = new Course("Docker","Learn about Docker Data from ZERO to MASTER", "Ray Krieger", "All level", 125000);
        course2.getInfo();
    }
}

