package exp5;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * Created by visha on 14-02-2017.
 */
public class Exp5_2 extends JFrame {

    Exp5_2() {

        setTitle("Exp. 5.1");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode veg = new DefaultMutableTreeNode("Vegetables");
        root.add(veg);

        DefaultMutableTreeNode v1 = new DefaultMutableTreeNode("Capsicum");
        veg.add(v1);
        DefaultMutableTreeNode v2 = new DefaultMutableTreeNode("Carrot");
        veg.add(v2);
        DefaultMutableTreeNode v3 = new DefaultMutableTreeNode("Tomato");
        veg.add(v3);
        DefaultMutableTreeNode v4 = new DefaultMutableTreeNode("Potato");
        veg.add(v4);

        DefaultMutableTreeNode fru = new DefaultMutableTreeNode("Fruits");
        root.add(fru);

        DefaultMutableTreeNode f1 = new DefaultMutableTreeNode("Banana");
        fru.add(f1);
        DefaultMutableTreeNode f2 = new DefaultMutableTreeNode("Mango");
        fru.add(f2);
        DefaultMutableTreeNode f3 = new DefaultMutableTreeNode("Apple");
        fru.add(f3);
        DefaultMutableTreeNode f4 = new DefaultMutableTreeNode("Blackberry");
        fru.add(f4);

        JTree tree = new JTree(root);

        JScrollPane jsp = new JScrollPane(tree,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jsp);
    }
    public static void main(String[] args) {

        Exp5_2 frame = new Exp5_2();
    }
}
