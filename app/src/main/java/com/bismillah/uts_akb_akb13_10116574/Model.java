package com.bismillah.uts_akb_akb13_10116574;

// NIM : 10116574
// NAMA : IRA YUTI
// KELAS : AKB13
// TANGGAL PENGERJAAN : 20 MEI 2019

public class Model {

        //Model Intro
        String Title,Description;
        int ScreenImg;


        public Model(String title, String description, int screenImg) {
            Title = title;
            Description = description;
            ScreenImg = screenImg;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public int getScreenImg() {
            return ScreenImg;
        }

        public void setScreenImg(int screenImg) {
            ScreenImg = screenImg;
        }
    }


