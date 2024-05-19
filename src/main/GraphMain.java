/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author fikri aditya
 */
public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        // Menambahkan vertex
        graph.addVertex('A'); // 0 (start for dfs)
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2
        graph.addVertex('D'); // 3
        graph.addVertex('E'); // 4

        // Menambahkan edge
        graph.addEdge(0, 1); // AB
        graph.addEdge(0, 3); // AD
        graph.addEdge(1, 0); // BA
        graph.addEdge(1, 3); // BD
        graph.addEdge(2, 0); // CA
        graph.addEdge(3, 0); // DA
        graph.addEdge(3, 1); // DB

        // Menampilkan adjacency matrix
        System.out.println("Adjacency Matrix:");
        graph.adjacencyMatrix();
        System.out.println();

        // Menampilkan detail vertex dan edge
        graph.displayGraphDetails();
    }
}

