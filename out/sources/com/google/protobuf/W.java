package com.google.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class W implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f29094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f29096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29097d;

    public W(J j, String str, Object[] objArr) {
        this.f29094a = j;
        this.f29095b = str;
        this.f29096c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f29097d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f29097d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.protobuf.H
    public final boolean a() {
        return (this.f29097d & 2) == 2;
    }

    @Override // com.google.protobuf.H
    public final J b() {
        return this.f29094a;
    }

    @Override // com.google.protobuf.H
    public final ProtoSyntax c() {
        return (this.f29097d & 1) == 1 ? ProtoSyntax.f29082b : ProtoSyntax.f29083c;
    }

    public final Object[] d() {
        return this.f29096c;
    }

    public final String e() {
        return this.f29095b;
    }
}
