package p100i;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.C0856i;
import androidx.appcompat.widget.C0857j;
import androidx.appcompat.widget.C0861n;
import androidx.appcompat.widget.C0864q;
import androidx.appcompat.widget.C0865s;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.k0;
import androidx.collection.C0891t;
import androidx.collection.X;
import androidx.core.app.C1283h;
import androidx.core.app.RunnableC1276a;
import androidx.core.view.C1298m;
import androidx.core.view.L;
import androidx.core.view.N;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p100i.f implements androidx.appcompat.view.menu.f.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f36300B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ViewGroup f36301C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f36302D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f36303E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f36304F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f36305G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f36306H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f36307I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f36308J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f36309K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f36310L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f36311M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public m[] f36312N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public m f36313O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f36314P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f36315Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f36316R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f36317S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Configuration f36318T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f36319U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f36320V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f36321W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f36322X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public k f36323Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public i f36324Z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f36325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f36326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Window f36327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f36328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f36329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p100i.a f36330p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f36331p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p138l.f f36332q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f36333q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f36334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B f36336s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f36337s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f36338t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Rect f36339t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f36340u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Rect f36341u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p138l.a f36342v;
    public o v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ActionBarContextView f36343w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public OnBackInvokedDispatcher f36344w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PopupWindow f36345x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public OnBackInvokedCallback f36346x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p100i.i f36347y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final X<String, Integer> f36297y0 = new X<>();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int[] f36298z0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final boolean f36296A0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Z f36348z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f36299A = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final a f36335r0 = new a();

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            if ((gVar.f36333q0 & 1) != 0) {
                gVar.L(0);
            }
            if ((gVar.f36333q0 & 4096) != 0) {
                gVar.L(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            gVar.f36331p0 = false;
            gVar.f36333q0 = 0;
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class b implements i.c.a {
        public b() {
        }

        @Override // i.c.a
        public final boolean a() {
            g gVar = g.this;
            gVar.R();
            p100i.a aVar = gVar.f36330p;
            return (aVar == null || (aVar.d() & 4) == 0) ? false : true;
        }

        @Override // i.c.a
        public final Context b() {
            return g.this.O();
        }

        @Override // i.c.a
        public final void c(p125k.b bVar, int i10) {
            g gVar = g.this;
            gVar.R();
            p100i.a aVar = gVar.f36330p;
            if (aVar != null) {
                aVar.q(bVar);
                aVar.p(i10);
            }
        }

        @Override // i.c.a
        public final Drawable d() {
            c0 c0VarE = c0.e(g.this.O(), null, new int[]{com.voltasit.obdeleven.R.attr.homeAsUpIndicator});
            Drawable drawableB = c0VarE.b(0);
            c0VarE.g();
            return drawableB;
        }

        @Override // i.c.a
        public final void e(int i10) {
            g gVar = g.this;
            gVar.R();
            p100i.a aVar = gVar.f36330p;
            if (aVar != null) {
                aVar.p(i10);
            }
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public final class c implements androidx.appcompat.view.menu.j.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            g.this.H(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = g.this.f36327m.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class d implements p138l.a.InterfaceC0502a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p138l.a.InterfaceC0502a f36352a;

        /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
        public class a extends O3.d {
            public a() {
            }

            @Override // androidx.core.view.a0
            public final void d() {
                d dVar = d.this;
                g.this.f36343w.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f36345x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f36343w.getParent() instanceof View) {
                    View view = (View) gVar.f36343w.getParent();
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    O.c.c(view);
                }
                gVar.f36343w.h();
                gVar.f36348z.d(null);
                gVar.f36348z = null;
                ViewGroup viewGroup = gVar.f36301C;
                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                O.c.c(viewGroup);
            }
        }

        public d(p138l.a.InterfaceC0502a interfaceC0502a) {
            this.f36352a = interfaceC0502a;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [i.e, java.lang.Object] */
        @Override // p138l.a.InterfaceC0502a
        public final void a(p138l.a aVar) {
            this.f36352a.a(aVar);
            g gVar = g.this;
            if (gVar.f36345x != null) {
                gVar.f36327m.getDecorView().removeCallbacks(gVar.f36347y);
            }
            if (gVar.f36343w != null) {
                Z z10 = gVar.f36348z;
                if (z10 != null) {
                    z10.b();
                }
                Z zA = O.a(gVar.f36343w);
                zA.a(0.0f);
                gVar.f36348z = zA;
                zA.d(new a());
            }
            ?? r10 = gVar.f36329o;
            if (r10 != 0) {
                r10.onSupportActionModeFinished(gVar.f36342v);
            }
            gVar.f36342v = null;
            ViewGroup viewGroup = gVar.f36301C;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.c.c(viewGroup);
            gVar.Z();
        }

        @Override // p138l.a.InterfaceC0502a
        public final boolean b(p138l.a aVar, MenuItem menuItem) {
            return this.f36352a.b(aVar, menuItem);
        }

        @Override // p138l.a.InterfaceC0502a
        public final boolean c(p138l.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = g.this.f36301C;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.c.c(viewGroup);
            return this.f36352a.c(aVar, fVar);
        }

        @Override // p138l.a.InterfaceC0502a
        public final boolean d(p138l.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f36352a.d(aVar, fVar);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public static class e {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public static class f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static p271w0.g b(Configuration configuration) {
            return p271w0.g.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(p271w0.g gVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f47683a.f47685a.toLanguageTags()));
        }

        public static void d(Configuration configuration, p271w0.g gVar) {
            configuration.setLocales(LocaleList.forLanguageTags(gVar.f47683a.f47685a.toLanguageTags()));
        }
    }

    /* JADX INFO: renamed from: i.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public static class C0380g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, i.k] */
        public static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            ?? r10 = new OnBackInvokedCallback() { // from class: i.k
                public final void onBackInvoked() {
                    gVar.U();
                }
            };
            M5.d.b(obj).registerOnBackInvokedCallback(1000000, r10);
            return r10;
        }

        public static void c(Object obj, Object obj2) {
            M5.d.b(obj).unregisterOnBackInvokedCallback(M5.c.b(obj2));
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class i extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f36360c;

        public i(Context context) {
            super();
            this.f36360c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // i.g.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // i.g.j
        public final int c() {
            return e.a(this.f36360c) ? 2 : 1;
        }

        @Override // i.g.j
        public final void d() {
            g.this.D(true, true);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f36362a;

        /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public final void a() {
            a aVar = this.f36362a;
            if (aVar != null) {
                try {
                    g.this.f36326l.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f36362a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f36362a == null) {
                this.f36362a = new a();
            }
            g.this.f36326l.registerReceiver(this.f36362a, intentFilterB);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class k extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f36365c;

        public k(s sVar) {
            super();
            this.f36365c = sVar;
        }

        @Override // i.g.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        @Override // i.g.j
        public final int c() {
            Location lastKnownLocation;
            boolean z10;
            long j;
            s sVar = this.f36365c;
            s.a aVar = sVar.f36425c;
            if (aVar.f36427b > System.currentTimeMillis()) {
                z10 = aVar.f36426a;
            } else {
                Context context = sVar.f36423a;
                int iB = Fa.d.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation2 = null;
                LocationManager locationManager = sVar.f36424b;
                if (iB == 0) {
                    try {
                        if (locationManager.isProviderEnabled("network")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("network");
                        } else {
                            lastKnownLocation = null;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    lastKnownLocation = null;
                }
                if (Fa.d.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                    lastKnownLocation = lastKnownLocation2;
                }
                z10 = false;
                if (lastKnownLocation != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (r.f36418d == null) {
                        r.f36418d = new r();
                    }
                    r rVar = r.f36418d;
                    rVar.a(jCurrentTimeMillis - 86400000, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                    rVar.a(jCurrentTimeMillis, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                    z10 = rVar.f36421c == 1;
                    long j10 = rVar.f36420b;
                    long j11 = rVar.f36419a;
                    rVar.a(jCurrentTimeMillis + 86400000, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                    long j12 = rVar.f36420b;
                    if (j10 == -1 || j11 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis <= j11) {
                            j12 = jCurrentTimeMillis > j10 ? j11 : j10;
                        }
                        j = j12 + 60000;
                    }
                    aVar.f36426a = z10;
                    aVar.f36427b = j;
                } else {
                    int i10 = Calendar.getInstance().get(11);
                    if (i10 < 6 || i10 >= 22) {
                        z10 = true;
                    }
                }
            }
            return z10 ? 2 : 1;
        }

        @Override // i.g.j
        public final void d() {
            g.this.D(true, true);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class l extends ContentFrameLayout {
        public l(p138l.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    g gVar = g.this;
                    gVar.I(gVar.Q(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(v.e(getContext(), i10));
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l f36371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f36372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f36373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f36374h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f36375i;
        public p138l.c j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f36376k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f36377l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f36378m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f36379n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f36380o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Bundle f36381p;
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public final class n implements androidx.appcompat.view.menu.j.a {
        public n() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            m mVar;
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            int i10 = 0;
            boolean z11 = fVarK != fVar;
            if (z11) {
                fVar = fVarK;
            }
            g gVar = g.this;
            m[] mVarArr = gVar.f36312N;
            int length = mVarArr != null ? mVarArr.length : 0;
            while (true) {
                if (i10 < length) {
                    mVar = mVarArr[i10];
                    if (mVar != null && mVar.f36374h == fVar) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                if (!z11) {
                    gVar.I(mVar, z10);
                } else {
                    gVar.G(mVar.f36367a, mVar, fVarK);
                    gVar.I(mVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.f36306H || (callback = gVar.f36327m.getCallback()) == null || gVar.f36317S) {
                return true;
            }
            callback.onMenuOpened(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    public g(Context context, Window window, p100i.e eVar, Object obj) {
        X<String, Integer> x10;
        Integer num;
        p100i.d dVar = null;
        this.f36319U = -100;
        this.f36326l = context;
        this.f36329o = eVar;
        this.f36325k = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof p100i.d)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    dVar = (p100i.d) context;
                    break;
                }
            }
            if (dVar != null) {
                this.f36319U = dVar.getDelegate().h();
            }
        }
        if (this.f36319U == -100 && (num = (x10 = f36297y0).get(this.f36325k.getClass().getName())) != null) {
            this.f36319U = num.intValue();
            x10.remove(this.f36325k.getClass().getName());
        }
        if (window != null) {
            E(window);
        }
        C0856i.d();
    }

    public static p271w0.g F(Context context) {
        p271w0.g gVar;
        p271w0.g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = p100i.f.f36286d) == null) {
            return null;
        }
        p271w0.g gVarB = f.b(context.getApplicationContext().getResources().getConfiguration());
        LocaleList localeList = gVar.f47683a.f47685a;
        if (localeList.isEmpty()) {
            gVar2 = p271w0.g.f47682b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (i10 < gVarB.f47683a.f47685a.size() + localeList.size()) {
                Locale locale = i10 < localeList.size() ? localeList.get(i10) : gVarB.f47683a.f47685a.get(i10 - localeList.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            gVar2 = new p271w0.g(new p271w0.i(w0.g.b.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return gVar2.f47683a.f47685a.isEmpty() ? gVarB : gVar2;
    }

    public static Configuration J(Context context, int i10, p271w0.g gVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            f.d(configuration2, gVar);
        }
        return configuration2;
    }

    @Override // p100i.f
    public final void A(int i10) {
        this.f36320V = i10;
    }

    @Override // p100i.f
    public final void B(CharSequence charSequence) {
        this.f36334r = charSequence;
        B b10 = this.f36336s;
        if (b10 != null) {
            b10.setWindowTitle(charSequence);
            return;
        }
        p100i.a aVar = this.f36330p;
        if (aVar != null) {
            aVar.t(charSequence);
            return;
        }
        TextView textView = this.f36302D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i.e, java.lang.Object] */
    @Override // p100i.f
    public final p138l.a C(p138l.a.InterfaceC0502a interfaceC0502a) {
        p138l.a aVarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (interfaceC0502a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        p138l.a aVar = this.f36342v;
        if (aVar != null) {
            aVar.c();
        }
        d dVar = new d(interfaceC0502a);
        R();
        p100i.a aVar2 = this.f36330p;
        ?? r10 = this.f36329o;
        if (aVar2 != null) {
            p138l.a aVarU = aVar2.u(dVar);
            this.f36342v = aVarU;
            if (aVarU != null && r10 != 0) {
                r10.onSupportActionModeStarted(aVarU);
            }
        }
        if (this.f36342v == null) {
            Z z10 = this.f36348z;
            if (z10 != null) {
                z10.b();
            }
            p138l.a aVar3 = this.f36342v;
            if (aVar3 != null) {
                aVar3.c();
            }
            if (r10 == 0 || this.f36317S) {
                aVarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    aVarOnWindowStartingSupportActionMode = r10.onWindowStartingSupportActionMode(dVar);
                } catch (AbstractMethodError unused) {
                    aVarOnWindowStartingSupportActionMode = null;
                }
            }
            if (aVarOnWindowStartingSupportActionMode != null) {
                this.f36342v = aVarOnWindowStartingSupportActionMode;
            } else {
                if (this.f36343w == null) {
                    if (this.f36309K) {
                        TypedValue typedValue = new TypedValue();
                        Context context = this.f36326l;
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.voltasit.obdeleven.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            p138l.c cVar = new p138l.c(context, 0);
                            cVar.getTheme().setTo(themeNewTheme);
                            context = cVar;
                        }
                        this.f36343w = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.voltasit.obdeleven.R.attr.actionModePopupWindowStyle);
                        this.f36345x = popupWindow;
                        H0.g.d(popupWindow, 2);
                        this.f36345x.setContentView(this.f36343w);
                        this.f36345x.setWidth(-1);
                        context.getTheme().resolveAttribute(com.voltasit.obdeleven.R.attr.actionBarSize, typedValue, true);
                        this.f36343w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f36345x.setHeight(-2);
                        this.f36347y = new p100i.i(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f36301C.findViewById(com.voltasit.obdeleven.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(O()));
                            this.f36343w = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f36343w != null) {
                    Z z11 = this.f36348z;
                    if (z11 != null) {
                        z11.b();
                    }
                    this.f36343w.h();
                    Context context2 = this.f36343w.getContext();
                    ActionBarContextView actionBarContextView = this.f36343w;
                    p138l.d dVar2 = new p138l.d();
                    dVar2.f44047d = context2;
                    dVar2.f44048e = actionBarContextView;
                    dVar2.f44049f = dVar;
                    androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
                    fVar.f8468l = 1;
                    dVar2.f44052i = fVar;
                    fVar.f8462e = dVar2;
                    if (dVar.f36352a.d(dVar2, fVar)) {
                        dVar2.i();
                        this.f36343w.f(dVar2);
                        this.f36342v = dVar2;
                        if (this.f36300B && (viewGroup = this.f36301C) != null && viewGroup.isLaidOut()) {
                            this.f36343w.setAlpha(0.0f);
                            Z zA = O.a(this.f36343w);
                            zA.a(1.0f);
                            this.f36348z = zA;
                            zA.d(new p100i.j(this));
                        } else {
                            this.f36343w.setAlpha(1.0f);
                            this.f36343w.setVisibility(0);
                            if (this.f36343w.getParent() instanceof View) {
                                View view = (View) this.f36343w.getParent();
                                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                                O.c.c(view);
                            }
                        }
                        if (this.f36345x != null) {
                            this.f36327m.getDecorView().post(this.f36347y);
                        }
                    } else {
                        this.f36342v = null;
                    }
                }
            }
            p138l.a aVar4 = this.f36342v;
            if (aVar4 != null && r10 != 0) {
                r10.onSupportActionModeStarted(aVar4);
            }
            Z();
            this.f36342v = this.f36342v;
        }
        Z();
        return this.f36342v;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(boolean z10, boolean z11) {
        int i10;
        boolean z12;
        if (this.f36317S) {
            return false;
        }
        int i11 = this.f36319U;
        if (i11 == -100) {
            i11 = p100i.f.f36285c;
        }
        Context context = this.f36326l;
        int iT = T(context, i11);
        int i12 = Build.VERSION.SDK_INT;
        p271w0.g gVarF = i12 < 33 ? F(context) : null;
        if (!z11 && gVarF != null) {
            gVarF = f.b(context.getResources().getConfiguration());
        }
        Configuration configurationJ = J(context, iT, gVarF, null, false);
        boolean z13 = this.f36322X;
        Object obj = this.f36325k;
        boolean z14 = true;
        if (z13 || !(obj instanceof Activity)) {
            this.f36322X = true;
            i10 = this.f36321W;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i12 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f36321W = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f36321W = 0;
                }
                this.f36322X = true;
                i10 = this.f36321W;
            }
        }
        Configuration configuration = this.f36318T;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i13 = configuration.uiMode & 48;
        int i14 = configurationJ.uiMode & 48;
        p271w0.g gVarB = f.b(configuration);
        p271w0.g gVarB2 = gVarF == null ? null : f.b(configurationJ);
        int i15 = i13 != i14 ? 512 : 0;
        if (gVarB2 != null && !gVarB.equals(gVarB2)) {
            i15 |= 8196;
        }
        if (((~i10) & i15) != 0 && z10 && this.f36315Q && ((f36296A0 || this.f36316R) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z12 = false;
            } else {
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && (i15 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationJ.getLayoutDirection());
                }
                if (i16 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC1276a(0, activity));
                }
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12 || i15 == 0) {
            z14 = z12;
        } else {
            boolean z15 = (i15 & i10) == i15;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
            if (gVarB2 != null) {
                f.d(configuration2, gVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i17 = this.f36320V;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.f36320V, true);
            }
            if (z15 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC1376t) {
                    if (((InterfaceC1376t) activity2).getLifecycle().b().compareTo(Lifecycle.State.f17751d) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f36316R && !this.f36317S) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z14 && (obj instanceof p100i.d)) {
            if ((i15 & 512) != 0) {
                ((p100i.d) obj).onNightModeChanged(iT);
            }
            if ((i15 & 4) != 0) {
                ((p100i.d) obj).onLocalesChanged(gVarF);
            }
        }
        if (gVarB2 != null) {
            f.c(f.b(context.getResources().getConfiguration()));
        }
        if (i11 == 0) {
            P(context).e();
        } else {
            k kVar = this.f36323Y;
            if (kVar != null) {
                kVar.a();
            }
        }
        if (i11 == 3) {
            if (this.f36324Z == null) {
                this.f36324Z = new i(context);
            }
            this.f36324Z.e();
        } else {
            i iVar = this.f36324Z;
            if (iVar != null) {
                iVar.a();
            }
        }
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void E(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f36327m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f36328n = hVar;
        window.setCallback(hVar);
        c0 c0VarE = c0.e(this.f36326l, null, f36298z0);
        Drawable drawableC = c0VarE.c(0);
        if (drawableC != null) {
            window.setBackgroundDrawable(drawableC);
        }
        c0VarE.g();
        this.f36327m = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f36344w0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f36346x0) != null) {
            C0380g.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f36346x0 = null;
        }
        Object obj = this.f36325k;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f36344w0 = C0380g.a(activity);
            } else {
                this.f36344w0 = null;
            }
        } else {
            this.f36344w0 = null;
        }
        Z();
    }

    public final void G(int i10, m mVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (mVar == null && i10 >= 0) {
                m[] mVarArr = this.f36312N;
                if (i10 < mVarArr.length) {
                    mVar = mVarArr[i10];
                }
            }
            if (mVar != null) {
                fVar = mVar.f36374h;
            }
        }
        if ((mVar == null || mVar.f36378m) && !this.f36317S) {
            h hVar = this.f36328n;
            Window.Callback callback = this.f36327m.getCallback();
            hVar.getClass();
            try {
                hVar.f36358f = true;
                callback.onPanelClosed(i10, fVar);
            } finally {
                hVar.f36358f = false;
            }
        }
    }

    public final void H(androidx.appcompat.view.menu.f fVar) {
        if (this.f36311M) {
            return;
        }
        this.f36311M = true;
        this.f36336s.i();
        Window.Callback callback = this.f36327m.getCallback();
        if (callback != null && !this.f36317S) {
            callback.onPanelClosed(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
        }
        this.f36311M = false;
    }

    public final void I(m mVar, boolean z10) {
        l lVar;
        B b10;
        if (z10 && mVar.f36367a == 0 && (b10 = this.f36336s) != null && b10.a()) {
            H(mVar.f36374h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f36326l.getSystemService("window");
        if (windowManager != null && mVar.f36378m && (lVar = mVar.f36371e) != null) {
            windowManager.removeView(lVar);
            if (z10) {
                G(mVar.f36367a, mVar, null);
            }
        }
        mVar.f36376k = false;
        mVar.f36377l = false;
        mVar.f36378m = false;
        mVar.f36372f = null;
        mVar.f36379n = true;
        if (this.f36313O == mVar) {
            this.f36313O = null;
        }
        if (mVar.f36367a == 0) {
            Z();
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    public final boolean K(KeyEvent keyEvent) {
        View decorView;
        boolean zF;
        boolean zX;
        AudioManager audioManager;
        Object obj = this.f36325k;
        if (((obj instanceof C1298m.a) || (obj instanceof p100i.m)) && (decorView = this.f36327m.getDecorView()) != null && C1298m.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            h hVar = this.f36328n;
            Window.Callback callback = this.f36327m.getCallback();
            hVar.getClass();
            try {
                hVar.f36357e = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                hVar.f36357e = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                hVar.f36357e = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f36314P = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                m mVarQ = Q(0);
                if (mVarQ.f36378m) {
                    return true;
                }
                X(mVarQ, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f36342v != null) {
                    return true;
                }
                m mVarQ2 = Q(0);
                B b10 = this.f36336s;
                Context context = this.f36326l;
                if (b10 == null || !b10.c() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    boolean z10 = mVarQ2.f36378m;
                    if (z10 || mVarQ2.f36377l) {
                        I(mVarQ2, true);
                        zF = z10;
                    } else if (mVarQ2.f36376k) {
                        if (mVarQ2.f36380o) {
                            mVarQ2.f36376k = false;
                            zX = X(mVarQ2, keyEvent);
                        } else {
                            zX = true;
                        }
                        if (zX) {
                            V(mVarQ2, keyEvent);
                            zF = true;
                        } else {
                            zF = false;
                        }
                    } else {
                        zF = false;
                    }
                } else if (this.f36336s.a()) {
                    zF = this.f36336s.f();
                } else if (this.f36317S || !X(mVarQ2, keyEvent)) {
                    zF = false;
                } else {
                    zF = this.f36336s.g();
                }
                if (!zF || (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) == null) {
                    return true;
                }
                audioManager.playSoundEffect(0);
                return true;
            }
        } else if (U()) {
            return true;
        }
        return false;
    }

    public final void L(int i10) {
        m mVarQ = Q(i10);
        if (mVarQ.f36374h != null) {
            Bundle bundle = new Bundle();
            mVarQ.f36374h.t(bundle);
            if (bundle.size() > 0) {
                mVarQ.f36381p = bundle;
            }
            mVarQ.f36374h.w();
            mVarQ.f36374h.clear();
        }
        mVarQ.f36380o = true;
        mVarQ.f36379n = true;
        if ((i10 == 108 || i10 == 0) && this.f36336s != null) {
            m mVarQ2 = Q(0);
            mVarQ2.f36376k = false;
            X(mVarQ2, null);
        }
    }

    public final void M() {
        ViewGroup viewGroup;
        if (this.f36300B) {
            return;
        }
        int[] iArr = p088h.a.j;
        Context context = this.f36326l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            v(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowActionBar, false)) {
            v(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            v(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            v(10);
        }
        this.f36309K = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        N();
        this.f36327m.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f36310L) {
            viewGroup = this.f36308J ? (ViewGroup) layoutInflaterFrom.inflate(com.voltasit.obdeleven.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.voltasit.obdeleven.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f36309K) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.voltasit.obdeleven.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f36307I = false;
            this.f36306H = false;
        } else if (this.f36306H) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.voltasit.obdeleven.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new p138l.c(context, typedValue.resourceId) : context).inflate(com.voltasit.obdeleven.R.layout.abc_screen_toolbar, (ViewGroup) null);
            B b10 = (B) viewGroup.findViewById(com.voltasit.obdeleven.R.id.decor_content_parent);
            this.f36336s = b10;
            b10.setWindowCallback(this.f36327m.getCallback());
            if (this.f36307I) {
                this.f36336s.h(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
            }
            if (this.f36304F) {
                this.f36336s.h(2);
            }
            if (this.f36305G) {
                this.f36336s.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.f36306H);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.f36307I);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.f36309K);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.f36308J);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(C4.v.f(sb2, this.f36310L, " }"));
        }
        Y6.c cVar = new Y6.c();
        cVar.f7617b = this;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(viewGroup, cVar);
        if (this.f36336s == null) {
            this.f36302D = (TextView) viewGroup.findViewById(com.voltasit.obdeleven.R.id.title);
        }
        boolean z10 = k0.f8999a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.voltasit.obdeleven.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f36327m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f36327m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new p100i.h(this));
        this.f36301C = viewGroup;
        Object obj = this.f36325k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f36334r;
        if (!TextUtils.isEmpty(title)) {
            B b11 = this.f36336s;
            if (b11 != null) {
                b11.setWindowTitle(title);
            } else {
                p100i.a aVar = this.f36330p;
                if (aVar != null) {
                    aVar.t(title);
                } else {
                    TextView textView = this.f36302D;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f36301C.findViewById(R.id.content);
        View decorView = this.f36327m.getDecorView();
        contentFrameLayout2.f8672h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f36300B = true;
        m mVarQ = Q(0);
        if (this.f36317S || mVarQ.f36374h != null) {
            return;
        }
        S(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
    }

    public final void N() {
        if (this.f36327m == null) {
            Object obj = this.f36325k;
            if (obj instanceof Activity) {
                E(((Activity) obj).getWindow());
            }
        }
        if (this.f36327m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context O() {
        R();
        p100i.a aVar = this.f36330p;
        Context contextE = aVar != null ? aVar.e() : null;
        return contextE == null ? this.f36326l : contextE;
    }

    public final j P(Context context) {
        if (this.f36323Y == null) {
            if (s.f36422d == null) {
                Context applicationContext = context.getApplicationContext();
                s.f36422d = new s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f36323Y = new k(s.f36422d);
        }
        return this.f36323Y;
    }

    public final m Q(int i10) {
        m[] mVarArr = this.f36312N;
        if (mVarArr == null || mVarArr.length <= i10) {
            m[] mVarArr2 = new m[i10 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.f36312N = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i10];
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        mVar2.f36367a = i10;
        mVar2.f36379n = false;
        mVarArr[i10] = mVar2;
        return mVar2;
    }

    public final void R() {
        M();
        if (this.f36306H && this.f36330p == null) {
            Object obj = this.f36325k;
            if (obj instanceof Activity) {
                this.f36330p = new t((Activity) obj, this.f36307I);
            } else if (obj instanceof Dialog) {
                this.f36330p = new t((Dialog) obj);
            }
            p100i.a aVar = this.f36330p;
            if (aVar != null) {
                aVar.l(this.f36337s0);
            }
        }
    }

    public final void S(int i10) {
        this.f36333q0 = (1 << i10) | this.f36333q0;
        if (this.f36331p0) {
            return;
        }
        View decorView = this.f36327m.getDecorView();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        decorView.postOnAnimation(this.f36335r0);
        this.f36331p0 = true;
    }

    public final int T(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return P(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f36324Z == null) {
                    this.f36324Z = new i(context);
                }
                return this.f36324Z.c();
            }
        }
        return i10;
    }

    public final boolean U() {
        boolean z10 = this.f36314P;
        this.f36314P = false;
        m mVarQ = Q(0);
        if (mVarQ.f36378m) {
            if (!z10) {
                I(mVarQ, true);
            }
            return true;
        }
        p138l.a aVar = this.f36342v;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        R();
        p100i.a aVar2 = this.f36330p;
        return aVar2 != null && aVar2.b();
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01be  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0161, code lost:
    
        if (r15.f8448g.getCount() > 0) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(i.g.m r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100i.g.V(i.g$m, android.view.KeyEvent):void");
    }

    public final boolean W(m mVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f36376k || X(mVar, keyEvent)) && (fVar = mVar.f36374h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean X(m mVar, KeyEvent keyEvent) {
        B b10;
        B b11;
        Resources.Theme themeNewTheme;
        B b12;
        B b13;
        if (this.f36317S) {
            return false;
        }
        if (mVar.f36376k) {
            return true;
        }
        m mVar2 = this.f36313O;
        if (mVar2 != null && mVar2 != mVar) {
            I(mVar2, false);
        }
        Window.Callback callback = this.f36327m.getCallback();
        int i10 = mVar.f36367a;
        if (callback != null) {
            mVar.f36373g = callback.onCreatePanelView(i10);
        }
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (b13 = this.f36336s) != null) {
            b13.b();
        }
        if (mVar.f36373g == null && (!z10 || !(this.f36330p instanceof q))) {
            androidx.appcompat.view.menu.f fVar = mVar.f36374h;
            if (fVar == null || mVar.f36380o) {
                if (fVar == null) {
                    Context context = this.f36326l;
                    if ((i10 == 0 || i10 == 108) && this.f36336s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.voltasit.obdeleven.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.voltasit.obdeleven.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.voltasit.obdeleven.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            p138l.c cVar = new p138l.c(context, 0);
                            cVar.getTheme().setTo(themeNewTheme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f8462e = this;
                    androidx.appcompat.view.menu.f fVar3 = mVar.f36374h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(mVar.f36375i);
                        }
                        mVar.f36374h = fVar2;
                        androidx.appcompat.view.menu.d dVar = mVar.f36375i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f8458a);
                        }
                    }
                    if (mVar.f36374h == null) {
                        return false;
                    }
                }
                if (z10 && (b11 = this.f36336s) != null) {
                    if (this.f36338t == null) {
                        this.f36338t = new c();
                    }
                    b11.d(mVar.f36374h, this.f36338t);
                }
                mVar.f36374h.w();
                if (!callback.onCreatePanelMenu(i10, mVar.f36374h)) {
                    androidx.appcompat.view.menu.f fVar4 = mVar.f36374h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(mVar.f36375i);
                        }
                        mVar.f36374h = null;
                    }
                    if (z10 && (b10 = this.f36336s) != null) {
                        b10.d(null, this.f36338t);
                    }
                    return false;
                }
                mVar.f36380o = false;
            }
            mVar.f36374h.w();
            Bundle bundle = mVar.f36381p;
            if (bundle != null) {
                mVar.f36374h.s(bundle);
                mVar.f36381p = null;
            }
            if (!callback.onPreparePanel(0, mVar.f36373g, mVar.f36374h)) {
                if (z10 && (b12 = this.f36336s) != null) {
                    b12.d(null, this.f36338t);
                }
                mVar.f36374h.v();
                return false;
            }
            mVar.f36374h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            mVar.f36374h.v();
        }
        mVar.f36376k = true;
        mVar.f36377l = false;
        this.f36313O = mVar;
        return true;
    }

    public final void Y() {
        if (this.f36300B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Z() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f36344w0 != null && (Q(0).f36378m || this.f36342v != null)) {
                z10 = true;
            }
            if (z10 && this.f36346x0 == null) {
                this.f36346x0 = C0380g.b(this.f36344w0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f36346x0) == null) {
                    return;
                }
                C0380g.c(this.f36344w0, onBackInvokedCallback);
                this.f36346x0 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        m mVar;
        Window.Callback callback = this.f36327m.getCallback();
        if (callback != null && !this.f36317S) {
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            m[] mVarArr = this.f36312N;
            int length = mVarArr != null ? mVarArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                mVar = mVarArr[i10];
                if (mVar != null && mVar.f36374h == fVarK) {
                    if (mVar != null) {
                        return callback.onMenuItemSelected(mVar.f36367a, menuItem);
                    }
                }
            }
            mVar = null;
            if (mVar != null) {
                return callback.onMenuItemSelected(mVar.f36367a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        B b10 = this.f36336s;
        if (b10 == null || !b10.c() || (ViewConfiguration.get(this.f36326l).hasPermanentMenuKey() && !this.f36336s.e())) {
            m mVarQ = Q(0);
            mVarQ.f36379n = true;
            I(mVarQ, false);
            V(mVarQ, null);
            return;
        }
        Window.Callback callback = this.f36327m.getCallback();
        if (this.f36336s.a()) {
            this.f36336s.f();
            if (this.f36317S) {
                return;
            }
            callback.onPanelClosed(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, Q(0).f36374h);
            return;
        }
        if (callback == null || this.f36317S) {
            return;
        }
        if (this.f36331p0 && (1 & this.f36333q0) != 0) {
            View decorView = this.f36327m.getDecorView();
            a aVar = this.f36335r0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        m mVarQ2 = Q(0);
        androidx.appcompat.view.menu.f fVar2 = mVarQ2.f36374h;
        if (fVar2 == null || mVarQ2.f36380o || !callback.onPreparePanel(0, mVarQ2.f36373g, fVar2)) {
            return;
        }
        callback.onMenuOpened(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, mVarQ2.f36374h);
        this.f36336s.g();
    }

    @Override // p100i.f
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.f36301C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f36328n.a(this.f36327m.getCallback());
    }

    @Override // p100i.f
    public final Context d(Context context) {
        Configuration configuration;
        this.f36315Q = true;
        int i10 = this.f36319U;
        if (i10 == -100) {
            i10 = p100i.f.f36285c;
        }
        int iT = T(context, i10);
        if (p100i.f.m(context) && p100i.f.m(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (p100i.f.j) {
                    try {
                        p271w0.g gVar = p100i.f.f36286d;
                        if (gVar == null) {
                            if (p100i.f.f36287e == null) {
                                p100i.f.f36287e = p271w0.g.a(C1283h.b(context));
                            }
                            if (!p100i.f.f36287e.f47683a.f47685a.isEmpty()) {
                                p100i.f.f36286d = p100i.f.f36287e;
                            }
                        } else if (!gVar.equals(p100i.f.f36287e)) {
                            p271w0.g gVar2 = p100i.f.f36286d;
                            p100i.f.f36287e = gVar2;
                            C1283h.a(context, gVar2.f47683a.f47685a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!p100i.f.f36289g) {
                p100i.f.f36284b.execute(new M2.d(2, context));
            }
        }
        p271w0.g gVarF = F(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(J(context, iT, gVarF, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof p138l.c) {
            try {
                ((p138l.c) context).a(J(context, iT, gVarF, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f36296A0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f10 = configuration3.fontScale;
                float f11 = configuration4.fontScale;
                if (f10 != f11) {
                    configuration.fontScale = f11;
                }
                int i11 = configuration3.mcc;
                int i12 = configuration4.mcc;
                if (i11 != i12) {
                    configuration.mcc = i12;
                }
                int i13 = configuration3.mnc;
                int i14 = configuration4.mnc;
                if (i13 != i14) {
                    configuration.mnc = i14;
                }
                f.a(configuration3, configuration4, configuration);
                int i15 = configuration3.touchscreen;
                int i16 = configuration4.touchscreen;
                if (i15 != i16) {
                    configuration.touchscreen = i16;
                }
                int i17 = configuration3.keyboard;
                int i18 = configuration4.keyboard;
                if (i17 != i18) {
                    configuration.keyboard = i18;
                }
                int i19 = configuration3.keyboardHidden;
                int i20 = configuration4.keyboardHidden;
                if (i19 != i20) {
                    configuration.keyboardHidden = i20;
                }
                int i21 = configuration3.navigation;
                int i22 = configuration4.navigation;
                if (i21 != i22) {
                    configuration.navigation = i22;
                }
                int i23 = configuration3.navigationHidden;
                int i24 = configuration4.navigationHidden;
                if (i23 != i24) {
                    configuration.navigationHidden = i24;
                }
                int i25 = configuration3.orientation;
                int i26 = configuration4.orientation;
                if (i25 != i26) {
                    configuration.orientation = i26;
                }
                int i27 = configuration3.screenLayout & 15;
                int i28 = configuration4.screenLayout & 15;
                if (i27 != i28) {
                    configuration.screenLayout |= i28;
                }
                int i29 = configuration3.screenLayout & 192;
                int i30 = configuration4.screenLayout & 192;
                if (i29 != i30) {
                    configuration.screenLayout |= i30;
                }
                int i31 = configuration3.screenLayout & 48;
                int i32 = configuration4.screenLayout & 48;
                if (i31 != i32) {
                    configuration.screenLayout |= i32;
                }
                int i33 = configuration3.screenLayout & 768;
                int i34 = configuration4.screenLayout & 768;
                if (i33 != i34) {
                    configuration.screenLayout |= i34;
                }
                int i35 = configuration3.colorMode & 3;
                int i36 = configuration4.colorMode & 3;
                if (i35 != i36) {
                    configuration.colorMode |= i36;
                }
                int i37 = configuration3.colorMode & 12;
                int i38 = configuration4.colorMode & 12;
                if (i37 != i38) {
                    configuration.colorMode |= i38;
                }
                int i39 = configuration3.uiMode & 15;
                int i40 = configuration4.uiMode & 15;
                if (i39 != i40) {
                    configuration.uiMode |= i40;
                }
                int i41 = configuration3.uiMode & 48;
                int i42 = configuration4.uiMode & 48;
                if (i41 != i42) {
                    configuration.uiMode |= i42;
                }
                int i43 = configuration3.screenWidthDp;
                int i44 = configuration4.screenWidthDp;
                if (i43 != i44) {
                    configuration.screenWidthDp = i44;
                }
                int i45 = configuration3.screenHeightDp;
                int i46 = configuration4.screenHeightDp;
                if (i45 != i46) {
                    configuration.screenHeightDp = i46;
                }
                int i47 = configuration3.smallestScreenWidthDp;
                int i48 = configuration4.smallestScreenWidthDp;
                if (i47 != i48) {
                    configuration.smallestScreenWidthDp = i48;
                }
                int i49 = configuration3.densityDpi;
                int i50 = configuration4.densityDpi;
                if (i49 != i50) {
                    configuration.densityDpi = i50;
                }
            }
        }
        Configuration configurationJ = J(context, iT, gVarF, configuration, true);
        p138l.c cVar = new p138l.c(context, com.voltasit.obdeleven.R.style.Theme_AppCompat_Empty);
        cVar.a(configurationJ);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = cVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    p211r0.i.a(theme);
                } else {
                    synchronized (p211r0.h.f46258a) {
                        if (!p211r0.h.f46260c) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                p211r0.h.f46259b = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException unused3) {
                            }
                            p211r0.h.f46260c = true;
                        }
                        Method method = p211r0.h.f46259b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                p211r0.h.f46259b = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused5) {
        }
        return cVar;
    }

    @Override // p100i.f
    public final <T extends View> T e(int i10) {
        M();
        return (T) this.f36327m.findViewById(i10);
    }

    @Override // p100i.f
    public final Context f() {
        return this.f36326l;
    }

    @Override // p100i.f
    public final b g() {
        return new b();
    }

    @Override // p100i.f
    public final int h() {
        return this.f36319U;
    }

    @Override // p100i.f
    public final MenuInflater i() {
        if (this.f36332q == null) {
            R();
            p100i.a aVar = this.f36330p;
            this.f36332q = new p138l.f(aVar != null ? aVar.e() : this.f36326l);
        }
        return this.f36332q;
    }

    @Override // p100i.f
    public final p100i.a j() {
        R();
        return this.f36330p;
    }

    @Override // p100i.f
    public final void k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f36326l);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            boolean z10 = layoutInflaterFrom.getFactory2() instanceof g;
        }
    }

    @Override // p100i.f
    public final void l() {
        if (this.f36330p != null) {
            R();
            if (this.f36330p.f()) {
                return;
            }
            S(0);
        }
    }

    @Override // p100i.f
    public final void n(Configuration configuration) {
        if (this.f36306H && this.f36300B) {
            R();
            p100i.a aVar = this.f36330p;
            if (aVar != null) {
                aVar.g();
            }
        }
        C0856i c0856iA = C0856i.a();
        Context context = this.f36326l;
        synchronized (c0856iA) {
            P p10 = c0856iA.f8982a;
            synchronized (p10) {
                C0891t<WeakReference<Drawable.ConstantState>> c0891t = p10.f8766b.get(context);
                if (c0891t != null) {
                    c0891t.a();
                }
            }
        }
        this.f36318T = new Configuration(this.f36326l.getResources().getConfiguration());
        D(false, false);
    }

    @Override // p100i.f
    public final void o() {
        String strC;
        this.f36315Q = true;
        D(false, true);
        N();
        Object obj = this.f36325k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = androidx.core.app.n.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                p100i.a aVar = this.f36330p;
                if (aVar == null) {
                    this.f36337s0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (p100i.f.f36291i) {
                p100i.f.u(this);
                p100i.f.f36290h.add(new WeakReference<>(this));
            }
        }
        this.f36318T = new Configuration(this.f36326l.getResources().getConfiguration());
        this.f36316R = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c0864q;
        byte b10 = 4;
        View view2 = null;
        if (this.v0 == null) {
            int[] iArr = p088h.a.j;
            Context context2 = this.f36326l;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.v0 = new o();
            } else {
                try {
                    this.v0 = (o) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.v0 = new o();
                }
            }
        }
        o oVar = this.v0;
        int i10 = j0.f8996a;
        oVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p088h.a.f35713z, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof p138l.c) && ((p138l.c) context).f44042a == resourceId)) ? context : new p138l.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b10 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b10 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b10 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b10 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                b10 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b10 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b10 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b10 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b10 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b10 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b10 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b10 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b10 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                c0864q = new C0864q(cVar, attributeSet);
                break;
            case 1:
                c0864q = new AppCompatCheckedTextView(cVar, attributeSet);
                break;
            case 2:
                c0864q = new C0861n(cVar, attributeSet);
                break;
            case 3:
                c0864q = oVar.e(cVar, attributeSet);
                break;
            case 4:
                c0864q = new AppCompatImageButton(cVar, attributeSet);
                break;
            case 5:
                c0864q = new C0865s(cVar, attributeSet);
                break;
            case 6:
                c0864q = new AppCompatSpinner(cVar, attributeSet);
                break;
            case 7:
                c0864q = oVar.d(cVar, attributeSet);
                break;
            case 8:
                c0864q = new A(cVar, attributeSet);
                break;
            case 9:
                c0864q = new AppCompatImageView(cVar, attributeSet);
                break;
            case 10:
                c0864q = oVar.a(cVar, attributeSet);
                break;
            case 11:
                c0864q = oVar.c(cVar, attributeSet);
                break;
            case 12:
                c0864q = new C0857j(cVar, attributeSet);
                break;
            case 13:
                c0864q = oVar.b(cVar, attributeSet);
                break;
            default:
                c0864q = null;
                break;
        }
        if (c0864q == null && context != cVar) {
            Object[] objArr = oVar.f36398a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, Name.LABEL);
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = o.f36396g;
                        if (i11 < 3) {
                            View viewF = oVar.f(cVar, str, strArr[i11]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i11++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = oVar.f(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            c0864q = view2;
        }
        if (c0864q != null) {
            Context context3 = c0864q.getContext();
            if ((context3 instanceof ContextWrapper) && c0864q.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, o.f36392c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0864q.setOnClickListener(new o.a(c0864q, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, o.f36393d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    new N(com.voltasit.obdeleven.R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(c0864q, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, o.f36394e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    O.o(c0864q, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = cVar.obtainStyledAttributes(attributeSet, o.f36395f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z11 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                    new L(com.voltasit.obdeleven.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(c0864q, Boolean.valueOf(z11));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c0864q;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p100i.f
    public final void p() {
        if (this.f36325k instanceof Activity) {
            synchronized (p100i.f.f36291i) {
                p100i.f.u(this);
            }
        }
        if (this.f36331p0) {
            this.f36327m.getDecorView().removeCallbacks(this.f36335r0);
        }
        this.f36317S = true;
        if (this.f36319U != -100) {
            Object obj = this.f36325k;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f36297y0.put(this.f36325k.getClass().getName(), Integer.valueOf(this.f36319U));
            } else {
                f36297y0.remove(this.f36325k.getClass().getName());
            }
        } else {
            f36297y0.remove(this.f36325k.getClass().getName());
        }
        p100i.a aVar = this.f36330p;
        if (aVar != null) {
            aVar.h();
        }
        k kVar = this.f36323Y;
        if (kVar != null) {
            kVar.a();
        }
        i iVar = this.f36324Z;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // p100i.f
    public final void q() {
        M();
    }

    @Override // p100i.f
    public final void r() {
        R();
        p100i.a aVar = this.f36330p;
        if (aVar != null) {
            aVar.r(true);
        }
    }

    @Override // p100i.f
    public final void s() {
        D(true, false);
    }

    @Override // p100i.f
    public final void t() {
        R();
        p100i.a aVar = this.f36330p;
        if (aVar != null) {
            aVar.r(false);
        }
    }

    @Override // p100i.f
    public final boolean v(int i10) {
        if (i10 == 8) {
            i10 = 108;
        } else if (i10 == 9) {
            i10 = 109;
        }
        if (this.f36310L && i10 == 108) {
            return false;
        }
        if (this.f36306H && i10 == 1) {
            this.f36306H = false;
        }
        if (i10 == 1) {
            Y();
            this.f36310L = true;
            return true;
        }
        if (i10 == 2) {
            Y();
            this.f36304F = true;
            return true;
        }
        if (i10 == 5) {
            Y();
            this.f36305G = true;
            return true;
        }
        if (i10 == 10) {
            Y();
            this.f36308J = true;
            return true;
        }
        if (i10 == 108) {
            Y();
            this.f36306H = true;
            return true;
        }
        if (i10 != 109) {
            return this.f36327m.requestFeature(i10);
        }
        Y();
        this.f36307I = true;
        return true;
    }

    @Override // p100i.f
    public final void w(int i10) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.f36301C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f36326l).inflate(i10, viewGroup);
        this.f36328n.a(this.f36327m.getCallback());
    }

    @Override // p100i.f
    public final void x(View view) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.f36301C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f36328n.a(this.f36327m.getCallback());
    }

    @Override // p100i.f
    public final void y(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.f36301C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f36328n.a(this.f36327m.getCallback());
    }

    @Override // p100i.f
    public final void z(Toolbar toolbar) {
        Object obj = this.f36325k;
        if (obj instanceof Activity) {
            R();
            p100i.a aVar = this.f36330p;
            if (aVar instanceof t) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f36332q = null;
            if (aVar != null) {
                aVar.h();
            }
            this.f36330p = null;
            if (toolbar != null) {
                q qVar = new q(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f36334r, this.f36328n);
                this.f36330p = qVar;
                this.f36328n.f36355c = qVar.f36406c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f36328n.f36355c = null;
            }
            l();
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class h extends p138l.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q.e f36355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f36357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f36358f;

        public h(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f36356d = true;
                callback.onContentChanged();
            } finally {
                this.f36356d = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z10 = this.f36357e;
            Window.Callback callback = this.f44107b;
            if (z10) {
                return callback.dispatchKeyEvent(keyEvent);
            }
            return g.this.K(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (this.f44107b.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            g gVar = g.this;
            gVar.R();
            p100i.a aVar = gVar.f36330p;
            if (aVar != null && aVar.i(keyCode, keyEvent)) {
                return true;
            }
            m mVar = gVar.f36313O;
            if (mVar != null && gVar.W(mVar, keyEvent.getKeyCode(), keyEvent)) {
                m mVar2 = gVar.f36313O;
                if (mVar2 == null) {
                    return true;
                }
                mVar2.f36377l = true;
                return true;
            }
            if (gVar.f36313O == null) {
                m mVarQ = gVar.Q(0);
                gVar.X(mVarQ, keyEvent);
                boolean zW = gVar.W(mVarQ, keyEvent.getKeyCode(), keyEvent);
                mVarQ.f36376k = false;
                if (zW) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f36356d) {
                this.f44107b.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return this.f44107b.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            q.e eVar = this.f36355c;
            if (eVar != null) {
                View view = i10 == 0 ? new View(q.this.f36404a.f8963a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f44107b.onCreatePanelView(i10);
        }

        @Override // p138l.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            g gVar = g.this;
            if (i10 == 108) {
                gVar.R();
                p100i.a aVar = gVar.f36330p;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                gVar.getClass();
            }
            return true;
        }

        @Override // p138l.h, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f36358f) {
                this.f44107b.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            g gVar = g.this;
            if (i10 == 108) {
                gVar.R();
                p100i.a aVar = gVar.f36330p;
                if (aVar != null) {
                    aVar.c(false);
                    return;
                }
                return;
            }
            if (i10 != 0) {
                gVar.getClass();
                return;
            }
            m mVarQ = gVar.Q(i10);
            if (mVarQ.f36378m) {
                gVar.I(mVarQ, false);
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f8480x = true;
            }
            q.e eVar = this.f36355c;
            if (eVar != null && i10 == 0) {
                q qVar = q.this;
                if (!qVar.f36407d) {
                    qVar.f36404a.f8973l = true;
                    qVar.f36407d = true;
                }
            }
            boolean zOnPreparePanel = this.f44107b.onPreparePanel(i10, view, menu);
            if (fVar != null) {
                fVar.f8480x = false;
            }
            return zOnPreparePanel;
        }

        @Override // p138l.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar = g.this.Q(0).f36374h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            g gVar = g.this;
            if (!gVar.f36299A || i10 != 0) {
                return l.h.a.b(this.f44107b, callback, i10);
            }
            l.e.a aVar = new l.e.a(gVar.f36326l, callback);
            p138l.a aVarC = gVar.C(aVar);
            if (aVarC != null) {
                return aVar.e(aVarC);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
