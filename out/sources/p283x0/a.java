package p283x0;

import android.graphics.Typeface;
import p211r0.f;
import p222s0.e;

/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.a f47839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f47840c;

    public a(e.a aVar, Typeface typeface) {
        this.f47839b = aVar;
        this.f47840c = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = this.f47839b.f46860f;
        if (eVar != null) {
            eVar.c(this.f47840c);
        }
    }
}
