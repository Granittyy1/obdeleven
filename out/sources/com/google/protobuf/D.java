package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MapEntryLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class D<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f29022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f29023b;

    /* JADX INFO: compiled from: MapEntryLite.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat$FieldType f29024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WireFormat$FieldType f29025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f29026c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
            this.f29024a = wireFormat$FieldType;
            this.f29025b = wireFormat$FieldType2;
            this.f29026c = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
        this.f29022a = new a<>(wireFormat$FieldType, wireFormat$FieldType2, obj);
        this.f29023b = obj;
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v10) {
        return C2075q.b(aVar.f29025b, 2, v10) + C2075q.b(aVar.f29024a, 1, k10);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        C2075q.m(codedOutputStream, aVar.f29024a, 1, k10);
        C2075q.m(codedOutputStream, aVar.f29025b, 2, v10);
    }
}
