package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        String[] playlist = {"wheniseeyouagain", "borntorun", "nothingelsematters", "cecelia "};

         int jumpsForward = 0;

       //  startIndex = 1;
        // int jumpsBackward = -1;
        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i] != selection) {
                jumpsForward += 1;

            }
        }
        if (jumpsForward < playList.length + jumpsForward ) {
            return jumpsForward;

        } else {


            return jumpsForward;

        }





        }



    }





