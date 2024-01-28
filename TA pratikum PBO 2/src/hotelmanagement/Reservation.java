package hotelmanagement;

public class Reservation {
    private int roomNumber;
    private String guestName;
    private double totalPrice;

    public Reservation(int roomNumber, String guestName, double totalPrice) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.totalPrice = totalPrice;
    }

    // Getter dan setter untuk setiap atribut
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }



    @Override
    public String toString() {
        return "Nomor Kamar: " + roomNumber +
                "\nNama Tamu: " + guestName +
                "\nTotal Harga: $" + totalPrice + "\n";
    }
}
