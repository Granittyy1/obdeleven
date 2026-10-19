package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f17111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f17112b;

    static {
        D d10 = null;
        try {
            d10 = (D) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f17111a = d10;
        f17112b = new E();
    }
}
