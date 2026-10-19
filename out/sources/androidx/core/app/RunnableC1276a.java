package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.O0;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.core.app.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1276a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16717c;

    public /* synthetic */ RunnableC1276a(int i10, Object obj) {
        this.f16716b = i10;
        this.f16717c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.core.app.g$a] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r10;
        ?? r11;
        ?? r12;
        Object obj2 = this.f16717c;
        switch (this.f16716b) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    Class<?> cls = C1282g.f16725a;
                    activity.recreate();
                    return;
                }
                Class<?> cls2 = C1282g.f16725a;
                ?? r13 = 1;
                r13 = 1;
                C1282g.a aVar = 27;
                Application application = 26;
                boolean z10 = i10 == 26 || i10 == 27;
                Method method = C1282g.f16730f;
                if ((!z10 || method != null) && (C1282g.f16729e != null || C1282g.f16728d != null)) {
                    try {
                        Object obj3 = C1282g.f16727c.get(activity);
                        if (obj3 != null && (obj = C1282g.f16726b.get(activity)) != null) {
                            application = activity.getApplication();
                            aVar = new C1282g.a(activity);
                            application.registerActivityLifecycleCallbacks(aVar);
                            r13 = C1282g.f16731g;
                            r13.post(new RunnableC1279d(aVar, obj3));
                            if (i10 != 26 && i10 != 27) {
                                r13 = 0;
                            }
                            try {
                                if (r13 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r12 = r13;
                                        r11 = aVar;
                                        r10 = application;
                                        r12.post(new RunnableC1280e(r10, r11));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                r13.post(new RunnableC1280e(application, aVar));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r12 = r13;
                                r11 = aVar;
                                r10 = application;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) obj2;
                hVar.w();
                hVar.W(R.string.common_something_went_wrong);
                return;
            case 2:
                O0 o10 = (O0) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) o10.f33975u.f2143u.getLayoutManager();
                if (linearLayoutManager != null) {
                    linearLayoutManager.g1(o10.f33973s.getInt("key_last_position"), 0);
                    return;
                }
                return;
            default:
                NavigationManager this$0 = (NavigationManager) obj2;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.l(null);
                return;
        }
    }
}
