package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentHostCallback.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1352q<H> extends AbstractC1349n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityC1347l f17631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityC1347l f17632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f17633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f17634e;

    public AbstractC1352q(ActivityC1347l activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        Handler handler = new Handler();
        this.f17631b = activity;
        this.f17632c = activity;
        this.f17633d = handler;
        this.f17634e = new z();
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract ActivityC1347l e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public abstract void h();
}
