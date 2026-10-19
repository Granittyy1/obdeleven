package p296y0;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.startup.StartupActivity;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: SplashScreen.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0553a f48015a;

    /* JADX INFO: renamed from: y0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SplashScreen.kt */
    public static class C0553a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartupActivity f48016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f48017b = new p(8);

        /* JADX INFO: renamed from: y0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SplashScreen.kt */
        public static final class ViewTreeObserverOnPreDrawListenerC0554a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f48019c;

            public ViewTreeObserverOnPreDrawListenerC0554a(View view) {
                this.f48019c = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (C0553a.this.f48017b.c()) {
                    return false;
                }
                this.f48019c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        public C0553a(StartupActivity startupActivity) {
            this.f48016a = startupActivity;
        }

        public void a() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f48016a.getTheme();
            theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
            if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                theme.getDrawable(typedValue.resourceId);
            }
            theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
            c(theme, typedValue);
        }

        public void b(c cVar) {
            this.f48017b = cVar;
            View viewFindViewById = this.f48016a.findViewById(android.R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0554a(viewFindViewById));
        }

        public final void c(Resources.Theme theme, TypedValue typedValue) {
            int i10;
            if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i10 = typedValue.resourceId) == 0) {
                return;
            }
            this.f48016a.setTheme(i10);
        }
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    public static final class b extends C0553a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0555a f48020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p296y0.b f48021d;

        /* JADX INFO: renamed from: y0.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SplashScreen.kt */
        public static final class ViewTreeObserverOnPreDrawListenerC0555a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f48023c;

            public ViewTreeObserverOnPreDrawListenerC0555a(View view) {
                this.f48023c = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (b.this.f48017b.c()) {
                    return false;
                }
                this.f48023c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        public b(StartupActivity startupActivity) {
            super(startupActivity);
            this.f48021d = new p296y0.b(this, startupActivity);
        }

        @Override // p296y0.a.C0553a
        public final void a() {
            StartupActivity startupActivity = this.f48016a;
            Resources.Theme theme = startupActivity.getTheme();
            i.d(theme, "activity.theme");
            c(theme, new TypedValue());
            ((ViewGroup) startupActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f48021d);
        }

        @Override // p296y0.a.C0553a
        public final void b(c cVar) {
            this.f48017b = cVar;
            View viewFindViewById = this.f48016a.findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.f48020c != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f48020c);
            }
            ViewTreeObserverOnPreDrawListenerC0555a viewTreeObserverOnPreDrawListenerC0555a = new ViewTreeObserverOnPreDrawListenerC0555a(viewFindViewById);
            this.f48020c = viewTreeObserverOnPreDrawListenerC0555a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0555a);
        }
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    public interface c {
        boolean c();
    }

    public a(StartupActivity startupActivity) {
        this.f48015a = Build.VERSION.SDK_INT >= 31 ? new b(startupActivity) : new C0553a(startupActivity);
    }
}
