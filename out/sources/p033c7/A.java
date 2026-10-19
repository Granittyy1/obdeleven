package p033c7;

import N7.b;
import androidx.compose.ui.graphics.colorspace.q;
import io.reactivex.internal.operators.maybe.e;
import io.reactivex.internal.operators.maybe.k;
import p123ja.h;
import qa.a;

/* JADX INFO: compiled from: ImpressionStorageClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f22338c = b.J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f22339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h<b> f22340b = io.reactivex.internal.operators.maybe.b.f40795b;

    public A(T t8) {
        this.f22339a = t8;
    }

    public final h<b> a() {
        h<b> hVar = this.f22340b;
        e eVarA = this.f22339a.a(b.M());
        F0.b bVar = new F0.b(this);
        a.c cVar = a.f46191d;
        return new k(hVar.e(new k(eVarA, bVar, cVar)), cVar, new q(1, this));
    }
}
