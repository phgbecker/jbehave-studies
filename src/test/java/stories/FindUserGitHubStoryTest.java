package stories;

public class FindUserGitHubStoryTest extends AbstractStory {

    @Override
    String storyName() {
        return "FindUserGitHub.story";
    }

    @Override
    Object stepInstance() {
        return new FindUserGitHub();
    }

}
