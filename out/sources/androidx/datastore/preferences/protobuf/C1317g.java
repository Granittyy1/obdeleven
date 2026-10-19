package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ByteString.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1317g extends ByteString.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17228b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ByteString f17230d;

    public C1317g(ByteString byteString) {
        this.f17230d = byteString;
        this.f17229c = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17228b < this.f17229c;
    }
}
