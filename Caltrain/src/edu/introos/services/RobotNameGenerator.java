/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.introos.services;

import java.util.Random;

/**
 *
 * @author Allendale
 */
public class RobotNameGenerator {
    
    public String[] names = {
        "Jack",
        "Lewis",
        "James",
        "Logan",
        "Daniel",
        "Ryan",
        "Aaron",
        "Oliver",
        "Liam",
        "Jamie",
        "Ethan",
        "Alexander",
        "Cameron",
        "Finlay",
        "Kyle",
        "Adam",
        "Harry",
        "Matthew",
        "Callum",
        "Lucas",
        "Nathan",
        "Aiden",
        "Dylan",
        "Charlie",
        "Connor",
        "Thomas",
        "Alfie",
        "Joshua",
        "William",
        "Jayden",
        "Andrew",
        "Kai",
        "Max",
        "Ben",
        "Samuel",
        "Luke",
        "Tyler",
        "Rory",
        "David",
        "Michael",
        "Riley",
        "Noah",
        "Cole",
        "Joseph",
        "John",
        "Archie",
        "Jacob",
        "Fraser",
        "Rhys",
        "Ross",
        "Calum",
        "Jay",
        "Josh",
        "Euan",
        "Mason",
        "Owen",
        "Sam",
        "Leo",
        "Robert",
        "Scott",
        "Leon",
        "Robbie",
        "Benjamin",
        "Caleb",
        "Oscar",
        "Harris",
        "Murray",
        "Sean",
        "Christopher",
        "Kieran",
        "Aidan",
        "Jake",
        "Evan",
        "Kayden",
        "Arran",
        "Angus",
        "Brodie",
        "Ewan",
        "Muhammad",
        "Alex",
        "Declan",
        "Finn",
        "Blair",
        "Ollie",
        "Reece",
        "Corey",
        "Kian",
        "Harrison",
        "Taylor",
        "Kaiden",
        "Kenzie",
        "Cody",
        "Craig",
        "Mohammed",
        "Calvin",
        "Mark",
        "Jude",
        "Luca",
        "Ciaran",
        "George",
        "Zak",
        "Zac",
        "Charles",
        "Gregor",
        "Hamish",
        "Isaac",
        "Harvey",
        "Shay",
        "Struan",
        "Lee",
        "Steven",
        "Joe",
        "Lennon",
        "Patrick",
        "Jason",
        "Louis",
        "Olly",
        "Bailey",
        "Marcus",
        "Peter",
        "Sebastian",
        "Gabriel",
        "Jackson",
        "Zack",
        "Ashton",
        "Brandon",
        "Reuben",
        "Theo",
        "Paul",
        "Conor",
        "Hayden",
        "Lachlan",
        "Ruaridh",
        "Innes",
        "Stuart",
        "Jordan",
        "Sonny",
        "Alan",
        "Blake",
        "Zachary",
        "Cooper",
        "Ellis",
        "Caiden",
        "Fergus",
        "Jakub",
        "Zach",
        "Findlay",
        "Alistair",
        "Elliot",
        "Harley",
        "Anthony",
        "Callan",
        "Filip",
        "Louie",
        "Lyle",
        "Mohammad",
        "Brody",
        "Cayden",
        "Cian",
        "Marc",
        "Danny",
        "Shaun",
        "Austin",
        "Joel",
        "Nicholas",
        "Rio",
        "Rocco",
        "Dean",
        "Jonathan",
        "Carson",
        "Duncan",
        "Mitchell",
        "Ruairidh",
        "Stephen",
        "Dominic",
        "Kerr",
        "Edward",
        "Lloyd",
        "Mackenzie",
        "Martin",
        "Ali",
        "Henry",
        "Kevin",
        "Tom",
        "Alasdair",
        "Billy",
        "Freddie",
        "Keir",
        "Levi",
        "Junior",
        "Allan",
        "Campbell",
        "Darren",
        "Drew",
        "Oskar",
        "Arron",
        "Ayden",
        "Douglas",
        "Frederick"
    };

    public String generateName(){
        Random rand = new Random();
    int randomNum = rand.nextInt(names.length);
    return names[randomNum];		
    } 
    
}
