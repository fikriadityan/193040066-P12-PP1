/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author fikri aditya
 */
public class Graph {
    private Vertex vertexList[]; // array of vertices
    private int adjMat[][]; // adjacency matrix
    private int nVerts; // current number of vertices

    // Constructor
    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        // Initialize adjacency matrix to 0
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    // Method to add a vertex to the graph
    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    // Method to add an edge between two vertices
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1; // For undirected graph
    }

    // Method to get a vertex
    public Vertex getVertex(int index) {
        return vertexList[index];
    }

    // Method to display the adjacency matrix
    public void adjacencyMatrix() {
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to display vertex and edges details
    public void displayGraphDetails() {
        System.out.println("Vertex and Edges:");
        for (int i = 0; i < nVerts; i++) {
            System.out.print("Vertex " + vertexList[i].getLabel() + " is connected to: ");
            for (int j = 0; j < nVerts; j++) {
                if (adjMat[i][j] == 1) {
                    System.out.print(vertexList[j].getLabel() + " ");
                }
            }
            System.out.println();
        }
    }
}
