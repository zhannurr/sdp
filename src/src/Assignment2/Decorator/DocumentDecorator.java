package Assignment2.Decorator;

import Assignment2.Document;

public abstract class DocumentDecorator implements Document {
    protected Document decoratedDocument;

    public DocumentDecorator(Document decoratedDocument) {
        this.decoratedDocument = decoratedDocument;
    }

    @Override
    public void display() {
        decoratedDocument.display();
    }
}
