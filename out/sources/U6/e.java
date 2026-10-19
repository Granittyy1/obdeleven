package U6;

import Q3.k;
import W6.i;
import W6.j;
import W6.n;
import W6.o;
import W6.p;
import W6.u;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import p033c7.C1506t;

/* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends W6.f.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X6.c f6539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Activity f6540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f6541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U6.b f6542i;

    /* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 4) {
                return false;
            }
            e eVar = e.this;
            FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks = eVar.f6542i.f6528l;
            if (firebaseInAppMessagingDisplayCallbacks != null) {
                ((C1506t) firebaseInAppMessagingDisplayCallbacks).f(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.f28153b);
            }
            U6.b bVar = eVar.f6542i;
            bVar.getClass();
            H3.c.j();
            bVar.a(eVar.f6540g);
            bVar.f6527k = null;
            bVar.f6528l = null;
            return true;
        }
    }

    /* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
    public class b implements p.a {
        public b() {
        }

        @Override // W6.p.a
        public final void a() {
            e eVar = e.this;
            U6.b bVar = eVar.f6542i;
            p083g7.h hVar = bVar.f6527k;
            if (hVar == null || bVar.f6528l == null) {
                return;
            }
            k kVar = hVar.f35628b;
            Log.isLoggable("FIAM.Display", 4);
            ((C1506t) eVar.f6542i.f6528l).b();
        }
    }

    /* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
    public class c implements p.a {
        public c() {
        }

        @Override // W6.p.a
        public final void a() {
            FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks;
            e eVar = e.this;
            U6.b bVar = eVar.f6542i;
            if (bVar.f6527k != null && (firebaseInAppMessagingDisplayCallbacks = bVar.f6528l) != null) {
                ((C1506t) firebaseInAppMessagingDisplayCallbacks).f(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.f28154c);
            }
            U6.b bVar2 = eVar.f6542i;
            bVar2.getClass();
            H3.c.j();
            bVar2.a(eVar.f6540g);
            bVar2.f6527k = null;
            bVar2.f6528l = null;
        }
    }

    /* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            j jVar = eVar.f6542i.f6524g;
            X6.c cVar = jVar.f7022a;
            boolean zIsShown = cVar == null ? false : cVar.e().isShown();
            X6.c cVar2 = eVar.f6539f;
            if (zIsShown) {
                H3.c.k("Fiam already active. Cannot show new Fiam.");
            } else {
                Activity activity = eVar.f6540g;
                if (activity.isFinishing()) {
                    H3.c.k("Activity is finishing or does not have valid window token. Cannot show FIAM.");
                } else {
                    n nVarA = cVar2.a();
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(nVarA.f7032g.intValue(), nVarA.f7033h.intValue(), 1003, nVarA.f7030e.intValue(), -3);
                    Rect rectA = j.a(activity);
                    if ((nVarA.f7031f.intValue() & 48) == 48) {
                        layoutParams.y = rectA.top;
                    }
                    layoutParams.dimAmount = 0.3f;
                    layoutParams.gravity = nVarA.f7031f.intValue();
                    layoutParams.windowAnimations = 0;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    windowManager.addView(cVar2.e(), layoutParams);
                    j.a(activity);
                    H3.c.j();
                    H3.c.j();
                    if (cVar2 instanceof X6.a) {
                        W6.h hVar = new W6.h(cVar2);
                        cVar2.b().setOnTouchListener(nVarA.f7032g.intValue() == -1 ? new u(cVar2.b(), hVar) : new i(cVar2.b(), hVar, layoutParams, windowManager, cVar2));
                    }
                    jVar.f7022a = cVar2;
                }
            }
            if (cVar2.a().j.booleanValue()) {
                U6.b bVar = eVar.f6542i;
                W6.d dVar = bVar.j;
                ViewGroup viewGroupE = cVar2.e();
                dVar.getClass();
                viewGroupE.setAlpha(0.0f);
                viewGroupE.measure(-2, -2);
                Point point = new Point(0, viewGroupE.getMeasuredHeight() * (-1));
                viewGroupE.animate().translationX(point.x).translationY(point.y).setDuration(1L).setListener(new W6.c(viewGroupE, bVar.f6526i));
            }
        }
    }

    public e(U6.b bVar, X6.c cVar, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f6542i = bVar;
        this.f6539f = cVar;
        this.f6540g = activity;
        this.f6541h = onGlobalLayoutListener;
    }

    @Override // W6.f.a
    public final void l() {
        X6.c cVar = this.f6539f;
        if (!cVar.a().f7034i.booleanValue()) {
            cVar.e().setOnTouchListener(new a());
        }
        U6.b bVar = this.f6542i;
        p pVar = bVar.f6522e;
        b bVar2 = new b();
        pVar.getClass();
        pVar.f7037a = new o(5000L, bVar2).start();
        if (cVar.a().f7035k.booleanValue()) {
            c cVar2 = new c();
            p pVar2 = bVar.f6523f;
            pVar2.getClass();
            pVar2.f7037a = new o(20000L, cVar2).start();
        }
        this.f6540g.runOnUiThread(new d());
    }
}
