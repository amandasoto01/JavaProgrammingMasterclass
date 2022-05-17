package com.example.game;

import java.util.List;

public interface ISaveable {

     List<String> save();
     void read (List<String> savedObjects);
}
