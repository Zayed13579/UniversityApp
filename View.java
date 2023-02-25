package com.mycompany.universityapp;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    //----- Collections ----- :
    static ArrayList<Building> buildingList = new ArrayList<Building>();
    static ArrayList<Instructor> instructorsList = new ArrayList<Instructor>();
    //-----------------------

    //----- Objects ----- :
    static Scanner keyBoard = new Scanner(System.in);
    static University university;
    static Building computer;
    static Instructor ahmed;
    static Instructor zayed;
    //-------------------

    //----- Variable ----- :
    static int out;
    static int out2;
    static boolean booolean;
    static boolean booolean2;
    static String sOut;
    //--------------------

    public static void mainMenu() {
        //==================== Values ==================== :
        //---------- University ---------- :
        university = new University("Umm Al-Qura", "Mekka Al-awali");
        //---------------------------------

        //---------- Buildings ---------- :
        computer = new Building();
        computer.SetName("College of Computer and Information Systems");
        buildingList.add(computer);
        // _____ Ahmeds room _____ :
        Room ahmedRoom = new Room("1", "4");
        computer.roomList.add(ahmedRoom);
        //_________________________

        // _____ Zayeds room _____ :
        Room zayedRoom = new Room("2", "4");
        computer.roomList.add(zayedRoom);
        //_________________________
        //--------------------------------

        //---------- Instructors ---------- :
        ahmed = new Instructor("Ahmed lal alhindi", "20", "ahhindi@uqu.edu.sa", "oop", "1234");
        instructorsList.add(ahmed);

        zayed = new Instructor("Zayed faisal bakhsh", "20", "s443010753@st.uqu.edu.sa", "everything in the life", "4321");
        instructorsList.add(zayed);
        //----------------------------------
        //=================================================

        ///////////////////////////////////////////////////////////////
        System.out.println("----- Welcome to the Main menue -----");
        System.out.println("  1- Search .");
        System.out.println("  2- Exit .");
        System.out.println("-------------------------------------");
        System.out.println("Please enter your choice : ");
        out = keyBoard.nextInt();
        //-------------- start option 1 --------------- :

        //___I did this loop because if the user selects something that is not in the options ___:
        booolean = false;
        while (booolean == false) {
            if (out == 1) {
                System.out.println(">> Do you want to search about " + university.GetName() + "University  of " + university.GetLocation() + " ?");
                System.out.println("  1- Yes . \n  2- No .");
                out2 = keyBoard.nextInt();

                //___I did this loop because if the user selects something that is not in the options ___: 
                booolean2 = false;
                while (booolean2 == false) {
                    if (out2 == 1) {
                        System.out.println(">> So what do you want to search about it from the below ?");
                        System.out.println("  1- Building .\n  2- Instructor .");
                        out = keyBoard.nextInt();
                        booolean2 = true;
                        break;
                    } else if (out2 == 2) {
                        System.out.println(">> Ok , see you .");
                        booolean2 = true;
                        System.out.close();
                    } else {
                        System.out.println(">> That is not in the options try again : ");
                        out2 = keyBoard.nextInt();
                    }
                }
                booolean = true;
                //_____________________________________________________________________________________
            } else if (out == 2) {
                System.out.println(">> Ok , see you .");
                booolean = true;
                System.out.close();
            } else {
                System.out.println(">> That is not in the options try again : ");
                System.out.println("  1- Search .");
                System.out.println("  2- Exit .");
                out = keyBoard.nextInt();
            }
        }
        //_____________________________________________________________________________________
        //--------------------------------------------------

        //-------------- start option 2 --------------- :
        ////___I did this loop because if the user selects something that is not in the options ___:
        booolean = false;
        while (booolean == false) {
            if (out == 1) {
                System.out.println(">> There is " + buildingList.size() + " Buildings in the University and it is name " + computer.GetName() + "and it have " + computer.GetRoomList().size() + " rooms in the building .");
                booolean = true;
            } else if (out == 2) {
                System.out.println(">> So what do you want to search about him from the below ?");
                System.out.println("  1- Instructors number .\n  2- Instructors data .");
                out = keyBoard.nextInt();
                //___I did this loop because if the user selects something that is not in the options ___:
                booolean = false;
                while(booolean == false){
                    if (out == 1) {
                        System.out.println(">> There is " + instructorsList.size() + " Instructors in the University");
                        booolean2 = true;
                        booolean = true;
                    } else if (out == 2) {
                        System.out.println(">> What is the name of the Instructor from the below ?");
                        System.out.println("  1- ahmed lal alhindi .\n  2- zayed faisal bakhsh .");
                        out = keyBoard.nextInt();
                        booolean = false;
                        while (booolean == false) {
                            if (out == 1) {
                                sOut = "ahmed lal alhindi";
                                booolean = true;
                            } else if (out == 2) {
                                sOut = "zayed faisal bakhsh";
                                booolean = true;
                            } else {
                                System.out.println(">> That is not in the options try again : ");
                                out = keyBoard.nextInt();
                            }
                        }
                        int index = 0;
                        for (Instructor name : instructorsList) {
                            if (name.GetName().equalsIgnoreCase(sOut)) {
                                index = instructorsList.indexOf(name);
                            }
                        }
                            System.out.println("What do you want to search about him ?");
                            booolean = false;
                            do {
                                System.out.println("  1- all data .\n  2- his age .\n  3- his email .\n  4- teaches course .\n  5- his room number .\n  6- exit .");
                                out = keyBoard.nextInt();
                                switch (out) {
                                     case 1:
                                        System.out.println("Instructor age is : " + instructorsList.get(index).GetAge() + "\nInstructor email is : " + instructorsList.get(index).GetEmail() + "\nInstructor course is : " + instructorsList.get(index).GetSubject() + "\nInstructor room number is : " + instructorsList.get(index).GetRoomNum());
                                        System.out.println("==========================================================================================================================================");
                                        break;
                                    case 2:
                                        System.out.println("Instructor age is : " + instructorsList.get(index).GetAge());
                                        System.out.println("==========================================================================================================================================");
                                        break;
                                    case 3:
                                        System.out.println("Instructor email is : " + instructorsList.get(index).GetEmail());
                                        System.out.println("==========================================================================================================================================");
                                        break;
                                    case 4:
                                        System.out.println("\nInstructor course is : " + instructorsList.get(index).GetSubject());
                                        System.out.println("==========================================================================================================================================");
                                        break;
                                    case 5:
                                        System.out.println("\nInstructor room number is : " + instructorsList.get(index).GetRoomNum());
                                         System.out.println("==========================================================================================================================================");
                                        break;
                                }
                            } while (out != 6);
                        
                        booolean2 = true;
                        booolean = true;
                    } else {
                        System.out.println(">> That is not in the options try again : ");
                        out = keyBoard.nextInt();
                    }
                }    
                booolean = true;
                //_____________________________________________________________________________________
            } else {
                System.out.println(">> That is not in the options try again : ");
                out = keyBoard.nextInt();
            }
        }
        //----------------------------------------------
    }

}
