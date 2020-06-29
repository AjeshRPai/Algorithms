package TreeAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class FindTheSumOfNodes {

    static int total=0;

    public static void main(String[] args) {
        findSum(getDummyRoot());
        System.out.println("total = " + total);
    }

    static void findSum(Leaf leaf) {
        if(leaf.value == null)
            return;
        total += leaf.value;
        if(leaf.leafList==null)
            return;
        for (Leaf leaf1 : leaf.leafList) {
            findSum(leaf1);
        }
    }

    public static Leaf getDummyRoot() {
        Leaf root = new Leaf(0,null);
        Leaf leaf1 = new Leaf(1,null);
        Leaf leaf2 = new Leaf(2,null);

        List<Leaf> children = new ArrayList<>();
        children.add(leaf1);
        children.add(leaf2);
        Leaf leaf3 = new Leaf(3,children);

        Leaf leaf4 = new Leaf(4,null);
        Leaf leaf5 = new Leaf(5,null);
        Leaf leaf6 = new Leaf(6,null);
        List<Leaf> children2 = new ArrayList<>();
        children2.add(leaf4);
        children2.add(leaf5);
        children2.add(leaf6);
        Leaf leaf7 = new Leaf(7,children2);

        List<Leaf> rootChildren = new ArrayList<>();
        rootChildren.add(leaf3);
        rootChildren.add(leaf7);

        root.leafList = rootChildren;
        return root;
    }
}
