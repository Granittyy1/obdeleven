package Z6;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: compiled from: InflaterConfigModule_ProvidesDisplayMetricsFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<Application> f7939b;

    public j(e eVar, p268va.a<Application> aVar) {
        this.f7938a = eVar;
        this.f7939b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = this.f7939b.get();
        this.f7938a.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }
}
