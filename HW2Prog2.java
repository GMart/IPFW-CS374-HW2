// Garrett Martin
// CS374 HW2P2

import java.io.*;
import java.net.*;

public class HW2Prog2 {
    public static void main(String[] args) throws Exception {

		String URLarg = args[0].trim();
        URL oracle = new URL(URLarg);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}