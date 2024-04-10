import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group("Group 1");
        Group group2 = new Group("Group 2");
        Group group3 = new Group("Group 3");

        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group3);

        StreamService streamService = new StreamService();
        List<Stream> streams = Arrays.asList(stream1, stream2);
        streamService.sortStreams(streams);

        for (Stream stream : streams) {
            System.out.println("Stream size: " + stream.size());
            for (Group group : stream) {
                System.out.println("  Group: " + group.getName());
            }
        }
    }
}