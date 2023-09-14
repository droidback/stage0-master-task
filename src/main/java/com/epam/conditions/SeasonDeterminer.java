package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        //winter -> 12 1 2
        //spring -> 3 4 5
        //summer -> 6 7 8
        //fall -> 9 10 11
        String result = switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Wrong month number";
        };

        System.out.println(result);
    }

}
