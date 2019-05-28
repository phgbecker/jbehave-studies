package stories;

public class IncreaseCounterStoryTest extends AbstractStory {

    @Override
    String storyName() {
        return "IncreaseCounter.story";
    }

    @Override
    Object stepInstance() {
        return new IncreaseCounterSteps();
    }
    

}
