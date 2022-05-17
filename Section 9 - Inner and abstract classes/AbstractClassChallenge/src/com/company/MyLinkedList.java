package com.company;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            //List empty, so this item becomes the head of the list
            this.root = item;
            return true;
        }

        //System.out.println(item.getValue());
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison < 0){
                //newItem is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //we reach the end of the list, insert at the end
                    currentItem.setNext(item).setPrevious(currentItem);
                    //item.setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                //new item is less, insert before
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    // item.setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                    // currentItem.setPrevious(item);
                }else{
                    //the node with previous is the root
                    item.setNext(this.root).setPrevious(item);
                    //this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            } else{
                //equal
                System.out.println(item.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                //found the item to delete
                if(currentItem == this.root){
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparison < 0 ){
                currentItem = currentItem.next();
            }else{
                //comparison>0
                //we are at an item grater than the one to be deleted, the item is not in the list
                System.out.println();
                return false;
            }
        }
        //we have reached the end of the list
        //wihtout finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
       /*if (this.root != null) {
            ListItem currentItem = this.root;
            System.out.println(this.root.getValue());
            while(currentItem.next() != null){
                currentItem = currentItem.next();
                System.out.println(currentItem.getValue());
            }
        }*/

        if(root == null){
            System.out.println("The list is empty");
        }else{
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

        /*if(root != null){
            System.out.println(root.getValue());
            traverse((root.next()));
        }*/
    }
}
