package p114j1;

import android.os.Looper;

/* JADX INFO: renamed from: j1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackgroundThreadStateHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2480b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f41006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f41007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<T> f41008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f41009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f41010e;

    /* JADX INFO: renamed from: j1.b$a */
    /* JADX INFO: compiled from: BackgroundThreadStateHandler.java */
    public interface a<T> {
        void c(T t8, T t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2480b(Object obj, Looper looper, Looper looper2, t tVar, a aVar) {
        this.f41006a = tVar.a(looper, null);
        this.f41007b = tVar.a(looper2, null);
        this.f41009d = obj;
        this.f41010e = obj;
        this.f41008c = aVar;
    }
}
