package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: compiled from: JsonObject.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedTreeMap<String, g> f28826b = new LinkedTreeMap<>(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f28826b.equals(this.f28826b));
    }

    public final int hashCode() {
        return this.f28826b.hashCode();
    }
}
