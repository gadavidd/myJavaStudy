package org.example.test;

import org.example.main.DijkstrasAlgorithm;
import org.example.main.SelectionSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DijkstrasAlgorithmTest {

    @Test
    public void DijkstrasAlgorithmTest1() {
        DijkstrasAlgorithm dijkstrasAlgorithm = new DijkstrasAlgorithm();

        //create the graph
        dijkstrasAlgorithm.graph.put("start", new HashMap<>());
        dijkstrasAlgorithm.graph.get("start").put("a", 6.0);
        dijkstrasAlgorithm.graph.get("start").put("b", 2.0);

        dijkstrasAlgorithm.graph.put("a", new HashMap<>());
        dijkstrasAlgorithm.graph.get("a").put("fin", 1.0);

        dijkstrasAlgorithm.graph.put("b", new HashMap<>());
        dijkstrasAlgorithm.graph.get("b").put("a", 3.0);
        dijkstrasAlgorithm.graph.get("b").put("fin", 5.0);

        dijkstrasAlgorithm.graph.put("fin", new HashMap<>());

        //The costs table
        dijkstrasAlgorithm.costs.put("a", 6.0);
        dijkstrasAlgorithm.costs.put("b", 2.0);
        dijkstrasAlgorithm.costs.put("fin", Double.POSITIVE_INFINITY);

        //The parents table
        dijkstrasAlgorithm.parents.put("a", "start");
        dijkstrasAlgorithm.parents.put("b", "start");
        dijkstrasAlgorithm.parents.put("fin", null);

        dijkstrasAlgorithm.findLowestCostNode();

        System.out.println("Cost from the start to each node:");
        System.out.println(dijkstrasAlgorithm.costs); // { a: 5, b: 2, fin: 6 }
    }
}
