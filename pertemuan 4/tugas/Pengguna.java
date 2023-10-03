package tugas;

public class Pengguna {
    private String nama, email;

    public Pengguna(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String info() {
        String info = "";
        info += "Nama : " + nama + "\n";
        info += "Email : " + email + "\n";
        return info;
    }
}
