package com.company;

public class Node extends ListItem {

    public Node(Object value){
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextNode;
    }

    @Override
    ListItem setNext(ListItem next) {
        this.nextNode = next;
        return this.nextNode;
    }

    @Override
    ListItem previous() {
        return this.previousNode;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        this.previousNode = previous;
        return this.previousNode;
    }

    @Override
    int compareTo(ListItem node) {
        if(node != null){
            return ((String) super.getValue()).compareTo((String) node.getValue());
        }else{
            return -1;
        }
    }
}
