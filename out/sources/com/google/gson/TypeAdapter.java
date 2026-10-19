package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeAdapter<T> {

    public final class NullSafeTypeAdapter extends TypeAdapter<T> {
        public NullSafeTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(M7.a aVar) throws IOException {
            if (aVar.y0() != JsonToken.j) {
                return (T) TypeAdapter.this.read(aVar);
            }
            aVar.n0();
            return null;
        }

        public final String toString() {
            return "NullSafeTypeAdapter[" + TypeAdapter.this + "]";
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, T t8) throws IOException {
            if (t8 == null) {
                bVar.x();
            } else {
                TypeAdapter.this.write(bVar, t8);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new M7.a(reader));
    }

    public final T fromJsonTree(g gVar) {
        try {
            return read(new com.google.gson.internal.bind.a(gVar));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return !(this instanceof NullSafeTypeAdapter) ? new NullSafeTypeAdapter() : this;
    }

    public abstract T read(M7.a aVar) throws IOException;

    public final void toJson(Writer writer, T t8) throws IOException {
        write(new M7.b(writer), t8);
    }

    public final g toJsonTree(T t8) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, t8);
            ArrayList arrayList = bVar.f28956p;
            if (arrayList.isEmpty()) {
                return bVar.f28958r;
            }
            throw new IllegalStateException("Expected one JSON element but was " + arrayList);
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public abstract void write(M7.b bVar, T t8) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t8) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t8);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }
}
