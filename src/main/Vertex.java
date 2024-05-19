/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author fikri aditya
 */
public class Vertex {
    private char label; // label (e.g. 'A')
    private boolean wasVisited; // flag to indicate if the vertex was visited

    // Constructor
    public Vertex(char lab) {
        this.label = lab;
        this.wasVisited = false;
    }

    // Getter for label
    public char getLabel() {
        return label;
    }

    // Setter for label
    public void setLabel(char label) {
        this.label = label;
    }

    // Getter for wasVisited
    public boolean isWasVisited() {
        return wasVisited;
    }

    // Setter for wasVisited
    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}

