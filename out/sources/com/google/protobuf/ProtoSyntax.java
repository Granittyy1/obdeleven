package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtoSyntax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ProtoSyntax f29082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProtoSyntax f29083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ProtoSyntax[] f29084d;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        f29082b = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        f29083c = protoSyntax2;
        f29084d = new ProtoSyntax[]{protoSyntax, protoSyntax2};
    }

    public ProtoSyntax() {
        throw null;
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) f29084d.clone();
    }
}
