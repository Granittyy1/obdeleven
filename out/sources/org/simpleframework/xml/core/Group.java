package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Group {
    LabelMap getElements() throws Exception;

    Label getLabel(Class cls);

    Label getText() throws Exception;

    boolean isInline();

    boolean isTextList();

    String toString();
}
