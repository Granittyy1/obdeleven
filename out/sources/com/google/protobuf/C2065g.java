package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ByteString.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2065g extends ByteString.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29148b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ByteString f29150d;

    public C2065g(ByteString byteString) {
        this.f29150d = byteString;
        this.f29149c = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29148b < this.f29149c;
    }
}
