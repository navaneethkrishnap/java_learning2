package coreJava.enumerations;

enum Ranking{
    First('A'), Second('B'), Third('C'), Other('D'), NotAvail;

    private char grade;

    Ranking(char n){
        grade = n;
    }
    Ranking(){
        grade = 'N';
    }

    char getGrade(){
        return grade;
    }
}
public class EnumDemo3 {
    public static void main(String[] args) {
        {
            Ranking test;

            System.out.println("Grade of Rank 3 is "+ Ranking.Third.getGrade() + " grade.\n");

            // Display all Ranks and Grades
            System.out.println("All Ranks and Grading");
            for(Ranking r : Ranking.values()){
                System.out.println(r + " rank will get "+ r.getGrade()+ " grade.");
            }

        }
    }
}
