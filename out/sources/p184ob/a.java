package p184ob;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f45251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45252d;

    public a(String name, boolean z10) {
        i.e(name, "name");
        this.f45249a = name;
        this.f45250b = z10;
        this.f45252d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f45249a;
    }
}
