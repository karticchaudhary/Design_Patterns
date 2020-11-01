package behavioral.iterator;

public class MainClass {

    public static void main(String[] args) {
        Topic[] topics = new Topic[5];
        topics[0] = new Topic("1");
        topics[1] = new Topic("2");
        topics[2] = new Topic("3");
        topics[3] = new Topic("4");
        topics[4] = new Topic("5");

        List<Topic> list = new TopicList(topics);
        CustomIterator<Topic> iterator = list.iterator();
        System.out.println(iterator.currentItem().getName());

    }
}
