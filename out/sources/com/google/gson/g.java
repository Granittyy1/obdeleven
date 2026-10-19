package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: JsonElement.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    @Deprecated
    public g() {
    }

    public final i d() {
        if (this instanceof i) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            M7.b bVar = new M7.b(stringWriter);
            bVar.f4612i = Strictness.f28812b;
            TypeAdapters.f28937z.write(bVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
