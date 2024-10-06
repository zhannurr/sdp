package Assignment2.Bridge;

public abstract class DocumentRenderer {
    protected RenderEngine engine;

    public DocumentRenderer(RenderEngine engine) {
        this.engine = engine;
    }

    public abstract void render(String content);
}
