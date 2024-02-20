/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sujal Rabari
 */
import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Choose your favourite genre from the following list:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        int genreChoice = scanner.nextInt();
        String chosenGenre = genres[genreChoice - 1];

        UserProfile userProfile = new UserProfile(name, chosenGenre);
        System.out.println("Your user profile was created successfully!");
    }
}

