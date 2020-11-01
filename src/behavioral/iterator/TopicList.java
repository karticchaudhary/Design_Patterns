package behavioral.iterator;

public class TopicList implements List<Topic> {

    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public CustomIterator<Topic> iterator() {
        return new TopicIterator(topics);
    }

}
