package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class V implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeneratedMessageLite f17176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f17178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17179d;

    public V(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.f17176a = generatedMessageLite;
        this.f17177b = str;
        this.f17178c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f17179d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f17179d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final boolean a() {
        return (this.f17179d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final I b() {
        return this.f17176a;
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final ProtoSyntax c() {
        return (this.f17179d & 1) == 1 ? ProtoSyntax.f17166b : ProtoSyntax.f17167c;
    }

    public final Object[] d() {
        return this.f17178c;
    }

    public final String e() {
        return this.f17177b;
    }
}
