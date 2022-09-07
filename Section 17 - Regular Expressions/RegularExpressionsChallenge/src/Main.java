import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Challenge # 1;
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));


        // Challenge # 2
        String challenge2 = "I want a ball.";
        String reg = "I want a (bike|ball).";
        System.out.println(challenge1.matches(reg));
        System.out.println(challenge2.matches(reg));


        String validation = "I want a \\w+.";
        System.out.println(challenge1.matches(validation));
        System.out.println(challenge2.matches(validation));

        // Challenge # 3
        Pattern challenge3Pattern = Pattern.compile(validation);
        Matcher challenge3Matcher = challenge3Pattern.matcher(challenge1);
        System.out.println("3: " + challenge3Matcher.matches());
        challenge3Matcher = challenge3Pattern.matcher(challenge2);
        System.out.println("3: "+challenge3Matcher.matches());

        // Challenge 4
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("[ ]","_"));
        System.out.println(challenge4.replaceAll("\\s" , "_"));

        // Challenge # 5
        String challenge5 = "aaabccccccccefffg";
        String challenge5Reg = "^[a]{3}[b][c]{8}[e][f]{3}[g]$";
        String s1 = "[abcdefg]+";
        String s2 = "[a-g]+";
        Pattern patternChallenge5 = Pattern.compile(challenge5Reg);
        Matcher matcherChallenge5 = patternChallenge5.matcher(challenge5);
        System.out.println("5: " + matcherChallenge5.matches());

        // Challenge # 6
        String challenge5Reg2 = "^a{3}bc{8}ef{3}g$";
        patternChallenge5 = Pattern.compile(challenge5Reg2);
        matcherChallenge5 = patternChallenge5.matcher(challenge5);
        System.out.println(matcherChallenge5.matches());
        System.out.println(challenge5.replaceAll(challenge5Reg2, "challenge"));

        // Challenge # 7
        String challenge7 = "abcd.1235";
        String challenge7v2 = "jsdh.12";
        String reg7 = "^[A-Z][a-z]+[.][0-9]+$";
        Pattern pattern7 = Pattern.compile(reg7);
        Matcher matcher7 = pattern7.matcher(challenge7);
        System.out.println(matcher7.matches());

        // Challenge # 8
        System.out.println("-----------------------------");
        String challenge8 = "abcd.135uvqz.7tzik.999";
        String reg8 = "([A-Za-z]+)([.])([0-9]+)";
        Pattern patternGroup = Pattern.compile(reg8);
        Matcher matcherGroup = patternGroup.matcher(challenge8);

        while(matcherGroup.find()){
            System.out.println("Occurrence: " + matcherGroup.group(3));
        }

        // Challenge # 9
        String challenge9 = "abcd.123\tuvqz.7\ttzik.999\n";
        Pattern pattern9  = Pattern.compile("([A-Za-z]+)([.])([0-9]+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);

        while(matcher9.find()){
            System.out.println("Occurrence: " + matcher9.group(3));
        }

        // Challenge # 10
        String challenge10 = "abcd.123\tuvqz.7\ttzik.999\n";
        Pattern pattern10  = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);

        while(matcher10.find()){
            System.out.println("Occurrence: " + matcher10.start(1) + " to " + (matcher10.end(1)-1));
        }

        // Challenge # 11
        String challenge11 = "{0,2}, {0,5}, {1,3}, {2,4}";
        Pattern pattern11  = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);

        while(matcher11.find()) {
            System.out.println("11: ocurrence: " + matcher11.group(1));
        }

        System.out.println("-----------------------------");
        String challenge11a = "{0,2}, {0,5}, {1,3}, {2,4}, {x,y}, {6,34}, {11,12}";
        Pattern pattern11a  = Pattern.compile("\\{(\\d+,\\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);

        while(matcher11a.find()) {
            System.out.println("11a: occurrence: " + matcher11a.group(1));
        }

        System.out.println("****************");
        // Challenge # 12
        String zipCode = "11111";
        String reg12 = "[0-9]{5}";
        Pattern pattern12 = Pattern.compile(reg12);
        Matcher matcher12 = pattern12.matcher(zipCode);
        System.out.println(matcher12.matches());
        System.out.println(zipCode.matches("^\\d{5}$"));
        
        // Challenge # 13
        String challenge13 = "11111-1111";
        String reg13 = "^[0-9]{5}-[0-9]{4}$";
        Pattern pattern13 = Pattern.compile(reg13);
        Matcher matcher13 = pattern13.matcher(challenge13);
        System.out.println("13: " + matcher13.matches());
        System.out.println(zipCode.matches("^\\d{5}-\\d{4}$"));

        // Challenge # 14
        String challenge14 = "11111-1111";
        String reg14 = "^[0-9]{5}(-[0-9]{4})?$";
        Pattern pattern14 = Pattern.compile(reg14);
        Matcher matcher14 = pattern14.matcher(challenge14);
        System.out.println("14: " + matcher14.matches());
        System.out.println(zipCode.matches("^\\d{5}(-\\d{4})?$"));

    }
}