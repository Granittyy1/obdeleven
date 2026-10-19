package Q3;

import D2.V;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.collection.C0873a;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.google.android.gms.internal.measurement.M1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: RequestManagerRetriever.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Handler.Callback {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f5076i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile com.bumptech.glide.e f5077b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f5080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f5081f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5078c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f5079d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0873a<View, Fragment> f5082g = new C0873a<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0873a<View, android.app.Fragment> f5083h = new C0873a<>();

    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public class a implements b {
    }

    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public interface b {
    }

    public i() {
        new Bundle();
        this.f5081f = f5076i;
        this.f5080e = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    public static void b(FragmentManager fragmentManager, C0873a c0873a) {
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                c0873a.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), c0873a);
            }
        }
    }

    public static void c(List list, C0873a c0873a) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                c0873a.put(fragment.getView(), fragment);
                c(fragment.getChildFragmentManager().f17676c.f(), c0873a);
            }
        }
    }

    public static boolean j(Context context) {
        Activity activityA = a(context);
        return activityA == null || !activityA.isFinishing();
    }

    @Deprecated
    public final com.bumptech.glide.e d(Activity activity, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        h hVarH = h(fragmentManager, fragment, z10);
        com.bumptech.glide.e eVar = hVarH.f5072e;
        if (eVar != null) {
            return eVar;
        }
        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(activity);
        ((a) this.f5081f).getClass();
        com.bumptech.glide.e eVar2 = new com.bumptech.glide.e(bVarB, hVarH.f5069b, hVarH.f5070c, activity);
        hVarH.f5072e = eVar2;
        return eVar2;
    }

    public final com.bumptech.glide.e e(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = X3.j.f7214a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof ActivityC1347l) {
                return g((ActivityC1347l) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (X3.j.g()) {
                    return e(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                return d(activity, activity.getFragmentManager(), null, j(activity));
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return e(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f5077b == null) {
            synchronized (this) {
                try {
                    if (this.f5077b == null) {
                        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.f5081f;
                        V v10 = new V();
                        C6.b bVar2 = new C6.b();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f5077b = new com.bumptech.glide.e(bVarB, v10, bVar2, applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f5077b;
    }

    public final com.bumptech.glide.e f(Fragment fragment) {
        M1.d(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (X3.j.g()) {
            return e(fragment.getContext().getApplicationContext());
        }
        return k(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    public final com.bumptech.glide.e g(ActivityC1347l activityC1347l) {
        if (X3.j.g()) {
            return e(activityC1347l.getApplicationContext());
        }
        if (activityC1347l.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return k(activityC1347l, activityC1347l.getSupportFragmentManager(), null, j(activityC1347l));
    }

    public final h h(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        h hVar = (h) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (hVar != null) {
            return hVar;
        }
        HashMap map = this.f5078c;
        h hVar2 = (h) map.get(fragmentManager);
        if (hVar2 == null) {
            hVar2 = new h();
            hVar2.f5074g = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                hVar2.a(fragment.getActivity());
            }
            if (z10) {
                hVar2.f5069b.a();
            }
            map.put(fragmentManager, hVar2);
            fragmentManager.beginTransaction().add(hVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f5080e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return hVar2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        Object obj3;
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                obj3 = null;
                z10 = false;
                obj2 = null;
            } else {
                obj = (y) message.obj;
                objRemove = this.f5079d.remove(obj);
            }
            if (z10 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Objects.toString(obj2);
            }
            return z10;
        }
        obj = (FragmentManager) message.obj;
        objRemove = this.f5078c.remove(obj);
        Object obj4 = objRemove;
        obj2 = obj;
        obj3 = obj4;
        if (z10) {
            Objects.toString(obj2);
        }
        return z10;
    }

    public final l i(y yVar, Fragment fragment, boolean z10) {
        l lVar = (l) yVar.D("com.bumptech.glide.manager");
        if (lVar != null) {
            return lVar;
        }
        HashMap map = this.f5079d;
        l lVar2 = (l) map.get(yVar);
        if (lVar2 == null) {
            lVar2 = new l();
            lVar2.f5093g = fragment;
            if (fragment != null && fragment.getContext() != null) {
                Fragment parentFragment = fragment;
                while (parentFragment.getParentFragment() != null) {
                    parentFragment = parentFragment.getParentFragment();
                }
                y fragmentManager = parentFragment.getFragmentManager();
                if (fragmentManager != null) {
                    lVar2.o(fragment.getContext(), fragmentManager);
                }
            }
            if (z10) {
                lVar2.f5088b.a();
            }
            map.put(yVar, lVar2);
            C1336a c1336a = new C1336a(yVar);
            c1336a.d(0, lVar2, "com.bumptech.glide.manager", 1);
            c1336a.j(true, true);
            this.f5080e.obtainMessage(2, yVar).sendToTarget();
        }
        return lVar2;
    }

    public final com.bumptech.glide.e k(Context context, y yVar, Fragment fragment, boolean z10) {
        l lVarI = i(yVar, fragment, z10);
        com.bumptech.glide.e eVar = lVarI.f5092f;
        if (eVar != null) {
            return eVar;
        }
        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(context);
        ((a) this.f5081f).getClass();
        com.bumptech.glide.e eVar2 = new com.bumptech.glide.e(bVarB, lVarI.f5088b, lVarI.f5089c, context);
        lVarI.f5092f = eVar2;
        return eVar2;
    }
}
