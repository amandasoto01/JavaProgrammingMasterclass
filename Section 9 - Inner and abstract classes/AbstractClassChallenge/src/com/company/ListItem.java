package com.company;

public abstract class ListItem<T>{

    protected ListItem previousNode = null;
    protected ListItem nextNode = null;
    protected T value;

    public ListItem(T value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem node);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem node);

    abstract int compareTo(ListItem node);

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
