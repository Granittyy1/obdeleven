package org.slf4j.helpers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MarkerIgnoringBase extends NamedLoggerBase {
    private static final long serialVersionUID = 9044267456635152283L;

    @Override // org.slf4j.helpers.NamedLoggerBase, cc.b
    public String getName() {
        return this.name;
    }

    public final String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }
}
