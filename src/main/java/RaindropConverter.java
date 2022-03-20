class RaindropConverter {

    String convert(int number) {

        StringBuilder sb = new StringBuilder();
        if (number % 3 == 0) {
            sb.append("Pling");
        }

        if (number % 5 == 0) {
            sb.append("Plang");
        }

        if (number % 7 == 0) {
            sb.append("Plong");
        }
        if (sb.length() == 0) {
            return String.valueOf(number);
        } else {
            return sb.toString();
        }

//        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
//            return "PlingPlangPlong";
//        } else if (number % 3 == 0 && number % 7 == 0) {
//            return "PlingPlong";
//        } else if (number % 3 == 0 && number % 5 == 0) {
//            return "PlingPlang";
//        } else if (number % 5 == 0 && number % 7 == 0) {
//            return "PlangPlong";
//        } else if (number % 3 == 0) {
//            return "Pling";
//        }  else if (number % 5 == 0) {
//            return "Plang";
//        } else if (number % 7 == 0) {
//            return "Plong";
//        } else {
//            return String.valueOf(number);
//        }
    }

}
