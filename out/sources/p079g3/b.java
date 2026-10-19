package p079g3;

import android.graphics.Rect;
import androidx.collection.C0874b;
import androidx.collection.C0891t;
import androidx.collection.Y;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p142l3.c;

/* JADX INFO: compiled from: LottieComposition.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f35552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<String> f35553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f35554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f35555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f35556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Y<c> f35557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0891t<Layer> f35558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f35559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f35560i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f35561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f35562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f35563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35564n;

    public b() {
        u uVar = new u();
        new C0874b(0);
        new HashMap();
        this.f35552a = uVar;
        this.f35553b = new HashSet<>();
        this.f35564n = 0;
    }

    public final void a(String str) {
        p214r3.c.b(str);
        this.f35553b.add(str);
    }

    public final float b() {
        return (long) (((this.f35561k - this.j) / this.f35562l) * 1000.0f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f35559h.iterator();
        while (it.hasNext()) {
            sb2.append(((Layer) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}
