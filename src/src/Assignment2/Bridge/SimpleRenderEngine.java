package Assignment2.Bridge;

// Простой рендеринг документа
public class SimpleRenderEngine implements RenderEngine {
    @Override
    public void render(String documentTitle) {
        System.out.println("Rendering document in simple mode: " + documentTitle); // Рендеринг в простом режиме
    }
}
