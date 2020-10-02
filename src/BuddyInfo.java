public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;
    public BuddyInfo(String name,String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }




    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        BuddyInfo Name1= new BuddyInfo("John",  "Carleton",  "613");
        System.out.println("Hello" +" "+ Name1.getName());
    }

}


