package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28877b = a(ToNumberPolicy.f28817c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToNumberPolicy f28878a;

    public NumberTypeAdapter(ToNumberPolicy toNumberPolicy) {
        this.f28878a = toNumberPolicy;
    }

    public static m a(ToNumberPolicy toNumberPolicy) {
        return new m() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.m
            public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
                if (aVar.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    public final Number read(M7.a aVar) throws IOException {
        JsonToken jsonTokenY0 = aVar.y0();
        int iOrdinal = jsonTokenY0.ordinal();
        if (iOrdinal == 5 || iOrdinal == 6) {
            return this.f28878a.a(aVar);
        }
        if (iOrdinal == 8) {
            aVar.n0();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + jsonTokenY0 + "; at path " + aVar.s());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(M7.b bVar, Number number) throws IOException {
        bVar.f0(number);
    }
}
