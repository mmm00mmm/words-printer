import conversion.Capitalize;
import conversion.Compress;
import conversion.Reverse;
import output.Horizontal;
import output.Vertical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        args = new String[]{"aaa bbb", "--capitalize", "--horizontal"};
        new Resolver(Arrays.asList(args));
    }
}