/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uaspbonoteapp;

import com.mycompany.uaspbonoteapp.db.NoteAppMenu;


/**
 *2
 * @author Azmy
 */
public class Main{

    public static void main(String[] args) {
        NoteAppMenu noteapp = new NoteAppMenu("notes.db");
        noteapp.start();
    }
}
