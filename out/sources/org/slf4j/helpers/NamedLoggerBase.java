package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
abstract class NamedLoggerBase implements cc.b, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // cc.b
    public String getName() {
        return this.name;
    }

    public Object readResolve() throws ObjectStreamException {
        return cc.c.c(getName());
    }
}
