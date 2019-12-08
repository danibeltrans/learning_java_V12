import java.util.stream.Stream;

public class StringNews {


    public static void main(String[] args) {

        System.out.println("hello".indent(2));

        var multiline = "This\nis a\nmulti-line\nString";

        // System.out.println(multiline);

        multiline.lines().forEach(System.out::println);


        var indented = multiline.indent(5);

        //System.out.println(indented);

        indented.lines().forEach(System.out::println);



        String text ="$This $is $jackass";

        String[] result = StringNews.words(StringNews.clean(text));

        print(result);

        result= text.transform(String::toUpperCase)
                .transform(StringNews::clean)
                .transform(StringNews::words);

        print(result);

    }

    public static String clean (String s){
        return s.replaceAll("\\$", "");
    }

    public static String[] words (String s){
        return s.split(" ");
    }

    public static void print(String[] strings){

        Stream<String> stringStream = Stream.of(strings);
        stringStream.forEach(System.out::println);

    }



}
