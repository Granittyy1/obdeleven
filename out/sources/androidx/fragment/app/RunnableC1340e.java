package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1340e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17593e;

    public /* synthetic */ RunnableC1340e(Object obj, Object obj2, Object obj3, int i10) {
        this.f17590b = i10;
        this.f17591c = obj;
        this.f17592d = obj2;
        this.f17593e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17590b) {
            case 0:
                P impl = (P) this.f17591c;
                kotlin.jvm.internal.i.e(impl, "$impl");
                P.g((Rect) this.f17593e, (View) this.f17592d);
                break;
            case 1:
                String applicationId = (String) this.f17591c;
                kotlin.jvm.internal.i.e(applicationId, "$applicationId");
                Context context = (Context) this.f17592d;
                String str = (String) this.f17593e;
                p165n4.i.f44889a.getClass();
                JSONObject jSONObjectA = p165n4.i.a();
                if (jSONObjectA.length() != 0) {
                    p165n4.i.d(applicationId, jSONObjectA);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, jSONObjectA.toString()).apply();
                    p165n4.i.f44893e = Long.valueOf(System.currentTimeMillis());
                }
                p165n4.i.e();
                p165n4.i.f44890b.set(false);
                break;
            default:
                retrofit2.i.b bVar = retrofit2.i.b.this;
                boolean zIsCanceled = bVar.f46694c.isCanceled();
                retrofit2.f fVar = (retrofit2.f) this.f17592d;
                if (!zIsCanceled) {
                    fVar.onResponse(bVar, (retrofit2.v) this.f17593e);
                } else {
                    fVar.onFailure(bVar, new IOException("Canceled"));
                }
                break;
        }
    }
}
