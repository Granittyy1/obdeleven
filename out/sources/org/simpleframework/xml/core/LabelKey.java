package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
class LabelKey {
    private final Class label;
    private final String name;
    private final Class owner;
    private final Class type;

    public LabelKey(Contact contact, Annotation annotation) {
        this.owner = contact.getDeclaringClass();
        this.label = annotation.annotationType();
        this.name = contact.getName();
        this.type = contact.getType();
    }

    public boolean equals(Object obj) {
        return (obj instanceof LabelKey) && equals((LabelKey) obj);
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.owner.hashCode();
    }

    public String toString() {
        return "key '" + this.name + "' for " + this.owner;
    }

    private boolean equals(LabelKey labelKey) {
        if (labelKey == this) {
            return true;
        }
        if (labelKey.label == this.label && labelKey.owner == this.owner) {
            return labelKey.type == this.type && labelKey.name.equals(this.name);
        }
        return false;
    }
}
