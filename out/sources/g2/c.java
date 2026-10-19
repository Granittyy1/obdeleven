package g2;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35508f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35510h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35516o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35503a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35504b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f35505c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35506d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35507e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35509g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35511i = false;
    public final int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35512k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35513l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35514m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35515n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35517p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35518q = false;

    public static int a(int i10, int i11, String str, String str2) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}
