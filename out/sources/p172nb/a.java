package p172nb;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f45025c;

    public /* synthetic */ a(String str, boolean z10) {
        this.f45024b = str;
        this.f45025c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f45024b;
        i.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f45025c);
        return thread;
    }
}
