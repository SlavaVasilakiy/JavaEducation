

import java.util.Scanner;

/**
 *
 * @author Vasilakii Vyacheslav
 */
public class App {

    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Scanner scanner = new Scanner(System.in);
        Functionalities functionalities = new Functionalities(scanner);
        
        FamilyTreeBuilder familyTreeBuilder = new FamilyTreeBuilder(scanner, familyTree);
        familyTreeBuilder.buildDefaultFamilyTree();
        
        Finder finder = new Finder(familyTree);
        
        TextBasedUserInterface textBasedUserInterface = new TextBasedUserInterface(scanner, functionalities, familyTreeBuilder, finder);
        textBasedUserInterface.start();


    }

}
