package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1327q.a;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ExtensionSchema.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1324n<T extends C1327q.a<T>> {
    public abstract void a(Map.Entry entry);

    public abstract GeneratedMessageLite.e b(C1323m c1323m, I i10, int i11);

    public abstract C1327q<T> c(Object obj);

    public abstract C1327q<T> d(Object obj);

    public abstract boolean e(I i10);

    public abstract void f(Object obj);

    public abstract Object g(Object obj) throws IOException;

    public abstract void h(Object obj) throws IOException;

    public abstract void i(Object obj) throws IOException;

    public abstract void j(Map.Entry entry) throws IOException;
}
