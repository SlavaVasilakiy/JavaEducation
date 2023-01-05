

import java.util.ArrayList;

public class Finder {

    private final FamilyTree familyTree;

    public Finder(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public void findParents(String name) {
        if (isMember(name)) {
            if (familyTree.getParents(name).isEmpty()) {
                System.out.println(name + " не имеет родителей в генеалогическом древе");
            } else {
                System.out.println("Родители " + name + " are:");
                familyTree.getParents(name).stream().forEach(parent -> System.out.println("-" + parent.getName()));
            }
        }
    }

    public void findChildren(String name) {
        try {
            if (familyTree.getMember(name).getChildren().isEmpty()) {
                System.out.println(name + " не имеет детей в генеалогическом древе");
            } else {
                System.out.println("Дети " + name + " are: ");
                familyTree.getMember(name).getChildren().stream().forEach(child -> System.out.println("-" + child.getName()));
            }
        } catch (Exception e) {
            System.out.println(name + " не является членом генеалогического древа");
        }
    }

    public void areSiblings(String firstName, String secondName) {
        if (isMember(firstName) && isMember(secondName)) {
            if (familyTree.getParents(firstName).equals(familyTree.getParents(secondName))) {
                if (familyTree.getParents(firstName).isEmpty()) {
                    System.out.println(firstName + " и " + secondName + " не  брат и сестра.");
                    return;
                }
                System.out.println(firstName + " и " + secondName + " брат и сестра.");
            } else {
                System.out.println(firstName + " и " + secondName + " не  брат и сестра.");
            }
        }
    }

    public void findAncestors(String name) {
        if (isMember(name)) {
            ArrayList<Member> ancestors = familyTree.getParents(name);
            if (ancestors.isEmpty()) {
                System.out.println(name + " не имеет предков в генеалогическом древе");
                return;
            } else {
                for (int i = 0; i < ancestors.size(); i++) {
                    if (familyTree.hasParents(ancestors.get(i).getName())) {
                        ancestors.addAll(familyTree.getParents(ancestors.get(i).getName()));
                    }
                }
            }
            System.out.println("Предки для " + name + " are: ");
            ancestors.stream().forEach(ancestor -> System.out.println("-" + ancestor.getName()));
        }
    }

    public void showAllMembers() {
        familyTree.getFamilyTree().stream().forEach(member -> System.out.println("-" + member.getName()));
    }

    private boolean isMember(String name) {
        if (!familyTree.getFamilyTree().contains(familyTree.getMember(name))) {
            System.out.println(name + " не член генеалогического древа");
            return false;
        }
        return true;
    }

}
