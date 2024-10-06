package Assignment2.Bridge;

// Рендеринг документа с выделением
public class HighlightRenderEngine implements RenderEngine {
    @Override
    public void render(String documentTitle) {
        System.out.println("Рендеринг документа с выделением текста: " + documentTitle); // Рендеринг с выделением
    }
}
