package org.simpleframework.xml.stream;

import J4.i;

/* JADX INFO: loaded from: classes2.dex */
class InputPosition implements Position {
    private EventNode source;

    public InputPosition(EventNode eventNode) {
        this.source = eventNode;
    }

    @Override // org.simpleframework.xml.stream.Position
    public int getLine() {
        return this.source.getLine();
    }

    @Override // org.simpleframework.xml.stream.Position
    public String toString() {
        return i.b(getLine(), "line ");
    }
}
