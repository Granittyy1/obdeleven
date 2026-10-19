package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<a> f17484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17492i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f17493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f17495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<String> f17496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<String> f17497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<Runnable> f17499q;

    /* JADX INFO: compiled from: FragmentTransaction.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f17501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17505f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17506g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Lifecycle.State f17507h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Lifecycle.State f17508i;

        public a() {
        }

        public a(Fragment fragment, int i10) {
            this.f17500a = i10;
            this.f17501b = fragment;
            this.f17502c = false;
            Lifecycle.State state = Lifecycle.State.f17753f;
            this.f17507h = state;
            this.f17508i = state;
        }

        public a(int i10, Fragment fragment, int i11) {
            this.f17500a = i10;
            this.f17501b = fragment;
            this.f17502c = true;
            Lifecycle.State state = Lifecycle.State.f17753f;
            this.f17507h = state;
            this.f17508i = state;
        }
    }

    public final void b(a aVar) {
        this.f17484a.add(aVar);
        aVar.f17503d = this.f17485b;
        aVar.f17504e = this.f17486c;
        aVar.f17505f = this.f17487d;
        aVar.f17506g = this.f17488e;
    }

    public final void c(String str) {
        if (!this.f17491h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f17490g = true;
        this.f17492i = str;
    }

    public abstract void d(int i10, Fragment fragment, String str, int i11);

    public final void e(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        d(i10, fragment, str, 2);
    }

    public abstract C1336a f(Fragment fragment, Lifecycle.State state);
}
