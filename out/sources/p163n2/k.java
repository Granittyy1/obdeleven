package p163n2;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import p141l2.C;
import p141l2.z;
import p293xa.g;

/* JADX INFO: compiled from: NavDestinationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f44810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f44812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g<z> f44815f;

    public k(C destination) {
        i.e(destination, "destination");
        this.f44810a = destination;
        this.f44811b = new ArrayList();
        this.f44812c = new LinkedHashMap();
    }

    public final C.b a(String route) {
        z value;
        i.e(route, "route");
        g<z> gVar = this.f44815f;
        if (gVar == null || (value = gVar.getValue()) == null) {
            return null;
        }
        int i10 = C.f44217f;
        String uriString = C.a.a(route);
        i.e(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        i.d(uri, "parse(...)");
        Bundle bundleD = value.d(uri, this.f44812c);
        if (bundleD == null) {
            return null;
        }
        return new C.b(this.f44810a, bundleD, value.f44337l, value.b(uri), false, -1);
    }
}
