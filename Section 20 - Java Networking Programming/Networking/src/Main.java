import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://example.org");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line = "";
            while(line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close();


            /*
            //URI uri = new URI("http://username:password@myserver.com:500/catalogue/phones?os=android#samsung");
             URI baseUri = new URI("http://username:password@mynewserver.com:500");
            // relative uri because it doesn't completely identify the resource
            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=12345");

            URI resolvedUri1 = baseUri.resolve(uri1);
            URI resolvedUri2 = baseUri.resolve(uri2);
            URI resolvedUri3 = baseUri.resolve(uri3);

            URL url1 = resolvedUri1.toURL();
            System.out.println("URL = " + url1);
            URL url2 = resolvedUri2.toURL();
            System.out.println("URL = " + url2);
            URL url3 = resolvedUri3.toURL();
            System.out.println("URL = " + url3);

            URI relativizedURI = baseUri.relativize(resolvedUri2);
            System.out.println("Relative URI = " + relativizedURI);


            // URI uri = new URI("hello");

            /* System.out.println("Scheme = " + uri.getScheme());
            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
            System.out.println("Authority = " + uri.getAuthority());
            System.out.println("User info = " + uri.getUserInfo());
            System.out.println("Host = " + uri.getHost());
            System.out.println("Port = " + uri.getPort());
            // Path to the specific resources in the host
            System.out.println("Path = " + uri.getPath());
            // Query set of key value pairs
            System.out.println("Query = " + uri.getQuery());
            System.out.println("Fragment = " + uri.getFragment());
            */

        } catch (MalformedURLException e ) {
            System.out.println("MalformedURLException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}