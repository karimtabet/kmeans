import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class KMeansClusteringTest {
    @Test
    public void testMain8Centroids() throws IOException {
        KMeansClustering kmeans = new KMeansClustering(8);
        kmeans.run();

        assertEquals(Files.readString(Paths.get("src/test/resources/expected_output_8_centroids.txt")),
                Files.readString(Paths.get("output.txt")));
    }
}