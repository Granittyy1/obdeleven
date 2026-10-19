package p283x0;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Callable<j.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f47852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f47853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f47854e;

    public f(String str, Context context, e eVar, int i10) {
        this.f47851b = str;
        this.f47852c = context;
        this.f47853d = eVar;
        this.f47854e = i10;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() throws Exception {
        return j.a(this.f47851b, this.f47852c, this.f47853d, this.f47854e);
    }
}
