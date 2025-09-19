package ru.mirea.fedoseev.practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        Author a2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');
        Author a3 = new Author("Unknown Writer", "unknown@nowhere.com", 'U');

        System.out.println(a1); // Tan Ah Teck (M) at ahTeck@somewhere.com
        System.out.println(a2); // Sue Grant (F) at suGrant@somewhere.com
        System.out.println(a3); // Unknown Writer (U) at unknown@nowhere.com

        a1.setEmail("newEmail@domain.com");
        System.out.println("After email change: " + a1.getEmail());
    }
}
