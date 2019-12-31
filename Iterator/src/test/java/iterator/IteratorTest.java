package iterator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IteratorTest {
    @Test
    public void iterator_test() {
        Topic[] topics = new Topic[5];
        topics[0] = new Topic("topic1");
        topics[1] = new Topic("topic2");
        topics[2] = new Topic("topic3");
        topics[3] = new Topic("topic4");
        topics[4] = new Topic("topic5");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < topics.length; i++) {
            expected.append(topics[i].getName());
        }
        List<Topic> list = new TopicList(topics);
        Iterator<Topic> iterator = list.iterator();
        while (iterator.hasNext()) {
            Topic currentTopic = iterator.next();
            stringBuilder.append(currentTopic.getName());
        }

        assertThat(stringBuilder.toString())
                .as("has the same elements")
                .isEqualTo(expected.toString());
    }
}