package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1326p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1325o f17269a = new C1325o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1324n<?> f17270b;

    static {
        AbstractC1324n<?> abstractC1324n = null;
        try {
            abstractC1324n = (AbstractC1324n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f17270b = abstractC1324n;
    }
}
