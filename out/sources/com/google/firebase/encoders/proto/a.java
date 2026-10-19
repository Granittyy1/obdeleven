package com.google.firebase.encoders.proto;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: AtProtobuf.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Protobuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28113a;

    public a(int i10) {
        this.f28113a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return Protobuf.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        a aVar = (a) ((Protobuf) obj);
        if (this.f28113a == aVar.f28113a) {
            Object obj2 = Protobuf.IntEncoding.f28111b;
            aVar.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f28113a) + (Protobuf.IntEncoding.f28111b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f28113a + "intEncoding=" + Protobuf.IntEncoding.f28111b + ')';
    }
}
